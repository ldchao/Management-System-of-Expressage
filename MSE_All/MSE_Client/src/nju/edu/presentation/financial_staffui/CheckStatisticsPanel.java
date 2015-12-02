package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;
import nju.edu.businesslogic.financebl.StatisticsBL;

import javax.swing.JToolBar;

import PO.LoginPO;

@SuppressWarnings("serial")
public class CheckStatisticsPanel extends JPanel {
	private JTable table;
	private JTable table2;
	private DefaultTableModel tableModel1;
	private DefaultTableModel tableModel2;
	StatisticsBL stbl = new StatisticsBL();

	/**
	 * Create the panel.
	 */
	public CheckStatisticsPanel(JFrame main, LoginPO loginPO, String start,
			String end) {
		setLayout(null);
		CheckStatisticsPanel csp = this;

		int startnum = Integer.valueOf(start.replaceAll("-", ""));
		int endnum = Integer.valueOf(end.replaceAll("-", ""));

		JLabel label = new JLabel("财务人员>>统计报表>>查看收款信息和付款信息");
		label.setBounds(92, 8, 563, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(csp);
				StatisticsPanel sts = new StatisticsPanel(loginPO, main);
				Thread t = new Thread(sts);
				t.start();
				main.add(sts);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		add(button_4);

		JLabel label_1 = new JLabel("收款信息");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(320, 81, 93, 15);
		add(label_1);

		JLabel label_2 = new JLabel("\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label_2.setFont(new Font("黑体", Font.BOLD, 15));
		label_2.setBounds(319, 293, 93, 15);
		add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 114, 654, 147);
		add(scrollPane);

		// 收款单
		table = new JTable();
		table.setRowHeight(25);
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

		JLabel label_3 = new JLabel(start + "至" + end + "期间的经营情况");
		label_3.setFont(new Font("黑体", Font.BOLD, 17));
		label_3.setBounds(188, 44, 368, 23);
		add(label_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		add(toolBar);

		JLabel lblNewLabel = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(lblNewLabel);

		JButton button = new JButton("\u5BFC\u51FA");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stbl.excel(payvo, payeevo, start + "至" + end + "的");
				lblNewLabel.setText("已成功导出到本地！");
			}
		});
		button.setBounds(316, 489, 93, 23);
		add(button);
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
