package Client.presentation.Transit_center_storemasterui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JComboBox;

import Client.presentation.Transit_center_salesmanui.Transferui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetRemindData extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public SetRemindData(JFrame m,JPanel jp) {
		JFrame main=m;
		JPanel lastui=jp;
		SetRemindData nowPanel=this;
        setLayout(null);
		
        JButton button = new JButton("����");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);				
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 65, 23);
		add(button);
		
		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>������>>��������ֵ");
		lblNewLabel.setBounds(100, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("��������ã�");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("��ǰ����ֵ����");
		lblNewLabel_3.setBounds(178, 258, 93, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("��������ֵ����");
		lblNewLabel_2.setBounds(182, 327, 105, 15);
		add(lblNewLabel_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533,734,28);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_6);	
		
		JButton btnNewButton_1 = new JButton("ȷ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_6.setText("���óɹ�");
			}
		});
		btnNewButton_1.setBounds(206, 409, 93, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ȡ��");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetRemindData sr=new SetRemindData(main,lastui);
				main.remove(nowPanel);				
				main.getContentPane().add(sr);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(398, 409, 93, 25);
		add(btnNewButton_2);
		

		
		JLabel lblNewLabel_4 = new JLabel("ѡ�����");
		lblNewLabel_4.setBounds(178, 201, 79, 15);
		add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(336, 198, 200, 18);
		add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(336, 255, 200, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(336, 324, 200, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("\u8BBE\u7F6E\u5E93\u533A\u63D0\u9192\u503C");
		label.setFont(new Font("΢���ź�", Font.BOLD, 24));
		label.setBounds(273, 99, 236, 38);
		add(label);
		
	}
}
