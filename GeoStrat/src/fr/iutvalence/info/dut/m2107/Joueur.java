package fr.iutvalence.info.dut.m2107;

import java.util.Scanner;

public class Joueur {

	/**
	 * 
	 */
	private int numero;
	
	/**
	 * Scanner permit a communication between the player and the application
	 */
	private Scanner scanner;	
	
	
	/**
	 * Creation of the object player
	 */
	private Object joueur;
	
	
	/**
	 * 
	 */
	String name; 
	
	
	/**
	 * @param name1
	 */
	public Joueur(String name1) 
	{
		this.name = name1; 
	}
	
	
	/**
	 * This method is dedicate to the player
	 * 
	 * @param player1
	 * @param sc
	 */
	public Joueur(Joueur player1, Scanner sc)
	{
		this.joueur = player1;
		this.scanner = sc;
	}
	
	
	/**
	 * Getter for the name
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}
	
	public int changerDeTour() {
		// TODO - implement Joueur.changerDeTour
		throw new UnsupportedOperationException();
	}

}