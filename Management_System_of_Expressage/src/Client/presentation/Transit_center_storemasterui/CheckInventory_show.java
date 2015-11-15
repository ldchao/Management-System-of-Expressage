package Client.presentation.Transit_center_storemasterui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;

public class CheckInventory_show extends JPanel {

	/**
	 * Create the panel.
	 */
	public CheckInventory_show() {
setLayout(null);
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.setBounds(10, 10, 57, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("仓库管理员>>库存管理>>查看库存>>显示");
		lblNewLabel.setBounds(92, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("张三，你好！");
		lblNewLabel_1.setBounds(505, 14, 79, 15);
		add(lblNewLabel_1);
		

		
		JButton btnNewButton_1 = new JButton("确定");
		btnNewButton_1.setBounds(196, 430, 130, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("取消");
		btnNewButton_2.setBounds(422, 430, 123, 25);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533,734,28);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_6);
		
		JLabel label = new JLabel("库存信息显示");
		label.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label.setBounds(305, 88, 144, 28);
		add(label);
		
		JLabel label_1 = new JLabel("\u51FA\u5E93\u6570\u91CF");
		label_1.setBounds(227, 164, 54, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u5165\u5E93\u6570\u91CF");
		label_2.setBounds(227, 217, 54, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("\u51FA\u5E93\u91D1\u989D");
		label_3.setBounds(227, 279, 54, 15);
		add(label_3);
		
		JLabel label_4 = new JLabel("\u5165\u5E93\u91D1\u989D");
		label_4.setBounds(227, 343, 54, 15);
		add(label_4);
		
		JLabel label_5 = new JLabel("_________");
		label_5.setBounds(372, 164, 54, 15);
		add(label_5);
		
		JLabel label_6 = new JLabel("_________");
		label_6.setBounds(372, 217, 54, 15);
		add(label_6);
		
		JLabel lblNewLabel_2 = new JLabel("_________");
		lblNewLabel_2.setBounds(372, 279, 54, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("_________");
		lblNewLabel_3.setBounds(372, 343, 54, 15);
		add(lblNewLabel_3);
	}
}
