package fr.iutvalence.info.dut.m2107;


import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.image.BufferedImage;
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


private final int REALRECTX = 0;
private final int REALRECTY = 30;


private final int SIZERECT = 150;
private final int UNITERECTX = 0;
private final int UNITERECTY = 500;
private final int AUNITERECTX = 500;
private final int AUNITERECTY = 500;
private final int INFORECTX = 675;
private final int INFORECTY = 500;
private final int MAPRECTX = 850;
private final int MAPRECTY = 500;


public void paintComponent(Graphics g){

	
//!\\ Don't forget for a rect it's always
	 // x, y, longueur, largeur
	 	/**
	 	 * It's the "real" map
	 	 */
	 	//color of rect of oval
	  //  g.setColor(Color.white);
 	    //size of rect of oval
	   //  g.fillRect(REALRECTX,REALRECTY,this.getWidth(),this.getHeight()-200);
	    
	    /**
	     * it's all unit info's rect
	     */
	    //color
	    g.setColor(Color.RED);
	    //size
	    g.fillRect(UNITERECTX,UNITERECTY,SIZERECT,SIZERECT);
	    
	    /**
	     * it's all unit info's rect
	     */
	    //color
	    g.setColor(Color.YELLOW);
	    //size
	    g.fillRect(AUNITERECTX,AUNITERECTY,SIZERECT,SIZERECT);
	    
	    /**
	     * it's the information tile rect
	     */
	    g.setColor(Color.LIGHT_GRAY);
	    //size
	    g.fillRect(INFORECTX,INFORECTY,SIZERECT,SIZERECT);
	    
	    /**
	     * it's the map's rect
	     */
	    //color
	    g.setColor(Color.DARK_GRAY);
	    //size
	    g.fillRect(MAPRECTX,MAPRECTY,SIZERECT,SIZERECT);
	    
	    
	    // color of oval
	    g.setColor(Color.red);
	    //the oval
	    g.fillOval(posX, posY, 50, 50);
	    
	    try {
		      Image img = ImageIO.read(new File("doge.png"));
		      g.drawImage(img, AUNITERECTX, AUNITERECTY, this);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }         
   
	  }
  
 
 
 // use for the oval, but no use at all
/*
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
*/
}
