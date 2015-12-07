package nju.edu.presentation.Loginui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import PO.LoginPO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PersonalInfomation extends JFrame {
	private boolean state = true;

	/**
	 * Create the panel.
	 */

	/*
	 * 用法模板参照financebl包中FmainPanel类中的37到57行
	 */
	public PersonalInfomation(LoginPO loginPO) {
		getContentPane().setLayout(null);

		JLabel label = new JLabel("\u59D3\u540D\uFF1A");
		label.setBounds(42, 18, 67, 15);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("\u804C\u4F4D\uFF1A");
		label_1.setBounds(42, 56, 67, 15);
		getContentPane().add(label_1);

		JLabel label_3 = new JLabel("\u7528\u6237\u540D\uFF1A");
		label_3.setBounds(42, 100, 67, 15);
		getContentPane().add(label_3);

		JLabel lblName = new JLabel(loginPO.getName());
		lblName.setBounds(128, 18, 120, 15);
		getContentPane().add(lblName);

		JLabel lblPosition = new JLabel(loginPO.getLimit());
		lblPosition.setBounds(128, 56, 120, 15);
		getContentPane().add(lblPosition);

		JLabel lblUser = new JLabel(loginPO.getUser());
		lblUser.setBounds(128, 100, 120, 15);
		getContentPane().add(lblUser);

		JButton button = new JButton("\u4FEE\u6539\u5BC6\u7801");
		button.setBounds(42, 140, 87, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				setMouseState(true);
			}
		});
		button_1.setBounds(154, 140, 87, 23);
		getContentPane().add(button_1);

		// frame
		this.setUndecorated(true);
		this.setSize(290, 215);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
	}

	public void setMouseState(boolean b) {
		this.state = b;
	}

	public boolean getMouseState() {
		return this.state;
	}
}
