package Client.presentation.financial_staffui;

import javax.swing.JFrame;

import javafx.scene.layout.Pane;

public class testmain extends JFrame{

	public testmain(){
		financial_staffui fs = new financial_staffui();
		this.add(fs);
    	this.setSize(720, 550);
    	this.setLocation(400, 100);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
	}
	
	public static void main(String[] args) {
		testmain frame = new testmain();
	}
}
