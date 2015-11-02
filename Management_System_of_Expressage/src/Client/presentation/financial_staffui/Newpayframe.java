package Client.presentation.financial_staffui;

import javax.swing.JFrame;

public class Newpayframe extends JFrame{
	
	public Newpayframe(){
		NewPayorder Npui = new NewPayorder();
		this.add(Npui);
    	this.setSize(750, 550);
    	this.setLocation(400, 100);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
	}

}
