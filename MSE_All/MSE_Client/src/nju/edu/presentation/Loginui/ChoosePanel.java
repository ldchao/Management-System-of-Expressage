package nju.edu.presentation.Loginui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class ChoosePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoosePanel(JFrame main) {
		this.setLayout(null);
		this.setSize(750, 600);
		JPanel choose = this;

		JButton button = new JButton("");
		button.setBounds(250, 277, 250, 45);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		ImageIcon icon = new ImageIcon("image/mainSearchButton.png");
		Image temp = icon.getImage().getScaledInstance(button.getWidth(), button.getHeight(),
				icon.getImage().SCALE_DEFAULT);
		icon = new ImageIcon(temp);
		button.setIcon(icon);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(choose);
				// 进入订单查询界面
				ChecklistPanel checklistPanel = new ChecklistPanel(main, choose);
				main.getContentPane().add(checklistPanel);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button);

		JButton button_1 = new JButton("登 录");
		button_1.setBounds(250, 346, 250, 45);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		
		ImageIcon icon2 = new ImageIcon("image/mainLoginButton.png");
		Image temp2 = icon2.getImage().getScaledInstance(button_1.getWidth(), button_1.getHeight(),
				icon2.getImage().SCALE_DEFAULT);
		icon2 = new ImageIcon(temp2);
		button_1.setIcon(icon2);
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(choose);
				LoginPanel login = new LoginPanel(main);
				main.getContentPane().add(login);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button_1);
	}

	public void paintComponent(Graphics g) {
		int x = 0, y = 0;
		ImageIcon icon = new ImageIcon("image/main.png");
		g.drawImage(icon.getImage(), x, y, getSize().width, getSize().height, this);
	}

}
