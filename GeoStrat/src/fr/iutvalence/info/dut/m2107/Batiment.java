package fr.iutvalence.info.dut.m2107;

 public abstract class Batiment{
	 
	    // Override dans chaque classe héritant de Batiment
	 
	protected Joueur proprietaire;
	 
	public Batiment(int deplacement, int defense)
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void changeProprietaire(Joueur newProprio) {
        this.proprietaire = newProprio;
    }
 
	public boolean isCatchable()
	{
		return true;
	}

	
	public void supprimer() {
		// TODO - implement Batiment.supprimer
		throw new UnsupportedOperationException();
	}


}