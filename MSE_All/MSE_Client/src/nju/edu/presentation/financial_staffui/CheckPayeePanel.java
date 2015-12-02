package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import nju.edu.VO.PayeeorderVO;
import nju.edu.businesslogic.financebl.CalculateBL;
import PO.LoginPO;
import PO.OrganizationNumPO;

@SuppressWarnings("serial")
public class CheckPayeePanel extends JPanel {
	private JTable table;
	private DefaultTableModel tableModel;
	CalculateBL cbl = new CalculateBL();

	/**
	 * Create the panel.
	 */
	public CheckPayeePanel(JFrame main, LoginPO loginPO, String date,
			String shop) {

		setLayout(null);
		setSize(750, 600);

		CheckPayeePanel cpep = this;

		JLabel label = new JLabel("财务人员>>结算管理>>查看结算信息");
		label.setBounds(92, 8, 563, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(cpep);
				CalculatePanel clf = new CalculatePanel(loginPO, main);
				main.add(clf);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		add(button_4);

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
		add(label_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 177, 600, 200);
		add(scrollPane);

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
		add(label_2);

		JLabel lblMoney = new JLabel("");
		lblMoney.setFont(new Font("黑体", Font.BOLD, 15));
		lblMoney.setBounds(385, 467, 107, 23);
		add(lblMoney);
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
		add(button);
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