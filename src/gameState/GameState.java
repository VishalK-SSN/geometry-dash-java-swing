package gameState;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;

public interface GameState {
	void update();
	void draw(Graphics g);
	void keyPressed(KeyEvent e);
	void keyReleased(KeyEvent e);
	void mousePressed(MouseEvent e);
	void mouseReleased(MouseEvent e);
}
