package gameState;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;

public class GameStateManager implements KeyListener, MouseListener{
	
	public static GameStateManager gsm;
	
	public static final String MENU_STATE = "MENU_STATE";
	
	private String currentState;
	private GameState currentGameState;
	
	public GameStateManager() {
		
	}
	
	public void update() {
		currentGameState.update();
	}
	
	public void draw(Graphics g) {
		currentGameState.draw(g);
	}
	
	public void setState(String state) {
		currentState = state;
		// Change current game state
	}
	
	public String getState() {
		return currentState;
	}
	
	// Keyboard events
	@Override
	public void keyPressed(KeyEvent e) {
		currentGameState.keyPressed(e);
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		currentGameState.keyReleased(e);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// Will not be used
	}
	
	// Mouse events
	@Override
    public void mousePressed(MouseEvent e) {
		currentGameState.mousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        currentGameState.mouseReleased(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    	// Will not be used
    }

    @Override
    public void mouseExited(MouseEvent e) {
    	// Will not be used
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {

    }
    
}
