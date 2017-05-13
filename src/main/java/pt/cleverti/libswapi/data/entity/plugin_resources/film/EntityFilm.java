package pt.cleverti.libswapi.data.entity.plugin_resources.film;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * EntityFilm, Film SWAPI entity, describes a film's details
 *
 * @author Duarte Silveira
 * @version 1
 * @since 11/05/17
 */
public class EntityFilm {
	/**
	 * title : A New Hope
	 * episode_id : 4
	 * opening_crawl : It is a period of civil war.
	 * Rebel spaceships, striking
	 * from a hidden base, have won
	 * their first victory against
	 * the evil Galactic Empire.
	 * <p>
	 * During the battle, Rebel
	 * spies managed to steal secret
	 * plans to the Empire's
	 * ultimate weapon, the DEATH
	 * STAR, an armored space
	 * station with enough power
	 * to destroy an entire planet.
	 * <p>
	 * Pursued by the Empire's
	 * sinister agents, Princess
	 * Leia races home aboard her
	 * starship, custodian of the
	 * stolen plans that can save her
	 * people and restore
	 * freedom to the galaxy....
	 * director : George Lucas
	 * producer : Gary Kurtz, Rick McCallum
	 * release_date : 1977-05-25
	 * characters : ["http://swapi.co/api/people/1/","http://swapi.co/api/people/2/","http://swapi.co/api/people/3/","http://swapi.co/api/people/4/","http://swapi.co/api/people/5/","http://swapi.co/api/people/6/","http://swapi.co/api/people/7/","http://swapi.co/api/people/8/","http://swapi.co/api/people/9/","http://swapi.co/api/people/10/","http://swapi.co/api/people/12/","http://swapi.co/api/people/13/","http://swapi.co/api/people/14/","http://swapi.co/api/people/15/","http://swapi.co/api/people/16/","http://swapi.co/api/people/18/","http://swapi.co/api/people/19/","http://swapi.co/api/people/81/"]
	 * planets : ["http://swapi.co/api/planets/2/","http://swapi.co/api/planets/3/","http://swapi.co/api/planets/1/"]
	 * starships : ["http://swapi.co/api/starships/2/","http://swapi.co/api/starships/3/","http://swapi.co/api/starships/5/","http://swapi.co/api/starships/9/","http://swapi.co/api/starships/10/","http://swapi.co/api/starships/11/","http://swapi.co/api/starships/12/","http://swapi.co/api/starships/13/"]
	 * vehicles : ["http://swapi.co/api/vehicles/4/","http://swapi.co/api/vehicles/6/","http://swapi.co/api/vehicles/7/","http://swapi.co/api/vehicles/8/"]
	 * species : ["http://swapi.co/api/species/5/","http://swapi.co/api/species/3/","http://swapi.co/api/species/2/","http://swapi.co/api/species/1/","http://swapi.co/api/species/4/"]
	 * created : 2014-12-10T14:23:31.880000Z
	 * edited : 2015-04-11T09:46:52.774897Z
	 * url : http://swapi.co/api/films/1/
	 */

	private String       title;
	@SerializedName("episode_id")
	private int          episodeId;
	@SerializedName("opening_crawl")
	private String       openingCrawl;
	private String       director;
	private String       producer;
	@SerializedName("release_date")
	private String       dateRelease;
	@SerializedName("created")
	private String       dateCreated;
	@SerializedName("edited")
	private String       dateEdited;
	@SerializedName("url")
	private String       urlDetails;
	@SerializedName("characters")
	private List<String> listCharacters;
	@SerializedName("planets")
	private List<String> listPlanets;
	@SerializedName("starships")
	private List<String> listStarships;
	@SerializedName("vehicles")
	private List<String> listVehicles;
	@SerializedName("species")
	private List<String> listSpecies;

	public static List<EntityFilm> arrayEntityFilmFromData(String str) {

		Type listType = new TypeToken<ArrayList<EntityFilm>>() { }.getType();

		return new Gson().fromJson(str, listType);
	}

	public String getTitle() { return title;}

	public int getEpisodeId() { return episodeId;}

	public String getOpeningCrawl() { return openingCrawl;}

	public String getDirector() { return director;}

	public String getProducer() { return producer;}

	public String getDateRelease() { return dateRelease;}

	public String getDateCreated() { return dateCreated;}

	public String getDateEdited() { return dateEdited;}

	public String getUrlDetails() { return urlDetails;}

	public List<String> getListCharacters() { return listCharacters;}

	public List<String> getListPlanets() { return listPlanets;}

	public List<String> getListStarships() { return listStarships;}

	public List<String> getListVehicles() { return listVehicles;}

	public List<String> getListSpecies() { return listSpecies;}

	@Override
	public String toString() {
		return "EntityFilm{" + "title='" + title + '\'' + ", episodeId=" + episodeId + ", openingCrawl='" + openingCrawl + '\'' + ", director='" + director + '\'' + ", producer='" + producer + '\'' + ", dateRelease='" + dateRelease + '\'' + ", dateCreated='" + dateCreated + '\'' + ", dateEdited='" + dateEdited + '\'' + ", urlDetails='" + urlDetails + '\'' + ", listCharacters=" + listCharacters + ", listPlanets=" + listPlanets + ", listStarships=" + listStarships + ", listVehicles=" + listVehicles + ", listSpecies=" + listSpecies + '}';
	}

}
