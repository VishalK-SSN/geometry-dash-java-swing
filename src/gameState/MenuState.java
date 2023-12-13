package gameState;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import game.GameWindow;

public class MenuState implements GameState {

	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 0, GameWindow.WIDTH, GameWindow.HEIGHT);
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}
