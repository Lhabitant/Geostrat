package fr.iutvalence.info.dut.m2107;

import java.util.Scanner;

public class Factory extends Building {

	int number = 0;//made to put the number of the unity
	
	/**
	 * @param deplacement
	 * @param defense
	 * @param numeroCase
	 */
	public Factory(int deplacement, int defense)
	{
		super(deplacement, defense);
	}
/**
 * this is where a new unit is created
 * the player choose a number
 * 1 is for Triangle(Soldier)
 * 2 is for Square (Tank)
 * 3 is for Circle (Engineer)
 */
	public void constuireUnite() {
		// TODO - implement Usine.constuireUnite
		Scanner unitchose = new Scanner(System.in);
		System.out.println("Faites un choix");
		int unitname = unitchose.nextInt();

		
		if(unitname == 1)
		{
			number++;
			Unit triangle = new Soldier();
			triangle.unitNumber = number;
		}
		if(unitname == 2)
		{
			number++;
			Unit square = new Tank();
			square.unitNumber = number;
		}
		if(unitname == 3)
		{
			number++;
			Unit circle = new Engineer();
			circle.unitNumber = number;
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