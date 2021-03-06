package nju.edu.presentation.system_administratorui;

import javax.swing.JFrame;

import PO.LoginPO;

@SuppressWarnings("serial")
public class Administratorframe extends JFrame {

	/**
	 * Create the panel.
	 */
	public Administratorframe(LoginPO loginPO) {

		AdminPanel adminPanel = new AdminPanel(loginPO, this);
		this.add(adminPanel);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}