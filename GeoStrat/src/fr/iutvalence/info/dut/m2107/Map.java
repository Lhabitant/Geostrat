package fr.iutvalence.info.dut.m2107;

import java.util.Random;

public class Map {
	
	public final static int SIZE = 20;
    
    protected Case[][] cases= new Case[SIZE][SIZE];
    
    Random r = new Random();
    
	/**
	 * Initialized the map with different case
	 * @param cases
	 */
	public Map() 
	{
		for (int i = 0 ; i < SIZE ; i++){
			for (int j = 0 ; j < SIZE ; j++)
			{
				int valeur = 0 + r.nextInt(4 - 0); // generate a random number
				if(valeur == 0)
				{
					cases[i][j] = new ForestCase(); 
				}
				if(valeur == 1)
				{
					cases[i][j] = new MountainCase();
				}
				if(valeur == 2)
				{
					cases[i][j] = new PlainCase();
				}
				if(valeur == 3)
				{
					cases[i][j] = new CityCase();
				}
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
	 * This method permit a display for the map and a display for the type and the vitesse
	 */
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
