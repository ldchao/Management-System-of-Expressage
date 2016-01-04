package nju.edu.presentation.Transit_center_storemasterui;

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

import PO.LoginPO;
import nju.edu.businesslogic.storebl.StoreMessageBL;
import nju.edu.presentation.Loginui.PersonalInfomation;

public class Transit_center_storemaster_mainui_Panel extends JPanel {

	StoreMessageBL sm;
	JLabel label_3;
	private PersonalInfomation perinfo;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/TransitCenterStoreMaster/Transit_center_storemaster_mainui.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height, this);
	}

	public Transit_center_storemaster_mainui_Panel(JFrame main, LoginPO loginPO,StoreMessageBL sm) {
		this.setLayout(null);
		Transit_center_storemaster_mainui_Panel contentPane = this;

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		label_3 = new JLabel("状态栏");
		label_3.setForeground(Color.WHITE);
		toolBar.add(label_3);

		label_3.setText("仓库信息初始化成功");

		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");

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
				sm.save();
				label_3.setText("库存信息储存完毕");
				System.exit(0);
				main.dispose();
			}
		});
		add(button);

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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Warehouse_inui wi = new Warehouse_inui(main, contentPane, loginPO);
				main.remove(contentPane);
				main.getContentPane().add(wi);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(211, 171, 125, 100);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon("image/transparent_small.png"));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon("image/mask_small.png"));
			}
		});
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory_managementui im = new Inventory_managementui(main, contentPane, loginPO);
				main.remove(contentPane);
				main.getContentPane().add(im);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(414, 171, 125, 100);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon("image/transparent_small.png"));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton_1.setIcon(new ImageIcon("image/mask_small.png"));
			}
		});
		add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Warehouse_outui wo = new Warehouse_outui(main, contentPane, loginPO);
				main.remove(contentPane);
				main.getContentPane().add(wo);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(211, 343, 125, 100);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon("image/transparent_small.png"));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton_2.setIcon(new ImageIcon("image/mask_small.png"));
			}
		});
		add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(414, 343, 125, 100);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Optionui o = new Optionui(main, contentPane, loginPO, sm);
				main.remove(contentPane);
				main.getContentPane().add(o);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});

		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setIcon(new ImageIcon("image/transparent_small.png"));
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton_3.setIcon(new ImageIcon("image/mask_small.png"));
			}
		});
		add(btnNewButton_3);
	}

}
