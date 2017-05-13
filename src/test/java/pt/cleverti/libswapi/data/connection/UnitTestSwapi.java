package pt.cleverti.libswapi.data.connection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Unit test for the swapi base
 */
public class UnitTestSwapi {

	private CompositeDisposable compositeDisposable;
	private ConnectionSwapi connectionSwapi;

	@Before
  	public void setUp() {
		compositeDisposable = new CompositeDisposable();
		connectionSwapi = new ConnectionSwapi(compositeDisposable);
	}

	@Test
	public void testGetEntitiesUrls() throws Exception {
		Object objectReturn = connectionSwapi.getSwapiConnection().getEntitiesUrls().blockingFirst();
		System.out.println(objectReturn.toString());
		Assert.assertNotNull(objectReturn);
	}

//	@Test
//	public void testUsingTestSubscriber() throws Exception {
//		TestSubscriber<Integer> testSubscriber = new TestSubscriber<>();
//		Observable.just(1).subscribe(testSubscriber);
//		testSubscriber.assertNoErrors();
//		testSubscriber.assertReceivedOnNext(Arrays.asList(1));
//	}

}
