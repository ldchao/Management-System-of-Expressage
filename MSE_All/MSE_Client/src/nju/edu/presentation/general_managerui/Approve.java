package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Approve extends JPanel {


	public Approve() {
		setBounds(100, 100, 750, 600);
		setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button.setBounds(10, 10, 76, 23);
		add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u5355\u636E\u5BA1\u6279");
		label.setBounds(96, 14, 108, 15);
		add(label);
		
		Button button_1 = new Button("\u8BA2\u5355");
		button_1.setBounds(84, 67, 125, 100);
		add(button_1);
		
		Button button_2 = new Button("\u6D3E\u4EF6\u5355");
		button_2.setBounds(310, 67, 125, 100);
		add(button_2);
		
		Button button_3 = new Button("\u8425\u4E1A\u5385\u5230\u8FBE\u5355");
		button_3.setBounds(530, 67, 125, 100);
		add(button_3);
		
		Button button_4 = new Button("\u4E2D\u8F6C\u4E2D\u5FC3\u5230\u8FBE\u5355");
		button_4.setBounds(84, 244, 125, 100);
		add(button_4);
		
		Button button_5 = new Button("\u4E2D\u8F6C\u5355");
		button_5.setBounds(310, 244, 125, 100);
		add(button_5);
		
		Button button_6 = new Button("\u5165\u5E93\u5355");
		button_6.setBounds(530, 244, 125, 100);
		add(button_6);
		
		Button button_7 = new Button("\u51FA\u5E93\u5355");
		button_7.setBounds(84, 421, 125, 100);
		add(button_7);
		
		Button button_8 = new Button("\u6536\u6B3E\u5355");
		button_8.setBounds(310, 421, 125, 100);
		add(button_8);
		
		Button button_9 = new Button("\u4ED8\u6B3E\u5355");
		button_9.setBounds(530, 421, 125, 100);
		add(button_9);
	}
}
