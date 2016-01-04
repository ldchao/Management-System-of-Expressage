package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.presentation.Transit_center_salesmanui.Transferui;

public class Warehouse_outui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Warehouse_outui(JFrame m, JPanel jp,LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = jp;
		Warehouse_outui nowPanel = this;
		setLayout(null);
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
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button);

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Warehouse_out_checkRemindui woc=new Warehouse_out_checkRemindui(main,nowPanel,loginPO);
				main.remove(nowPanel);				
				main.getContentPane().add(woc);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(134, 214, 160, 128);
		add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Storeoutorder_Input si=new Storeoutorder_Input(main,nowPanel,loginPO);
				main.remove(nowPanel);				
				main.getContentPane().add(si);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(441, 214, 160, 128);
		add(btnNewButton_2);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel lblNewLabel_4 = new JLabel("×´Ì¬À¸");
		lblNewLabel_4.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel_4);

	}
}
