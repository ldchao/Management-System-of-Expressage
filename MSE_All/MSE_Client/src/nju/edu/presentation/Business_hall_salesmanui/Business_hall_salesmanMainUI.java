package nju.edu.presentation.Business_hall_salesmanui;

import javax.swing.JFrame;

import PO.LoginPO;

@SuppressWarnings("serial")
public class Business_hall_salesmanMainUI extends JFrame {

	/**
	 * Create the frame.
	 */
	public Business_hall_salesmanMainUI(LoginPO loginPO) {
		
		Business_hall_salesmanMainPanel mainpanel = new Business_hall_salesmanMainPanel(loginPO, this);
		this.add(mainpanel);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 750, 600);
		setLocationRelativeTo(null);
		this.setResizable(false);
	}

}
