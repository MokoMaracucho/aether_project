package aether_project;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel {
//	public void paintComponent(Graphics g) {
	// Vous verrez cette phrase chaque fois que la méthode sera invoquée
//		System.out.println("Je suis exécutée !");
//		g.fillOval(20, 20, 75, 75);

//	private int posX = -50;
//	private int posY = -50;
//
//	public void paintComponent(Graphics g) {
//		g.setColor(Color.red);
//		g.fillOval(posX, posY, 50, 50);
//	}
//
//	public int getPosX() {
//		return posX;
//	}
//
//	public void setPosX(int posX) {
//		this.posX = posX;
//	}
//
//	public int getPosY() {
//		return posY;
//	}
//
//	public void setPosY(int posY) {
//		this.posY = posY;
//	}

//	}

	private int posX = -50;
	private int posY = -50;

	public void paintComponent(Graphics g) {
		// On choisit une couleur de fond pour le rectangle
		g.setColor(Color.white);
		// On le dessine de sorte qu'il occupe toute la surface
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		// On redéfinit une couleur pour le rond
		g.setColor(Color.red);
		// On le dessine aux coordonnées souhaitées
		g.fillOval(posX, posY, 50, 50);
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
