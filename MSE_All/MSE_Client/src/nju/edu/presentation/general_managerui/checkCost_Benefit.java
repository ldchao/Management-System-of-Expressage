package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import nju.edu.businesslogic.financebl.PayorderBL;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class checkCost_Benefit extends JPanel {

	private JTable table;
	static DefaultTableModel tableModel;
	PayorderBL payorderBL = new PayorderBL();
	
	public checkCost_Benefit(JFrame main) {
		checkCost_Benefit checkCost_Benefitframe=this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatics_Analysis newcheckStatics_Analysis=new checkStatics_Analysis(main);
				main.remove(checkCost_Benefitframe);
				main.add(newcheckStatics_Analysis);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 75, 23);
		add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u6210\u672C\u6536\u76CA\u8868\u67E5\u8BE2");
		label.setBounds(95, 14, 211, 15);
		add(label);
		
		JLabel label_1 = new JLabel("\u622A\u81F3\u5F53\u524D\u65E5\u671F\u7684\u6210\u672C\u6536\u76CA\u8868");
		label_1.setFont(new Font("黑体", Font.BOLD, 20));
		label_1.setBounds(260, 78, 260, 31);
		add(label_1);
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		
		tableModel = new DefaultTableModel(new Object[][] {
			{ "\u622A\u81F3\u65E5\u671F", null },
			{ "\u603B\u6536\u5165", null }, { "\u603B\u652F\u51FA", null },
			{ "\u603B\u5229\u6DA6", null }, }, new String[] { "", "" });
		
		table = new JTable();
		table.setBounds(143, 132, 479, 160);
		add(table);
		table.setRowHeight(40);
		table.setDefaultRenderer(Object.class, r);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setEnabled(false);
		table.setModel(tableModel);
		double[] pro = payorderBL.profit();
		for (int i = 0; i < 3; i++)
			table.setValueAt(pro[i], i + 1, 1);

		// 获取当前日期
		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		table.setValueAt(date.format(dt), 0, 1);
	}

}
