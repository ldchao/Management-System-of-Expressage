package Client.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;

public class Arriverorder extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Arriverorder() {
setLayout(null);
		
		JButton button = new JButton("����");
		button.setBounds(10, 10, 62, 23);
		add(button);
		
		JLabel label = new JLabel("��ת����ҵ��Ա>>��ת����>>�½����ﵥ>>���ﵥ");
		label.setBounds(82, 14, 404, 15);
		add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(525, 14, 96, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 400, 650, 25);
		add(toolBar);
		
		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);

		JLabel label_2 = new JLabel("��������");
		label_2.setBounds(180, 69, 54, 15);
		add(label_2);
		
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("����ѡ������");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(317, 69, 96, 15);
		add(lblNewLabel_8);
		
		JLabel label_3 = new JLabel("��ת�����");
		label_3.setBounds(180, 117, 96, 15);
		add(label_3);
		
		textField = new JTextField();
		textField.setBounds(317, 114, 134, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("������");
		lblNewLabel.setBounds(180, 163, 54, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("���ﵽ��״̬");
		lblNewLabel_1.setBounds(180, 216, 96, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("����״̬");
		lblNewLabel_2.setBounds(180, 266, 69, 15);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(317, 160, 134, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(317, 263, 134, 21);
		add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("��");
		rdbtnNewRadioButton.setBounds(317, 212, 64, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("����");
		rdbtnNewRadioButton_1.setBounds(383, 212, 69, 23);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("��ʧ");
		rdbtnNewRadioButton_2.setBounds(454, 212, 57, 23);
		add(rdbtnNewRadioButton_2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.setBounds(206, 339, 80, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.setBounds(351, 339, 80, 23);
		add(btnNewButton_1);
	}
}
