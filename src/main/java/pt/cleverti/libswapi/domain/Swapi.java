package pt.cleverti.libswapi.domain;

/**
 * Base SWAPI domain objet, listing available resources names
 *
 * @author Duarte Silveira
 * @version 1
 * @since 18/05/17
 */
public class Swapi {

	private String films;
	private String people;
	private String planets;
	private String species;
	private String starships;
	private String vehicles;

	public String getFilms() { return films;}

	public String getPeople() { return people;}

	public String getPlanets() { return planets;}

	public String getSpecies() { return species;}

	public String getStarships() { return starships;}

	public String getVehicles() { return vehicles;}


	@Override
	public String toString() {
		return "Swapi{" + "resources: " + films + ", " + people + ", " + planets + ", " + species + ", " + starships + ", " + vehicles + '}';
	}
}
