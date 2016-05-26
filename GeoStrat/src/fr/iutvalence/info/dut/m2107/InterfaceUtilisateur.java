package fr.iutvalence.info.dut.m2107;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color; 
import java.awt.Graphics;
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
	private JPanel container = new JPanel();
	// we create a new JLabel
    JLabel label = new JLabel("JLabel");
    // create a new button with the class Bouton
    JButton boutonEnd = new JButton(new EndTurnAction("Fin de tour"));
    JButton bouton1 = new JButton(new Action1("bouton1"));
    
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

	    //add the button "fin de tour" on the screen
	    pan.add(boutonEnd);
	    //add the button "bouton1" on the screen
	    pan.add(bouton1);
	    // permet de fixer les boutons
	    pan.setLayout(null);
	    container.setLayout(new BorderLayout());
	    
	    this.setContentPane(pan);
	    this.setVisible(true);
	    
	    //postion of end turn buttom (here bouton) (x,y,longueur,largueur)
	    boutonEnd.setBounds(ENDBUTX, ENDBUTY, LENDBUT,  lENDBUT);
	    bouton1.setBounds(BUTX, BUTY, LENDBUT,  lENDBUT);
	    // position of a Label
	    container.add(label, BorderLayout.NORTH);
	    //go();
	    
	    
	    
	    Object[][] data = {

	    	      {"Cysboy", "28 ans", "1.80 m"},

	    	      {"BZHHydde", "28 ans", "1.80 m"},

	    	      {"IamBow", "24 ans", "1.90 m"},

	    	      {"FunMan", "32 ans", "1.85 m"}

	    	    };


	    	    //Les titres des colonnes

	    	    String  title[] = {"Pseudo", "Age", "Taille"};

	    	    JTable tableau = new JTable(data, title);

	    	    //Nous ajoutons notre tableau à notre contentPane dans un scroll

	    	    //Sinon les titres des colonnes ne s'afficheront pas !

	    	    this.getContentPane().add(new JScrollPane(tableau));
	    
	    
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	  public static void main(String[] args){
		  InterfaceUtilisateur fen = new InterfaceUtilisateur();
	    fen.setVisible(true);
	  }   
	

	
	//a old code not important
	/*
	 private void go()
	 {
		 int x = pan.getPosX(), y = pan.getPosY();
		 boolean backX = false;
		 boolean backY = false;
		  
		 while(true)
		    {
			 	if(x <1)
			 	{
			 		backX = false;	
			 	}
			 	if (y < 20)
			 	{
			 		backY = false;
			 	}
			 	if (x == pan.getWidth()-50)
			    {
			 		backX = true;
			    }
			    if( y == pan.getHeight()-250)
			    {
			    	backY = true;	  
			    }
			    
			    if(!backX)
			        pan.setPosX(++x);
			      else
			        pan.setPosX(--x);
			    if(!backY)
			        pan.setPosY(++y);
			      else
			        pan.setPosY(--y);

			      pan.repaint();  
		      try
		      {
		        Thread.sleep(10);
		      } 
		      catch (InterruptedException e)
		      {
		        e.printStackTrace();
		      }
		    }
	 }
*/
	
	
}
	  
	  
	  
	  
	  
	

