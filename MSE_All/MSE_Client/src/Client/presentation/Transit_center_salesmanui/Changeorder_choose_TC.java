<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/presentation/Transit_center_salesmanui/Changeorder_choose_TC.java
package Client.presentation.Transit_center_salesmanui;

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
		
		JLabel lblNewLabel = new JLabel("一架");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel.setBounds(27, 90, 41, 15);
		add(lblNewLabel);
		
		JLabel label_2 = new JLabel("二架");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_2.setBounds(27, 184, 41, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("三架");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_3.setBounds(27, 281, 41, 15);
		add(label_3);
		
		JLabel label_5 = new JLabel("四架");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_5.setBounds(32, 388, 41, 15);
		add(label_5);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("选择要中转到外市中转中心的货物");
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD, 20));
		lblNewLabel_1.setBounds(180, 39, 338, 31);
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
		chckbxNewCheckBox.setBounds(89, 87, 89, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("6~10位");
		checkBox.setBounds(198, 87, 85, 23);
		add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("11~15位");
		checkBox_1.setBounds(300, 87, 92, 23);
		add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("16~20位");
		checkBox_2.setBounds(394, 87, 81, 23);
		add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("21~25位");
		checkBox_3.setBounds(488, 87, 90, 23);
		add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("26~30位");
		checkBox_4.setBounds(590, 87, 81, 23);
		add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("31~35位");
		checkBox_5.setBounds(89, 124, 89, 23);
		add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("36~40位");
		checkBox_6.setBounds(198, 124, 85, 23);
		add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("41~45位");
		checkBox_7.setBounds(300, 124, 92, 23);
		add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("46~50位");
		checkBox_8.setBounds(394, 124, 81, 23);
		add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("51~55位");
		checkBox_9.setBounds(488, 124, 90, 23);
		add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("56~60位");
		checkBox_10.setBounds(590, 124, 81, 23);
		add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("1~5位");
		checkBox_11.setBounds(89, 181, 89, 23);
		add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("6~10位");
		checkBox_12.setBounds(198, 181, 85, 23);
		add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("11~15位");
		checkBox_13.setBounds(300, 181, 92, 23);
		add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("16~20位");
		checkBox_14.setBounds(394, 181, 81, 23);
		add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("21~25位");
		checkBox_15.setBounds(488, 181, 90, 23);
		add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("26~30位");
		checkBox_16.setBounds(590, 181, 81, 23);
		add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("31~35位");
		checkBox_17.setBounds(89, 223, 89, 23);
		add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("36~40位");
		checkBox_18.setBounds(198, 223, 85, 23);
		add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("41~45位");
		checkBox_19.setBounds(300, 223, 92, 23);
		add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("46~50位");
		checkBox_20.setBounds(394, 223, 81, 23);
		add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("51~55位");
		checkBox_21.setBounds(488, 223, 90, 23);
		add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("56~60位");
		checkBox_22.setBounds(590, 223, 81, 23);
		add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("1~5位");
		checkBox_23.setBounds(89, 278, 89, 23);
		add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("6~10位");
		checkBox_24.setBounds(198, 278, 85, 23);
		add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("11~15位");
		checkBox_25.setBounds(301, 278, 91, 23);
		add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("16~20位");
		checkBox_26.setBounds(394, 278, 81, 23);
		add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("21~25位");
		checkBox_27.setBounds(488, 278, 90, 23);
		add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("26~30位");
		checkBox_28.setBounds(590, 278, 81, 23);
		add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("31~35位");
		checkBox_29.setBounds(89, 320, 89, 23);
		add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("36~40位");
		checkBox_30.setBounds(198, 320, 85, 23);
		add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("41~45位");
		checkBox_31.setBounds(300, 320, 92, 23);
		add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("46~50位");
		checkBox_32.setBounds(394, 320, 81, 23);
		add(checkBox_32);
		
		JCheckBox checkBox_33 = new JCheckBox("51~55位");
		checkBox_33.setBounds(488, 320, 90, 23);
		add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("56~60位");
		checkBox_34.setBounds(590, 320, 81, 23);
		add(checkBox_34);
		
		JCheckBox checkBox_35 = new JCheckBox("1~5位");
		checkBox_35.setBounds(89, 385, 89, 23);
		add(checkBox_35);
		
		JCheckBox checkBox_36 = new JCheckBox("6~10位");
		checkBox_36.setBounds(198, 385, 85, 23);
		add(checkBox_36);
		
		JCheckBox checkBox_37 = new JCheckBox("11~15位");
		checkBox_37.setBounds(300, 385, 92, 23);
		add(checkBox_37);
		
		JCheckBox checkBox_38 = new JCheckBox("16~20位");
		checkBox_38.setBounds(394, 380, 81, 23);
		add(checkBox_38);
		
		JCheckBox checkBox_39 = new JCheckBox("21~25位");
		checkBox_39.setBounds(488, 385, 90, 23);
		add(checkBox_39);
		
		JCheckBox checkBox_40 = new JCheckBox("26~30位");
		checkBox_40.setBounds(590, 385, 81, 23);
		add(checkBox_40);
		
		JCheckBox checkBox_41 = new JCheckBox("31~35位");
		checkBox_41.setBounds(89, 428, 89, 23);
		add(checkBox_41);
		
		JCheckBox checkBox_42 = new JCheckBox("36~40位");
		checkBox_42.setBounds(198, 428, 85, 23);
		add(checkBox_42);
		
		JCheckBox checkBox_43 = new JCheckBox("41~45位");
		checkBox_43.setBounds(300, 428, 92, 23);
		add(checkBox_43);
		
		JCheckBox checkBox_44 = new JCheckBox("46~50位");
		checkBox_44.setBounds(394, 428, 81, 23);
		add(checkBox_44);
		
		JCheckBox checkBox_45 = new JCheckBox("51~55位");
		checkBox_45.setBounds(488, 428, 90, 23);
		add(checkBox_45);
		
		JCheckBox checkBox_46 = new JCheckBox("56~60位");
		checkBox_46.setBounds(590, 428, 81, 23);
		add(checkBox_46);
		
		
		
	}

}
=======
package Client.presentation.Transit_center_salesmanui;

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
		
		JLabel lblNewLabel = new JLabel("一架");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel.setBounds(27, 90, 41, 15);
		add(lblNewLabel);
		
		JLabel label_2 = new JLabel("二架");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_2.setBounds(27, 184, 41, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("三架");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_3.setBounds(27, 281, 41, 15);
		add(label_3);
		
		JLabel label_5 = new JLabel("四架");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_5.setBounds(32, 388, 41, 15);
		add(label_5);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("选择要中转到外市中转中心的货物");
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD, 20));
		lblNewLabel_1.setBounds(180, 39, 338, 31);
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
		chckbxNewCheckBox.setBounds(89, 87, 89, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("6~10位");
		checkBox.setBounds(198, 87, 85, 23);
		add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("11~15位");
		checkBox_1.setBounds(300, 87, 92, 23);
		add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("16~20位");
		checkBox_2.setBounds(394, 87, 81, 23);
		add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("21~25位");
		checkBox_3.setBounds(488, 87, 90, 23);
		add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("26~30位");
		checkBox_4.setBounds(590, 87, 81, 23);
		add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("31~35位");
		checkBox_5.setBounds(89, 124, 89, 23);
		add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("36~40位");
		checkBox_6.setBounds(198, 124, 85, 23);
		add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("41~45位");
		checkBox_7.setBounds(300, 124, 92, 23);
		add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("46~50位");
		checkBox_8.setBounds(394, 124, 81, 23);
		add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("51~55位");
		checkBox_9.setBounds(488, 124, 90, 23);
		add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("56~60位");
		checkBox_10.setBounds(590, 124, 81, 23);
		add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("1~5位");
		checkBox_11.setBounds(89, 181, 89, 23);
		add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("6~10位");
		checkBox_12.setBounds(198, 181, 85, 23);
		add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("11~15位");
		checkBox_13.setBounds(300, 181, 92, 23);
		add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("16~20位");
		checkBox_14.setBounds(394, 181, 81, 23);
		add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("21~25位");
		checkBox_15.setBounds(488, 181, 90, 23);
		add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("26~30位");
		checkBox_16.setBounds(590, 181, 81, 23);
		add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("31~35位");
		checkBox_17.setBounds(89, 223, 89, 23);
		add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("36~40位");
		checkBox_18.setBounds(198, 223, 85, 23);
		add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("41~45位");
		checkBox_19.setBounds(300, 223, 92, 23);
		add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("46~50位");
		checkBox_20.setBounds(394, 223, 81, 23);
		add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("51~55位");
		checkBox_21.setBounds(488, 223, 90, 23);
		add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("56~60位");
		checkBox_22.setBounds(590, 223, 81, 23);
		add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("1~5位");
		checkBox_23.setBounds(89, 278, 89, 23);
		add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("6~10位");
		checkBox_24.setBounds(198, 278, 85, 23);
		add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("11~15位");
		checkBox_25.setBounds(301, 278, 91, 23);
		add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("16~20位");
		checkBox_26.setBounds(394, 278, 81, 23);
		add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("21~25位");
		checkBox_27.setBounds(488, 278, 90, 23);
		add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("26~30位");
		checkBox_28.setBounds(590, 278, 81, 23);
		add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("31~35位");
		checkBox_29.setBounds(89, 320, 89, 23);
		add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("36~40位");
		checkBox_30.setBounds(198, 320, 85, 23);
		add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("41~45位");
		checkBox_31.setBounds(300, 320, 92, 23);
		add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("46~50位");
		checkBox_32.setBounds(394, 320, 81, 23);
		add(checkBox_32);
		
		JCheckBox checkBox_33 = new JCheckBox("51~55位");
		checkBox_33.setBounds(488, 320, 90, 23);
		add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("56~60位");
		checkBox_34.setBounds(590, 320, 81, 23);
		add(checkBox_34);
		
		JCheckBox checkBox_35 = new JCheckBox("1~5位");
		checkBox_35.setBounds(89, 385, 89, 23);
		add(checkBox_35);
		
		JCheckBox checkBox_36 = new JCheckBox("6~10位");
		checkBox_36.setBounds(198, 385, 85, 23);
		add(checkBox_36);
		
		JCheckBox checkBox_37 = new JCheckBox("11~15位");
		checkBox_37.setBounds(300, 385, 92, 23);
		add(checkBox_37);
		
		JCheckBox checkBox_38 = new JCheckBox("16~20位");
		checkBox_38.setBounds(394, 380, 81, 23);
		add(checkBox_38);
		
		JCheckBox checkBox_39 = new JCheckBox("21~25位");
		checkBox_39.setBounds(488, 385, 90, 23);
		add(checkBox_39);
		
		JCheckBox checkBox_40 = new JCheckBox("26~30位");
		checkBox_40.setBounds(590, 385, 81, 23);
		add(checkBox_40);
		
		JCheckBox checkBox_41 = new JCheckBox("31~35位");
		checkBox_41.setBounds(89, 428, 89, 23);
		add(checkBox_41);
		
		JCheckBox checkBox_42 = new JCheckBox("36~40位");
		checkBox_42.setBounds(198, 428, 85, 23);
		add(checkBox_42);
		
		JCheckBox checkBox_43 = new JCheckBox("41~45位");
		checkBox_43.setBounds(300, 428, 92, 23);
		add(checkBox_43);
		
		JCheckBox checkBox_44 = new JCheckBox("46~50位");
		checkBox_44.setBounds(394, 428, 81, 23);
		add(checkBox_44);
		
		JCheckBox checkBox_45 = new JCheckBox("51~55位");
		checkBox_45.setBounds(488, 428, 90, 23);
		add(checkBox_45);
		
		JCheckBox checkBox_46 = new JCheckBox("56~60位");
		checkBox_46.setBounds(590, 428, 81, 23);
		add(checkBox_46);
		
		
		
	}

}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/presentation/Transit_center_salesmanui/Changeorder_choose_TC.java
