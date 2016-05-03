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
	 * size of terrain in Y
	 */
	private final int LARGEUR;
	/**
	 * size of terrain in X
	 */
	private final int LONGUEUR;
	
	/**
	 * is use for play a game and put unite of this (a refaire?)
	 */
	protected int[][] terrain;
	
	/**
	 * this attribut is use to make a aggregation with Carte
	 */
	protected Carte carte;
	
	/**
	 * this method is use to make a aggregation with Carte
	 */
	public Case()
	{
		LARGEUR = 20;
		LONGUEUR = 20;
		int x = 0;
		int y = 0;
		while(x < LONGUEUR)
		{
			y = 0;
			while(y <LARGEUR )
			{
				terrain[LONGUEUR][LARGEUR] = 0;
				y++;
			}
			x++;
		}
		
		this.terrain = new int [LONGUEUR][LARGEUR];
		this.carte = new Carte();
		this.carte.setCarte(this); // Il faut crée la carte avant non ?
		// (TODO) Need correction
		//this.carte.setCase(this);
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
