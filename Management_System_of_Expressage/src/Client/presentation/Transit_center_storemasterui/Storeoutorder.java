package Client.presentation.Transit_center_storemasterui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;

public class Storeoutorder extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	/**
	 * Create the panel.
	 */
	public Storeoutorder() {
setLayout(null);
		
		JButton btnNewButton = new JButton("����");
		btnNewButton.setBounds(10, 10, 78, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>�������>>�½����ⵥ>>���ⵥ");
		lblNewLabel.setBounds(98, 14, 347, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("��������ã�");
		lblNewLabel_1.setBounds(508, 14, 104, 15);
		add(lblNewLabel_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 400, 650, 25);
		add(toolBar);
		
		JLabel lblNewLabel_4 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("��ݱ��");
		lblNewLabel_2.setBounds(168, 97, 54, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("��������");
		lblNewLabel_3.setBounds(168, 139, 54, 15);
		add(lblNewLabel_3);
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_3_1 = new JLabel("����ѡ������");
		dateChooser1.register(lblNewLabel_3_1);
		lblNewLabel_3_1.setBounds(330, 139, 85, 15);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5 = new JLabel("Ŀ�ĵ�");
		lblNewLabel_5.setBounds(168, 180, 54, 15);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("װ����ʽ");
		lblNewLabel_6.setBounds(168, 221, 54, 15);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("��ת�����");
		lblNewLabel_7.setBounds(168, 262, 78, 15);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_10 = new JLabel("����״̬");
		lblNewLabel_10.setBounds(168, 302, 54, 15);
		add(lblNewLabel_10);
		
		JButton btnNewButton_1 = new JButton("ȷ��");
		btnNewButton_1.setBounds(168, 346, 93, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("����");
		btnNewButton_2.setBounds(400, 346, 93, 23);
		add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(256, 259, 237, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(259, 218, 234, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(259, 94, 234, 21);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(259, 177, 234, 21);
		add(textField_4);
		textField_4.setColumns(10);
		
		

		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(259, 299, 234, 21);
		add(comboBox_1);
	}
}
