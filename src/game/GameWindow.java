package game;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import gameState.GameStateManager;

public class GameWindow extends JFrame {
	public static final int WIDTH = 780, HEIGHT = 500;
	
	public GameWindow() {
		super();
		this.init();
		
		// Event Handling
		GameStateManager.gsm = new GameStateManager();
		this.addKeyListener(GameStateManager.gsm);
		this.addMouseListener(GameStateManager.gsm);
		
		// Game Loop
		Timer timer = new Timer(1000/Game.FPS, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				update();
				repaint();
			}
		});
		timer.start();
	}
	
	public void init() {
		super.setTitle("Geometry Dash");
		super.setSize(WIDTH, HEIGHT);
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
	}
	
	private void update() {
		GameStateManager.gsm.update();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		GameStateManager.gsm.draw(g);
	}
}
