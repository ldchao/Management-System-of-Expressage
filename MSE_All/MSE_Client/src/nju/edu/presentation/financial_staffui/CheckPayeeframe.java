package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import nju.edu.VO.PayeeorderVO;
import nju.edu.businesslogic.financebl.CalculateBL;
import nju.edu.businesslogic.financebl.PayeeorderBL;
import nju.edu.businesslogic.financebl.checkPayeeOrder;
import PO.OrganizationNumPO;

@SuppressWarnings("serial")
public class CheckPayeeframe extends JFrame {
	private JTable table;
	private DefaultTableModel tableModel;
	CalculateBL cbl = new CalculateBL();

	/**
	 * Create the panel.
	 */
	public CheckPayeeframe(String date, String shop) {
		getContentPane().setLayout(null);

		CheckPayeeframe cpef = this;

		JLabel label = new JLabel("财务人员>>结算管理>>查看结算信息");
		label.setBounds(92, 8, 563, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpef.dispose();
				Calculateframe clf = new Calculateframe();
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		getContentPane().add(button_4);

		JLabel label_1;
		OrganizationNumPO opo = new OrganizationNumPO();
		String shopname = opo.getName(shop);
		if (shopname != null) {
			label_1 = new JLabel(shopname + date + "的收款信息");
		} else {
			label_1 = new JLabel("无此编号营业厅");
		}
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(225, 114, 310, 23);
		getContentPane().add(label_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 177, 600, 200);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setRowHeight(25);

		scrollPane.setViewportView(table);
		table.setRowSelectionAllowed(true);
		table.setEnabled(false);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		tableModel = new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, }, new String[] { "订单号", "收款金额",
				"快递员姓名", "业务员姓名" });
		table.setModel(tableModel);

		ArrayList<PayeeorderVO> payeevo = cbl.check(date, shop);
		showTable(payeevo);

		JLabel label_2 = new JLabel("");
		label_2.setFont(new Font("黑体", Font.BOLD, 15));
		label_2.setBounds(276, 467, 107, 23);
		getContentPane().add(label_2);

		JLabel lblMoney = new JLabel("");
		lblMoney.setFont(new Font("黑体", Font.BOLD, 15));
		lblMoney.setBounds(385, 467, 107, 23);
		getContentPane().add(lblMoney);
		// 合计
		JButton button = new JButton("\u5408\u8BA1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double total = cbl.total(payeevo);
				label_2.setText("收款总金额：");
				lblMoney.setText(total + "");
			}
		});
		button.setBounds(318, 415, 93, 23);
		getContentPane().add(button);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void showTable(ArrayList<PayeeorderVO> payeevo) {
		int count = 0;

		for (PayeeorderVO vo : payeevo) {
			table.setValueAt(vo.getOrder(), count, 0);
			table.setValueAt(vo.getMoney(), count, 1);
			table.setValueAt(vo.getCarrierName(), count, 2);
			table.setValueAt(vo.getShopperName(), count, 3);
			count++;

			if (count >= table.getRowCount()) {
				String[] str = { "", "", "", "", "" };
				tableModel.addRow(str);
			}
		}
	}
}