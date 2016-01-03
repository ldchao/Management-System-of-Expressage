package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
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

		JLabel lblNewLabel = new JLabel("仓库管理员>>库存管理>>盘点库存>>当前各库位订单信息");
		lblNewLabel.setBounds(100, 14, 350, 15);
		add(lblNewLabel);

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

		JLabel label = new JLabel("出入库快递信息");
		label.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label.setBounds(268, 76, 196, 33);
		add(label);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 116, 604, 339);
		add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(inventoryMessage, new String[] {
				"快递编号", "入库日期", "目的地", "区号", "排号", "架号", "位号" }));
		scrollPane.setViewportView(table);
	}
}
