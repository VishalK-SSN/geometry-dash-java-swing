package game;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	public static final int WIDTH = 780, HEIGHT = 500;
	
	public GameWindow() {
		super();
		this.init();
	}
	
	public void init() {
		super.setTitle("Geometry Dash");
		super.setSize(WIDTH, HEIGHT);
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
	}
}
