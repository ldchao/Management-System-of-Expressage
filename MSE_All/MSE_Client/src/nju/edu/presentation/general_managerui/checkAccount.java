package nju.edu.presentation.general_managerui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import PO.LoginPO;
import nju.edu.VO.AccountVO;
import nju.edu.businesslogic.accountbl.AccountBL;

@SuppressWarnings("serial")
public class checkAccount extends JPanel {

	private static JTable table;
	private int rowpos = -1;
	private static DefaultTableModel tableModel;
	private AccountBL accountBL;
	
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/generalManager/checkAccount.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}
	
	public checkAccount(JFrame main,LoginPO loginPO) {
		accountBL=new AccountBL();
		checkAccount checkAccountframe=this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		
		setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatics_Analysis newcheckStatics_Analysis=new checkStatics_Analysis(main,loginPO);
				main.remove(checkAccountframe);
				main.getContentPane().add(newcheckStatics_Analysis);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(new ImageIcon("image/transparent_circle.png"));
		button.addMouseListener(new MouseAdapter() {
					@Override
			public void mousePressed(MouseEvent e) {
						button.setIcon(new ImageIcon("image/mask_circle.png"));
			}	
		});
		add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(158, 141, 427, 271);
		add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(25);
		table.setSelectionBackground(new Color(88, 93, 103,230));
		table.setSelectionForeground(new Color(255, 255, 255,200));
		
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
