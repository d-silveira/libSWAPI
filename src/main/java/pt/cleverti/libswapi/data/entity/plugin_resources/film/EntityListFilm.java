package pt.cleverti.libswapi.data.entity.plugin_resources.film;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
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

//	public static List<EntityListFilm> arrayEntityFilmFromData(String str) {
//
//		Type listType = new TypeToken<ArrayList<EntityListFilm>>() { }.getType();
//
//		return new Gson().fromJson(str, listType);
//	}

	public int getCount() { return count;}

//	public void setCount(int count) { this.count = count;}

	public Object getUrlNext() { return urlNext;}

//	public void setUrlNext(Object urlNext) { this.urlNext = urlNext;}

	public Object getUrlPrevious() { return urlPrevious;}

//	public void setUrlPrevious(Object urlPrevious) { this.urlPrevious = urlPrevious;}

	public List<EntityFilm> getListEntityFilm() { return listEntityFilm;}

//	public void setListEntityFilm(List<EntityFilm> listEntityFilm) { this.listEntityFilm = listEntityFilm;}

}
