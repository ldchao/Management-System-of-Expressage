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
import javax.swing.table.DefaultTableModel;

import nju.edu.businesslogic.storebl.Inventory_managementBL;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementBLService;
import PO.LoginPO;

public class Take_Stock_show extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/TransitCenterStoreMaster/Take_Stock_show.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
	public Take_Stock_show(JFrame m, JPanel jp, LoginPO loginPO,String qu) {
		JFrame main = m;
		JPanel lastui = jp;
		Take_Stock_show nowPanel = this;
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);
		Inventory_managementBLService ib=new Inventory_managementBL();
		String[][] inventoryMessage=ib.checkInventoryOrder(qu);

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
		scrollPane.setBounds(73, 138, 604, 313);
		add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(inventoryMessage, new String[] {
				"快递编号", "入库日期", "目的地", "区号", "排号", "架号", "位号" }));
		scrollPane.setViewportView(table);
	}
}
