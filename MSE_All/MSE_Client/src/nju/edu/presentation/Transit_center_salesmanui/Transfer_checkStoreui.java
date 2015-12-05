package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import PO.LoginPO;
import nju.edu.businesslogic.transferbl.TransferBL;
import nju.edu.businesslogicservice.transferblservice.TransferBLService;

public class Transfer_checkStoreui extends JPanel {
	private JTable table;
	JFrame main;
	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	public Transfer_checkStoreui(JFrame m, JPanel jp,LoginPO loginPO) {
		main = m;
		JPanel lastui = jp;
		Transfer_checkStoreui nowPanel = this;
		setLayout(null);

		JButton button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 65, 23);
		add(button);

		JLabel label = new JLabel("中转中心业务员>>录入中转单>>查看库存");
		label.setBounds(100, 14, 288, 15);
		add(label);

		JLabel label_1 = new JLabel(loginPO.getName()+"，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JLabel label_2 = new JLabel("各个规定区域库存比例");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_2.setBounds(263, 76, 225, 35);
		add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 150, 514, 299);
		add(scrollPane);

		TransferBLService tb = new TransferBL();
		String[][] storeRadio = tb.checkStore();

		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table.setEnabled(false);
		table.setFont(new Font("宋体", Font.PLAIN, 12));
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);
		
		tableModel = new DefaultTableModel(storeRadio, new String[] { "库存区域",
				"库存比例", "提醒比例" });

		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(157);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(108);
		scrollPane.setViewportView(table);

		JButton button_1 = new JButton("确认");
		button_1.setBounds(316, 478, 153, 23);
		add(button_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
	}

}
