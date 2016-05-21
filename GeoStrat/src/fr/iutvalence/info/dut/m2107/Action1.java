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
public class Action1 extends AbstractAction  {

	public Action1(String texte){
		super(texte);
	}
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Vous avez cliqué là");
	} 
}

