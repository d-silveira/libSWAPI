package pt.cleverti.libswapi.plugin_resources.film.domain;

/**
 * Film, domain object that describes a film's details
 *
 * @author Duarte Silveira
 * @version 1
 * @since 18/05/17
 */
public class Film {

	private String       title;
	private int          episodeId;
	private String       openingCrawl;
	private String       director;
	private String       producer;
	private String       dateRelease;
	private String       dateCreated;
	private String       dateEdited;
//	private List<String> listCharacters;
//	private List<String> listPlanets;
//	private List<String> listStarships;
//	private List<String> listVehicles;
//	private List<String> listSpecies;

	public String getTitle() { return title;}

	public int getEpisodeId() { return episodeId;}

	public String getOpeningCrawl() { return openingCrawl;}

	public String getDirector() { return director;}

	public String getProducer() { return producer;}

	public String getDateRelease() { return dateRelease;}

	public String getDateCreated() { return dateCreated;}

	public String getDateEdited() { return dateEdited;}

//	public List<String> getListCharacters() { return listCharacters;}
//
//	public List<String> getListPlanets() { return listPlanets;}
//
//	public List<String> getListStarships() { return listStarships;}
//
//	public List<String> getListVehicles() { return listVehicles;}
//
//	public List<String> getListSpecies() { return listSpecies;}

	@Override
	public String toString() {
		return "FilmRelations{" + "title='" + title + '\'' + ", episodeId=" + episodeId + ", openingCrawl='" + openingCrawl + '\'' + ", director='" + director + '\'' + ", producer='" + producer + '\'' + ", dateRelease='" + dateRelease + '\'' + ", dateCreated='" + dateCreated + '\'' + ", dateEdited='" + dateEdited + '\'' + '}';
	}
}
