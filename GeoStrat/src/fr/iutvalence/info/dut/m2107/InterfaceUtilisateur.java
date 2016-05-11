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
//!\\ User Iterface in construction //!\\
//*******************************************************************************************	
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
	    JPanel pan = new JPanel();
	    //Background color
	    pan.setBackground(Color.GREEN);        
	    // prevent Jframe that Jpanel will be content panel
	    this.setContentPane(pan);               
	    this.setVisible(true);
	    
	    // create a new button
	    JButton bouton = new JButton();
	    bouton.setText("Mon bouton");
	    
	    //add the button on the screen
	    pan.add(bouton);
	    
	    //the animation
	    go();
	}

	
	
	//!\\ Test d'une animation ( merci open classroom




private InterfaceUtilisateur pan = new InterfaceUtilisateur();

	private int posY;

	private int posX;



public int getPosX() {
  return posX;
}

public void setPosX(int posX) {
  this.posX = posX;
}

public int getPosY() {
  return posY;
}

public void setPosY(int posY) {
  this.posY = posY;
}


private void go(){  

  //Les coordonnées de départ de notre rond

  int x = pan.getPosX(), y = pan.getPosY();

  //Le booléen pour savoir si l'on recule ou non sur l'axe x

  boolean backX = false;

  //Le booléen pour savoir si l'on recule ou non sur l'axe y

  boolean backY = false;

  

  //Dans cet exemple, j'utilise une boucle while

  //Vous verrez qu'elle fonctionne très bien

  while(true){

    //Si la coordonnée x est inférieure à 1, on avance

    if(x < 1)backX = false;

    //Si la coordonnée x est supérieure à la taille du Panneau moins la taille du rond, on recule

    if(x > pan.getWidth()-50)backX = true;

    //Idem pour l'axe y

    if(y < 1)backY = false;

    if(y > pan.getHeight()-50)backY = true;

    

    //Si on avance, on incrémente la coordonnée

    if(!backX)

      pan.setPosX(++x);

    //Sinon, on décrémente

    else

      pan.setPosX(--x);

    //Idem pour l'axe Y

    if(!backY)

      pan.setPosY(++y);

    else

      pan.setPosY(--y);

      

    //On redessine notre Panneau

    pan.repaint();

    //Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde

    try {

      Thread.sleep(3);

    } catch (InterruptedException e) {

      e.printStackTrace();

    }

  }    

}  

}
	  
	  
	  
	  
	  
	

