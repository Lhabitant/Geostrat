package fr.iutvalence.info.dut.m2107;

 public abstract class Building
 {
	 
	    // Override dans chaque classe héritant de Batiment
	 
	protected Joueur proprietaire;
	 
	public Building(int deplacement, int defense)
	{
		super();
	}
	
	/**
	 * Method for switch the owner of the building. Owner is a player
	 * @param newProprio
	 */
	public void switchOwner(Joueur newProprio) {
        this.proprietaire = newProprio;
    }
 
	/**
	 * Method to make the building catchable
	 * @return boolean
	 */
	public boolean isCatchable()
	{
		return true;
	}

}