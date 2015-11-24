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

public class PolicyManage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PolicyManage frame = new PolicyManage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PolicyManage() {
		PolicyManage policyManageframe=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				policyManageframe.dispose();
				Manager newmanager=new Manager();
			}
		});
		button.setBounds(10, 10, 75, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u7B56\u7565\u7BA1\u7406");
		label.setBounds(95, 14, 211, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u85AA\u6C34\u7B56\u7565\u7BA1\u7406");
		label_1.setBounds(212, 171, 106, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5E38\u91CF\u7B56\u7565\u7BA1\u7406");
		label_2.setBounds(464, 171, 106, 15);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				policyManageframe.dispose();
				SalaryManage newsalaryManage=new SalaryManage();
			}
		});
		btnNewButton.setBounds(166, 223, 160, 128);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				policyManageframe.dispose();
				ConstantManage newconstantManage=new ConstantManage();
			}
		});
		button_1.setBounds(422, 223, 160, 128);
		contentPane.add(button_1);
	}

}
