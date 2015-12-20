package nju.edu.presentation.general_managerui;

import javax.swing.JFrame;

public class ManagerFrame extends JFrame{
	public ManagerFrame() {
		// TODO Auto-generated constructor stub
		Manager manager=new Manager(this);
		this.add(manager);
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
