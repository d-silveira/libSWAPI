package pt.cleverti.libswapi.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author Duarte Silveira
 * @version 1
 * @since 11/05/17
 */
public class EntitySwapi {
	/**
	 * films : http://swapi.co/api/films/
	 * people : http://swapi.co/api/people/
	 * planets : http://swapi.co/api/planets/
	 * species : http://swapi.co/api/species/
	 * starships : http://swapi.co/api/starships/
	 * vehicles : http://swapi.co/api/vehicles/
	 */

	@SerializedName("films")
	private String urlFilms;
	@SerializedName("people")
	private String urlPeople;
	@SerializedName("planets")
	private String urlPlanets;
	@SerializedName("species")
	private String urlSpecies;
	@SerializedName("starships")
	private String urlStarships;
	@SerializedName("vehicles")
	private String urlVehicles;

//	public static List<EntitySwapi> arrayEntitySwapiFromData(String str) {
//
//		Type listType = new TypeToken<ArrayList<EntitySwapi>>() { }.getType();
//
//		return new Gson().fromJson(str, listType);
//	}

	public String getUrlFilms() { return urlFilms;}

//	public void setUrlFilms(String urlFilms) { this.urlFilms = urlFilms;}

	public String getUrlPeople() { return urlPeople;}

//	public void setUrlPeople(String urlPeople) { this.urlPeople = urlPeople;}

	public String getUrlPlanets() { return urlPlanets;}

//	public void setUrlPlanets(String urlPlanets) { this.urlPlanets = urlPlanets;}

	public String getUrlSpecies() { return urlSpecies;}

//	public void setUrlSpecies(String urlSpecies) { this.urlSpecies = urlSpecies;}

	public String getUrlStarships() { return urlStarships;}

//	public void setUrlStarships(String urlStarships) { this.urlStarships = urlStarships;}

	public String getUrlVehicles() { return urlVehicles;}

//	public void setUrlVehicles(String urlVehicles) { this.urlVehicles = urlVehicles;}
}
