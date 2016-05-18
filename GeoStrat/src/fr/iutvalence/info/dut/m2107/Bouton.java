package fr.iutvalence.info.dut.m2107;


import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

/**
 * @author Loïc
 *
 */
public class Bouton extends JButton implements MouseListener{
	int test = 0;
	private String name;
	public Bouton(String str)
	{
		super(str);
		this.name = str;
		this.addMouseListener(this);
	}

	
	
	public void paintComponent(Graphics g)
	{ 
		Graphics2D g2d = (Graphics2D)g;
		GradientPaint gp = new GradientPaint(0,test,Color.blue, 0, 20,Color.cyan, true);
		g2d.setPaint(gp);
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		g2d.setColor(Color.white);
		g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth()/ 2 /4),(this.getHeight() / 2) + 5);
		System.out.println(test);
	}
	
	 //Méthode appelée lors du clic de souris
	  public void mouseClicked(MouseEvent event) { }

	  //Méthode appelée lors du survol de la souris
	  public void mouseEntered(MouseEvent event) 
	  { 
		  test = 10;
	  }

	  //Méthode appelée lorsque la souris sort de la zone du bouton
	  public void mouseExited(MouseEvent event)
	  { 
		  test = 0;
	  }

	  //Méthode appelée lorsque l'on presse le bouton gauche de la souris
	  public void mousePressed(MouseEvent event) { }

	  //Méthode appelée lorsque l'on relâche le clic de souris
	  public void mouseReleased(MouseEvent event) { }    

}
