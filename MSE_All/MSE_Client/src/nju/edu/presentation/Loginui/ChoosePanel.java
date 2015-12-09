package nju.edu.presentation.Loginui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class ChoosePanel extends JPanel {
	

	/**
	 * Create the panel.
	 */
	public ChoosePanel(JFrame main) {
		this.setLayout(null);
		this.setSize(750, 600);
		JPanel choose = this;

		JButton button = new JButton("查询订单");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(choose);
				// 进入订单查询界面
				ChecklistPanel checklistPanel = new ChecklistPanel(main, choose);
				main.getContentPane().add(checklistPanel);
				main.invalidate();
				main.repaint();
			}
		});
		button.setFont(new Font("华文隶书", Font.BOLD, 25));
//		button.setIcon(new ImageIcon("image/main查询订单按钮.png"));
		button.setBounds(279, 270, 200, 40);
		add(button);

		JButton button_1 = new JButton("\u7528\u6237\u767B\u5F55");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(choose);
				LoginPanel login = new LoginPanel(main);
				main.getContentPane().add(login);
				main.invalidate();
				main.repaint();
			}
		});
		button_1.setFont(new Font("华文隶书", Font.BOLD, 25));
		button_1.setBounds(279, 339, 200, 40);
		add(button_1);
	}
	
	
	public void paintComponent(Graphics g){
		int x =0,y=0;
		ImageIcon icon = new ImageIcon("image/Artboard 1@3x.png");
		g.drawImage(icon.getImage(), x, y, getSize().width,
			     getSize().height, this);
		
	}
//	protected void paintComponent(Graphics g){
//		super.paintComponent(g);
//		
//	}

}
