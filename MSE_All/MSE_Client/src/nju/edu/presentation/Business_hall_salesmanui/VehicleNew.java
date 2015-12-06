package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import nju.edu.presentation.financial_staffui.DateChooser;

import javax.swing.JTextField;
import java.awt.Color;

public class VehicleNew extends JPanel{


		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		

		public VehicleNew(JFrame m, JPanel bf) {
			JFrame main = m;
			JPanel lastui = bf;
			VehicleNew nowPanel = this;
			nowPanel.setBounds(0, 0, 750, 600);
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

			JLabel label = new JLabel("营业厅业务员>>新建车辆信息");
			label.setBounds(100, 14, 200, 15);
			add(label);

			JLabel label_1 = new JLabel("阙帅，你好！");
			label_1.setBounds(600, 14, 100, 15);
			add(label_1);

			JToolBar toolBar = new JToolBar();
			toolBar.setBounds(0, 533, 734, 28);
			add(toolBar);

			JLabel label_4 = new JLabel("状态栏");
			toolBar.add(label_4);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(212, 319, 106, 26);
			add(textField);
			
			JLabel carNumLabel = new JLabel("车辆代号");
			carNumLabel.setBounds(133, 318, 57, 28);
			add(carNumLabel);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(212, 357, 106, 26);
			add(textField_1);
			
			JLabel engineNumLabel = new JLabel("发动机型号");
			engineNumLabel.setBounds(133, 357, 65, 28);
			add(engineNumLabel);
			
			JLabel carLabel = new JLabel("车辆号");
			carLabel.setBounds(133, 438, 67, 28);
			add(carLabel);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(212, 438, 106, 26);
			add(textField_2);
			
			JLabel baseLabel = new JLabel("底盘号");
			baseLabel.setBounds(133, 398, 57, 28);
			add(baseLabel);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(212, 399, 106, 26);
			add(textField_3);
			
			DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
			JLabel showDate2 = new JLabel("请单击选择日期");
			showDate2.setBounds(465, 365, 93, 23);
			dateChooser2.register(showDate2);
			add(showDate2);
			
			JLabel label_7 = new JLabel("购买日期");
			label_7.setBounds(379, 362, 57, 28);
			add(label_7);
			
			JLabel label_8 = new JLabel("服役时间");
			label_8.setBounds(379, 400, 74, 28);
			add(label_8);
			
			JLabel label_9 = new JLabel("请单击选择日期");
			label_9.setBounds(465, 403, 93, 23);
			add(label_9);
			
			JLabel label_11 = new JLabel("驾驶员");
			label_11.setBounds(379, 319, 57, 28);
			add(label_11);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(458, 319, 106, 26);
			add(textField_4);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBounds(268, 104, 160, 160);
			add(panel);
			
			JButton btnNewButton = new JButton("\u786E\u8BA4");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(268, 492, 67, 29);
			add(btnNewButton);
			
			JButton button_1 = new JButton("\u53D6\u6D88");
			button_1.setBounds(347, 492, 67, 29);
			add(button_1);
			
			
			
			
			

	}
}


