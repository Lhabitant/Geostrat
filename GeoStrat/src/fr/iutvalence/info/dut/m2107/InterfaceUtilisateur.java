package fr.iutvalence.info.dut.m2107;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color; 
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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
public class InterfaceUtilisateur extends JFrame implements ActionListener, MouseListener, MouseMotionListener {	

	
//*******************************************************************************************
//!\\ User Interface in construction //!\\
//*******************************************************************************************	
	
	/**
	 * C'est utilisé pour afficher les informations contenu dans InterfaceUtilisateurEnJeu
	 * Un JPanel utilisé pour afficher des boutons
	 * boutons :
	 * - fin de tour 
	 * - bouton1
	 */
	private InterfaceUtilisateurEnJeu pan = new InterfaceUtilisateurEnJeu();
	/**
	 * 
	 */
	private JPanel container = new JPanel();
	/**
	 * Jpanel utilisé pour l'affichage d'un tableau de bouton, obsolète
	 */
	private JPanel but = new JPanel();
	/**
	 * Jpanel utilisé lors de test
	 */
	private JPanel test = new JPanel();
	// we create a new JLabel
    JLabel label = new JLabel("JLabel");
    /**
     * création du bouton de fin de tour, il fait appel à la classe EndTurnAction
     * La classe permet d'afficher "vous avez cliqué ici"
     */
    JButton boutonEnd = new JButton(new EndTurnAction("Fin de tour"));	// create a new button with the class Bouton
    /**
     * création du bouton de fin de tour, il fait appel à la classe Action1
     * La classe permet d'afficher "vous avez cliqué là"
     */
    JButton bouton1 = new JButton(new Action1("bouton1"));	// create a new button with the class Bouton
    
    /**
     * création d'un bouton pour l'affficher dans un tableau, fonctionnel mais obsolète
     */
    JButton boutonA = new JButton("A");
    /**
     * création d'un bouton pour l'affficher dans un tableau, fonctionnel mais obsolète
     */
    JButton boutonB = new JButton("B");
    /**
     * création d'un bouton pour l'affficher dans un tableau, fonctionnel mais obsolète
     */
    JButton boutonC = new JButton("C");
    /**
     * création d'un bouton pour l'affficher dans un tableau, fonctionnel mais obsolète
     */
    JButton boutonD = new JButton("D");
	
    /**
     *  Résolution en X de la fenetre
     */
    private final int RESX = 1200;
    /**
     *  Résolution en Y de la fenetre
     */
	private final int RESY = 700;
	/**
	 * largueur des bouton
	 */
	private final int LENDBUT = 150;
	/**
	 * longueur des bouton
	 */
	private final int lENDBUT = 50;
	/**
	 * position en x du bouton fin de tour
	 */
	private final int ENDBUTX = 1025;
	/**
	 * position en y du bouton fin de tour
	 */
	private final int ENDBUTY = 500;
	/**
	 * position en x du bouton1
	 */
	private final int BUTX = 1025;
	/**
	 * position en y du bouton1
	 */
	private final int BUTY = 560;
	/**
	 * permet d'afficher les coordonnée de la souris en x en fonction du tableau
	 */
	private static int mouseX = 0;
	/**
	 * permet d'afficher les coordonnée de la souris en y en fonction du tableau
	 */
	private static int mouseY = 0;
	/**
	 * sert à la selection d'une case
	 */
	private static int tileSelectX;
	/**
	 * sert à la selection d'une case
	 */
	private static int tileSelectY;
	/**
	 * create a new map
	 */
	Map map = new Map();
	/**
	 * create a new tab
	 */
	Case[][] carte = map.getCases();
	/**
	 * it use for modify a case
	 * 	 */
	Action1 action = new Action1("test");
	
	
	/**
	 * Création de la fenetre et de tout ce qui la compose
	 */
	public InterfaceUtilisateur()
	{ 
	  
		/**
		 * nom de la fenetre
		 */
		this.setTitle("GeoStrat");
		/**
		 * résolution de la fenetre
		 */
	    this.setSize(RESX, RESY );
	    /**
	     * position de la fenetre (ici au centre de l'écran)
	     */
	    this.setLocationRelativeTo(null);	 // position of window (center)
	    /**
	     * ferme la fenetre quand on clique sur la croix rouge
	     */
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // position of window (center)          
	    /**
	     * permet d'afficher la fenêtre à l'écran
	     */
	    this.setVisible(true);	//we can see the window
	   // this.setLocationRelativeTo(null);
	    
	    
	    /**
	     * affiche une grille en 2 par 2 de boutons, les 3 indiquent les espacements en x et y
	     * obsolète
	     */
	    but.setLayout(new GridLayout(2,2,3,3));
	    /**
	     * ajoute un boutonA
	     */
	    but.add(boutonA);
	    /**
	     * ajoute un boutonB
	     */
	    but.add(boutonB);
	    /**
	     * ajoute un boutonC
	     */
	    but.add(boutonC);
	    /**
	     * ajoute un boutonD
	     */
	    but.add(boutonD);
	    /**
	     * ajoute un bouton fin de tour
	     */
	    pan.add(boutonEnd);	//add the button "fin de tour" on the screen
	    /**
	     * ajoute un bouton1
	     */
	    pan.add(bouton1);	//add the button "bouton1" on the screen 
	    /**
	     * permet de fixer les boutons 
	     * fin de tour
	     * Bouton1
	     */
	    pan.setLayout(null);	// permet de fixer les boutons
	   // setLayout(null);
	   // but.setBounds(100, 100, 500, 375);
	   // container.setLayout(new BorderLayout());
	    
	    //display they different Jpanel
	    this.setContentPane(pan);
	    //this.setContentPane(but);
	   
	    //this.setVisible(true);
	    
	    
	   
	    /**
	     * position du bouton fin de tour
	     */
	    boutonEnd.setBounds(ENDBUTX, ENDBUTY, LENDBUT,  lENDBUT);	 //postion of end turn buttom (here bouton) (x,y,longueur,largueur)
	    /**
	     * position du bouton1
	     */
	    bouton1.setBounds(BUTX, BUTY, LENDBUT,  lENDBUT);	 //postion buttom1 (here bouton) (x,y,longueur,largueur)
	    //go();
	    
	    
	    /**
	     * permet d'écouter la souris
	     */
        this.addMouseListener(this);
        /**
	     * permet d'écouter les mouvements de la souris
	     */
        this.addMouseMotionListener(this);
        
  

	}

	public InterfaceUtilisateur(String filename) throws Exception {

	 }



	public void mouseDragged(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	/**
	 * méthode qui sert à lire et à afficher les coordonées de la souris 
	 */
	public void mouseMoved(MouseEvent e) //lorsque la souris bouge
	{
		mouseX = (e.getX()-10)/50; // on lit les coordonnées de la souris puis on calcule son positionnement en x
		mouseY = (e.getY()-30)/50; // on lit les coordonnées de la souris puis on calcule son positionnement en y
		//System.out.println("Position: x= "+mouseX+" y = "+mouseY); 	// on affiche les coordonnées calculé de la souris
		//System.out.println("Real Position: x= "+e.getX()+" y = "+e.getY());// on affiche les coordonnées de la souris
	}
	/**
	 * méthode qui sert à lire et à afficher les coordonées de la souris durant un clic
	 */
	public void mouseClicked(MouseEvent e) 
	{
		
		tileSelectX = mouseX;
		tileSelectY = mouseY;
		System.out.println("Case selectionne");
		System.out.println("Position: x= "+mouseX+" y = "+mouseY); 	// on affiche les coordonnées calculé de la souris
		
		if(action.getSelect() == false)
		{
			map.displayMap();
			carte[tileSelectY][tileSelectX] = new MountainCase() ;
			map.setCases(carte);
		}		
				
	}
	
	/**
	 * @return mouseX
	 */
	public static int getMouseX()
	{
		return mouseX;
	}
	
	/**
	 * @return mouseY
	 */
	public static int getMouseY()
	{
		return mouseY;
	}
	
	/**
	 * @return tileSelectX
	 */
	public static int getTileSelectX()
	{
		return tileSelectX;
	}
	
	/**
	 * @return tileSelectY
	 */
	public static int getTileSelectY()
	{
		return tileSelectY;
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	  
	  
	  
	  
	  
	

