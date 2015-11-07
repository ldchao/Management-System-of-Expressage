package Client.presentation.Transit_center_storemasterui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;

import javax.swing.JRadioButton;

public class Take_Stock extends JPanel {

	/**
	 * Create the panel.
	 */
	public Take_Stock() {

        setLayout(null);
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.setBounds(10, 10, 57, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("仓库管理员>>库存管理>>盘点库存");
		lblNewLabel.setBounds(92, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("张三，你好！");
		lblNewLabel_1.setBounds(505, 14, 79, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("开始日期");
		lblNewLabel_2.setBounds(117, 101, 54, 15);
		add(lblNewLabel_2);
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(211, 101, 96, 15);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_3 = new JLabel("结束日期");
		lblNewLabel_3.setBounds(337, 101, 54, 15);
		add(lblNewLabel_3);
		
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_9 = new JLabel("单击选择日期");
		dateChooser2.register(lblNewLabel_9);
		lblNewLabel_9.setBounds(423, 101, 96, 15);
		add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("确定");
		btnNewButton_1.setBounds(146, 332, 130, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("取消");
		btnNewButton_2.setBounds(369, 332, 123, 25);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 400, 650, 25);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("选择库区");
		lblNewLabel_4.setBounds(117, 173, 54, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("选择查看方式");
		lblNewLabel_5.setBounds(117, 252, 88, 15);
		add(lblNewLabel_5);
		
		JRadioButton radioButton = new JRadioButton("航运区");
		radioButton.setBounds(211, 169, 79, 23);
		add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("铁运区");
		radioButton_1.setBounds(312, 169, 79, 23);
		add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("汽运区");
		radioButton_2.setBounds(423, 169, 121, 23);
		add(radioButton_2);
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(radioButton_2);
		bg1.add(radioButton_1);
		bg1.add(radioButton);
		
		
		JRadioButton radioButton_3 = new JRadioButton("页面显示");
		radioButton_3.setBounds(234, 248, 121, 23);
		add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("输出Excel表");
		radioButton_4.setBounds(369, 248, 121, 23);
		add(radioButton_4);
		
		ButtonGroup bg2=new ButtonGroup();
		bg2.add(radioButton_3);
		bg2.add(radioButton_4);
	}
}
