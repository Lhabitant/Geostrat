package fr.iutvalence.info.dut.m2107;

import java.util.Scanner;

public class Usine extends Batiment {

	/**
	 * @param deplacement
	 * @param defense
	 * @param numeroCase
	 */
	public Usine(int deplacement, int defense, int numeroCase)
	{
		super(deplacement, defense, numeroCase);
		// TODO Auto-generated constructor stub
	}

	public void constuireUnite() {
		// TODO - implement Usine.constuireUnite
		Scanner sc = new Scanner(System.in);
		System.out.println("fait un choix");
		int nomunit = sc.nextInt();
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

}