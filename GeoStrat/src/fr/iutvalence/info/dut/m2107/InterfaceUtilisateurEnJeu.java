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

/**
 * constante utilisé pour une animation obsolète
 * c'est la position en x d'un rond
 */
private int posX = -50;
/**
 * constante utilisé pour une animation obsolète
 * c'est la position en y d'un rond
 */
private int posY = -50;

/**
 * constante utilisé pour l'affichage de la zone de jeu
 * c'est la position en x du rectangle
 */
private final int REALRECTX = 0;
/**
 * Constante utilisé pour l'affichage de la zone de jeu
 * permet de régler la largeur du triangle
 */
private final int CALE = 210;
/**
 * constante utilisé pour l'affichage de la zone de jeu
 * c'est la position en y du rectangle
 */
private final int REALRECTY = 0;

/**
 * C'est la taille des différents rectangles utilisé pour leur longueur et largeur
 */
private final int SIZERECT = 150;
/**
 *  C'est la position en x du rectangle d'affichage des informations de l'unite selectionné  
 * 	rectangle rouge
 */
private final int UNITERECTX = 0;
/**
 *  C'est la position en y du rectangle d'affichage des informations de l'unite selectionné  
 *  rectangle rouge
 */
private final int UNITERECTY = 500;
/**
 * C'est la position en x du rectangle d'affichage de la lsite de toute les unitées
 * rectangle jaune
 */
private final int AUNITERECTX = 500;
/**
 * C'est la position en y du rectangle d'affichage de la lsite de toute les unitées
 * rectangle jaune
 */
private final int AUNITERECTY = 500;
/**
 * C'est la position en x du rectangle d'information de la case selectionné
 * renctangle gris clair
 */
private final int INFORECTX = 675;
/**
 * C'est la position en y du rectangle d'information de la case selectionné
 * renctangle gris clair
 */
private final int INFORECTY = 500;
/**
 * C'est la position en x du rectangle d'affichage de la carte en miniature
 * rectangle gris
 */
private final int MAPRECTX = 850;
/**
 * C'est la position en y du rectangle d'affichage de la carte en miniature
 * rectangle gris
 */
private final int MAPRECTY = 500;
/**
 * C'est le nombre de colonne que le programme va afficher
 */
private final int NBRC = 9;
/**
 * C'est le nombre de ligne que le programme va afficher
 */
private final int NBRL = 23;


/**
 * 
 * 
 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
 */
public void paintComponent(Graphics g){
	/**
	 * Variable qui sert à afficher les colonnes
	 */
	int lX = 0; 
	/**
	 * Variable qui sert à afficher les lignes
	 */
	int lY = 0;
	 
	
						//!\\ x, y, longueur, largeur
	 	/**
	 	 * Création du rectangle "zone de jeu"
	 	 * couleur blanc
	 	 */
	  	g.setColor(Color.white);	//color of rect 
	    g.fillRect(REALRECTX,REALRECTY,this.getWidth(),this.getHeight()-CALE);	//size of rect 
	    
	    /**
	     *  Création du tableau de jeu
	     */
	    g.setColor(Color.black);	//passage à la couleur noir
	    for(int x = 0; x <= NBRC; x++)	// boucle utilisé pour la création des colonnes
	    {
	    	  g.drawLine(0,lX ,this.getWidth(),lX); 	// on affiche les colonnes
	    	  lX = lX + 50; 	// on déplace la prochaine ligne dee 50
	    }
	    for(int y = 0; y <= NBRL; y++)	// boucle utilisé pour la création des lignes
	    {
	    	  g.drawLine(lY,0 ,lY,this.getHeight());	// on affiche les lignes
	    	  lY = lY + 50;	// on déplace la prochaine ligne dee 50
	    }
	    
	    
	    
	    /**
	     * Création du rectangle info unite
	     * couleur rouge
	     */
	    g.setColor(Color.RED); //color
	    g.fillRect(UNITERECTX,UNITERECTY,SIZERECT,SIZERECT);	//size
	    
	    /**
	     * Création du rectangle liste unite
	     * couleur jaune
	     */
	    g.setColor(Color.YELLOW);	//color
	    g.fillRect(AUNITERECTX,AUNITERECTY,SIZERECT,SIZERECT);	//size
	    
	    /**
	     * Création du rectangle info case
	     * couleur girs clair
	     */
	    g.setColor(Color.LIGHT_GRAY);	//color
	    g.fillRect(INFORECTX,INFORECTY,SIZERECT,SIZERECT);	//size
	    
	    /**
	     * Création de la miniature de la carte
	     * couleur gris
	     */
	    g.setColor(Color.DARK_GRAY);   //color
	    g.fillRect(MAPRECTX,MAPRECTY,SIZERECT,SIZERECT);	  //size
	    
	    /*
	     * Code obsolète
	    // color of oval
	    g.setColor(Color.red);
	    //the oval
	    g.fillOval(posX, posY, 50, 50);
	    */
	    
	    /**
	     * affichage de l'image "doge"
	     */
	    try {
		      Image img = ImageIO.read(new File("doge.png")); 	// on va chercher l'image
		      g.drawImage(img, AUNITERECTX, AUNITERECTY, this);	// on affiche l'image
		    } catch (IOException e) {
		      e.printStackTrace(); 	// gestion de l'exception
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
