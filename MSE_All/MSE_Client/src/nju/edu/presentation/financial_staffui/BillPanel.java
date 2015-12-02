package nju.edu.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PO.LoginPO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class BillPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BillPanel(LoginPO loginPO, JFrame main) {

		setLayout(null);
		setSize(750, 600);

		BillPanel bp = this;

		JLabel label = new JLabel("财务人员>>期初建账");
		label.setBounds(88, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(bp);
				FmainPanel fm = new FmainPanel(loginPO, main);
				main.add(fm);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(10, 1, 68, 23);
		add(button_4);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(bp);
				NewbillPanel nbp = new NewbillPanel(loginPO,main);
				main.add(nbp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(159, 221, 160, 128);
		add(btnNewButton);

		JLabel label_1 = new JLabel("\u65B0\u5EFA\u5E10");
		label_1.setBounds(216, 197, 81, 15);
		add(label_1);

		JLabel label_4 = new JLabel("\u67E5\u770B\u671F\u521D\u4FE1\u606F");
		label_4.setBounds(461, 197, 81, 15);
		add(label_4);

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(bp);
				CheckBillPanel cbp = new CheckBillPanel(loginPO,main);
				main.add(cbp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(417, 221, 160, 128);
		add(button);
	}
}