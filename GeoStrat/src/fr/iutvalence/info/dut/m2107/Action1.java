/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * @author Loïc
 *	La classe est utilisé pour une action encore non définie
 *Actuellement elle affiche dans la console "Vous avez cliqué là"
 */
public class Action1 extends AbstractAction  {
	
	private static boolean select = false;

	/**
	 * constructeur utilisé pour la création d'un bouton de type Action1
	 * @param texte
	 */
	public Action1(String texte){
		super(texte);
	}
	
	/**
	 * Cette méthode permet d'executer un code lorsque que l'on clique sur un bouton
	 */
	public void actionPerformed(ActionEvent e) { 
		System.out.println(select);	// affiche dans la console un texte
		if(select == false)
		{
			select = true;
		}else
		{
			select = false;			
		}
	}
	public boolean getSelect()
	{
		return select;
	}
}

