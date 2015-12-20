package nju.edu.presentation.courierui;

import javax.swing.JFrame;

import PO.LoginPO;
import nju.edu.presentation.financial_staffui.FmainPanel;

public class CourierFrame extends JFrame{
	public CourierFrame() {
		Courier courier=new Courier(this);
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
