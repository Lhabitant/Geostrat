package fr.iutvalence.info.dut.m2107;

/**
 * @author VickFluchaire
 * This is an abstract class for
 */
abstract class Case 
{
	public abstract int getVitesse();
	
	public abstract int getDefense();
	
	abstract String getType(); 
	
	/**
	 * This method permit to display speed movement
	 * @see Vitesse de deplacement
	 */
	public void displayVitesse()
	{
		System.out.println("Vitesse de deplacement : " + getVitesse() + "%");
	}

	/**
	 * This method permit to display defense bonus
	 * @see Bonus de defense
	 */
	public void displayDefense()
	{
		System.out.println("Bonus de défense : " + getDefense() + "%");
	}	
}