package nju.edu.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.Point;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JScrollPane;

import nju.edu.VO.AccountVO;
import nju.edu.VO.PayorderVO;
import nju.edu.businesslogic.financebl.PayorderBL;

public class CheckPayorderframe extends JFrame {
	private static JTable table;
	private int rowpos = -1;
	private static DefaultTableModel tableModel;
	PayorderBL payorderBL = new PayorderBL();

	/**
	 * Create the panel.
	 */
	public CheckPayorderframe() {
		getContentPane().setLayout(null);

		CheckPayorderframe cpf = this;

		JLabel label = new JLabel(
				"\u8D22\u52A1\u4EBA\u5458>>\u6210\u672C\u7BA1\u7406>>\u67E5\u770B\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label.setBounds(92, 8, 563, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpf.dispose();
				Payframe pf = new Payframe();
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		getContentPane().add(button_4);

		JLabel label_1 = new JLabel("\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(320, 129, 93, 15);
		getContentPane().add(label_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(92, 176, 549, 208);
		getContentPane().add(scrollPane);

		table = new JTable();
		// 选取行
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				Point mousepoint;
				mousepoint = e.getPoint();
				rowpos = table.rowAtPoint(mousepoint);
				table.setRowSelectionInterval(rowpos, rowpos);
			}
		});
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table.setEnabled(false);
		tableModel = new DefaultTableModel(new Object[][] {
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
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null }, }, new String[] {
				"\u4ED8\u6B3E\u65E5\u671F", "\u4ED8\u6B3E\u91D1\u989D",
				"\u4ED8\u6B3E\u8D26\u53F7", "\u4ED8\u6B3E\u6761\u76EE",
				"\u5907\u6CE8", "\u4ED8\u6B3E\u4EBA" });
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setMinWidth(20);
		table.getColumnModel().getColumn(3).setPreferredWidth(125);
		table.getColumnModel().getColumn(3).setMinWidth(20);
		table.getColumnModel().getColumn(4).setPreferredWidth(125);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		
		showTable(payorderBL.checkPayorder());

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 显示
	public static void showTable(ArrayList<PayorderVO> pavo) {
		int i = 0;
		for (PayorderVO pa : pavo) {
			tableModel.setValueAt(pa.getDate(), i, 0);
			tableModel.setValueAt(pa.getMoney(), i, 1);
			tableModel.setValueAt(pa.getAccount(), i, 2);
			tableModel.setValueAt(pa.getList(), i, 3);
			tableModel.setValueAt(pa.getComment(), i, 4);
			tableModel.setValueAt(pa.getPayor(), i, 5);
			i++;

			if (i >= table.getRowCount()) {
				String[] rowstr = { "", "","","","","" };
				tableModel.addRow(rowstr);
			}
		}
		
		while (i < table.getRowCount()) {
			tableModel.setValueAt("", i, 0);
			tableModel.setValueAt("", i, 1);
			tableModel.setValueAt("", i, 2);
			tableModel.setValueAt("", i, 3);
			tableModel.setValueAt("", i, 4);
			tableModel.setValueAt("", i, 5);
			i++;
		}
	}
}
