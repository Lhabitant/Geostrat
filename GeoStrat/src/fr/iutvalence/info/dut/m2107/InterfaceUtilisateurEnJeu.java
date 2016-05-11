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
 * @author Aliot
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
	    g.setColor(Color.red);
	    g.fillOval(posX, posY, 50, 50);
	    try {

	        Image img = ImageIO.read(new File("doge.jpeg"));

	        g.drawImage(img, 0, 0, this);

	        //Pour une image de fond

	        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

	      } catch (IOException e) {

	        e.printStackTrace();

	      }    
	  }
  
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
