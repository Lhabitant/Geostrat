/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * @author Lecomte Loïc
 *
 */
public class InterfaceUtilisateur {

	/**
	 * this attribut is use to make a composition with carte
	 */
	protected Carte carte;
	
	/**
	 * this attribut is use to make a composition whith carte
	 */
	protected DetailleUnite detailleUnite;
	
	
	
	/**
	 * this method is use to make a composition with carte
	 * @return carte
	 */
	public Carte getCarte() {
		return carte;
	}
	/**
	 * this method is use to make a composition with carte
	 * @param carte
	 */
	public void setCarte(Carte carte) 
	{
		this.carte = carte;
	}
	
	/**
	 * this method is use to make a composition with DetailleUnite
	 * @return detailleUnite
	 */
	public DetailleUnite getDetailleUnite()
	{
		return detailleUnite;
	}
	/**
	 * this method is use to make a composition with DetailleUnite
	 * @param detailUnite
	 */
	public void setDetailleUnite(DetailleUnite detailleUnite)
	{
		this.detailleUnite = detailleUnite;
	}
}
