package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import nju.edu.presentation.financial_staffui.DateChooser;

import javax.swing.JTextField;
import java.awt.Color;

public class DriverMainUI extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	

	public DriverMainUI(JFrame m, JPanel bf) {
		JFrame main = m;
		JPanel lastui = bf;
		DriverMainUI nowPanel = this;
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

		JLabel label = new JLabel("Ӫҵ��ҵ��Ա>>˾����Ϣ����");
		label.setBounds(100, 14, 200, 15);
		add(label);

		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(212, 319, 106, 26);
		add(textField);
		
		JLabel label_2 = new JLabel("˾�����");
		label_2.setBounds(133, 318, 57, 28);
		add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(212, 357, 106, 26);
		add(textField_1);
		
		JLabel label_3 = new JLabel("˾������");
		label_3.setBounds(133, 357, 57, 28);
		add(label_3);
		
		JLabel label_5 = new JLabel("Ӫҵ�����");
		label_5.setBounds(133, 438, 67, 28);
		add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(212, 438, 106, 26);
		add(textField_2);
		
		JLabel label_6 = new JLabel("�ֻ�����");
		label_6.setBounds(382, 319, 57, 28);
		add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(461, 320, 106, 26);
		add(textField_3);
		
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate2 = new JLabel("�뵥��ѡ������");
		showDate2.setBounds(468, 403, 93, 23);
		dateChooser2.register(showDate2);
		add(showDate2);
		
		JLabel label_7 = new JLabel("��������");
		label_7.setBounds(382, 400, 57, 28);
		add(label_7);
		
		JLabel label_8 = new JLabel("��ʻ֤����");
		label_8.setBounds(382, 438, 74, 28);
		add(label_8);
		
		JLabel label_9 = new JLabel("�뵥��ѡ������");
		label_9.setBounds(468, 441, 93, 23);
		add(label_9);
		
		JLabel label_10 = new JLabel("�Ա�");
		label_10.setBounds(133, 397, 57, 28);
		add(label_10);
		
//		String[] general = new String[]{"��ѡ��","��","Ů"};
		JComboBox<String> sex = new JComboBox<>();
		sex.addItem("��ѡ��");
		sex.addItem("��");
		sex.addItem("Ů");
		sex.setBounds(213, 398, 105, 28);
		add(sex);
		
		JLabel label_11 = new JLabel("����֤��");
		label_11.setBounds(382, 357, 57, 28);
		add(label_11);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(461, 357, 106, 26);
		add(textField_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(268, 104, 160, 160);
		add(panel);
		
		
		
		
		

}
}