package nju.edu.presentation.Transit_center_salesmanui;

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

import nju.edu.presentation.Loginui.PersonalInfomation;
import PO.LoginPO;

@SuppressWarnings("serial")
public class Transit_center_salesman_mainpanel extends JPanel {
	private PersonalInfomation perinfo;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/TransitCenterSalesman/Transit_center_salesman_mainui.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	/**
	 * Create the frame.
	 */
	public Transit_center_salesman_mainpanel(LoginPO loginPO, JFrame main) {

		Transit_center_salesman_mainpanel panel = this;

		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);
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

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(15, -9, 63, 63);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(image1);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				main.dispose();
			}
		});
		add(btnNewButton);

		// 中转接收按钮
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receiveui r = new Receiveui(main, panel, loginPO);
				main.remove(panel);
				main.getContentPane().add(r);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(86, 237, 160, 128);
		add(btnNewButton_1);

		// 录入中转单按钮
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transferui t = new Transferui(main, panel, loginPO);
				main.remove(panel);
				main.getContentPane().add(t);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(291, 237, 160, 128);
		add(btnNewButton_2);

		// 装车管理按钮
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shippingui s = new Shippingui(main, panel, loginPO);
				main.remove(panel);
				main.getContentPane().add(s);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(499, 237, 160, 128);
		add(btnNewButton_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 540, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_2 = new JLabel("状态栏");
		label_2.setForeground(Color.WHITE);
		toolBar.add(label_2);

	}
}
