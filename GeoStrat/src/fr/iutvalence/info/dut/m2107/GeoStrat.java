package fr.iutvalence.info.dut.m2107;

import java.util.Scanner;

public class GeoStrat {
	
	public static void main(String[] args) {
		
		/* Read and register a player name */
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom :");
        String namescan = sc.nextLine();
        Joueur joueur1;
        joueur1 = new Joueur(namescan);
		System.out.println(" ");
		System.out.println("Bonjour " + joueur1.getName()+ " et bienvenue !");
		System.out.println(" ");
		System.out.println("Une partie de GeoStrat a �t� cr��e. Regarde la fen�tre qui a �t� cr��e ! ");
		System.out.println(" ");
        Joueur Joueur = new Joueur(joueur1, sc);
		
		InterfaceUtilisateur win = new InterfaceUtilisateur();
		Audio son = new Audio("src/music/music_1.wav");

	}

	
} 