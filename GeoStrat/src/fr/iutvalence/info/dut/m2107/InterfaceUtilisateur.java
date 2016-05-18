package fr.iutvalence.info.dut.m2107;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color; 
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Lecomte Lo�c
 *
 */
public class InterfaceUtilisateur extends JFrame {	

	
//*******************************************************************************************
//!\\ User Interface in construction //!\\
//*******************************************************************************************	
	private InterfaceUtilisateurEnJeu pan = new InterfaceUtilisateurEnJeu();
	private JPanel container = new JPanel();
	// we create a new JLabel
    JLabel label = new JLabel("Mon premier JLabel");
    // create a new button with the class Bouton
    JButton bouton = new Bouton("test");
	
	private final int RESX = 1200;
	private final int RESY = 700;
		
	/**
	 * this method is use to make a window
	 */
	public InterfaceUtilisateur()
	{ 

		// name of window 
		this.setTitle("GeoStrat");
		// This of window X,Y
		//TODO use variable X and Y
	    this.setSize(RESX, RESY );
	    // position of window (center)
	    this.setLocationRelativeTo(null);
	    //stop the programm when we close the window
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    //we can see the window
	    this.setVisible(true);
	    
	    //new instance of panel
	    //Panel pan = new Panel();
	    pan.setLayout(null);
	    //Background color
	    setBackground(Color.GREEN);        
	    // prevent Jframe that Jpanel will be content panel
	    this.setContentPane(pan);               
	    this.setVisible(false);
	     
	    //add the button on the screen
	    pan.add(bouton);
	    this.setContentPane(pan);
	    this.setVisible(true);
	    //postion of a buttom (here bouton) (x,y,longueur,largueur)
	    bouton.setBounds(0, this.getHeight()-80, 100, 50);
	    // position of a Label
	    container.add(label, BorderLayout.NORTH);
	    go();
	    
	    
	}

	
	
	
	
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
	
	
	
}
	  
	  
	  
	  
	  
	

