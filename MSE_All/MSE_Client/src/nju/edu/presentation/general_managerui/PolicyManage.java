package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PolicyManage extends JPanel {

	public PolicyManage(JFrame main) {
		PolicyManage policyManageframe=this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager newmanager=new Manager(main);
				main.remove(policyManageframe);
				main.add(newmanager);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 75, 23);
		add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u7B56\u7565\u7BA1\u7406");
		label.setBounds(95, 14, 211, 15);
		add(label);
		
		JLabel label_1 = new JLabel("\u85AA\u6C34\u7B56\u7565\u7BA1\u7406");
		label_1.setBounds(212, 171, 106, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u5E38\u91CF\u7B56\u7565\u7BA1\u7406");
		label_2.setBounds(464, 171, 106, 15);
		add(label_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalaryManage newsalaryManage=new SalaryManage(main);
				main.remove(policyManageframe);
				main.add(newsalaryManage);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(166, 223, 160, 128);
		add(btnNewButton);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConstantManage newconstantManage=new ConstantManage(main);
				main.remove(policyManageframe);
				main.add(newconstantManage);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(422, 223, 160, 128);
		add(button_1);
	}

}
