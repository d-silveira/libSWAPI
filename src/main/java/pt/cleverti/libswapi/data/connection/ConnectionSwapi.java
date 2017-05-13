package pt.cleverti.libswapi.data.connection;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import pt.cleverti.libswapi.BuildConfig;
import pt.cleverti.libswapi.data.api.APISwapi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * ConnectionSwapi, this is the only class you need to instantiate to use the lib.
 * 					highly recommend instantiating it by dagger2 injection,
 * 					so as to avoid duplication and easing lifecycle management
 *
 * @author Duarte Silveira
 * @version 1
 * @since 11/05/17
 */
public class ConnectionSwapi {

    private CompositeDisposable compositeDisposable;
	private APISwapi swapiConnection;

	public ConnectionSwapi(@NotNull CompositeDisposable compositeDisposable) {
		this.compositeDisposable = compositeDisposable;

		if (BuildConfig.DEBUG) {
			HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
			interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
			OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor).build();

			swapiConnection = new Retrofit.Builder()
					.baseUrl(APISwapi.baseUrl)
					.client(okHttpClient)
					.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
					.addConverterFactory(GsonConverterFactory.create())
					.build().create(APISwapi.class);
		} else {
			swapiConnection = new Retrofit.Builder()
                .baseUrl(APISwapi.baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
				.build().create(APISwapi.class);

		}

	}

	/**
	 * getSwapiConnection, get the actual connection, allowing you to call it's API methods
	 */
	public APISwapi getSwapiConnection() {
		return swapiConnection;
	}

	/**
	 * prepareRequest,	Helper method to automatically set the proper thread handling for you
	 * 					, needs to receive an swapi connection request to initiate the actual request
	 * 					it needs only that you .subscribe(with the handler methods you see fit)
	 * 					adding it's return to the compositeDisposable(), so that you can call dispose of
	 * 					all requests temporary memory on your onDestroy methods
	 * 					e.g.: compositeDisposable.add(prepareRequest(getSwapiConnection().getEntitiesUrls())
	 * 					.subscribe(this::onNext, this::onError, this::onCompleted));
	 *
	 * @param swapiConnectionRequest
	 */
	public Observable<?> prepareRequest(@NotNull Observable<?> swapiConnectionRequest) {
		return swapiConnectionRequest.subscribeOn(Schedulers.io())
									 .observeOn(AndroidSchedulers.mainThread());
	}


}
