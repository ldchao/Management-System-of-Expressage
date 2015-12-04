package nju.edu.presentation.system_administratorui;

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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import PO.LoginPO;
import nju.edu.VO.UserVO;
import nju.edu.businesslogic.staffbl.UserBL;

@SuppressWarnings("serial")
public class CheckUserPanel extends JPanel implements Runnable {
	private static JTable table;
	private int rowpos = -1;
	private static DefaultTableModel tableModel;
	private static JLabel lblNewLabel;
	private static boolean signal;
	private Thread t;
	UserBL usb = new UserBL();

	/**
	 * Create the panel.
	 */
	public CheckUserPanel(LoginPO loginPO, JFrame main) {
		signal = false;
		setLayout(null);

		CheckUserPanel cup = this;
		
		t = new Thread(this);
		t.start();

		JLabel label = new JLabel("财务人员>>账户管理>>查改删已有账户");
		label.setBounds(92, 8, 563, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				main.remove(cup);
				AdminPanel adp = new AdminPanel(loginPO, main);
				main.add(adp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
				t.stop();
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		add(button_4);

		JLabel label_1 = new JLabel("用户属性");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(332, 127, 70, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		add(toolBar);

		lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		JButton button_1 = new JButton("\u5220\u9664");
		button_1.setBounds(413, 434, 70, 23);
		add(button_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(149, 183, 436, 217);
		add(scrollPane);

		table = new JTable();
		table.setRowHeight(25);
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);

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
		table.setEnabled(false);
		table.setRowSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		tableModel = new DefaultTableModel(new Object[][] { { "", "", "" },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, }, new String[] { "\u7528\u6237\u540D",
				"\u7528\u6237\u5BC6\u7801", "\u7528\u6237\u6743\u9650" });
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);

		showTable(usb.checkUsers());

		// 删除行
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos != -1) {
					String name = tableModel.getValueAt(rowpos, 0).toString();
					@SuppressWarnings("unused")
					UserConfirmframe userConfirmframe = new UserConfirmframe(
							name);
					signal = true;
				}
			}
		});

		JButton button = new JButton("\u4FEE\u6539");
		// 修改用户信息
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = tableModel.getValueAt(rowpos, 0).toString();
				String limit = tableModel.getValueAt(rowpos, 2).toString();
				if (rowpos != -1) {
					UpdateUserFrame up = new UpdateUserFrame(name, limit,
							rowpos);
					Thread t = new Thread(up);
					t.start();
				}
			}
		});
		button.setBounds(262, 434, 70, 23);
		add(button);
	}

	public static void showTable(ArrayList<UserVO> uvo) {
		int i = 0;
		for (UserVO uc : uvo) {
			tableModel.setValueAt(uc.getName(), i, 0);
			tableModel.setValueAt(uc.getKey(), i, 1);
			tableModel.setValueAt(uc.getLimit(), i, 2);
			i++;

			if (i >= table.getRowCount()) {
				String[] rowstr = { "", "", "" };
				tableModel.addRow(rowstr);
			}

		}
		while (i < table.getRowCount()) {
			tableModel.setValueAt("", i, 0);
			tableModel.setValueAt("", i, 1);
			tableModel.setValueAt("", i, 2);
			i++;
		}
	}

	public static void setlblNewLabel(String str) {
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
