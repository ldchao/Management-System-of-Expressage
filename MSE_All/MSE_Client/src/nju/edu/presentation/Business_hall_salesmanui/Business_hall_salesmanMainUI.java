package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Color;
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

import PO.LoginPO;
import nju.edu.presentation.financial_staffui.ReceiFormPanel;

@SuppressWarnings("serial")
public class Business_hall_salesmanMainUI extends JFrame {
	private JPanel contentPane;
	Business_hall_salesmanMainUI main;

	/**
	 * Create the frame.
	 */
	public Business_hall_salesmanMainUI(LoginPO loginPO) {
		main = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 750, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		getContentPane().add(contentPane);
		this.setResizable(false);
		contentPane.setLayout(null);

		JLabel label_1 = new JLabel("Hello! " + loginPO.getName());
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(655, 12, 100, 15);
		setForeground(Color.WHITE);
		contentPane.add(label_1);

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
		contentPane.add(btnNewButton);

		// 车辆装车管理按钮
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VehicleLoadManageUI r = new VehicleLoadManageUI(main,
						contentPane, loginPO);
				main.remove(contentPane);
				main.getContentPane().add(r);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(153, 174, 125, 100);
		contentPane.add(btnNewButton_1);

		// 车辆信息管理按钮
		JButton vehicleBtn = new JButton("New button");
		vehicleBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VehicleMainUI vehicleImfoUI = new VehicleMainUI(main,
						contentPane,loginPO);
				main.remove(contentPane);
				main.getContentPane().add(vehicleImfoUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		vehicleBtn.setBounds(335, 175, 125, 100);
		contentPane.add(vehicleBtn);

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DriverMainUI driverMainUI = new DriverMainUI(main, contentPane, loginPO);
				main.remove(contentPane);
				main.getContentPane().add(driverMainUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(504, 175, 125, 100);
		contentPane.add(button);

		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ReceiFormUI receiUI = new ReceiFormUI(main, contentPane,
						loginPO);
				main.remove(contentPane);
				main.getContentPane().add(receiUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(153, 355, 125, 100);
		contentPane.add(button_1);

		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SendUI sendUI = new SendUI(main, contentPane, loginPO);
				main.remove(contentPane);
				main.getContentPane().add(sendUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_2.setBounds(335, 355, 125, 100);
		contentPane.add(button_2);

		JButton button_3 = new JButton("New button");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(contentPane);
				ReceiFormPanel rfp = new ReceiFormPanel(main, contentPane);
				main.getContentPane().add(rfp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_3.setBounds(504, 355, 125, 100);
		contentPane.add(button_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		contentPane.add(toolBar);

		JLabel label_2 = new JLabel("状态栏");
		label_2.setForeground(Color.WHITE);
		toolBar.add(label_2);
	}
}
