package Client.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;

public class NewPayorder extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public NewPayorder() {

setLayout(null);
		
		JLabel label = new JLabel("财务人员>>成本管理>>新建付款单");
		label.setBounds(88, 5, 518, 15);
		add(label);
		
		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 1, 68, 23);
		add(button_4);
		
		JLabel label_1 = new JLabel("付款金额");
		label_1.setBounds(112, 109, 74, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("付款人");
		label_2.setBounds(112, 161, 74, 15);
		add(label_2);
		
		JLabel label_4 = new JLabel("付款账号");
		label_4.setBounds(392, 109, 74, 15);
		add(label_4);
		
		JLabel label_5 = new JLabel("付款日期");
		label_5.setBounds(392, 161, 74, 15);
		add(label_5);
		
		textField = new JTextField();
		textField.setBounds(179, 109, 157, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(179, 158, 157, 21);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(465, 106, 157, 21);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(465, 158, 157, 21);
		add(textField_3);
		
		JLabel label_3 = new JLabel("\u4ED8\u6B3E\u6761\u76EE");
		label_3.setBounds(112, 208, 74, 15);
		add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(179, 208, 443, 76);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_6 = new JLabel("\u5907\u6CE8");
		label_6.setBounds(112, 310, 74, 15);
		add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(179, 310, 443, 76);
		add(textField_5);
		
		JLabel label_7 = new JLabel("\u4ED8\u6B3E\u4FE1\u606F");
		label_7.setBounds(354, 64, 54, 15);
		add(label_7);
		
	}
}
