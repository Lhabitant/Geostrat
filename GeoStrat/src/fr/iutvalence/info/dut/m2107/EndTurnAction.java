/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
/**
 * @author Loïc
 *
 */
public class EndTurnAction extends AbstractAction {

	public EndTurnAction(String texte){
		super(texte);
	}
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Vous avez cliqué ici");
	} 

}
