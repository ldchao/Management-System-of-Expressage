package Client.presentation.Transit_center_salesmanui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Shipping_Train extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	/**
	 * Create the panel.
	 */
	public Shipping_Train() {
		setLayout(null);
		JButton button = new JButton("����");
		button.setBounds(10, 10, 65, 23);
		add(button);
		
		JLabel label = new JLabel("��ת����ҵ��Ա>>װ�˹���>>�½�װ�˵�>>��װ�˵�");
		label.setBounds(77, 14, 376, 15);
		add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(523, 14, 121, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);
		
		JLabel label_2 = new JLabel("װ������");
		label_2.setBounds(71, 143, 54, 15);
		add(label_2);
		
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("����ѡ������");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(169, 143, 85, 15);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel = new JLabel("��ת���ı��");
		lblNewLabel.setBounds(71, 181, 88, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("���˱��");
		lblNewLabel_1.setBounds(71, 226, 54, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("�����");
		lblNewLabel_2.setBounds(71, 311, 54, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("�𳵴���");
		lblNewLabel_3.setBounds(71, 267, 54, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("��װԱ");
		lblNewLabel_4.setBounds(71, 354, 54, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ѻ��Ա");
		lblNewLabel_5.setBounds(71, 397, 54, 15);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("�˷�");
		lblNewLabel_6.setBounds(71, 446, 54, 15);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("����״̬");
		lblNewLabel_7.setBounds(399, 446, 54, 15);
		add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(169, 178, 181, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 223, 181, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 264, 181, 21);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 308, 181, 21);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(169, 351, 181, 21);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(169, 394, 181, 21);
		add(textField_5);
		
		JLabel label_3 = new JLabel("_ _ _ _ _");
		label_3.setBounds(169, 446, 72, 15);
		add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(502, 443, 171, 21);
		add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(399, 142, 274, 270);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel_9 = new JLabel("�������˵��ţ�");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("΢���ź�", Font.BOLD, 14));
		scrollPane.setColumnHeaderView(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.setBounds(221, 500, 85, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.setBounds(415, 500, 93, 23);
		add(btnNewButton_1);
		
		JLabel label_5 = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3\u706B\u8F66\u88C5\u8FD0\u5355");
		label_5.setFont(new Font("΢���ź�", Font.BOLD, 24));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(241, 75, 283, 33);
		add(label_5);
		
	}

}
