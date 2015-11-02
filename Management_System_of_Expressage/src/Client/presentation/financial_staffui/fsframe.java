package Client.presentation.financial_staffui;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class fsframe extends JFrame{

	
	public fsframe(){
		financial_staffui fs = new financial_staffui();
		this.add(fs);
    	this.setSize(750, 550);
    	this.setLocation(400, 100);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
	}
	
	public static void main(String[] args) {
		fsframe fsframe = new fsframe();
	}
}
