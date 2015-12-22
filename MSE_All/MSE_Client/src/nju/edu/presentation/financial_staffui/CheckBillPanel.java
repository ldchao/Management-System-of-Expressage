package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import PO.LoginPO;
import nju.edu.VO.StartinfoVO;
import nju.edu.businesslogic.billbl.BillBL;

@SuppressWarnings("serial")
public class CheckBillPanel extends JPanel {
	private static JTable table;
	private int rowpos;
	private static DefaultTableModel tableModel;
	BillBL bbl = new BillBL();

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/financial_stuff/searchInitial.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
	public CheckBillPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);
		setSize(750, 600);

		CheckBillPanel cbp = this;

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JButton button_4 = new JButton();
		button_4.setBounds(13, -9, 63, 63);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(cbp);
				BillPanel bpanel = new BillPanel(loginPO, main);
				main.getContentPane().add(bpanel);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_4.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});
		add(button_4);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 151, 658, 322);
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
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table.setEnabled(false);
		table.setSelectionBackground(new Color(88, 93, 103,230));
		table.setSelectionForeground(new Color(255, 255, 255,200));
		tableModel = new DefaultTableModel(
				new Object[][] { { "", "", "", "", "", "" }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "\u8D26\u540D\u79F0", "\u94F6\u884C\u8D26\u6237", "\u673A\u6784", "\u4EBA\u5458",
						"\u8F66\u8F86", "\u5E93\u5B58" });
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(70);
		table.getColumnModel().getColumn(1).setPreferredWidth(70);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setMinWidth(20);
		table.getColumnModel().getColumn(3).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setMinWidth(20);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		table.getColumnModel().getColumn(5).setPreferredWidth(120);

		showTable(bbl.checkBill());
	}

	public static void showTable(ArrayList<StartinfoVO> startinfoVO) {
		int i = 0;
		for (StartinfoVO sinvo : startinfoVO) {
			tableModel.setValueAt(sinvo.getName(), i, 0);
			tableModel.setValueAt(sinvo.getAccount(), i, 1);
			tableModel.setValueAt(sinvo.getOrganization(), i, 2);
			tableModel.setValueAt(sinvo.getStaff(), i, 3);
			tableModel.setValueAt(sinvo.getVehicle(), i, 4);
			tableModel.setValueAt(sinvo.getStore(), i, 5);
			i++;

			if (i >= table.getRowCount()) {
				String[] rowstr = { "", "", "", "", "", "" };
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
