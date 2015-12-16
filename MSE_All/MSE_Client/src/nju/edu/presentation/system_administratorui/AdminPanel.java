package nju.edu.presentation.system_administratorui;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import nju.edu.presentation.Loginui.PersonalInfomation;
import PO.LoginPO;

@SuppressWarnings("serial")
public class AdminPanel extends JPanel {
	private PersonalInfomation perinfo;

	/**
	 * Create the panel.
	 */
	public AdminPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);
		setSize(750, 600);

		AdminPanel adp = this;

		JLabel label = new JLabel("\u7CFB\u7EDF\u7BA1\u7406\u5458");
		label.setBounds(87, 10, 470, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				perinfo = new PersonalInfomation(loginPO, main);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (perinfo.getMouseState() == true)
					perinfo.dispose();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				perinfo.setAlwaysOnTop(true);
				perinfo.setMouseState(false);
			}
		});
		lblHello.setBounds(630, 10, 54, 15);
		add(lblHello);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(adp);
				NewUserPanel nup = new NewUserPanel(loginPO, main);
				main.add(nup);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(140, 213, 160, 128);
		add(btnNewButton);

		JLabel label_1 = new JLabel("\u65B0\u5EFA\u7528\u6237");
		label_1.setBounds(192, 177, 54, 15);
		add(label_1);

		JLabel label_4 = new JLabel("\u5DF2\u6709\u7528\u6237\u7BA1\u7406");
		label_4.setBounds(477, 177, 81, 15);
		add(label_4);

		JButton button_4 = new JButton("×¢Ïú");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		add(button_4);

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(adp);
				CheckUserPanel cup = new CheckUserPanel(loginPO, main);
				main.add(cup);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(434, 213, 160, 128);
		add(button);
	}

}
