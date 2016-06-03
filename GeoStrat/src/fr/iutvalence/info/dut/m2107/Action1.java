/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * @author Lo�c
 *	La classe est utilis� pour une action encore non d�finie
 *Actuellement elle affiche dans la console "Vous avez cliqu� l�"
 */
public class Action1 extends AbstractAction  {
	
	private static boolean select = false;

	/**
	 * constructeur utilis� pour la cr�ation d'un bouton de type Action1
	 * @param texte
	 */
	public Action1(String texte){
		super(texte);
	}
	
	/**
	 * Cette m�thode permet d'executer un code lorsque que l'on clique sur un bouton
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

