package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class Manager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager frame = new Manager();
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
	public Manager() {
		Manager managerframe=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(10, 10, 76, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406");
		label.setBounds(107, 10, 62, 23);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managerframe.dispose();
				StaffManager staffManager=new StaffManager();
			}
		});
		btnNewButton.setBounds(166, 140, 125, 100);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managerframe.dispose();
				checkStatics_Analysis checkStatics_Analysis=new checkStatics_Analysis();
			}
		});
		btnNewButton_1.setBounds(453, 140, 125, 100);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managerframe.dispose();
				PolicyManage policyManage=new PolicyManage();
			}
		});
		btnNewButton_2.setBounds(166, 356, 125, 100);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managerframe.dispose();
				ListApprove newlistApprove=new ListApprove();
			}
		});
		btnNewButton_3.setBounds(453, 356, 125, 100);
		contentPane.add(btnNewButton_3);
		
		JLabel label_1 = new JLabel("\u4EBA\u5458\u673A\u6784\u7BA1\u7406");
		label_1.setBounds(191, 115, 98, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u7B56\u7565\u7BA1\u7406");
		label_2.setBounds(205, 327, 54, 15);
		contentPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel("查看统计分析");
		lblNewLabel.setBounds(481, 115, 83, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("\u5355\u636E\u5BA1\u6279");
		label_3.setBounds(488, 327, 54, 15);
		contentPane.add(label_3);
		
		String[] s={"1","2"};
	}
}
