<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/presentation/Transit_center_salesmanui/Shipping_Plane.java
package Client.presentation.Transit_center_salesmanui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;

import javax.swing.JList;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class Shipping_Plane extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Shipping_Plane(JFrame m,JPanel jp) {
		main=m;
		JPanel lastui=jp;
		Shipping_Plane nowPanel=this;
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
		
		JLabel label = new JLabel("��ת����ҵ��Ա>>װ�˹���>>�½�װ�˵�>>�ɻ�װ�˵�");
		label.setBounds(100, 14, 376, 15);
		add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(600, 14, 100, 15);
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
		lblNewLabel.setBounds(71, 178, 88, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("���˱��");
		lblNewLabel_1.setBounds(71, 223, 54, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("�����");
		lblNewLabel_2.setBounds(71, 308, 54, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("�ɻ�����");
		lblNewLabel_3.setBounds(71, 266, 54, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("��װԱ");
		lblNewLabel_4.setBounds(71, 357, 54, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ѻ��Ա");
		lblNewLabel_5.setBounds(71, 401, 54, 15);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("�˷�");
		lblNewLabel_6.setBounds(71, 444, 54, 15);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("����״̬");
		lblNewLabel_7.setBounds(410, 444, 54, 15);
		add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(169, 175, 181, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 220, 181, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 263, 181, 21);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 305, 181, 21);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(169, 354, 181, 21);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(169, 398, 181, 21);
		add(textField_5);
		
		JLabel label_3 = new JLabel("_ _ _ _ _");
		label_3.setBounds(169, 444, 72, 15);
		add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(502, 441, 152, 21);
		add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(410, 142, 244, 274);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel_9 = new JLabel("�������˵��ţ�");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("΢���ź�", Font.BOLD, 14));
		scrollPane.setColumnHeaderView(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_4.setText("�����ɹ�");
			}
		});
		btnNewButton.setBounds(205, 489, 85, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shipping_Plane sp=new Shipping_Plane(main, lastui);
				main.remove(nowPanel);				
				main.getContentPane().add(sp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(410, 489, 93, 23);
		add(btnNewButton_1);
		
		JLabel label_5 = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3\u98DE\u673A\u88C5\u8FD0\u5355");
		label_5.setFont(new Font("΢���ź�", Font.BOLD, 24));
		label_5.setBounds(254, 81, 244, 33);
		add(label_5);
		
		
	}
}
=======
package Client.presentation.Transit_center_salesmanui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;

import javax.swing.JList;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class Shipping_Plane extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Shipping_Plane(JFrame m,JPanel jp) {
		main=m;
		JPanel lastui=jp;
		Shipping_Plane nowPanel=this;
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
		
		JLabel label = new JLabel("��ת����ҵ��Ա>>װ�˹���>>�½�װ�˵�>>�ɻ�װ�˵�");
		label.setBounds(100, 14, 376, 15);
		add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(600, 14, 100, 15);
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
		lblNewLabel.setBounds(71, 178, 88, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("���˱��");
		lblNewLabel_1.setBounds(71, 223, 54, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("�����");
		lblNewLabel_2.setBounds(71, 308, 54, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("�ɻ�����");
		lblNewLabel_3.setBounds(71, 266, 54, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("��װԱ");
		lblNewLabel_4.setBounds(71, 357, 54, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ѻ��Ա");
		lblNewLabel_5.setBounds(71, 401, 54, 15);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("�˷�");
		lblNewLabel_6.setBounds(71, 444, 54, 15);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("����״̬");
		lblNewLabel_7.setBounds(410, 444, 54, 15);
		add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(169, 175, 181, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 220, 181, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 263, 181, 21);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 305, 181, 21);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(169, 354, 181, 21);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(169, 398, 181, 21);
		add(textField_5);
		
		JLabel label_3 = new JLabel("_ _ _ _ _");
		label_3.setBounds(169, 444, 72, 15);
		add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(502, 441, 152, 21);
		add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(410, 142, 244, 274);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel_9 = new JLabel("�������˵��ţ�");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("΢���ź�", Font.BOLD, 14));
		scrollPane.setColumnHeaderView(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_4.setText("�����ɹ�");
			}
		});
		btnNewButton.setBounds(205, 489, 85, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shipping_Plane sp=new Shipping_Plane(main, lastui);
				main.remove(nowPanel);				
				main.getContentPane().add(sp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(410, 489, 93, 23);
		add(btnNewButton_1);
		
		JLabel label_5 = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3\u98DE\u673A\u88C5\u8FD0\u5355");
		label_5.setFont(new Font("΢���ź�", Font.BOLD, 24));
		label_5.setBounds(254, 81, 244, 33);
		add(label_5);
		
		
	}
}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/presentation/Transit_center_salesmanui/Shipping_Plane.java
