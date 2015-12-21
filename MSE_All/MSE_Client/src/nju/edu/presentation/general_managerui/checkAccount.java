package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import PO.LoginPO;
import nju.edu.VO.AccountVO;
import nju.edu.businesslogic.accountbl.AccountBL;

public class checkAccount extends JPanel {

	private static JTable table;
	private int rowpos = -1;
	private static DefaultTableModel tableModel;
	private AccountBL accountBL;
	
	public checkAccount(JFrame main,LoginPO loginPO) {
		accountBL=new AccountBL();
		checkAccount checkAccountframe=this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		
		setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatics_Analysis newcheckStatics_Analysis=new checkStatics_Analysis(main,loginPO);
				main.remove(checkAccountframe);
				main.add(newcheckStatics_Analysis);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 75, 23);
		add(button);
		
		JLabel lblNewLabel = new JLabel("\u603B\u7ECF\u7406>>\u8D26\u6237\u67E5\u8BE2");
		lblNewLabel.setBounds(95, 14, 110, 15);
		add(lblNewLabel);
		
		JLabel label = new JLabel("\u94F6\u884C\u8D26\u6237");
		label.setFont(new Font("黑体", Font.BOLD, 15));
		label.setBounds(343, 96, 70, 15);
		add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(156, 141, 432, 271);
		add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(25);
		
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);
		
		// 选取行
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Point mousepoint;
				mousepoint = e.getPoint();
				rowpos = table.rowAtPoint(mousepoint);
				table.setRowSelectionInterval(rowpos, rowpos);
			}
		});
		
		tableModel=new DefaultTableModel(
				new Object[][] {
					{null, null},{null, null},{null, null},{null, null},{null, null},
					{null, null},{null, null},{null, null},{null, null},{null, null},
					{null, null},{null, null},{null, null},{null, null},{null, null},
				},new String[] {
					"\u8D26\u6237\u540D\u79F0", "\u8D26\u6237\u4F59\u989D"
				}
			);
		table.setEnabled(false);
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(130);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		scrollPane.setViewportView(table);
		
		// 显示表格
		showTable(accountBL.check());
	}
	
	public static void showTable(ArrayList<AccountVO> acvo) {
		int i = 0;
		for (AccountVO ac : acvo) {
			tableModel.setValueAt(ac.getAcName(), i, 0);
			tableModel.setValueAt(ac.getMoney(), i, 1);
			i++;
			if (i >= table.getRowCount()) {
				String[] rowstr = { "", "" };
				tableModel.addRow(rowstr);
			}

		}
		while (i < table.getRowCount()) {
			tableModel.setValueAt("", i, 0);
			tableModel.setValueAt("", i, 1);
			i++;
		}
	}
}
