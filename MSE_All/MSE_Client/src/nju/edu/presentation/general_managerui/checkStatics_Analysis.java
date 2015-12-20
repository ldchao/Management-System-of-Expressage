package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JLabel;

public class checkStatics_Analysis extends JPanel {

	checkStatics_Analysis checkStatics_Analysis=this;
	public checkStatics_Analysis(JFrame main) {
		checkStatics_Analysis checkStatics_Analysisframe=this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);
		
		Button button = new Button("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager newmanager=new Manager(main);	
				main.remove(checkStatics_Analysis);
				main.add(newmanager);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 76, 23);
		add(button);
		
		Label label = new Label("总经理>>查看统计分析");
		label.setBounds(105, 10, 136, 23);
		add(label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkAccount newcheckAccount=new checkAccount(main);
				main.remove(checkStatics_Analysis);
				main.add(newcheckAccount);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(76, 233, 160, 128);
		add(btnNewButton);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCost_Benefit newcheckCost_Benefit=new checkCost_Benefit(main);
				main.remove(checkStatics_Analysis);
				main.add(newcheckCost_Benefit);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(286, 233, 160, 128);
		add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatistic newcheckStatistic=new checkStatistic(main);
				main.remove(checkStatics_Analysis);
				main.add(newcheckStatistic);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_2.setBounds(495, 233, 160, 128);
		add(button_2);
		
		JLabel label_1 = new JLabel("\u8D26\u6237\u67E5\u8BE2");
		label_1.setBounds(130, 196, 54, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("成本收益表查询");
		label_2.setBounds(323, 196, 95, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("统计报表查询");
		label_3.setBounds(534, 196, 84, 15);
		add(label_3);
	}
}
