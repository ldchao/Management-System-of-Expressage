package Client.presentation.financial_staffui;

import javax.swing.JFrame;

public class Payframe extends JFrame {

	
	public Payframe() {
		Payorderui pui = new Payorderui();
		this.add(pui);
    	this.setSize(750, 550);
    	this.setLocation(400, 100);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
	}

}
