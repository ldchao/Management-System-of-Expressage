package nju.edu.presentation.general_managerui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PO.LoginPO;

@SuppressWarnings("serial")
public class checkStatics_Analysis extends JPanel {
	checkStatics_Analysis checkStatics_Analysis = this;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/generalManager/checkStatics_Analysis.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings("unused")
	public checkStatics_Analysis(JFrame main, LoginPO loginPO) {
		checkStatics_Analysis checkStatics_Analysisframe = this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager newmanager = new Manager(main, loginPO);
				main.remove(checkStatics_Analysis);
				main.getContentPane().add(newmanager);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(new ImageIcon("image/transparent_circle.png"));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});

		add(button);

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		setForeground(Color.WHITE);

		JButton btnNewButton = new JButton("");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkAccount newcheckAccount = new checkAccount(main, loginPO);
				main.remove(checkStatics_Analysis);
				main.getContentPane().add(newcheckAccount);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(85, 236, 160, 128);
		add(btnNewButton);

		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCost_Benefit newcheckCost_Benefit = new checkCost_Benefit(
						main, loginPO);
				main.remove(checkStatics_Analysis);
				main.getContentPane().add(newcheckCost_Benefit);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(293, 236, 160, 128);
		add(button_1);

		JButton button_2 = new JButton("");
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatistic newcheckStatistic = new checkStatistic(main,
						loginPO);
				main.remove(checkStatics_Analysis);
				main.getContentPane().add(newcheckStatistic);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_2.setBounds(498, 236, 160, 128);
		add(button_2);
	}
}
