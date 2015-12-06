package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;

public class checkStatistic extends JFrame {

	private JPanel contentPane;
	JLabel label_2;
	JLabel label_4;
	JLabel label_5;

	public checkStatistic() {
		checkStatistic checkStatisticframe=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatisticframe.dispose();
				checkStatics_Analysis newcheckStatics_Analysis=new checkStatics_Analysis();
			}
		});
		button.setBounds(10, 10, 75, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u7EDF\u8BA1\u62A5\u8868\u67E5\u8BE2");
		label.setBounds(95, 14, 211, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u70B9\u51FB\u53F3\u4FA7\u6309\u94AE\u9009\u62E9\u8D77\u59CB\u65F6\u95F4");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_1.setBounds(201, 164, 211, 15);
		contentPane.add(label_1);
		
		label_2 = new JLabel("起始日期");
		label_2.setBounds(449, 165, 204, 15);
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser1.register(label_2);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u8BF7\u70B9\u51FB\u53F3\u4FA7\u6309\u94AE\u9009\u62E9\u7ED3\u675F\u65F6\u95F4");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_3.setBounds(201, 268, 211, 15);
		contentPane.add(label_3);
		
		label_4 = new JLabel("\u7ED3\u675F\u65E5\u671F");
		label_4.setBounds(449, 269, 204, 15);
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser2.register(label_4);
		contentPane.add(label_4);
		
		JButton button_1 = new JButton("\u786E\u5B9A");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valid=true;
				if(label_2.getText().equals("起始日期")||label_4.getText().equals("结束日期")){
					valid=false;
				}
				if(valid==false){
					label_5.setText("请选择完整的起始日期和结束日期");
				}else{
					int start=Integer.valueOf(label_2.getText().replaceAll("-", ""));
					int end=Integer.valueOf(label_4.getText().replaceAll("-", ""));
					if(start>end){
						label_5.setText("起始日期应晚于结束日期");
					}else{
						checkStatisticInformation checkStatisticInformation=new checkStatisticInformation(label_2.getText(),label_4.getText());
						dispose();
					}

				}

			}
		});
		button_1.setBounds(251, 375, 75, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u6E05\u7A7A");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_2.setText("起始日期");
				label_4.setText("结束日期");
			}
		});
		button_2.setBounds(415, 375, 75, 23);
		contentPane.add(button_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 534, 714, 17);
		contentPane.add(toolBar);
		
		label_5 = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(label_5);
	}
}
