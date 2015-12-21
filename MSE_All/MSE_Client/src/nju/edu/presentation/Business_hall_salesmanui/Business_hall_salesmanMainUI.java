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
		this.add(contentPane);
		this.setResizable(false);
		contentPane.setLayout(null);

		JLabel label = new JLabel("Ӫҵ��ҵ��Ա");
		label.setBounds(100, 14, 127, 15);
		contentPane.add(label);

		JLabel label_1 = new JLabel("Hello! " + loginPO.getName());
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(655, 12, 100, 15);
		setForeground(Color.WHITE);
		contentPane.add(label_1);

		JButton btnNewButton = new JButton("ע��");
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

		JLabel lblNewLabel = new JLabel("����װ������");
		lblNewLabel.setBounds(174, 127, 88, 40);
		contentPane.add(lblNewLabel);

		// ����װ������ť
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

		JLabel vehicleLabel = new JLabel("������Ϣ����");
		vehicleLabel.setBounds(360, 127, 78, 40);
		contentPane.add(vehicleLabel);

		// ������Ϣ����ť
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

		JLabel label_3 = new JLabel("˾����Ϣ����");
		label_3.setBounds(522, 127, 78, 40);
		contentPane.add(label_3);

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

		JLabel label_4 = new JLabel("����");
		label_4.setBounds(201, 307, 26, 40);
		contentPane.add(label_4);

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

		JLabel label_5 = new JLabel("�ɼ�");
		label_5.setBounds(379, 307, 26, 40);
		contentPane.add(label_5);

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

		JLabel label_6 = new JLabel("�����տ");

		label_6.setBounds(533, 307, 65, 40);
		contentPane.add(label_6);

		JButton button_3 = new JButton("New button");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(contentPane);
				ReceiFormPanel rfp = new ReceiFormPanel(main, contentPane);
				main.add(rfp);
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

		JLabel label_2 = new JLabel("״̬��");
		toolBar.add(label_2);
	}
}
