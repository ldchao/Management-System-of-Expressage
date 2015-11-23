<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/presentation/mainui/MainFrame.java
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
=======
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
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/presentation/mainui/MainFrame.java
