package Client.presentation.Transit_center_storemasterui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JComboBox;

public class SetRemindData extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public SetRemindData() {
        setLayout(null);
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.setBounds(10, 10, 57, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("仓库管理员>>库存管理>>设置提醒值");
		lblNewLabel.setBounds(92, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("张三，你好！");
		lblNewLabel_1.setBounds(505, 14, 79, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("当前提醒值比例");
		lblNewLabel_3.setBounds(194, 171, 93, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("输入提醒值比例");
		lblNewLabel_2.setBounds(194, 235, 105, 15);
		add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("确定");
		btnNewButton_1.setBounds(194, 310, 93, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("取消");
		btnNewButton_2.setBounds(363, 310, 93, 25);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 400, 650, 25);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("选择库区");
		lblNewLabel_4.setBounds(193, 111, 54, 15);
		add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(304, 108, 141, 18);
		add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(304, 168, 141, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(309, 232, 136, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
	}
}
