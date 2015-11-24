package nju.edu.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JToolBar;

import nju.edu.businesslogic.financebl.PayorderBL;

public class Profitframe extends JFrame {
	private JTable table;
	static DefaultTableModel tableModel;
	PayorderBL payorderBL = new PayorderBL();

	/**
	 * Create the panel.
	 */
	public Profitframe() {
		getContentPane().setLayout(null);
		Profitframe pf = this;

		JLabel label = new JLabel("财务人员>>成本管理>>查看成本收益表");
		label.setBounds(87, 5, 518, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pf.dispose();
				fsframe fs = new fsframe();
			}
		});
		button_4.setBounds(10, 1, 67, 23);
		getContentPane().add(button_4);

		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setEnabled(false);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));

		tableModel = new DefaultTableModel(new Object[][] {
				{ "\u622A\u81F3\u65E5\u671F", null },
				{ "\u603B\u6536\u5165", null }, { "\u603B\u652F\u51FA", null },
				{ "\u603B\u5229\u6DA6", null }, }, new String[] { "", "" });
		table.setModel(tableModel);
		table.setBounds(193, 252, 356, 64);
		getContentPane().add(table);

		// double[] pro = payorderBL.profit(payorderBL.checkPayorder(), null);
		// 收款单！
		for (int i = 0; i < 3; i++)
			table.setValueAt(0, i + 1, 1); // pro[i]

		// 获取当前日期
		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		table.setValueAt(date.format(dt), 0, 1);

		JLabel label_1 = new JLabel(
				"\u622A\u81F3\u5F53\u524D\u65E5\u671F\u7684\u6210\u672C\u6536\u76CA\u8868");
		label_1.setFont(new Font("黑体", Font.BOLD, 20));
		label_1.setBounds(242, 150, 260, 31);
		getContentPane().add(label_1);

		JButton button = new JButton("\u5BFC\u51FA");
		button.setBounds(325, 389, 93, 23);
		getContentPane().add(button);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		getContentPane().add(toolBar);

		JLabel label_2 = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(label_2);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}
