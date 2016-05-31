/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * @author Victor
 *
 */
public class CityCase extends Case
{
	protected Joueur proprietaire;
	
	
	public CityCase() {
		super();
		this.proprietaire = null;
	}
	
	/**
	 * @param proprietaire
	 */
	public CityCase(Joueur proprietaire) {
		super();
		this.proprietaire = proprietaire;
	}

	@Override
	public int getVitesse() {
		return 50;
	}

	@Override
	public int getDefense() {
		return 75;
	}
	
	String getType()
	{
		return "Ville";
	}
	
	public void switchOwner(Joueur newProprio) {
        this.proprietaire = newProprio;
    }
 
	public boolean isCatchable()
	{
		return true;
	}

}
