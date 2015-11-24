package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import nju.edu.presentation.financial_staffui.DateChooser;

public class VehicleLoadManageUI extends JPanel{
	private int rowpos = -1;
	
	
	//create the panel
	public VehicleLoadManageUI(JFrame m, JPanel bf){
		JFrame main = m;
		JPanel lastui = bf;
		VehicleLoadManageUI nowPanel = this;
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
		
		JLabel lblNewLabel = new JLabel("营业厅业务员>>车辆装车管理");
		lblNewLabel.setBounds(100, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("阙帅，你好！");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533,734,28);
		add(toolBar);
		
		JLabel lblNewLabel_2 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("装车日期");
		lblNewLabel_3.setBounds(146, 75, 54, 15);
		add(lblNewLabel_3);
		
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_4 = new JLabel("单击选择日期");
		dateChooser2.register(lblNewLabel_4);
		lblNewLabel_4.setBounds(242, 75, 96, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("营业厅编号");
		lblNewLabel_5.setBounds(146, 123, 65, 15);
		add(lblNewLabel_5);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(238, 119, 118, 21);
		add(textField_1);
		
		JLabel lblNewLabel_6 = new JLabel("汽运编号");
		lblNewLabel_6.setBounds(146, 167, 65, 15);
		add(lblNewLabel_6);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(238, 163, 118, 21);
		add(textField_2);
		
		JLabel lblNewLabel_7 = new JLabel("出发地");
		lblNewLabel_7.setBounds(483, 78, 45, 15);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("到达地");
		lblNewLabel_8.setBounds(483, 122, 43, 15);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("运费总价");
		lblNewLabel_9.setBounds(483, 167, 54, 15);
		add(lblNewLabel_9);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(549, 163, 65, 21);
		add(textField_3);
		
		
		
		String[] place = new String[3];
		place[0] = "南京";
		place[1] = "上海";
		place[2] = "北京";
		place[3] = "广州";
		
		JComboBox depart = new JComboBox(place);
		depart.setEditable(false);
		depart.setBounds(549, 75, 65, 23);
		add(depart);
		
		JComboBox arrival = new JComboBox(place);
		arrival.setEditable(false);
		arrival.setBounds(549, 117, 65, 23);
		add(arrival);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(126, 216, 506, 208);
		add(scrollPane);
		
		JTable table = new JTable();
		//选取行
		table.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent e) {
				Point mousepoint;
				mousepoint = e.getPoint();
				rowpos = table.rowAtPoint(mousepoint);
				table.setRowSelectionInterval(rowpos, rowpos);
			}
		});
		
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0),0,true));
		table.setEnabled(false);
		DefaultTableModel tableModel = new DefaultTableModel(new Object[][]{
			{"","","",""},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},
			{ null, null, null, null},},new String[]{
				"订单号","发出时间","发出地","快递员"});
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setMinWidth(20);
		table.getColumnModel().getColumn(3).setPreferredWidth(125);
		table.getColumnModel().getColumn(3).setMinWidth(20);
		
		JButton button2 = new JButton("确认");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_2.setText("保存成功");
			}
		});
		button2.setBounds(262, 493, 65, 28);
		add(button2);
		
		JButton button3 = new JButton("取消");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);				
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button3.setBounds(342, 493, 65, 28);
		add(button3);
		
		
		
		
	}
}
