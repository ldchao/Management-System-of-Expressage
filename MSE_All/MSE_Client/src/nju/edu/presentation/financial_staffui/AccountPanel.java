package nju.edu.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PO.LoginPO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AccountPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AccountPanel(LoginPO loginPO, JFrame main) {
		setSize(750, 600);
		setLayout(null);

		AccountPanel accountPanel = this;

		JLabel label = new JLabel(
				"\u8D22\u52A1\u4EBA\u5458>>\u8D26\u6237\u7BA1\u7406");
		label.setBounds(87, 10, 470, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(630, 10, 54, 15);
		add(lblHello);

		JLabel label_1 = new JLabel("\u65B0\u5EFA\u8D26\u6237");
		label_1.setBounds(217, 192, 54, 15);
		add(label_1);

		JLabel label_4 = new JLabel("\u5DF2\u6709\u8D26\u6237\u7BA1\u7406");
		label_4.setBounds(462, 192, 81, 15);
		add(label_4);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(accountPanel);
				FmainPanel fm = new FmainPanel(loginPO, main);
				main.add(fm);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		add(button_4);

		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(accountPanel);
				NewAccountPanel nacp = new NewAccountPanel(loginPO, main);
				Thread t = new Thread(nacp);
				t.start();
				main.add(nacp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(159, 222, 160, 128);
		add(button_1);

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(accountPanel);
				CheckAccountPanel cap = new CheckAccountPanel(loginPO, main);
				Thread t = new Thread(cap);
				t.start();
				main.add(cap);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(417, 222, 160, 128);
		add(button);

	}
}