package fr.iutvalence.info.dut.m2107;

/**
 * @author Victor
 *	It's the case for the forest, this class extends of Case
 */
class ForestCase extends Case{
	
	/**
	 * Getter for speed
	 * @return integer
	 */
	public int getVitesse(){
		return 50;
	}

	/**
	 * Getter for defense
	 * @return integer
	 */
	public int getDefense() {
		return 50;
	}
	
	/**
	 * Display for the type of the case
	 * @return cases type
	 */
	public String getType()
	{
		return "Foret";
	}
}
