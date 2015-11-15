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
import javax.swing.SwingConstants;
import java.awt.Font;

public class Shipping_Car extends JPanel {

	/**
	 * Create the panel.
	 */
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	
	public Shipping_Car() {
		setLayout(null);
		JButton button = new JButton("返回");
		button.setBounds(10, 10, 65, 23);
		add(button);
		
		JLabel label = new JLabel("中转中心业务员>>装运管理>>新建装运单>>汽车装运单");
		label.setBounds(77, 14, 376, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(523, 14, 121, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel label_2 = new JLabel("装车日期");
		label_2.setBounds(69, 134, 54, 15);
		add(label_2);
		
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(169, 134, 85, 15);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel = new JLabel("中转中心编号");
		lblNewLabel.setBounds(69, 172, 88, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("汽运编号");
		lblNewLabel_1.setBounds(71, 217, 54, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("到达地");
		lblNewLabel_2.setBounds(71, 302, 54, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("汽车代号");
		lblNewLabel_3.setBounds(71, 260, 54, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("监装员");
		lblNewLabel_4.setBounds(71, 343, 54, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("押运员");
		lblNewLabel_5.setBounds(71, 381, 54, 15);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("运费");
		lblNewLabel_6.setBounds(77, 421, 54, 15);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("审批状态");
		lblNewLabel_7.setBounds(392, 421, 54, 15);
		add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(169, 169, 181, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 214, 181, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 257, 181, 21);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 299, 181, 21);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(169, 340, 181, 21);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(169, 378, 181, 21);
		add(textField_5);
		
		JLabel label_3 = new JLabel("_ _ _ _ _");
		label_3.setBounds(182, 421, 72, 15);
		add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(492, 418, 152, 21);
		add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(403, 133, 241, 263);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel_9 = new JLabel("所有托运单号：");
		lblNewLabel_9.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBounds(219, 485, 85, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setBounds(426, 485, 93, 23);
		add(btnNewButton_1);
		
		JLabel label_5 = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3\u6C7D\u8F66\u88C5\u8FD0\u5355");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_5.setBounds(286, 74, 223, 28);
		add(label_5);
		
	}

}
