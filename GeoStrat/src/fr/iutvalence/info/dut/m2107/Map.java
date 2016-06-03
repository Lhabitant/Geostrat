package fr.iutvalence.info.dut.m2107;

public class Map {
	
	public final static int SIZE = 5;
    
    protected Case[][] cases= new Case[SIZE][SIZE];
    
	/**
	 * Initialized the map with forest case only
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
	
	/**
	 * Getter for the class Map
	 * @return cases
	 */
	public final Case[][] getCases() 
	{
		return cases;
	}

	/**
	 * Setter for the class Map
	 * @return cases
	 */
	public void setCases(Case[][] cases) 
	{
		this.cases = cases;
	}

	/**
	 * This method permit a display for the map and a display for the type // and the speed //
	 */
	public void displayMap() 
	{
		for(int i = 0 ; i < cases.length ; i++)
        {

             for(int j = 0 ; j < cases[i].length ; j++)
             {
                 System.out.print("|" + cases[i][j].getType() /*+ cases[i][j].getVitesse() + "%"*/ + "|" + "\t");
             }
             System.out.println(); // Des que l'on a fait une ligne, on saute une ligne
        }
	}
}
