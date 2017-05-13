package pt.cleverti.libswapi.data.api;

import io.reactivex.Observable;
import pt.cleverti.libswapi.data.entity.EntitySwapi;
import pt.cleverti.libswapi.data.entity.plugin_resources.film.EntityFilm;
import pt.cleverti.libswapi.data.entity.plugin_resources.film.EntityListFilm;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * APISwapi, Retrofit 2 SWAPI api declaration
 * 			each resource plugin should separate itself from the others by a comment block identifying itself
 *
 * @author Duarte Silveira
 * @version 1
 * @since 11/05/17
 */
public interface APISwapi {

	String baseUrl = "https://swapi.co/";

    @GET("api/")
	Observable<EntitySwapi> getEntitiesUrls();

	/** Film plugin block **/

	@GET("api/films/")
	Observable<EntityListFilm> getListEntityFilms();

	@GET("api/films/{id}/")
	Observable<EntityFilm> getEntityFilmById(@Path("id") int id);

	@GET("api/films/")
	Observable<EntityListFilm> getEntityFilmByTitle(@Query("search") String title);

}
