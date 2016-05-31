/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * @author Victor
 *
 */
public class CaseVille extends Case
{
	protected Joueur proprietaire;
	
	
	public CaseVille() {
		super();
		this.proprietaire = null;
	}
	
	/**
	 * @param proprietaire
	 */
	public CaseVille(Joueur proprietaire) {
		super();
		this.proprietaire = proprietaire;
	}

	@Override
	public int getVitesse() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int getDefense() {
		// TODO Auto-generated method stub
		return 75;
	}
	
	public void changeProprietaire(Joueur newProprio) {
        this.proprietaire = newProprio;
    }
 
	public boolean isCatchable()
	{
		return true;
	}

}
