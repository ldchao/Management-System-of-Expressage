package Client.presentation.Transit_center_storemasterui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;
import javax.swing.JTextField;

public class SetWarnData extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public SetWarnData() {

        setLayout(null);
		
		JButton btnNewButton = new JButton("����");
		btnNewButton.setBounds(10, 10, 57, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>������>>���þ���ֵ");
		lblNewLabel.setBounds(92, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("��������ã�");
		lblNewLabel_1.setBounds(505, 14, 79, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("��ǰ����ֵ����");
		lblNewLabel_3.setBounds(194, 126, 93, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("���뾯��ֵ����");
		lblNewLabel_2.setBounds(194, 196, 105, 15);
		add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("ȷ��");
		btnNewButton_1.setBounds(194, 288, 93, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ȡ��");
		btnNewButton_2.setBounds(363, 288, 93, 25);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 400, 650, 25);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(330, 123, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(330, 193, 116, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		
	}
}
