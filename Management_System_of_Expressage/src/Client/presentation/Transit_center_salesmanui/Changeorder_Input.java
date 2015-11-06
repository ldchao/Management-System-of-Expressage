package Client.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Changeorder_Input extends JPanel {

	/**
	 * Create the panel.
	 */
	public Changeorder_Input() {
        setLayout(null);
		
		JButton button = new JButton("返回");
		button.setBounds(10, 10, 63, 23);
		add(button);
		
		JLabel label = new JLabel("中转中心业务员>>录入中转单>>新建中转单");
		label.setBounds(89, 14, 270, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(488, 14, 99, 15);
		add(label_1);
		
		JLabel lblNewLabel = new JLabel("航运区");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel.setBounds(73, 140, 72, 15);
		add(lblNewLabel);
		
		JLabel label_2 = new JLabel("铁运区");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_2.setBounds(73, 203, 91, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("汽运区");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_3.setBounds(73, 269, 72, 15);
		add(label_3);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 400, 650, 25);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("选择库区和排号");
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD, 20));
		lblNewLabel_1.setBounds(231, 58, 171, 52);
		add(lblNewLabel_1);
		
		JRadioButton jb1 = new JRadioButton("一排");
		jb1.setBounds(209, 137, 72, 23);
		add(jb1);

		JRadioButton jb2 = new JRadioButton("二排");
		jb2.setBounds(309, 137, 72, 23);
		add(jb2);
		
		JRadioButton jb3 = new JRadioButton("三排");
		jb3.setBounds(409, 137, 72, 23);
		add(jb3);
		
		JRadioButton jb4 = new JRadioButton("一排");
		jb4.setBounds(209, 200, 72, 23);
		add(jb4);
		
		JRadioButton jb5 = new JRadioButton("二排");
		jb5.setBounds(309, 200, 72, 23);
		add(jb5);
		
		JRadioButton jb6 = new JRadioButton("三排");
		jb6.setBounds(409, 200, 63, 23);
		add(jb6);
		
		JRadioButton jb7 = new JRadioButton("一排");
		jb7.setBounds(209, 266, 72, 23);
		add(jb7);
		
		JRadioButton jb8 = new JRadioButton("二排");
		jb8.setBounds(309, 266, 72, 23);
		add(jb8);
		
		JRadioButton jb9 = new JRadioButton("三排");
		jb9.setBounds(409, 266, 63, 23);
		add(jb9);
		
		JRadioButton jb10 = new JRadioButton("四排");
		jb10.setBounds(501, 266, 72, 23);
		add(jb10);		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(jb1);bg.add(jb2);bg.add(jb3);bg.add(jb4);bg.add(jb5);
		bg.add(jb6);bg.add(jb7);bg.add(jb8);bg.add(jb9);bg.add(jb10);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBounds(169, 331, 93, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setBounds(321, 331, 93, 23);
		add(btnNewButton_1);
		
		
	}
}
