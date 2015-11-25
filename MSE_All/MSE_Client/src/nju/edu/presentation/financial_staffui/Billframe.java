package nju.edu.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Billframe extends JFrame {

	/**
	 * Create the panel.
	 */
	public Billframe() {

		getContentPane().setLayout(null);
		
		Billframe bf = this;

		JLabel label = new JLabel("财务人员>>期初建账");
		label.setBounds(88, 5, 518, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bf.dispose();
				fsframe fsframe = new fsframe();
			}
		});
		button_4.setBounds(10, 1, 68, 23);
		getContentPane().add(button_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bf.dispose();
				Newbillframe nbframe = new Newbillframe();
				Thread t = new Thread(nbframe);
				t.start();
			}
		});
		btnNewButton.setBounds(159, 221, 160, 128);
		getContentPane().add(btnNewButton);

		JLabel label_1 = new JLabel("\u65B0\u5EFA\u5E10");
		label_1.setBounds(216, 197, 81, 15);
		getContentPane().add(label_1);

		JLabel label_4 = new JLabel("\u67E5\u770B\u671F\u521D\u4FE1\u606F");
		label_4.setBounds(461, 197, 81, 15);
		getContentPane().add(label_4);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bf.dispose();
				CheckBillframe cbf = new CheckBillframe();
			}
		});
		button.setBounds(417, 221, 160, 128);
		getContentPane().add(button);
		
		
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