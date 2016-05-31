package fr.iutvalence.info.dut.m2107;

public class Map {
	
	public final static int SIZE = 20;
    
    protected Case[][] cases= new Case[SIZE][SIZE];
	/**
	 * @param cases
	 */
	public Map() 
	{
		for (int i = 0 ; i < SIZE ; i++){
			for (int j = 0 ; j < SIZE ; j++)
			{
				cases[i][j] = new ForestCase();
			}
		 }
	}
	
	private final Case[][] getCases() 
	{
		return cases;
	}

	
	private final void setCases(Case[][] cases) 
	{
		this.cases = cases;
	}

	public void displayMap() 
	{
		for(int i = 0 ; i < cases.length ; i++)
        {
             for(int j = 0 ; j < cases[i].length ; j++)
             {
                 System.out.print(cases[i][j].getType() + " " + cases[i][j].getVitesse() + "\t");
             }
             System.out.println(); // Des que l'on a fait une ligne, on saute une ligne
        }
	}
}
