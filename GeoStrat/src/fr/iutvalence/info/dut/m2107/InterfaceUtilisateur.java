package fr.iutvalence.info.dut.m2107;

import javax.swing.JFrame;

import java.awt.Color; 
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Lecomte Loïc
 *
 */
public class InterfaceUtilisateur extends JFrame {

	/**
	 * this attribut is use to make a composition with carte
	 */
	protected Carte carte;
	
	/**
	 * this attribut is use to make a composition whith carte
	 */
	protected DetailleUnite detailleUnite;
	
	
	
	/**
	 * this method is use to make a composition with carte
	 * @return carte
	 */
	public Carte getCarte() {
		return carte;
	}
	/**
	 * this method is use to make a composition with carte
	 * @param carte
	 */
	public void setCarte(Carte carte) 
	{
		this.carte = carte;
	}
	
	/**
	 * this method is use to make a composition with DetailleUnite
	 * @return detailleUnite
	 */
	public DetailleUnite getDetailleUnite()
	{
		return detailleUnite;
	}
	/**
	 * this method is use to make a composition with DetailleUnite
	 * @param detailUnite
	 */
	public void setDetailleUnite(DetailleUnite detailleUnite)
	{
		this.detailleUnite = detailleUnite;
	}
	
	 
	
//*******************************************************************************************
//!\\ User Interface in construction //!\\
//*******************************************************************************************	
	private InterfaceUtilisateurEnJeu pan = new InterfaceUtilisateurEnJeu();
		
	/**
	 * this method is use to make a window
	 */
	public InterfaceUtilisateur()
	{ 
		// name of window 
		this.setTitle("GeoStrat");
		// This of window X,Y
		//TODO use variable X and Y
	    this.setSize(400, 500);
	    // position of window (center)
	    this.setLocationRelativeTo(null);
	    //stop the programm when we close the window
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    //we can see the window
	    this.setVisible(true);
	    
	    //new instace of Jpanel
	    // JPanel pan = new JPanel();
	    //Background color
	    setBackground(Color.GREEN);        
	    // prevent Jframe that Jpanel will be content panel
	    this.setContentPane(pan);               
	    this.setVisible(false);
	    
	    // create a new button
	    JButton bouton = new JButton();
	    bouton.setText("Mon bouton");
	    
	    //add the button on the screen
	    pan.add(bouton);
	    this.setContentPane(pan);
	    this.setVisible(true);
	    go();
	}

	 private void go()
	 {
		    for(int i = -50; i < pan.getWidth(); i++)
		    {
		      int x = pan.getPosX(), y = pan.getPosY();
		      x++;
		      y++;
		      pan.setPosX(x);
		      pan.setPosY(y);
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
	  
	  
	  
	  
	  
	

