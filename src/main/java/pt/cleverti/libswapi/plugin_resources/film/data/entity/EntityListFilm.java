package pt.cleverti.libswapi.plugin_resources.film.data.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * EntityListFilm,  Film List SWAPI entity, describes a list of film's
 * 					returned by the films root, and films search
 *
 * @author Duarte Silveira
 * @version 1
 * @since 11/05/17
 */
public class EntityListFilm {
	/**
	 * count : 7
	 * next : null
	 * previous : null
	 * results : [{ListEntityFilm}]
	 */

	private int count;
	@SerializedName("next")
	private Object           urlNext;
	@SerializedName("previous")
	private Object           urlPrevious;
	@SerializedName("results")
	private List<EntityFilm> listEntityFilm;

	public static List<EntityListFilm> arrayEntityFilmFromData(String str) {

		Type listType = new TypeToken<ArrayList<EntityListFilm>>() { }.getType();

		return new Gson().fromJson(str, listType);
	}

	public int getCount() { return count;}

	public Object getUrlNext() { return urlNext;}

	public Object getUrlPrevious() { return urlPrevious;}

	public List<EntityFilm> getListEntityFilm() { return listEntityFilm;}

	@Override
	public String toString() {
		return "EntityListFilm{" + "count=" + count + ", urlNext=" + urlNext + ", urlPrevious=" + urlPrevious + ", listEntityFilm=" + listEntityFilm + '}';
	}

}
