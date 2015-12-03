package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import nju.edu.presentation.financial_staffui.ReceiFormPanel;

@SuppressWarnings("serial")
public class Business_hall_salesmanMainUI extends JFrame {
	private JPanel contentPane;
	Business_hall_salesmanMainUI main;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Business_hall_salesmanMainUI frame = new Business_hall_salesmanMainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Business_hall_salesmanMainUI() {
		main = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 750, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		this.add(contentPane);
		this.setResizable(false);
		contentPane.setLayout(null);

		JLabel label = new JLabel("营业厅业务员");
		label.setBounds(100, 14, 127, 15);
		contentPane.add(label);

		JLabel label_1 = new JLabel("阙帅，你好！");
		label_1.setBounds(600, 14, 100, 15);
		contentPane.add(label_1);

		JButton btnNewButton = new JButton("注销");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
			}
		});
		btnNewButton.setBounds(10, 10, 65, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("车辆装车管理");
		lblNewLabel.setBounds(174, 127, 88, 40);
		contentPane.add(lblNewLabel);

		// 车辆装车管理按钮
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VehicleLoadManageUI r = new VehicleLoadManageUI(main, contentPane);
				main.remove(contentPane);
				main.getContentPane().add(r);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(153, 174, 125, 100);
		contentPane.add(btnNewButton_1);

		JLabel vehicleLabel = new JLabel("车辆信息管理");
		vehicleLabel.setBounds(360, 127, 78, 40);
		contentPane.add(vehicleLabel);

		// 车辆信息管理按钮
		JButton vehicleBtn = new JButton("New button");
		vehicleBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VehicleMainUI vehicleImfoUI = new VehicleMainUI(main, contentPane);
				main.remove(contentPane);
				main.getContentPane().add(vehicleImfoUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		vehicleBtn.setBounds(335, 175, 125, 100);
		contentPane.add(vehicleBtn);

		JLabel label_3 = new JLabel("司机信息管理");
		label_3.setBounds(522, 127, 78, 40);
		contentPane.add(label_3);

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DriverMainUI driverImfoUI = new DriverMainUI(main, contentPane);
				main.remove(contentPane);
				main.getContentPane().add(driverImfoUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(504, 175, 125, 100);
		contentPane.add(button);

		JLabel label_4 = new JLabel("接收");
		label_4.setBounds(201, 307, 26, 40);
		contentPane.add(label_4);

		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ReceiFormUI receiUI = new ReceiFormUI(main, contentPane);
				main.remove(contentPane);
				main.getContentPane().add(receiUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(153, 355, 125, 100);
		contentPane.add(button_1);

		JLabel label_5 = new JLabel("派件");
		label_5.setBounds(379, 307, 26, 40);
		contentPane.add(label_5);

		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SendUI sendUI = new SendUI(main, contentPane);
				main.remove(contentPane);
				main.getContentPane().add(sendUI);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_2.setBounds(335, 355, 125, 100);
		contentPane.add(button_2);

		JLabel label_6 = new JLabel("管理收款单");

		label_6.setBounds(533, 307, 65, 40);
		contentPane.add(label_6);

		JButton button_3 = new JButton("New button");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(contentPane);
				ReceiFormPanel rfp = new ReceiFormPanel(main,contentPane);
				main.add(rfp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_3.setBounds(504, 355, 125, 100);
		contentPane.add(button_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		contentPane.add(toolBar);

		JLabel label_2 = new JLabel("状态栏");
		toolBar.add(label_2);
	}
}
