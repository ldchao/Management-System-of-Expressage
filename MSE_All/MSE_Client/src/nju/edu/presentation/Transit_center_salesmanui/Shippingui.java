package nju.edu.presentation.Transit_center_salesmanui;

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

public class Shippingui extends JPanel {
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Shippingui(JFrame m,JPanel jp,LoginPO loginPO) {
		main=m;
		JPanel lastui=jp;
		Shippingui nowPanel=this;
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);
		
		JButton button = new JButton("");
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(image1);
		button.addMouseListener(new MouseAdapter() {
					@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_circle.png"));
			}	
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);				
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button);
		
		JLabel label = new JLabel("中转中心业务员>>装运管理");
		label.setBounds(100, 14, 163, 15);
		add(label);
		
		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);
		
		
		JLabel label_2 = new JLabel("消息提醒");
		label_2.setBounds(196, 180, 54, 15);
		add(label_2);
		
		//消息提醒按钮		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shipping_checkremindui check=new Shipping_checkremindui(main, nowPanel,loginPO);
				main.remove(nowPanel);				
				main.getContentPane().add(check);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(146, 219, 160, 128);
		add(btnNewButton);
		
		JLabel label_3 = new JLabel("新建装运单");
		label_3.setBounds(463, 180, 83, 15);
		add(label_3);
		
	   //新建装运单按钮		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(428, 219, 160, 128);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shipping_Inputui input=new Shipping_Inputui(main, nowPanel,loginPO);
				main.remove(nowPanel);				
				main.getContentPane().add(input);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(btnNewButton_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		label_4.setBackground(Color.WHITE);
		toolBar.add(label_4);

	}

}
