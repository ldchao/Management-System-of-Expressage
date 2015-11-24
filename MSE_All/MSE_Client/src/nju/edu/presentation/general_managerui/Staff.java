package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Staff extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JRadioButton radioButton_2;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JRadioButton radioButton_6;
	private JButton button;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff frame = new Staff();
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
	public Staff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u4EBA\u5458\u5177\u4F53\u4FE1\u606F");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		label.setBounds(312, 68, 96, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D");
		label_1.setBounds(223, 133, 54, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(346, 130, 173, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(346, 172, 173, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(346, 215, 173, 21);
		contentPane.add(textField_2);
		
		label_2 = new JLabel("\u7535\u8BDD");
		label_2.setBounds(223, 175, 54, 15);
		contentPane.add(label_2);
		
		label_3 = new JLabel("\u624B\u673A");
		label_3.setBounds(223, 218, 54, 15);
		contentPane.add(label_3);
		
		label_4 = new JLabel("\u804C\u4F4D");
		label_4.setBounds(159, 378, 54, 15);
		contentPane.add(label_4);
		
		rdbtnNewRadioButton = new JRadioButton("\u5FEB\u9012\u5458");
		rdbtnNewRadioButton.setBounds(208, 332, 96, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		radioButton = new JRadioButton("\u8425\u4E1A\u5385\u4E1A\u52A1\u5458");
		radioButton.setBounds(312, 332, 126, 23);
		contentPane.add(radioButton);
		
		radioButton_1 = new JRadioButton("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		radioButton_1.setBounds(440, 332, 123, 23);
		contentPane.add(radioButton_1);
		
		label_5 = new JLabel("\u5355\u4F4D");
		label_5.setBounds(223, 274, 54, 15);
		contentPane.add(label_5);
		
		label_6 = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3");
		label_6.setBounds(354, 271, 54, 21);
		contentPane.add(label_6);
		
		label_7 = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3");
		label_7.setBounds(487, 271, 54, 21);
		contentPane.add(label_7);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u5317\u4EAC", "\u5357\u4EAC", "\u4E0A\u6D77", "\u5E7F\u5DDE"}));
		comboBox.setBounds(275, 271, 69, 21);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10"}));
		comboBox_1.setBounds(414, 271, 69, 21);
		contentPane.add(comboBox_1);
		
		radioButton_2 = new JRadioButton("\u9AD8\u7EA7\u8D22\u52A1\u4EBA\u5458");
		radioButton_2.setBounds(382, 417, 119, 23);
		contentPane.add(radioButton_2);
		
		radioButton_3 = new JRadioButton("\u4F4E\u7EA7\u8D22\u52A1\u4EBA\u5458");
		radioButton_3.setBounds(312, 374, 126, 23);
		contentPane.add(radioButton_3);
		
		radioButton_4 = new JRadioButton("\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u4EBA\u5458");
		radioButton_4.setBounds(440, 374, 145, 23);
		contentPane.add(radioButton_4);
		
		radioButton_5 = new JRadioButton("\u603B\u7ECF\u7406");
		radioButton_5.setBounds(272, 417, 86, 23);
		contentPane.add(radioButton_5);
		
		radioButton_6 = new JRadioButton("\u7BA1\u7406\u5458");
		radioButton_6.setBounds(208, 374, 86, 23);
		contentPane.add(radioButton_6);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(radioButton);
		bg.add(radioButton_1);
		bg.add(radioButton_2);
		bg.add(radioButton_3);
		bg.add(radioButton_4);
		bg.add(radioButton_5);
		bg.add(radioButton_6);
		bg.add(rdbtnNewRadioButton);
		
		button = new JButton("\u786E\u5B9A");
		button.setBounds(226, 481, 93, 23);
		contentPane.add(button);
		
		button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(390, 481, 93, 23);
		contentPane.add(button_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 533, 714, 28);
		contentPane.add(toolBar);
		
		JLabel label_8 = new JLabel("\u72B6\u6001");
		toolBar.add(label_8);
	}
}
