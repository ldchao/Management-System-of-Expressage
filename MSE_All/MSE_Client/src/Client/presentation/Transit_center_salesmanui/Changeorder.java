<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/presentation/Transit_center_salesmanui/Changeorder.java
package Client.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Changeorder extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Changeorder(JFrame m,JPanel jp) {

		main=m;
		JPanel lastui=jp;
		Changeorder nowPanel=this;
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
		
		JLabel label = new JLabel("��ת����ҵ��Ա>>¼����ת��>>�½���ת��>>ѡ�����>>��ת��");
		label.setBounds(100, 14, 393, 15);
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
		label_2.setBounds(70, 146, 54, 15);
		add(label_2);
		
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("����ѡ������");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(180, 146, 96, 15);
		add(lblNewLabel_8);
		
		JLabel label_3 = new JLabel("��ת�����");
		label_3.setBounds(70, 198, 96, 15);
		add(label_3);
		
		textField = new JTextField();
		textField.setBounds(180, 192, 134, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("������");
		lblNewLabel.setBounds(70, 244, 54, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("����״̬");
		lblNewLabel_2.setBounds(70, 405, 69, 15);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 241, 134, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(180, 402, 134, 21);
		add(comboBox);
		
		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_4.setText("�����ɹ�");
			}
		});
		btnNewButton.setBounds(226, 457, 80, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder c=new Changeorder(main, lastui);
				main.remove(nowPanel);				
				main.getContentPane().add(c);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(428, 457, 80, 23);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("�����");
		lblNewLabel_3.setBounds(70, 296, 54, 15);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 293, 134, 21);
		add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("��װԱ");
		lblNewLabel_1.setBounds(70, 349, 54, 15);
		add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(180, 346, 134, 21);
		add(textField_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(374, 131, 295, 289);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel_4 = new JLabel("\u672C\u6B21\u4E2D\u8F6C\u6240\u6709\u5355\u53F7");
		lblNewLabel_4.setFont(new Font("΢���ź�", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_4);
		
		JLabel label_5 = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3\u4E2D\u8F6C\u5355");
		label_5.setFont(new Font("΢���ź�", Font.BOLD, 24));
		label_5.setBounds(273, 60, 235, 33);
		add(label_5);
	}
}
=======
package Client.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Changeorder extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Changeorder(JFrame m,JPanel jp) {

		main=m;
		JPanel lastui=jp;
		Changeorder nowPanel=this;
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
		
		JLabel label = new JLabel("��ת����ҵ��Ա>>¼����ת��>>�½���ת��>>ѡ�����>>��ת��");
		label.setBounds(100, 14, 393, 15);
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
		label_2.setBounds(70, 146, 54, 15);
		add(label_2);
		
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("����ѡ������");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(180, 146, 96, 15);
		add(lblNewLabel_8);
		
		JLabel label_3 = new JLabel("��ת�����");
		label_3.setBounds(70, 198, 96, 15);
		add(label_3);
		
		textField = new JTextField();
		textField.setBounds(180, 192, 134, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("������");
		lblNewLabel.setBounds(70, 244, 54, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("����״̬");
		lblNewLabel_2.setBounds(70, 405, 69, 15);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 241, 134, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(180, 402, 134, 21);
		add(comboBox);
		
		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_4.setText("�����ɹ�");
			}
		});
		btnNewButton.setBounds(226, 457, 80, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder c=new Changeorder(main, lastui);
				main.remove(nowPanel);				
				main.getContentPane().add(c);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(428, 457, 80, 23);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("�����");
		lblNewLabel_3.setBounds(70, 296, 54, 15);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 293, 134, 21);
		add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("��װԱ");
		lblNewLabel_1.setBounds(70, 349, 54, 15);
		add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(180, 346, 134, 21);
		add(textField_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(374, 131, 295, 289);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel_4 = new JLabel("\u672C\u6B21\u4E2D\u8F6C\u6240\u6709\u5355\u53F7");
		lblNewLabel_4.setFont(new Font("΢���ź�", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_4);
		
		JLabel label_5 = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3\u4E2D\u8F6C\u5355");
		label_5.setFont(new Font("΢���ź�", Font.BOLD, 24));
		label_5.setBounds(273, 60, 235, 33);
		add(label_5);
	}
}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/presentation/Transit_center_salesmanui/Changeorder.java
