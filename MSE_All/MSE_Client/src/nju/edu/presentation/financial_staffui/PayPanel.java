package nju.edu.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PO.LoginPO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PayPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public PayPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);

		PayPanel pp = this;

		JLabel label = new JLabel("财务人员>>成本管理");
		label.setBounds(87, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(pp);
				FmainPanel fm = new FmainPanel(loginPO, main);
				main.add(fm);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(10, 1, 67, 23);
		add(button_4);

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(pp);
				NewPayorderPanel npf = new NewPayorderPanel(loginPO, main);
				Thread t = new Thread(npf);
				t.start();
				main.add(npf);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(51, 221, 160, 128);
		add(button);

		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(pp);
				CheckPayorderPanel cpf = new CheckPayorderPanel(loginPO, main);
				main.add(cpf);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(298, 221, 160, 128);
		add(button_1);

		JLabel label_1 = new JLabel("\u65B0\u5EFA\u4ED8\u6B3E\u5355");
		label_1.setBounds(97, 190, 67, 15);
		add(label_1);

		JLabel label_2 = new JLabel(
				"\u67E5\u770B\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label_2.setBounds(338, 190, 101, 15);
		add(label_2);

		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(pp);
				ProfitPanel pfp = new ProfitPanel(loginPO, main);
				main.add(pfp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_2.setBounds(539, 221, 160, 128);
		add(button_2);

		JLabel label_3 = new JLabel(
				"\u67E5\u770B\u6210\u672C\u6536\u76CA\u8868");
		label_3.setBounds(572, 190, 101, 15);
		add(label_3);
	}
}