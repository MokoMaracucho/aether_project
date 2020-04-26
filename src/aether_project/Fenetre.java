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
//		for (;;) {
//			int x = pan.getPosX(), y = pan.getPosY();
//			x++;
//			y++;
//			
//			System.out.println("PosX : " + x + ", PosY : " + y);
//			
//			pan.setPosX(x);
//			pan.setPosY(y);
//			pan.repaint();
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			// Si nos coordonnées arrivent au bord de notre composant
//			// On réinitialise
//			if (x == pan.getWidth() || y == pan.getHeight()) {
//				pan.setPosX(-50);
//				pan.setPosY(-50);
//			}
//		}
		
		// Les coordonnées de départ de notre rond
		int x = pan.getPosX(), y = pan.getPosY();
		// Le booléen pour savoir si l'on recule ou non sur l'axe x
		boolean backX = false;
		// Le booléen pour savoir si l'on recule ou non sur l'axe y
		boolean backY = false;

		// Dans cet exemple, j'utilise une boucle while
		// Vous verrez qu'elle fonctionne très bien
		while (true) {
			// Si la coordonnée x est inférieure à 1, on avance
			if (x < 1)
				backX = false;

			// Si la coordonnée x est supérieure à la taille du Panneau moins la taille du
			// rond, on recule
			if (x > pan.getWidth() - 50)
				backX = true;

			// Idem pour l'axe y
			if (y < 1)
				backY = false;
			if (y > pan.getHeight() - 50)
				backY = true;

			// Si on avance, on incrémente la coordonnée
			// backX est un booléen, donc !backX revient à écrire
			// if (backX == false)
			if (!backX)
				pan.setPosX(++x);

			// Sinon, on décrémente
			else
				pan.setPosX(--x);

			// Idem pour l'axe Y
			if (!backY)
				pan.setPosY(++y);
			else
				pan.setPosY(--y);

			// On redessine notre Panneau
			pan.repaint();

			// Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
