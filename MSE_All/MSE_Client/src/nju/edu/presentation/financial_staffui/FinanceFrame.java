package nju.edu.presentation.financial_staffui;

import javax.swing.JFrame;

import PO.LoginPO;

@SuppressWarnings("serial")
public class FinanceFrame extends JFrame {

	/**
	 * Create the panel.
	 */

	public FinanceFrame(LoginPO loginPO) {

		FmainPanel fmainPanel = new FmainPanel(loginPO, this);
		this.add(fmainPanel);

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
