package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class CheckStatisticsframe extends JFrame {
	private JTable table;
	private JTable table2;
	private int rowpos1 = -1;
	private int rowpos2 = -1;

	/**
	 * Create the panel.
	 */
	public CheckStatisticsframe() {
		getContentPane().setLayout(null);

		CheckStatisticsframe csf = this;

		JLabel label = new JLabel("财务人员>>统计报表>>查看收款信息和付款信息");
		label.setBounds(92, 8, 563, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				csf.dispose();
				Calculateframe clf = new Calculateframe();
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		getContentPane().add(button_4);

		JLabel label_1 = new JLabel("收款信息");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(320, 78, 93, 15);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label_2.setFont(new Font("黑体", Font.BOLD, 15));
		label_2.setBounds(320, 294, 93, 15);
		getContentPane().add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(92, 114, 549, 144);
		getContentPane().add(scrollPane);

		// 收款单
		table = new JTable();

		// 选取行
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				Point mousepoint;
				mousepoint = e.getPoint();
				rowpos1 = table.rowAtPoint(mousepoint);
				table.setRowSelectionInterval(rowpos1, rowpos1);
			}
		});

		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(new Object[][] {
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
				"\u5907\u6CE8", "\u4ED8\u6B3E\u4EBA" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setMinWidth(20);
		table.getColumnModel().getColumn(3).setPreferredWidth(125);
		table.getColumnModel().getColumn(3).setMinWidth(20);
		table.getColumnModel().getColumn(4).setPreferredWidth(125);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(92, 329, 549, 144);
		getContentPane().add(scrollPane_1);

		// 付款单
		table2 = new JTable();

		// 选取行
		table2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				Point mousepoint;
				mousepoint = e.getPoint();
				rowpos2 = table2.rowAtPoint(mousepoint);
				table2.setRowSelectionInterval(rowpos2, rowpos2);
			}
		});

		scrollPane_1.setViewportView(table2);
		table2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table2.setEnabled(false);
		table2.setModel(new DefaultTableModel(new Object[][] {
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
				"\u5907\u6CE8", "\u4ED8\u6B3E\u4EBA" }));
		table2.getColumnModel().getColumn(0).setPreferredWidth(85);
		table2.getColumnModel().getColumn(1).setPreferredWidth(85);
		table2.getColumnModel().getColumn(2).setPreferredWidth(90);
		table2.getColumnModel().getColumn(2).setMinWidth(20);
		table2.getColumnModel().getColumn(3).setPreferredWidth(125);
		table2.getColumnModel().getColumn(3).setMinWidth(20);
		table2.getColumnModel().getColumn(4).setPreferredWidth(125);
		table2.getColumnModel().getColumn(5).setPreferredWidth(80);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
