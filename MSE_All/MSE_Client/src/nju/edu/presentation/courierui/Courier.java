package nju.edu.presentation.courierui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PO.LoginPO;
import nju.edu.presentation.Loginui.PersonalInfomation;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Courier extends JPanel {
	private PersonalInfomation perinfo;

	public Courier(JFrame main,LoginPO loginPO) {
		Courier courierframe=this;
		setBounds(300, 100, 750, 600);
		setVisible(true);
		
		JButton btnNewButton = new JButton("返回");
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
		
		
		JLabel lblHello = new JLabel("Hello!"+loginPO.getName());
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
		
		JLabel label = new JLabel("\u5FEB\u9012\u5458");
		label.setBounds(96, 14, 54, 15);
		add(label);
		
		JLabel label_1 = new JLabel("\u8BA2\u5355\u8F93\u5165");
		label_1.setBounds(200, 149, 54, 15);
		add(label_1);
		
		//返回按钮
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order neworder=new Order(main,loginPO);
				main.remove(courierframe);
				main.getContentPane().add(neworder);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(150, 190, 160, 128);
		add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("收件人信息输入");
		lblNewLabel.setBounds(483, 149, 94, 15);
		add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receiver newreceiver=new Receiver(main,loginPO);
				main.remove(courierframe);
				main.add(newreceiver);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(450, 190, 160, 128);
		add(btnNewButton_2);
	}
}
