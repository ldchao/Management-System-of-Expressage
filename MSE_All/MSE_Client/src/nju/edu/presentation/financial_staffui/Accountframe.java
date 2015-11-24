package nju.edu.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accountframe extends JFrame {

	/**
	 * Create the panel.
	 */
	public Accountframe() {

		getContentPane().setLayout(null);
		
		Accountframe af = this;
		

		JLabel label = new JLabel(
				"\u8D22\u52A1\u4EBA\u5458>>\u8D26\u6237\u7BA1\u7406");
		label.setBounds(87, 10, 470, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(630, 10, 54, 15);
		getContentPane().add(lblHello);

		JLabel label_1 = new JLabel("\u65B0\u5EFA\u8D26\u6237");
		label_1.setBounds(217, 192, 54, 15);
		getContentPane().add(label_1);

		JLabel label_4 = new JLabel("\u5DF2\u6709\u8D26\u6237\u7BA1\u7406");
		label_4.setBounds(462, 192, 81, 15);
		getContentPane().add(label_4);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				af.dispose();
				fsframe fs = new fsframe();
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		getContentPane().add(button_4);

		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				af.dispose();
				NewAccountframe nacframe = new NewAccountframe();
			}
		});
		button_1.setBounds(159, 222, 160, 128);
		getContentPane().add(button_1);

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				af.dispose();
				CheckAccountframe caf = new CheckAccountframe();
			}
		});
		button.setBounds(417, 222, 160, 128);
		getContentPane().add(button);

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