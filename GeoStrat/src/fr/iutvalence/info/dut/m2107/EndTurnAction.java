/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
/**
 * @author Lo�c
 *	La classe est utilis� pour une action encore non d�finie
 *Actuellement elle affiche dans la console "Vous avez cliqu� ici"
 */
public class EndTurnAction extends AbstractAction {
	/**
	 * constructeur utilis� pour la cr�ation d'un bouton de type Action1
	 * @param texte
	 */
	public EndTurnAction(String texte){
		super(texte);
	}
	
	/**
	 * Cette m�thode permet d'executer un code lorsque que l'on clique sur un bouton
	 */
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Vous avez cliqu� ici");	// affiche dans la console un texte
	} 

}
