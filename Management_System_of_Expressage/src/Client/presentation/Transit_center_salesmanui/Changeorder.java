package Client.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Changeorder extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	/**
	 * Create the panel.
	 */
	public Changeorder() {
setLayout(null);
		
		JButton button = new JButton("����");
		button.setBounds(10, 10, 69, 23);
		add(button);
		
		JLabel label = new JLabel("��ת����ҵ��Ա>>¼����ת��>>�½���ת��>>ѡ�����>>��ת��");
		label.setBounds(89, 14, 393, 15);
		add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(488, 14, 110, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 400, 623, 25);
		add(toolBar);
		
		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);
		JLabel label_2 = new JLabel("װ������");
		label_2.setBounds(70, 69, 54, 15);
		add(label_2);
		
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("����ѡ������");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(180, 69, 96, 15);
		add(lblNewLabel_8);
		
		JLabel label_3 = new JLabel("��ת�����");
		label_3.setBounds(70, 114, 96, 15);
		add(label_3);
		
		textField = new JTextField();
		textField.setBounds(180, 111, 134, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("������");
		lblNewLabel.setBounds(70, 158, 54, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("����״̬");
		lblNewLabel_2.setBounds(70, 287, 69, 15);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 155, 134, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(180, 284, 134, 21);
		add(comboBox);
		
		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.setBounds(206, 339, 80, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.setBounds(351, 339, 80, 23);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("�����");
		lblNewLabel_3.setBounds(70, 203, 54, 15);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 200, 134, 21);
		add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("��װԱ");
		lblNewLabel_1.setBounds(70, 249, 54, 15);
		add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(180, 243, 134, 21);
		add(textField_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(365, 69, 235, 245);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel_4 = new JLabel("������ת���е���");
		scrollPane.setColumnHeaderView(lblNewLabel_4);
	}

}
