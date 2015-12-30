package nju.edu.presentation.Business_hall_salesmanui;

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
import javax.swing.JToolBar;

import nju.edu.presentation.financial_staffui.ReceiFormPanel;
import PO.LoginPO;

@SuppressWarnings("serial")
public class Business_hall_salesmanMainPanel extends JPanel {

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/businessHall_stuff/businessMain.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	public Business_hall_salesmanMainPanel(LoginPO loginPO, JFrame main) {

		JPanel panel = this;
		setLayout(null);

		JLabel label_1 = new JLabel("Hello! " + loginPO.getName());
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(655, 12, 100, 15);
		setForeground(Color.WHITE);
		add(label_1);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(13, -9, 63, 63);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon("image/transparent_circle.png"));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
			}
		});
		add(btnNewButton);

		// 车辆装车管理按钮
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VehicleLoadManageUI r = new VehicleLoadManageUI(main, panel,
						loginPO);
				main.remove(panel);
				main.getContentPane().add(r);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(121, 186, 125, 100);
		add(btnNewButton_1);

		// 车辆信息管理按钮
		JButton vehicleBtn = new JButton();
		vehicleBtn.setContentAreaFilled(false);
		vehicleBtn.setBorderPainted(false);
		vehicleBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VehicleMainUI vehicleImfoUI = new VehicleMainUI(main, panel,
						loginPO);
				main.remove(panel);
				main.getContentPane().add(vehicleImfoUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		vehicleBtn.setBounds(310, 186, 125, 100);
		add(vehicleBtn);

		JButton button = new JButton();
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DriverMainUI driverMainUI = new DriverMainUI(main, panel,
						loginPO);
				main.remove(panel);
				main.getContentPane().add(driverMainUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(499, 186, 125, 100);
		add(button);

		JButton button_1 = new JButton();
		button_1.setBounds(121, 353, 125, 100);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ReceiFormUI receiUI = new ReceiFormUI(main, panel, loginPO);
				main.remove(panel);
				main.getContentPane().add(receiUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button_1);

		JButton button_2 = new JButton();
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SendUI sendUI = new SendUI(main, panel, loginPO);
				main.remove(panel);
				main.getContentPane().add(sendUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_2.setBounds(309, 353, 125, 100);
		add(button_2);

		JButton button_3 = new JButton();
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(panel);
				ReceiFormPanel rfp = new ReceiFormPanel(main, panel);
				main.getContentPane().add(rfp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_3.setBounds(499, 352, 125, 100);
		add(button_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_2 = new JLabel("状态栏");
		label_2.setForeground(Color.WHITE);
		toolBar.add(label_2);
	}
}
