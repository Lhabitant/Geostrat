/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * @author Victor
 * This class stock the method for the city and the batiment
 */
public class CityCase extends Case
{
	protected Joueur proprietaire;
	
	/**
	 * Construction for the initialization
	 */
	public CityCase() 
	{
		super();
		this.proprietaire = null;
	}
	
	/**
	 * @param proprietaire
	 */
	public CityCase(Joueur proprietaire) {
		super();
		this.proprietaire = proprietaire;
	}

	/**
	 * Getter for speed
	 * @return integer
	 */
	public int getVitesse() {
		return 50;
	}

	/**
	 * Getter for defense
	 * @return integer
	 */
	public int getDefense() {
		return 75;
	}
	
	/**
	 * Display for the type of the case
	 * @return cases type
	 */
	public String getType()
	{
		return "Ville";
	}
	
	/**
	 * Method for switch the owner of the city. Owner is a player
	 * @param newProprio
	 */
	public void switchOwner(Joueur newProprio) {
        this.proprietaire = newProprio;
    }
 
	/**
	 * Method to make the city catchable
	 * @return boolean
	 */
	public boolean isCatchable()
	{
		return true;
	}

}
