/**
 * 
 */
package fr.iutvalence.info.dut.m2107;



/**
 * 
 * @author Fluchaire
 */
class Carte
{
	/**
	 * this attribut is use to make a aggregation with  Partie
	 */
	protected Partie partie;
	/**
	 * this attribut is use to make a composition with interface utilisateur
	 */
	protected InterfaceUtilisateur interfaceUtilisateur;
	
	/**
	 * this method is use to make a aggregation with  Partie
	 */
	public Carte()
	{
		this.partie = new Partie(); 
		this.partie.setCarte(this);
	}
	
	/**
	 * this attribut is use to make a aggregation with case
	 */
	protected Case tile;
	
	/**
	 *  this method is use to make a aggregation with  carte
	 * @return  carte
	 */
	public Case getCase()
	{
		return tile;

	}
	/**
	 * this method is use to make a aggregation with Case
	 * @param Case
	 */
	public void setCarte(Case tile) 
	{
		this.tile = tile;
	}
	
	
	 
	

	/**
	 * this method is use to make a composition with InterfaceUtilisateur
	 * @return interface utilisateur
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
		interfaceUtilisateur.setCarte(this);
	}
	
	/**
	 * 
	 */
	public void creer()
	{
		
	}
	
	/**
	 * 
	 */
	public void afficherCarte()
	{
		
	}
}
