package nju.edu.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.businesslogic.financebl.PayorderBL;

@SuppressWarnings("serial")
public class ProfitPanel extends JPanel {
	private JTable table;
	static DefaultTableModel tableModel;
	PayorderBL payorderBL = new PayorderBL();

	/**
	 * Create the panel.
	 */
	public ProfitPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);
		setSize(750, 600);
		ProfitPanel pfp = this;

		JLabel label = new JLabel("财务人员>>成本管理>>查看成本收益表");
		label.setBounds(87, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(pfp);
				PayPanel payPanel = new PayPanel(loginPO, main);
				main.add(payPanel);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(10, 1, 67, 23);
		add(button_4);

		table = new JTable();
		table.setRowHeight(40);
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);
		
		table.setEnabled(false);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));

		tableModel = new DefaultTableModel(new Object[][] {
				{ "\u622A\u81F3\u65E5\u671F", null },
				{ "\u603B\u6536\u5165", null }, { "\u603B\u652F\u51FA", null },
				{ "\u603B\u5229\u6DA6", null }, }, new String[] { "", "" });
		table.setModel(tableModel);
		table.setBounds(194, 208, 356, 160);
		add(table);

		double[] pro = payorderBL.profit();
		for (int i = 0; i < 3; i++)
			table.setValueAt(pro[i], i + 1, 1);

		// 获取当前日期
		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		table.setValueAt(date.format(dt), 0, 1);

		JLabel label_1 = new JLabel(
				"\u622A\u81F3\u5F53\u524D\u65E5\u671F\u7684\u6210\u672C\u6536\u76CA\u8868");
		label_1.setFont(new Font("黑体", Font.BOLD, 20));
		label_1.setBounds(242, 115, 260, 31);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		toolBar.setEnabled(false);
		add(toolBar);

		JLabel label_2 = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(label_2);

		JButton button = new JButton("\u5BFC\u51FA");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				payorderBL.excel(date.format(dt), pro[0], pro[1], pro[2]);
				label_2.setText("已成功导出到本地！");
			}
		});
		button.setBounds(325, 449, 93, 23);
		add(button);
	}
}
