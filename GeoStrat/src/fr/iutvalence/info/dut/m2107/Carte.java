package fr.iutvalence.info.dut.m2107;

public class Carte {
	
	public final static int BOARD_SIZE = 20;
	
	protected Case[][] cases;
	

	private Case[][] genererCarte()
	{
		Case[][] cases = new Case[BOARD_SIZE][BOARD_SIZE];
		return cases;
		
	}
	
	public Case[][] getCases() 
	{
		return cases;
	}


	public void setCases(Case[][] cases) 
	{
		this.cases = cases;
	}


	public void creer() 
	{
		// TODO - implement Carte.creer
		throw new UnsupportedOperationException();
	}

	public void afficherMap() {
		// TODO - implement Carte.afficherMap
		throw new UnsupportedOperationException();
	}

}