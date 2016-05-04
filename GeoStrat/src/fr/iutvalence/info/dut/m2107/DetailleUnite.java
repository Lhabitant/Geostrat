package fr.iutvalence.info.dut.m2107;
/**
 * 
 */

/**
 * @author Lecomte
 *
 */
public class DetailleUnite {

	/**
	 * this attribut is use to make a composition with interface utilisateur
	 */
	protected InterfaceUtilisateur interfaceUtilisateur;
	
	/**
	 * this attribut is use to make a composition with interface utilisateur
	 */
	protected Unite unite;
	/**
	 * this method is use to make a composition with InterfaceUtilisateur
	 * @return interfaceUtilisateur
	 */
	public InterfaceUtilisateur getInterfaceUtilisateur() {
		return interfaceUtilisateur;
	}

	/**
	 * this method is use to make a composition with InterfaceUtilisateur 
	 * @param interfaceUtilisateur
	 */
	public void setInterfaceUtilisateur(InterfaceUtilisateur interfaceUtilisateur) {
		this.interfaceUtilisateur = interfaceUtilisateur;
		interfaceUtilisateur.setDetailleUnite(this);
	}
	
	/**
	 * this method is use to make a composition with Unite
	 * @return unite
	 */
	public Unite getUnite() {
		return unite;
	}
	
	/**
	 * this method is use to make a composition with Unite
	 * @param unite
	 */
	public void setUnite(Unite unite) {
		this.unite = unite;
	}
	
	
	/**
	 * is use to display the Staf of a unite
	 */
	public void afficherStatUnite()
	{
		
	}
} 
