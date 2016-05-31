/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * @author Victor
 *
 */
public class VirtualCarte {

	/**
	 * Main for display the map in the console
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Test for the map display
//			Case c0 = new CaseForet();
//        	Case c1 = new CasePlaine();
//        	Case c2 = new CaseVille();
//        	Case c3 = new CaseMontagne();
// 
//       	Case[] cases = { c0, c1, c2, c3 };
//        	for (int i = 0; i < cases.length; i++) 
//        	{
//	       	   	cases[i].displayVitesse();
//	     	   	cases[i].displayDefense();
//       	}
               
       
        Map carte = new Map(); // appel constructeur qui va initialiser la carte via initCarte()
        carte.displayMap(); // affiche en console toute les cases : Type(Vitesse)
    }
}
