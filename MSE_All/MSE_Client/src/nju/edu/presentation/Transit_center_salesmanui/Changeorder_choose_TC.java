package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.JCheckBox;

public class Changeorder_choose_TC extends JPanel {
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Changeorder_choose_TC(JFrame m,JPanel jp) {
		main=m;
		JPanel lastui=jp;
		Changeorder_choose_TC nowPanel=this;
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
		
		JLabel label = new JLabel("中转中心业务员>>录入中转单>>新建中转单");
		label.setBounds(100, 14, 270, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("选择要中转到外市中转中心的货物");
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD, 20));
		lblNewLabel_1.setBounds(197, 80, 338, 31);
		add(lblNewLabel_1);
		
		
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder c=new Changeorder(main, nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(c);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(190, 474, 93, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_choose_TC ctc=new Changeorder_choose_TC(main, lastui);
				main.remove(nowPanel);				
				main.getContentPane().add(ctc);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(425, 474, 93, 23);
		add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("1~5位");
		chckbxNewCheckBox.setBounds(141, 164, 89, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("6~10位");
		checkBox.setBounds(270, 164, 85, 23);
		add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("11~15位");
		checkBox_1.setBounds(270, 216, 92, 23);
		add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("16~20位");
		checkBox_2.setBounds(394, 164, 81, 23);
		add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("21~25位");
		checkBox_3.setBounds(512, 164, 75, 23);
		add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("26~30位");
		checkBox_4.setBounds(512, 216, 81, 23);
		add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("31~35位");
		checkBox_5.setBounds(141, 273, 89, 23);
		add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("36~40位");
		checkBox_6.setBounds(141, 216, 85, 23);
		add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("41~45位");
		checkBox_7.setBounds(270, 273, 92, 23);
		add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("46~50位");
		checkBox_8.setBounds(394, 327, 81, 23);
		add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("51~55位");
		checkBox_9.setBounds(394, 273, 90, 23);
		add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("56~60位");
		checkBox_10.setBounds(512, 273, 81, 23);
		add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("1~5位");
		checkBox_11.setBounds(141, 327, 89, 23);
		add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("6~10位");
		checkBox_12.setBounds(270, 327, 85, 23);
		add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("11~15位");
		checkBox_13.setBounds(394, 379, 92, 23);
		add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("16~20位");
		checkBox_14.setBounds(512, 379, 81, 23);
		add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("21~25位");
		checkBox_15.setBounds(394, 216, 90, 23);
		add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("26~30位");
		checkBox_16.setBounds(512, 327, 81, 23);
		add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("31~35位");
		checkBox_17.setBounds(141, 379, 89, 23);
		add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("36~40位");
		checkBox_18.setBounds(270, 379, 85, 23);
		add(checkBox_18);
		
		
		
	}

}