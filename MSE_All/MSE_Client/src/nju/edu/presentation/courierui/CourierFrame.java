package nju.edu.presentation.courierui;

import javax.swing.JFrame;

import PO.LoginPO;

@SuppressWarnings("serial")
public class CourierFrame extends JFrame{
	public CourierFrame(LoginPO loginPO) {
		Courier courier=new Courier(this,loginPO);
		this.add(courier);

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
