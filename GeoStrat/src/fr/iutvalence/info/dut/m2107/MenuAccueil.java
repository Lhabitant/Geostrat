/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * @author Lecomte
 *
 */
public class MenuAccueil {
 
	/**
	 * this attribut is use to make a aggregation with  GeoStrat
	 */
	protected GeoStrat geostrat;
	
	/** 
	 * this method is use to make a aggregation with  GeoStrat
	 */
	public MenuAccueil()
	{
		this.geostrat = new GeoStrat();
		this.geostrat.setMenuAccueil(this);
	}


}
