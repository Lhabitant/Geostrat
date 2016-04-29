/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * 
 * @author Fluchaire
 */
class Carte
{
	/**
	 * this attribut is use to make a aggregation with  Partie
	 */
	protected Partie partie;
	
	/**
	 * this method is use to make a aggregation with  Partie
	 */
	public Carte()
	{
		this.partie = new Partie(); 
		this.partie.setCarte(this);
	}
	
	
	 
	
	
	/**
	 * 
	 */
	public void creer()
	{
		
	}
	
	/**
	 * 
	 */
	public void afficherCarte()
	{
		
	}
}
