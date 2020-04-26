package aether_project;

//import java.awt.Color;

import javax.swing.JFrame;
//import javax.swing.JPanel;

public class Fenetre extends JFrame {
//	public Fenetre() {
//		this.setTitle("Ma première fenêtre Java");
//		this.setSize(400, 100);
//		this.setLocationRelativeTo(null);
//
//		// Instanciation d'un objet JPanel
//		JPanel pan = new JPanel();
//		// Définition de sa couleur de fond
//		pan.setBackground(Color.ORANGE);
//		// On prévient notre JFrame que notre JPanel sera son content pane
//		this.setContentPane(pan);
//		this.setVisible(true);
//	}
	

//	public Fenetre() {
//		this.setTitle("Ma première fenêtre Java");
//		this.setSize(100, 150);
//		this.setLocationRelativeTo(null);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setContentPane(new Panneau());
//		this.setVisible(true);
//	} 
	

	private Panneau pan = new Panneau();

	public Fenetre() {
		this.setTitle("Animation");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(pan);
		this.setVisible(true);
		go();
	}

	private void go() {
		for (int i = -50; i < pan.getWidth(); i++) {
			
			int x = pan.getPosX();
			int y = pan.getPosY();
			
			x++;
			y++;
			
			pan.setPosX(x);
			pan.setPosY(y);
			
			pan.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}     
}
