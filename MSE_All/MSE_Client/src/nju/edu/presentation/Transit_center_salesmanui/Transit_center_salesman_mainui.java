package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import nju.edu.presentation.Loginui.PersonalInfomation;
import PO.LoginPO;

@SuppressWarnings("serial")
public class Transit_center_salesman_mainui extends JFrame {

	private JPanel contentPane;
	Transit_center_salesman_mainui main;
	private PersonalInfomation perinfo;

	/**
	 * Create the frame.
	 */
	public Transit_center_salesman_mainui(LoginPO loginPO) {
		main = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750,600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		getContentPane().add(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("中转中心业务员");
		label.setBounds(100, 14, 127, 15);
		contentPane.add(label);

		JLabel label_1 = new JLabel(loginPO.getName() + "，你好！");
		label_1.setBounds(600, 14, 100, 15);
		contentPane.add(label_1);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				perinfo = new PersonalInfomation(loginPO, main);
				perinfo.setLocation(750, 125);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (perinfo.getMouseState() == true)
					perinfo.dispose();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				perinfo.setLocation(750, 125);
				perinfo.setAlwaysOnTop(true);
				perinfo.setMouseState(false);
			}
		});

		JButton btnNewButton = new JButton("注销");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
			}
		});
		btnNewButton.setBounds(10, 10, 65, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("中转接收");
		lblNewLabel.setBounds(112, 152, 54, 15);
		contentPane.add(lblNewLabel);

		// 中转接收按钮
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receiveui r = new Receiveui(main, contentPane, loginPO);
				main.remove(contentPane);
				main.getContentPane().add(r);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(66, 191, 160, 128);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("录入中转单");
		lblNewLabel_1.setBounds(331, 152, 83, 15);
		contentPane.add(lblNewLabel_1);

		// 录入中转单按钮
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transferui t = new Transferui(main, contentPane, loginPO);
				main.remove(contentPane);
				main.getContentPane().add(t);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(292, 191, 160, 128);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_2 = new JLabel("装车管理");
		lblNewLabel_2.setBounds(548, 152, 54, 15);
		contentPane.add(lblNewLabel_2);

		// 装车管理按钮
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shippingui s = new Shippingui(main, contentPane, loginPO);
				main.remove(contentPane);
				main.getContentPane().add(s);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(515, 191, 160, 128);
		contentPane.add(btnNewButton_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		contentPane.add(toolBar);

		JLabel label_2 = new JLabel("状态栏");
		toolBar.add(label_2);

	}
}
