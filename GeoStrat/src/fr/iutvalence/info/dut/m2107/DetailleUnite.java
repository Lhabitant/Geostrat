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
	 * is use to display the Staf of a unite
	 */
	public void afficherStatUnite()
	{
		
	}
} 
