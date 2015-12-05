package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PO.ConstantPO;
import nju.edu.VO.ConstantVO;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Constant extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public Constant(ConstantVO vo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5E38\u91CF\u5177\u4F53\u4FE1\u606F");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		label.setBounds(307, 65, 99, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u4EF7\u683C\uFF08\u5143/\u516C\u91CC\uFF09\uFF1A");
		label_1.setBounds(214, 274, 107, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u8DDD\u79BB(\u516C\u91CC)\uFF1A");
		label_2.setBounds(214, 201, 107, 15);
		contentPane.add(label_2);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.setBounds(239, 335, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_1.setBounds(410, 335, 93, 23);
		contentPane.add(button_1);
		
		textField = new JTextField();
		textField.setBounds(371, 198, 149, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(371, 271, 149, 21);
		contentPane.add(textField_1);
		
		JLabel label_3 = new JLabel("\u5730\u70B9\uFF1A");
		label_3.setBounds(214, 132, 54, 15);
		contentPane.add(label_3);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 534, 724, 28);
		contentPane.add(toolBar);
		
		JLabel label_4 = new JLabel("\u72B6\u6001");
		toolBar.add(label_4);
	}
}
