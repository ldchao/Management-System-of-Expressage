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
		
		JButton button = new JButton("返回");
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
		
		JLabel label = new JLabel("中转中心业务员>>录入中转单>>新建中转单>>选择货物>>中转单");
		label.setBounds(100, 14, 393, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		JLabel label_2 = new JLabel("装车日期");
		label_2.setBounds(70, 146, 54, 15);
		add(label_2);
		
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(180, 146, 96, 15);
		add(lblNewLabel_8);
		
		JLabel label_3 = new JLabel("中转单编号");
		label_3.setBounds(70, 198, 96, 15);
		add(label_3);
		
		textField = new JTextField();
		textField.setBounds(180, 192, 134, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("出发地");
		lblNewLabel.setBounds(70, 244, 54, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("审批状态");
		lblNewLabel_2.setBounds(70, 405, 69, 15);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 241, 134, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(180, 402, 134, 21);
		add(comboBox);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_4.setText("创建成功");
			}
		});
		btnNewButton.setBounds(226, 457, 80, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
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
		
		JLabel lblNewLabel_3 = new JLabel("到达地");
		lblNewLabel_3.setBounds(70, 296, 54, 15);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 293, 134, 21);
		add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("监装员");
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
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_4);
		
		JLabel label_5 = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3\u4E2D\u8F6C\u5355");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 24));
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
		
		JButton button = new JButton("返回");
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
		
		JLabel label = new JLabel("中转中心业务员>>录入中转单>>新建中转单>>选择货物>>中转单");
		label.setBounds(100, 14, 393, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		JLabel label_2 = new JLabel("装车日期");
		label_2.setBounds(70, 146, 54, 15);
		add(label_2);
		
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(180, 146, 96, 15);
		add(lblNewLabel_8);
		
		JLabel label_3 = new JLabel("中转单编号");
		label_3.setBounds(70, 198, 96, 15);
		add(label_3);
		
		textField = new JTextField();
		textField.setBounds(180, 192, 134, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("出发地");
		lblNewLabel.setBounds(70, 244, 54, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("审批状态");
		lblNewLabel_2.setBounds(70, 405, 69, 15);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 241, 134, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(180, 402, 134, 21);
		add(comboBox);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_4.setText("创建成功");
			}
		});
		btnNewButton.setBounds(226, 457, 80, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
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
		
		JLabel lblNewLabel_3 = new JLabel("到达地");
		lblNewLabel_3.setBounds(70, 296, 54, 15);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 293, 134, 21);
		add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("监装员");
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
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_4);
		
		JLabel label_5 = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3\u4E2D\u8F6C\u5355");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label_5.setBounds(273, 60, 235, 33);
		add(label_5);
	}
}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/presentation/Transit_center_salesmanui/Changeorder.java
