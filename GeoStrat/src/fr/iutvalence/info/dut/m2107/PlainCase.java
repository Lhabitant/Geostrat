/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * @author Victor
 *
 */
public class PlainCase extends Case{

	/**
	 * Getter for speed
	 * @return integer
	 */
	public int getVitesse() {
		return 100;
	}

	/**
	 * Getter for defense
	 * @return integer
	 */
	public int getDefense() {
		return 10;
	}
	
	/**
	 * Display for the type of the case
	 * @return cases type
	 */
	public String getType()
	{
		return "Plaine";
	}
}
