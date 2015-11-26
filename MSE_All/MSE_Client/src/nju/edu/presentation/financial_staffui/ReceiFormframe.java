package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import nju.edu.businesslogic.financebl.PayeeorderBL;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("serial")
public class ReceiFormframe extends JFrame implements Runnable {
	private JTable table;
	private JTable table1;
	private DefaultTableModel tableModel;
	private JTable table_1;
	private boolean signal;
	private static int count;
	PayeeorderBL payeebl = new PayeeorderBL();

	/**
	 * Create the panel.
	 */
	public ReceiFormframe() {
		ReceiFormframe rff = this;
		getContentPane().setLayout(null);
		signal = false;

		JLabel label = new JLabel("营业厅业务员>>收款单管理");
		label.setBounds(87, 10, 470, 15);
		getContentPane().add(label);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rff.dispose();
				// 返回
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		getContentPane().add(button_4);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(630, 10, 54, 15);
		getContentPane().add(lblHello);

		// 新建付款单
		table1 = new JTable();
		table1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table1.setRowHeight(25);
		table1.setModel(new DefaultTableModel(new Object[][] {
				{ "\u8BA2\u5355\u53F7", "\u6536\u6B3E\u91D1\u989D",
						"\u6536\u6B3E\u65E5\u671F",
						"\u5FEB\u9012\u5458\u59D3\u540D", "业务员姓名" },
				{ null, null, null, null, null }, }, new String[] {
				"New column", "New column", "New column", "New column",
				"New column" }));
		table1.setBounds(92, 95, 549, 50);
		getContentPane().add(table1);

		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		table1.setValueAt(date.format(dt), 0, 2);

		// 付款单列表
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(92, 252, 549, 201);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setRowHeight(25);

		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table.setEnabled(false);
		tableModel = new DefaultTableModel(new Object[][] { { "", "", "", "" },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, }, new String[] { "订单号", "收款金额",
				"收款日期", "快递员姓名" });
		table.setModel(tableModel);

		// 总计表
		table_1 = new JTable();
		table_1.setEnabled(false);
		table_1.setRowSelectionAllowed(false);
		table_1.setModel(new DefaultTableModel(new Object[][] { {
				"\u8BA2\u5355\u603B\u6570", null, "收款总金额", null }, },
				new String[] { "New column", "New column", "New column",
						"New column" }));
		table_1.setRowHeight(25);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBounds(92, 481, 549, 25);
		getContentPane().add(table_1);

		// “添加”按钮
		JButton button = new JButton("\u6DFB\u52A0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str[] = new String[5];
				for (int i = 0; i < 5; i++)
					str[i] = table1.getValueAt(0, i).toString();
				payeebl.addReceiForm(str[0], str[1], str[2], str[3], str[4],
						false);
				signal = true;
				showList(str, count);
				count++;
				showTotal(count, payeebl.getTotal());
			}
		});
		button.setBounds(239, 171, 93, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("\u7ED3\u675F");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				payeebl.addReceiForm("", "", "", "", "", true);
				signal = true;
			}
		});
		button_1.setBounds(393, 171, 93, 23);
		getContentPane().add(button_1);

		JLabel label_1 = new JLabel(
				"\u5F55\u5165\u6536\u6B3E\u5355\u4FE1\u606F");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(311, 67, 121, 15);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\u6536\u6B3E\u5355\u5217\u8868");
		label_2.setFont(new Font("黑体", Font.BOLD, 15));
		label_2.setBounds(329, 227, 85, 15);
		getContentPane().add(label_2);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}

	public void showList(String str[], int n) {
		for (int i = 0; i < 4; i++)
			table.setValueAt(str[i], n, i);

		if (n >= table.getRowCount()) {
			String[] rowstr = { "", "", "", "" };
			tableModel.addRow(rowstr);
		}
	}

	public void showTotal(int count, double total) {
		table_1.setValueAt(count, 0, 1);
		table_1.setValueAt(total, 0, 3);
	}

	@Override
	public void run() {
		while (true) {
			if (signal) {
				try {

				} catch (Exception e) {
					e.printStackTrace();
				}
				table1.setValueAt("", 0, 0);
				table1.setValueAt("", 0, 1);
				table1.setValueAt("", 0, 3);
				signal = false;
			}
		}
	}
}
