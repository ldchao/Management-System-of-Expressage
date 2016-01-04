package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

import nju.edu.businesslogic.storebl.Inventory_managementBL;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementBLService;
import PO.LoginPO;

public class CheckInventory_show extends JPanel {
	private JTable table;
	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/TransitCenterStoreMaster/CheckInventory_show.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
	public CheckInventory_show(JFrame m, JPanel jp, LoginPO loginPO,String startDate,String overDate) {
		JFrame main = m;
		JPanel lastui = jp;
		CheckInventory_show nowPanel = this;
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);
		Inventory_managementBLService imb=new Inventory_managementBL();
		String[][] storeMessage=imb.checkInventory(startDate, overDate);

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

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel lblNewLabel_6 = new JLabel("状态栏");
		lblNewLabel_6.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel_6);

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(148, 200, 454, 222);
		add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(25);
		scrollPane.setViewportView(table);
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);

		table.setEnabled(false);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		tableModel = new DefaultTableModel(storeMessage, new String[] {
				"库存区域", "入库数量", "出库数量" });
		table.setModel(tableModel);
		
		JLabel lblNewLabel_3 = new JLabel(startDate);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(285, 158, 86, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel(overDate);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(505, 158, 86, 15);
		add(lblNewLabel_5);
		
		JLabel lblZ = new JLabel("\u6CE8\uFF1A\u673A\u52A8\u533A\u4E0D\u4F5C\u7EDF\u8BA1");
		lblZ.setForeground(new Color(248,179,28));
		lblZ.setBounds(158, 441, 171, 15);
		add(lblZ);

	}
}
