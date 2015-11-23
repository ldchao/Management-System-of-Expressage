<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/presentation/Transit_center_salesmanui/Changeorder_choose_BH.java
package Client.presentation.Transit_center_salesmanui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JComboBox;

public class Changeorder_choose_BH extends JPanel {
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Changeorder_choose_BH(JFrame m,JPanel jp) {
		main=m;
		JPanel lastui=jp;
		Changeorder_choose_BH nowPanel=this;
		setLayout(null);
		
		JButton button = new JButton("返回");
		button.setBounds(10, 10, 65, 23);
		add(button);
		
		JLabel label = new JLabel("中转中心业务员>>录入中转单>>新建中转单");
		label.setBounds(100, 14, 270, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JLabel lblNewLabel = new JLabel("选择架号");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel.setBounds(469, 107, 63, 15);
		add(lblNewLabel);
		
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533,734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("选择要中转到本市营业厅的货物");
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD, 20));
		lblNewLabel_1.setBounds(175, 66, 327, 31);
		add(lblNewLabel_1);
		
		
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBounds(217, 500, 93, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setBounds(394, 500, 93, 23);
		add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("1位");
		chckbxNewCheckBox.setBounds(63, 141, 89, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("2位");
		checkBox.setBounds(166, 141, 85, 23);
		add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("3位");
		checkBox_1.setBounds(267, 141, 92, 23);
		add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("4位");
		checkBox_2.setBounds(361, 141, 81, 23);
		add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("5位");
		checkBox_3.setBounds(469, 141, 90, 23);
		add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("6位");
		checkBox_4.setBounds(561, 141, 81, 23);
		add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("7位");
		checkBox_5.setBounds(63, 180, 89, 23);
		add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("8位");
		checkBox_6.setBounds(166, 180, 85, 23);
		add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("9位");
		checkBox_7.setBounds(267, 180, 92, 23);
		add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("10位");
		checkBox_8.setBounds(360, 180, 81, 23);
		add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("11位");
		checkBox_9.setBounds(469, 180, 90, 23);
		add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("12位");
		checkBox_10.setBounds(561, 180, 81, 23);
		add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("13位");
		checkBox_11.setBounds(63, 223, 89, 23);
		add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("14位");
		checkBox_12.setBounds(166, 223, 85, 23);
		add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("15位");
		checkBox_13.setBounds(267, 223, 92, 23);
		add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("16位");
		checkBox_14.setBounds(360, 223, 81, 23);
		add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("17位");
		checkBox_15.setBounds(469, 223, 90, 23);
		add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("18位");
		checkBox_16.setBounds(561, 223, 81, 23);
		add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("19位");
		checkBox_17.setBounds(63, 262, 89, 23);
		add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("20位");
		checkBox_18.setBounds(166, 262, 85, 23);
		add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("21位");
		checkBox_19.setBounds(267, 262, 92, 23);
		add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("22位");
		checkBox_20.setBounds(360, 262, 81, 23);
		add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("23位");
		checkBox_21.setBounds(469, 262, 90, 23);
		add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("24位");
		checkBox_22.setBounds(561, 262, 81, 23);
		add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("25位");
		checkBox_23.setBounds(63, 302, 89, 23);
		add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("26位");
		checkBox_24.setBounds(166, 302, 85, 23);
		add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("27位");
		checkBox_25.setBounds(267, 302, 91, 23);
		add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("28位");
		checkBox_26.setBounds(360, 302, 81, 23);
		add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("29位");
		checkBox_27.setBounds(469, 302, 90, 23);
		add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("30位");
		checkBox_28.setBounds(561, 302, 81, 23);
		add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("31位");
		checkBox_29.setBounds(63, 351, 89, 23);
		add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("32位");
		checkBox_30.setBounds(166, 351, 85, 23);
		add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("33位");
		checkBox_31.setBounds(267, 351, 92, 23);
		add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("34位");
		checkBox_32.setBounds(360, 351, 81, 23);
		add(checkBox_32);
		
		JCheckBox checkBox_33 = new JCheckBox("35位");
		checkBox_33.setBounds(469, 351, 90, 23);
		add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("36位");
		checkBox_34.setBounds(561, 351, 81, 23);
		add(checkBox_34);
		
		JCheckBox checkBox_35 = new JCheckBox("37位");
		checkBox_35.setBounds(63, 396, 89, 23);
		add(checkBox_35);
		
		JCheckBox checkBox_36 = new JCheckBox("38位");
		checkBox_36.setBounds(166, 396, 85, 23);
		add(checkBox_36);
		
		JCheckBox checkBox_37 = new JCheckBox("39位");
		checkBox_37.setBounds(267, 396, 92, 23);
		add(checkBox_37);
		
		JCheckBox checkBox_38 = new JCheckBox("40位");
		checkBox_38.setBounds(360, 396, 81, 23);
		add(checkBox_38);
		
		JCheckBox checkBox_39 = new JCheckBox("41位");
		checkBox_39.setBounds(469, 396, 90, 23);
		add(checkBox_39);
		
		JCheckBox checkBox_40 = new JCheckBox("42位");
		checkBox_40.setBounds(561, 396, 81, 23);
		add(checkBox_40);
		
		JCheckBox checkBox_41 = new JCheckBox("43位");
		checkBox_41.setBounds(63, 435, 89, 23);
		add(checkBox_41);
		
		JCheckBox checkBox_42 = new JCheckBox("44位");
		checkBox_42.setBounds(166, 435, 85, 23);
		add(checkBox_42);
		
		JCheckBox checkBox_43 = new JCheckBox("45位");
		checkBox_43.setBounds(267, 435, 92, 23);
		add(checkBox_43);
		
		JCheckBox checkBox_44 = new JCheckBox("46位");
		checkBox_44.setBounds(360, 435, 81, 23);
		add(checkBox_44);
		
		JCheckBox checkBox_45 = new JCheckBox("47位");
		checkBox_45.setBounds(469, 435, 90, 23);
		add(checkBox_45);
		
		JCheckBox checkBox_46 = new JCheckBox("48位");
		checkBox_46.setBounds(561, 435, 81, 23);
		add(checkBox_46);
		
		
		String[] jiahao={"  1架","  2架","  3架","  4架","  5架","  6架","  7架","  8架","  9架","10架","11架","12架","13架","14架","15架"};
		JComboBox comboBox = new JComboBox(jiahao);
		comboBox.setBounds(565, 105, 77, 21);
		add(comboBox);
	}
}
=======
package Client.presentation.Transit_center_salesmanui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JComboBox;

public class Changeorder_choose_BH extends JPanel {
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Changeorder_choose_BH(JFrame m,JPanel jp) {
		main=m;
		JPanel lastui=jp;
		Changeorder_choose_BH nowPanel=this;
		setLayout(null);
		
		JButton button = new JButton("返回");
		button.setBounds(10, 10, 65, 23);
		add(button);
		
		JLabel label = new JLabel("中转中心业务员>>录入中转单>>新建中转单");
		label.setBounds(100, 14, 270, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JLabel lblNewLabel = new JLabel("选择架号");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel.setBounds(469, 107, 63, 15);
		add(lblNewLabel);
		
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533,734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("选择要中转到本市营业厅的货物");
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD, 20));
		lblNewLabel_1.setBounds(175, 66, 327, 31);
		add(lblNewLabel_1);
		
		
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBounds(217, 500, 93, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setBounds(394, 500, 93, 23);
		add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("1位");
		chckbxNewCheckBox.setBounds(63, 141, 89, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("2位");
		checkBox.setBounds(166, 141, 85, 23);
		add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("3位");
		checkBox_1.setBounds(267, 141, 92, 23);
		add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("4位");
		checkBox_2.setBounds(361, 141, 81, 23);
		add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("5位");
		checkBox_3.setBounds(469, 141, 90, 23);
		add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("6位");
		checkBox_4.setBounds(561, 141, 81, 23);
		add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("7位");
		checkBox_5.setBounds(63, 180, 89, 23);
		add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("8位");
		checkBox_6.setBounds(166, 180, 85, 23);
		add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("9位");
		checkBox_7.setBounds(267, 180, 92, 23);
		add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("10位");
		checkBox_8.setBounds(360, 180, 81, 23);
		add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("11位");
		checkBox_9.setBounds(469, 180, 90, 23);
		add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("12位");
		checkBox_10.setBounds(561, 180, 81, 23);
		add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("13位");
		checkBox_11.setBounds(63, 223, 89, 23);
		add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("14位");
		checkBox_12.setBounds(166, 223, 85, 23);
		add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("15位");
		checkBox_13.setBounds(267, 223, 92, 23);
		add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("16位");
		checkBox_14.setBounds(360, 223, 81, 23);
		add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("17位");
		checkBox_15.setBounds(469, 223, 90, 23);
		add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("18位");
		checkBox_16.setBounds(561, 223, 81, 23);
		add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("19位");
		checkBox_17.setBounds(63, 262, 89, 23);
		add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("20位");
		checkBox_18.setBounds(166, 262, 85, 23);
		add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("21位");
		checkBox_19.setBounds(267, 262, 92, 23);
		add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("22位");
		checkBox_20.setBounds(360, 262, 81, 23);
		add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("23位");
		checkBox_21.setBounds(469, 262, 90, 23);
		add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("24位");
		checkBox_22.setBounds(561, 262, 81, 23);
		add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("25位");
		checkBox_23.setBounds(63, 302, 89, 23);
		add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("26位");
		checkBox_24.setBounds(166, 302, 85, 23);
		add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("27位");
		checkBox_25.setBounds(267, 302, 91, 23);
		add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("28位");
		checkBox_26.setBounds(360, 302, 81, 23);
		add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("29位");
		checkBox_27.setBounds(469, 302, 90, 23);
		add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("30位");
		checkBox_28.setBounds(561, 302, 81, 23);
		add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("31位");
		checkBox_29.setBounds(63, 351, 89, 23);
		add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("32位");
		checkBox_30.setBounds(166, 351, 85, 23);
		add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("33位");
		checkBox_31.setBounds(267, 351, 92, 23);
		add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("34位");
		checkBox_32.setBounds(360, 351, 81, 23);
		add(checkBox_32);
		
		JCheckBox checkBox_33 = new JCheckBox("35位");
		checkBox_33.setBounds(469, 351, 90, 23);
		add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("36位");
		checkBox_34.setBounds(561, 351, 81, 23);
		add(checkBox_34);
		
		JCheckBox checkBox_35 = new JCheckBox("37位");
		checkBox_35.setBounds(63, 396, 89, 23);
		add(checkBox_35);
		
		JCheckBox checkBox_36 = new JCheckBox("38位");
		checkBox_36.setBounds(166, 396, 85, 23);
		add(checkBox_36);
		
		JCheckBox checkBox_37 = new JCheckBox("39位");
		checkBox_37.setBounds(267, 396, 92, 23);
		add(checkBox_37);
		
		JCheckBox checkBox_38 = new JCheckBox("40位");
		checkBox_38.setBounds(360, 396, 81, 23);
		add(checkBox_38);
		
		JCheckBox checkBox_39 = new JCheckBox("41位");
		checkBox_39.setBounds(469, 396, 90, 23);
		add(checkBox_39);
		
		JCheckBox checkBox_40 = new JCheckBox("42位");
		checkBox_40.setBounds(561, 396, 81, 23);
		add(checkBox_40);
		
		JCheckBox checkBox_41 = new JCheckBox("43位");
		checkBox_41.setBounds(63, 435, 89, 23);
		add(checkBox_41);
		
		JCheckBox checkBox_42 = new JCheckBox("44位");
		checkBox_42.setBounds(166, 435, 85, 23);
		add(checkBox_42);
		
		JCheckBox checkBox_43 = new JCheckBox("45位");
		checkBox_43.setBounds(267, 435, 92, 23);
		add(checkBox_43);
		
		JCheckBox checkBox_44 = new JCheckBox("46位");
		checkBox_44.setBounds(360, 435, 81, 23);
		add(checkBox_44);
		
		JCheckBox checkBox_45 = new JCheckBox("47位");
		checkBox_45.setBounds(469, 435, 90, 23);
		add(checkBox_45);
		
		JCheckBox checkBox_46 = new JCheckBox("48位");
		checkBox_46.setBounds(561, 435, 81, 23);
		add(checkBox_46);
		
		
		String[] jiahao={"  1架","  2架","  3架","  4架","  5架","  6架","  7架","  8架","  9架","10架","11架","12架","13架","14架","15架"};
		JComboBox comboBox = new JComboBox(jiahao);
		comboBox.setBounds(565, 105, 77, 21);
		add(comboBox);
	}
}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/presentation/Transit_center_salesmanui/Changeorder_choose_BH.java
