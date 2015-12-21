package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import PO.LoginPO;
import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;
import nju.edu.businesslogic.financebl.StatisticsBL;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class checkStatisticInformation extends JPanel {

	private JTable table;
	private JTable table2;
	private DefaultTableModel tableModel1;
	private DefaultTableModel tableModel2;
	StatisticsBL stbl = new StatisticsBL();
	public checkStatisticInformation(String start, String end,JFrame main,LoginPO loginPO) {
		checkStatisticInformation checkStatisticInformation=this;
		setBounds(100, 100, 750, 600);
		this.setVisible(true);
		setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatistic checkStatistic=new checkStatistic(main,loginPO);
				main.remove(checkStatisticInformation);
				main.add(checkStatistic);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 93, 23);
		add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u67E5\u770B\u7EDF\u8BA1\u5206\u6790");
		label.setBounds(113, 14, 130, 15);
		add(label);
		
		JLabel label_1 = new JLabel(start + "至" + end + "期间的经营情况");
		label_1.setFont(new Font("黑体", Font.BOLD, 17));
		label_1.setBounds(209, 71, 368, 23);
		add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 114, 654, 147);
		add(scrollPane);
		
		int startnum = Integer.valueOf(start.replaceAll("-", ""));
		int endnum = Integer.valueOf(end.replaceAll("-", ""));
		
		// 收款单
		table = new JTable();
		table.setRowHeight(25);
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);

		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table.setEnabled(false);
		tableModel1 = new DefaultTableModel(new Object[][] {
				{ "", "", "", "", "", "" },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null }, }, new String[] {
				"\u6536\u6B3E\u65E5\u671F", "\u6536\u6B3E\u91D1\u989D",
				"\u8BA2\u5355\u53F7", "\u5FEB\u9012\u5458\u59D3\u540D",
				"\u8425\u4E1A\u5385\u7F16\u53F7",
				"\u4E1A\u52A1\u5458\u59D3\u540D" });
		table.setModel(tableModel1);

		ArrayList<PayeeorderVO> payeevo = stbl.checkPayee(startnum, endnum);
		showPayeeTable(payeevo);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(43, 324, 654, 147);
		add(scrollPane_1);

		// 付款单
		table2 = new JTable();
		table2.setRowHeight(25);
		// 使表格居中
		table2.setDefaultRenderer(Object.class, r);
		
		scrollPane_1.setViewportView(table2);
		table2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table2.setEnabled(false);
		tableModel2 = new DefaultTableModel(new Object[][] {
				{ "", "", "", "", "", "" },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null }, }, new String[] {
				"\u4ED8\u6B3E\u65E5\u671F", "\u4ED8\u6B3E\u91D1\u989D",
				"\u4ED8\u6B3E\u8D26\u53F7", "\u4ED8\u6B3E\u6761\u76EE",
				"\u5907\u6CE8", "\u4ED8\u6B3E\u4EBA" });
		table2.setModel(tableModel2);

		ArrayList<PayorderVO> payvo = stbl.checkPay(startnum, endnum);
		showPayTable(payvo);
	}
	
	public void showPayeeTable(ArrayList<PayeeorderVO> payeeList) {
		int i = 0;
		for (PayeeorderVO vo : payeeList) {
			tableModel1.setValueAt(vo.getDate(), i, 0);
			tableModel1.setValueAt(vo.getMoney(), i, 1);
			tableModel1.setValueAt(vo.getOrder(), i, 2);
			tableModel1.setValueAt(vo.getCarrierName(), i, 3);
			tableModel1.setValueAt(vo.getShop(), i, 4);
			tableModel1.setValueAt(vo.getShopperName(), i, 5);
			i++;

			if (i >= tableModel1.getRowCount()) {
				String[] rowstr = { "", "", "", "", "", "" };
				tableModel1.addRow(rowstr);
			}
		}
	}

	public void showPayTable(ArrayList<PayorderVO> payList) {
		int i = 0;
		for (PayorderVO vo : payList) {
			tableModel2.setValueAt(vo.getDate(), i, 0);
			tableModel2.setValueAt(vo.getMoney(), i, 1);
			tableModel2.setValueAt(vo.getAccount(), i, 2);
			tableModel2.setValueAt(vo.getList(), i, 3);
			tableModel2.setValueAt(vo.getComment(), i, 4);
			tableModel2.setValueAt(vo.getPayor(), i, 5);
			i++;

			if (i >= tableModel2.getRowCount()) {
				String[] rowstr = { "", "", "", "", "", "" };
				tableModel2.addRow(rowstr);
			}
		}
	}
}
