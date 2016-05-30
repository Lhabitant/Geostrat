package fr.iutvalence.info.dut.m2107;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color; 
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author Lecomte Loïc
 *
 */
// a error, i don't know why, but well it's work
public class InterfaceUtilisateur extends JFrame implements ActionListener {	

	
//*******************************************************************************************
//!\\ User Interface in construction //!\\
//*******************************************************************************************	
	


	
	
	private InterfaceUtilisateurEnJeu pan = new InterfaceUtilisateurEnJeu();
	//private JPanel container = new JPanel();
	private JPanel but = new JPanel();
	private JPanel test = new JPanel();
	// we create a new JLabel
    JLabel label = new JLabel("JLabel");
    // create a new button with the class Bouton
    JButton boutonEnd = new JButton(new EndTurnAction("Fin de tour"));
    JButton bouton1 = new JButton(new Action1("bouton1"));
    
    JButton boutonA = new JButton("A");
    JButton boutonB = new JButton("B");
    JButton boutonC = new JButton("C");
    JButton boutonD = new JButton("D");
	
    private final int RESX = 1200;
	private final int RESY = 700;
	
	private final int LENDBUT = 150;
	private final int lENDBUT = 50;
	private final int ENDBUTX = 1025;
	private final int ENDBUTY = 500;
	private final int BUTX = 1025;
	private final int BUTY = 560;
	


   
	/**
	 * this method is use to make a window
	 */
	public InterfaceUtilisateur()
	{ 
	  
		// name of window 
		this.setTitle("GeoStrat");
		// This of window X,Y
	    this.setSize(RESX, RESY );
	    // position of window (center)
	    this.setLocationRelativeTo(null);
	    //stop the programm when we close the window
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    //we can see the window
	    this.setVisible(true);
	    this.setLocationRelativeTo(null);
	    
	    but.setLayout(new GridLayout(2,2,3,3));
	    but.add(boutonA);
	    but.add(boutonB);
	    but.add(boutonC);
	    but.add(boutonD);
	    //add the button "fin de tour" on the screen
	    test.add(boutonEnd);
	    //add the button "bouton1" on the screen 
	    test.add(bouton1);
	    // permet de fixer les boutons
	    test.setLayout(null);
	    setLayout(null);
	    but.setBounds(100, 100, 500, 375);
	   // container.setLayout(new BorderLayout());
	    
	    //display they different Jpanel
	    this.setContentPane(test);
	    this.setContentPane(but);
	   
	    this.setVisible(true);
	    
	    
	    //postion of end turn buttom (here bouton) (x,y,longueur,largueur)
	    boutonEnd.setBounds(ENDBUTX, ENDBUTY, LENDBUT,  lENDBUT);
	    bouton1.setBounds(BUTX, BUTY, LENDBUT,  lENDBUT);
	    //go();
	    
	    
	
	}




	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
	  
	  
	  
	  
	  
	

