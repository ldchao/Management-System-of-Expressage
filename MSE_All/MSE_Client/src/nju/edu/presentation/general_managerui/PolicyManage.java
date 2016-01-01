package nju.edu.presentation.general_managerui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import PO.LoginPO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PolicyManage extends JPanel {

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/generalManager/PolicyManage.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	public PolicyManage(JFrame main, LoginPO loginPO) {
		PolicyManage policyManageframe = this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);

		JLabel lblHello = new JLabel("Hello!" + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(677, 6, 67, 25);
		add(lblHello);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager newmanager = new Manager(main, loginPO);
				main.remove(policyManageframe);
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

		JButton btnNewButton = new JButton("");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalaryManage newsalaryManage = new SalaryManage(main, loginPO);
				main.remove(policyManageframe);
				main.getContentPane().add(newsalaryManage);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(165, 238, 160, 128);
		add(btnNewButton);

		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConstantManage newconstantManage = new ConstantManage(main,
						loginPO);
				main.remove(policyManageframe);
				main.getContentPane().add(newconstantManage);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(421, 236, 160, 128);
		add(button_1);
	}

}
