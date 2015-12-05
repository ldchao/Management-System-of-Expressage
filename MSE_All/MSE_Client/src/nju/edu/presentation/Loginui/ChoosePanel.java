package nju.edu.presentation.Loginui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ChoosePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoosePanel(JFrame main) {
		this.setLayout(null);
		this.setSize(750, 600);
		JPanel choose = this;

		JLabel label = new JLabel("\u5FEB\u9012\u7BA1\u7406\u7CFB\u7EDF");
		label.setFont(new Font("隶书", Font.BOLD, 50));
		label.setBounds(216, 93, 318, 102);
		this.add(label);

		JButton button = new JButton("\u67E5\u8BE2\u8BA2\u5355");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(choose);
				// 进入订单查询界面
				ChecklistPanel checklistPanel = new ChecklistPanel(main, choose);
				main.add(checklistPanel);
				main.invalidate();
				main.repaint();
			}
		});
		button.setFont(new Font("华文隶书", Font.BOLD, 25));
		button.setBounds(290, 243, 162, 64);
		add(button);

		JButton button_1 = new JButton("\u7528\u6237\u767B\u5F55");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(choose);
				LoginPanel login = new LoginPanel(main);
				main.add(login);
				main.invalidate();
				main.repaint();
			}
		});
		button_1.setFont(new Font("华文隶书", Font.BOLD, 25));
		button_1.setBounds(290, 364, 162, 64);
		add(button_1);
	}

}
