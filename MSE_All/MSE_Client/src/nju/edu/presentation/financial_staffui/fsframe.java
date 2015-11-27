package nju.edu.presentation.financial_staffui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class fsframe extends JFrame {

	/**
	 * Create the panel.
	 */
	
	public fsframe() {
		getContentPane().setLayout(null);
		
		fsframe fs = this;
		
		JLabel label = new JLabel("财务人员");
		label.setBounds(90, 10, 470, 15);
		getContentPane().add(label);
		
		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(650, 10, 54, 15);
		getContentPane().add(lblHello);
		
		JButton btnNewButton = new JButton("New button");
	//	btnNewButton.setIcon(new ImageIcon("src/scene.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fs.dispose();
				Payframe paymain = new Payframe();
			}
		});
		btnNewButton.setBounds(108, 161, 125, 100);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fs.dispose();
				Calculateframe calframe = new Calculateframe();
				Thread t = new Thread(calframe);
				t.start();
			}
		});
		button.setBounds(316, 161, 125, 100);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fs.dispose();
				Statisticsframe sf = new Statisticsframe();
			}
		});
		button_1.setBounds(507, 161, 125, 100);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fs.dispose();
				Billframe billframe = new Billframe();
			}
		});
		button_2.setBounds(214, 329, 125, 100);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fs.dispose();
				Accountframe acf = new Accountframe();
			}
		});
		button_3.setBounds(416, 329, 125, 100);
		getContentPane().add(button_3);
		
		JLabel label_1 = new JLabel("成本管理");
		label_1.setBounds(146, 129, 57, 15);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("结算管理");
		label_2.setBounds(352, 129, 81, 15);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("统计报表");
		label_3.setBounds(544, 129, 81, 15);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("期初建账");
		label_4.setBounds(250, 304, 67, 15);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("账户管理");
		label_5.setBounds(451, 304, 67, 15);
		getContentPane().add(label_5);
		
		JButton button_4 = new JButton("\u9000\u51FA");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fs.dispose();
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		getContentPane().add(button_4);

		//frame
		this.setTitle("快递管理系统MSE客户端");
    	this.setSize(750, 600);
    	this.setLocation(400, 100);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
	}
}
