package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class checkAccount extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					checkAccount frame = new checkAccount();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public checkAccount() {
		checkAccount checkAccountframe=this;
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
				checkAccountframe.dispose();
				checkStatics_Analysis newcheckStatics_Analysis=new checkStatics_Analysis();
			}
		});
		button.setBounds(10, 10, 75, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("\u603B\u7ECF\u7406>>\u8D26\u6237\u67E5\u8BE2");
		lblNewLabel.setBounds(95, 14, 110, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u8D26\u6237");
		label.setBounds(253, 195, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(253, 284, 54, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(317, 192, 183, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(317, 281, 183, 21);
		contentPane.add(textField_1);
		
		JButton button_1 = new JButton("\u786E\u5B9A");
		button_1.setBounds(284, 368, 75, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u6E05\u7A7A");
		button_2.setBounds(385, 368, 75, 23);
		contentPane.add(button_2);
	}
}
