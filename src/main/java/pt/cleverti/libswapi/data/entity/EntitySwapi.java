package pt.cleverti.libswapi.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Base SWAPI entity, listing entities urls
 *
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

	public String getUrlFilms() { return urlFilms;}

	public String getUrlPeople() { return urlPeople;}

	public String getUrlPlanets() { return urlPlanets;}

	public String getUrlSpecies() { return urlSpecies;}

	public String getUrlStarships() { return urlStarships;}

	public String getUrlVehicles() { return urlVehicles;}


	@Override
	public String toString() {
		return "EntitySwapi{" + "urlFilms='" + urlFilms + '\'' + ", urlPeople='" + urlPeople + '\'' + ", urlPlanets='" + urlPlanets + '\'' + ", urlSpecies='" + urlSpecies + '\'' + ", urlStarships='" + urlStarships + '\'' + ", urlVehicles='" + urlVehicles + '\'' + '}';
	}
}
