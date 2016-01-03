package nju.edu.presentation.courierui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import PO.LoginPO;
import nju.edu.presentation.Loginui.PersonalInfomation;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Courier extends JPanel {
	private PersonalInfomation perinfo;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/courier/courier.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	public Courier(JFrame main, LoginPO loginPO) {
		Courier courierframe = this;
		setBounds(300, 100, 750, 600);
		setVisible(true);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
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
		setLayout(null);
		add(btnNewButton);

		JLabel lblHello = new JLabel("Hello!" + loginPO.getName());
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
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		// ·µ»Ø°´Å¥
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order neworder = new Order(main, loginPO);
				main.remove(courierframe);
				main.getContentPane().add(neworder);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(164, 236, 160, 128);
		add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receiver newreceiver = new Receiver(main, loginPO);
				main.remove(courierframe);
				main.getContentPane().add(newreceiver);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(420, 236, 160, 128);
		add(btnNewButton_2);
	}
}
