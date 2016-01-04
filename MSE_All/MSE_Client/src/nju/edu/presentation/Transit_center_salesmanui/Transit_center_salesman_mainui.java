package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.JFrame;
import PO.LoginPO;

@SuppressWarnings("serial")
public class Transit_center_salesman_mainui extends JFrame {

	public Transit_center_salesman_mainui(LoginPO loginPO) {

		Transit_center_salesman_mainpanel tp = new Transit_center_salesman_mainpanel(
				loginPO, this);
		add(tp);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750, 600);
		setLocationRelativeTo(null);
	}

}
