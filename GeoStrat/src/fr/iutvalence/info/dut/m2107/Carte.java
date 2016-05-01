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
	 * this attribut is use to make a aggregation with case
	 */
	protected Case tile;
	
	/**
	 *  this method is use to make a aggregation with  carte
	 * @return  carte
	 */
	public Case getCase()
	{
		return tile;

	}
	/**
	 * this method is use to make a aggregation with Case
	 * @param Case
	 */
	public void setCarte(Case tile) 
	{
		this.tile = tile;
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
