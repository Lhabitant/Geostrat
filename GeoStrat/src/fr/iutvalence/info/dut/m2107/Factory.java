package fr.iutvalence.info.dut.m2107;

import java.util.Scanner;

public class Factory extends Building {

	/**
	 * @param deplacement
	 * @param defense
	 * @param numeroCase
	 */
	public Factory(int deplacement, int defense)
	{
		super(deplacement, defense);
	}

	public void constuireUnite() {
		// TODO - implement Usine.constuireUnite
		Scanner choixunit = new Scanner(System.in);
		System.out.println("fait un choix");
		int nomunit = choixunit.nextInt();
		int numero = 0;
		
		if(nomunit == 1)
		{
			numero++;
			Unite triangle = new Soldier();
			triangle.numeroUnite = numero;
			System.out.println(numero);
		}
		if(nomunit == 2)
		{
			numero++;
			Unite triangle = new Soldier();
			triangle.numeroUnite = numero;
			System.out.println(numero);
		}
		if(nomunit == 3)
		{
			numero++;
			Unite triangle = new Soldier();
			triangle.numeroUnite = numero;
			System.out.println(numero);
		}
	}
	
	/**
	 * Method for switch the owner of the factory. Owner is a player
	 * @param newProprio
	 */
	public void switchOwner(Joueur newProprio) {
        this.proprietaire = newProprio;
    }
 
	/**
	 * Method to make the factory catchable
	 * @return boolean
	 */
	public boolean isCatchable()
	{
		return true;
	}

}