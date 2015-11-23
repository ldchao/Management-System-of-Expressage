package Client.presentation.mainui;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
     LoginPanle lp=null;
	
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
	}
    
	
	public MainFrame(){
    	
    	lp=new LoginPanle();
    	
    	this.add(lp);
    	this.setSize(400, 550);
    	this.setLocation(400, 100);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    }
}
