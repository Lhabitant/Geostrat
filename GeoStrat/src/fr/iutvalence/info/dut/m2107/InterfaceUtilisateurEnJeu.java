package fr.iutvalence.info.dut.m2107;


import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Image;
import java.io.IOException;




/**
 * 
 * @author Lecomte Loïc
 *
 */
public class InterfaceUtilisateurEnJeu extends JPanel
{
private int Resolution;
 	


//*******************************************************************************************
//!\\ User Interface in construction //!\\
//*******************************************************************************************	

private int posX = -50;
private int posY = -50; 

 public void paintComponent(Graphics g){
	   //color of rect of oval
	    g.setColor(Color.white);
	    //size of rect of oval
	    g.fillRect(0,20,this.getWidth(),this.getHeight()-200);
	    
	    g.setColor(Color.DARK_GRAY);
	    g.fillRect(900,485,this.getWidth(),this.getHeight());
	    
	    // color of oval
	    g.setColor(Color.red);
	    //the oval
	    g.fillOval(posX, posY, 50, 50);
	    
	    try {

	        Image img = ImageIO.read(new File("doge.jpeg"));

	       // g.drawImage(img, 0, 0, this);

	        //Pour une image de fond

	        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

	      } catch (IOException e) {

	        e.printStackTrace();

	      }    
	  }
  
 
 
 // use for the oval
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

}
