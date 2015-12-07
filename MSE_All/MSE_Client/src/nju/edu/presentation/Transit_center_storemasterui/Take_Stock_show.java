package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import PO.LoginPO;
import nju.edu.businesslogic.storebl.Inventory_managementBL;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementBLService;
import nju.edu.presentation.Transit_center_salesmanui.Transferui;
import nju.edu.presentation.financial_staffui.DateChooser;

public class Take_Stock_show extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Take_Stock_show(JFrame m, JPanel jp, LoginPO loginPO,String qu) {
		JFrame main = m;
		JPanel lastui = jp;
		Take_Stock_show nowPanel = this;
		setLayout(null);
		Inventory_managementBLService ib=new Inventory_managementBL();
		String[][] inventoryMessage=ib.checkInventoryOrder(qu);

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

		JLabel lblNewLabel = new JLabel("仓库管理员>>库存管理>>盘点库存>>当前各库位订单信息");
		lblNewLabel.setBounds(100, 14, 263, 15);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(loginPO.getName() + "，你好！");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel lblNewLabel_6 = new JLabel("状态栏");
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
