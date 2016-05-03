/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * @author Lecomte
 *
 */
public class Unite {

	/** 
	 * the name of a unite
	 */
	private char name;
	
	/**
	 * the number of a unite
	 */
	private int numeroUnite;
	
	/**
	 * the color of a unite
	 */
	private char couleur;
	
	/**
	 * the price of a unite
	 */
	private int prix;
	
	/**
	 * the attack stat of a unite
	 */
	private int statAttaque;
	
	/**
	 * the defense stat of a unite
	 */
	private int statDefense;
	
	/**
	 * the move stat of a unite
	 */
	private int statDeplacement;
	
	/**
	 * is a unite wait  
	 */
	private boolean etatAttente;
	 
	/**
	 * this attribut is use to make a composition with DetailleUnite 
	 */
	protected DetailleUnite detailleUnite;

	public DetailleUnite getDetailleUnite() {
		return detailleUnite;
	}

	public void setDetailleUnite(DetailleUnite detailleUnite)
	{
		this.detailleUnite = detailleUnite;
		detailleUnite.setUnite(this);
	}	
	
	
	/**
	 * get the number of a unite
	 * @return numeroUnite
	 */
	public int getNumeroUnite()
	{
		return numeroUnite;
		
	}
	
	/**
	 * get the color of a unite
	 * @return couleur
	 */
	public char getCouleur()
	{
		return couleur;
		
	}
	
	/**
	 * get the waitting stat of a unite
	 * @return etatAttente
	 */
	public boolean getEtatAttente()
	{
		return etatAttente;
		
	}
	
	/**
	 * for move a unite
	 */
	public void deplacer()
	{
		
	}
	/**
	 * for attack a unite
	 */
	public void attaquer()
	{
		
	}
	/**
	 * for delete a unite
	 */
	public void supprimer()
	{
		
	}
	
	/**
	 * for put to wait a unite
	 */
	public void passerEnAttente()
	{
		
	}
	/** 
	 * for capture a ennemy batiment
	 */
	public void capturer()
	{
		
	}
}
