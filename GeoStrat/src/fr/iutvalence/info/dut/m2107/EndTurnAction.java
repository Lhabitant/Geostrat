/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
/**
 * @author Lo�c
 *
 */
public class EndTurnAction extends AbstractAction {

	public EndTurnAction(String texte){
		super(texte);
	}
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Vous avez cliqu� ici");
	} 

}
