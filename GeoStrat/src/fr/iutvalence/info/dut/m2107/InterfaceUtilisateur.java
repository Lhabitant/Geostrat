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
// a error, i don't know why, but well it's work
public class InterfaceUtilisateur extends JFrame implements ActionListener, MouseListener, MouseMotionListener {	

	
//*******************************************************************************************
//!\\ User Interface in construction //!\\
//*******************************************************************************************	
	


	
	
	private InterfaceUtilisateurEnJeu pan = new InterfaceUtilisateurEnJeu();
	private JPanel container = new JPanel();
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
	    pan.add(boutonEnd);
	    //add the button "bouton1" on the screen 
	    pan.add(bouton1);
	    // permet de fixer les boutons
	    pan.setLayout(null);
	    setLayout(null);
	    but.setBounds(100, 100, 500, 375);
	    container.setLayout(new BorderLayout());
	    
	    //display they different Jpanel
	    this.setContentPane(pan);
	    //this.setContentPane(but);
	   
	    this.setVisible(true);
	    
	    
	    //postion of end turn buttom (here bouton) (x,y,longueur,largueur)
	    boutonEnd.setBounds(ENDBUTX, ENDBUTY, LENDBUT,  lENDBUT);
	    bouton1.setBounds(BUTX, BUTY, LENDBUT,  lENDBUT);
	    //go();
	    
	    

        this.addMouseListener(this);
        this.addMouseMotionListener(this);

	}

	public InterfaceUtilisateur(String filename) throws Exception {

	 }



	public void mouseDragged(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	//lorsque la souris bouge
	public void mouseMoved(MouseEvent e) 
	{
		System.out.println("Position: x= "+e.getX()/50+" y = "+e.getY()/50);
		System.out.println("Real Position: x= "+e.getX()+" y = "+e.getY());
	}
	public void mouseClicked(MouseEvent e) 
	{
		System.out.println("Clic: x= "+e.getX()/50+" y = "+e.getY()/50);
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
	  
	  
	  
	  
	  
	

