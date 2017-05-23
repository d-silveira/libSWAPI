package pt.cleverti.libswapi.data.connection.plugin_resources;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.reactivex.disposables.CompositeDisposable;
import pt.cleverti.libswapi.data.connection.ConnectionSwapi;

/**
 * Unit test for the film plugin
 */
public class UnitTestFilm {

	private CompositeDisposable compositeDisposable;
	private ConnectionSwapi connectionSwapi;

	@Before
  	public void setUp() {
		compositeDisposable = new CompositeDisposable();
		connectionSwapi = new ConnectionSwapi(compositeDisposable);
	}

	@Test
	public void testGetFilms() throws Exception {
		Object objectReturn = connectionSwapi.getSwapiConnection().getListEntityFilms().blockingFirst();
		System.out.println(objectReturn.toString());
		Assert.assertNotNull(objectReturn);
	}

	@Test
	public void testGetFilmById() throws Exception {
		Object objectReturn = connectionSwapi.getSwapiConnection().getEntityFilmById(1).blockingFirst();
		System.out.println(objectReturn.toString());
		Assert.assertNotNull(objectReturn);
	}

	@Test
	public void testSearchFilmByTitle() throws Exception {
		Object objectReturn = connectionSwapi.getSwapiConnection().searchEntityFilmByTitle("empire").blockingFirst();
		System.out.println(objectReturn.toString());
		Assert.assertNotNull(objectReturn);
	}

}
