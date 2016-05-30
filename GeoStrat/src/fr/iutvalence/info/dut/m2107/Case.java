package fr.iutvalence.info.dut.m2107;

/**
 * @author VickFluchaire
 *
 */
abstract class Case 
{

	public abstract int getVitesse();
	
	public abstract int getDefense();
	
	public void displayVitesse()
	{
		System.out.println("Vitesse de deplacement : " + getVitesse() + "%");
	}

	public void displayDefense()
	{
		System.out.println("Bonus de défense : " + getDefense() + "%");
	}
	
}