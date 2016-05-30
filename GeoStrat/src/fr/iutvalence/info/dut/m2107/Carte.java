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


	public void afficherMap() 
	{
	       for(int i = 0 ; i < cases.length ; i++)
	       {
	    	   for(int j = 0 ; j < cases.length ; j++)
	    	   {
	    		   System.out.print(cases[i][j].getClass().toString() + " " + cases[i][j].getVitesse() + "\t");
	    	   }
	       }
	}
	        

}