package fr.iutvalence.info.dut.m2107;

/**
 * @author fluchaiv
 *
 */
public class Case 
{

	private int deplacement;

	private int defense;

	protected int numeroCase;
	
	/**
	 * @param deplacement
	 * @param defense
	 * @param numeroCase
	 */
	public Case(int deplacement, int defense, int numeroCase)
	{
		super();
		this.deplacement = deplacement;
		this.defense = defense;
		this.numeroCase = numeroCase;
	}

}