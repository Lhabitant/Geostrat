/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * 
 * @author Fluchaire
 */
public class Case
{
	/**
	 * this attribut is use to make a aggregation with Carte
	 */
	protected Carte carte;
	
	/**
	 * this method is use to make a aggregation with Carte
	 */
	public Case()
	{
		this.carte = new Carte(); 
		this.carte.setCase(this);
	}
	
	
	
	/**
	 * 
	 */
	private int nombreDePointsDeDeplacementQuiSontConsommes;
	
	/**
	 * Give a bonus of defense
	 */
	private int defense;
	
	/**
	 * 
	 */
	protected int numeroCase;

	
	/**
	 * @return the numeroCase
	 */
	public int getNumeroCase()
	{
		return numeroCase;
	}

	/**
	 * @param numeroCase the numeroCase to set
	 */
	public void setNumeroCase(int numeroCase)
	{
		this.numeroCase = numeroCase;
	}

}
