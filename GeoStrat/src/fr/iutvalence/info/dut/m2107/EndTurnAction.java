/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
/**
 * @author Loïc
 *	La classe est utilisé pour une action encore non définie
 *Actuellement elle affiche dans la console "Vous avez cliqué ici"
 */
public class EndTurnAction extends AbstractAction {
	/**
	 * constructeur utilisé pour la création d'un bouton de type Action1
	 * @param texte
	 */
	public EndTurnAction(String texte){
		super(texte);
	}
	
	/**
	 * Cette méthode permet d'executer un code lorsque que l'on clique sur un bouton
	 */
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Vous avez cliqué ici");	// affiche dans la console un texte
	} 

}
