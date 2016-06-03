package fr.iutvalence.info.dut.m2107;

import java.util.Random;



public class MapTest {
	
	public final static int SIZE = 20;
    
    protected Case[][] cases= new Case[SIZE][SIZE];
    
    Random r = new Random();


	public final void test() {
		int valeur = 0 + r.nextInt(4 - 0); // generate a random number
		if (valeur>4)
			System.out.println("Valeur non prise en compte");
		
	}

}

