package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.channels.NetworkChannel;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogic.loadbl.ShippingBL;
import nju.edu.businesslogicservice.loadblservice.ShippingBLService;
import PO.LoginPO;
import PO.OrganizationNumPO;

public class Shipping_Inputui extends JPanel {
	private JTable table;
	JFrame main;
	private int rowpos = -1;
	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	public Shipping_Inputui(JFrame m, JPanel jp, LoginPO loginPO) {
		main = m;
		JPanel lastui = jp;
		Shipping_Inputui nowPanel = this;
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);

		JButton button = new JButton("");
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(image1);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button);

		JLabel label = new JLabel("中转中心业务员>>装运管理");
		label.setBounds(100, 14, 163, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		JLabel label_2 = new JLabel("选择要装运的中转单");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_2.setBounds(280, 78, 234, 28);
		add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(96, 125, 557, 328);
		add(scrollPane);

		ShippingBLService sb = new ShippingBL();
		ArrayList<ChangeorderVO> changeorderList = sb.checkRemind();
		String[][] tablemessage = null;
		if (changeorderList != null) {
			tablemessage = new String[changeorderList.size()][4];
			OrganizationNumPO op = new OrganizationNumPO();
			int i = -1;
			for (ChangeorderVO cv : changeorderList) {
				i++;
				tablemessage[i][0] = cv.getNumberOfTransfer();
				tablemessage[i][1] = op.getName(cv.getArrivenum());
				tablemessage[i][2] = cv.getWayOfTransport();
				tablemessage[i][3] = cv.getDate();
			}
		}
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

		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);

		scrollPane.setViewportView(table);
		table.setEnabled(false);
		table.setRowSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		tableModel = new DefaultTableModel(tablemessage, new String[] {
				"中转单编号", "到达地", "装运方式", "装运日期" });
		table.setModel(tableModel);

		// 创建装运单
		JButton btnNewButton = new JButton("创建装运单");
		btnNewButton.setBounds(193, 486, 52, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos == -1) {
					label_4.setText("请选择一张中转单");
				} else {
					Shippingorder shipping_panel;
					if (tableModel.getValueAt(rowpos, 2).equals("航运")) {
						shipping_panel = new Shippingorder(main, nowPanel,
								lastui, loginPO, changeorderList.get(rowpos),
								"飞机");
					} else if (tableModel.getValueAt(rowpos, 2).equals("铁运")) {
						shipping_panel = new Shippingorder(main, nowPanel,
								lastui, loginPO, changeorderList.get(rowpos),
								"火车");
					} else {
						shipping_panel = new Shippingorder(main, nowPanel,
								lastui, loginPO, changeorderList.get(rowpos),
								"汽车");
					}
					main.remove(nowPanel);
					main.getContentPane().add(shipping_panel);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}
			}
		});
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("放弃创建");
		btnNewButton_1.setBounds(436, 486, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		add(btnNewButton_1);
	}
}
