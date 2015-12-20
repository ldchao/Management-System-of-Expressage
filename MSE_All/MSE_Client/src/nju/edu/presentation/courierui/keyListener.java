package nju.edu.presentation.courierui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyListener implements KeyListener{

	@Override
	public void  keyTyped(KeyEvent e) {
		if (!(Character.isDigit(e.getKeyChar())||e.getKeyChar()=='.')) {
			e.consume();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
