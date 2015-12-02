package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import PO.LoginPO;
import nju.edu.VO.AccountVO;
import nju.edu.businesslogic.accountbl.AccountBL;

@SuppressWarnings("serial")
public class CheckAccountPanel extends JPanel implements Runnable {
	private static JTable table;
	private int rowpos = -1;
	private static DefaultTableModel tableModel;
	private static JLabel lblNewLabel;
	AccountBL accountBL = new AccountBL();
	private static boolean signal;

	/**
	 * Create the panel.
	 */
	public CheckAccountPanel(LoginPO loginPO, JFrame main) {
		signal = false;
		setLayout(null);
		setSize(750, 600);

		CheckAccountPanel cap = this;

		JLabel label = new JLabel("财务人员>>账户管理>>查改删已有账户");
		label.setBounds(92, 8, 563, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(cap);
				AccountPanel acp = new AccountPanel(loginPO, main);
				main.getContentPane().add(acp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		add(button_4);

		JLabel label_1 = new JLabel("\u94F6\u884C\u8D26\u6237");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(332, 115, 70, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 546, 750, 28);
		add(toolBar);

		lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		JButton button_1 = new JButton("\u5220\u9664");
		button_1.setBounds(448, 416, 70, 23);
		add(button_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 174, 434, 196);
		add(scrollPane);

		table = new JTable();
		table.setRowHeight(25);

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
		tableModel = new DefaultTableModel(new Object[][] { { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, },
				new String[] { "\u8D26\u6237\u540D\u79F0",
						"\u8D26\u6237\u4F59\u989D" });
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(130);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);

		// 显示表格
		showTable(accountBL.check());

		// 删除行
		button_1.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				if (rowpos != -1) {
					String name = tableModel.getValueAt(rowpos, 0).toString();
					ConfirmFrame conFrame = new ConfirmFrame(name);
					signal = true;
				}
			}
		});

		JButton button = new JButton("\u4FEE\u6539");
		// 修改行内容
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rowpos != -1) {
					String name = tableModel.getValueAt(rowpos, 0).toString();
					UpdateAccountframe up = new UpdateAccountframe(name, rowpos);
					Thread t = new Thread(up);
					t.start();
					signal = true;
				}
			}
		});
		button.setBounds(225, 416, 70, 23);
		add(button);
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

	public static void setLblNewLabel(String str) {
		lblNewLabel.setText(str);
		signal = true;
	}

	@Override
	public void run() {
		while (true) {
			if (signal) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				lblNewLabel.setText("状态栏");
				signal = false;
			}
		}
	}
}
