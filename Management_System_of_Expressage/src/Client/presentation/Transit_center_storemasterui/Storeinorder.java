package Client.presentation.Transit_center_storemasterui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Storeinorder extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public Storeinorder() {
setLayout(null);
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.setBounds(10, 10, 78, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("仓库管理员>>入库管理>>新建入库单>>入库单");
		lblNewLabel.setBounds(98, 14, 347, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("张三，你好！");
		lblNewLabel_1.setBounds(508, 14, 104, 15);
		add(lblNewLabel_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 400, 650, 25);
		add(toolBar);
		
		JLabel lblNewLabel_4 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("快递编号");
		lblNewLabel_2.setBounds(168, 97, 54, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("入库日期");
		lblNewLabel_3.setBounds(168, 139, 54, 15);
		add(lblNewLabel_3);
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_3_1 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_3_1);
		lblNewLabel_3_1.setBounds(330, 139, 85, 15);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5 = new JLabel("目的地");
		lblNewLabel_5.setBounds(168, 180, 54, 15);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("区号");
		lblNewLabel_6.setBounds(168, 221, 54, 15);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("排号");
		lblNewLabel_7.setBounds(363, 221, 39, 15);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("架号");
		lblNewLabel_8.setBounds(168, 262, 39, 15);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("位号");
		lblNewLabel_9.setBounds(363, 262, 39, 15);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("审批状态");
		lblNewLabel_10.setBounds(168, 302, 54, 15);
		add(lblNewLabel_10);
		
		JButton btnNewButton_1 = new JButton("确定");
		btnNewButton_1.setBounds(168, 346, 93, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("返回");
		btnNewButton_2.setBounds(400, 346, 93, 23);
		add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(400, 259, 93, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(400, 218, 93, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(259, 259, 94, 21);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(259, 94, 234, 21);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(259, 177, 234, 21);
		add(textField_4);
		textField_4.setColumns(10);
		
		
		String[] quhao={"航运区","铁运区","汽运区"};
		JComboBox comboBox = new JComboBox(quhao);
		comboBox.setBounds(259, 218, 94, 21);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(259, 299, 234, 21);
		add(comboBox_1);
		


	}

}
