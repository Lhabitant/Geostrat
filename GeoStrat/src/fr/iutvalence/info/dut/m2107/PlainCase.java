/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * @author Victor
 *
 */
public class PlainCase extends Case{

	@Override
	public int getVitesse() {
		return 100;
	}

	@Override
	public int getDefense() {
		return 10;
	}
	
	String getType()
	{
		return "Plaine";
	}
}
