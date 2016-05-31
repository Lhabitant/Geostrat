/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * @author Victor
 *
 */
public class MountainCase extends Case{

	@Override
	public int getVitesse() {
		return 25;
	}

	@Override
	public int getDefense() {
		return 75;
	}
	
	String getType()
	{
		return "Montagne";
	}
}
