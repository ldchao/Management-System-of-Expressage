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

		JLabel label = new JLabel("������Ա>>�������>>�鿴������Ϣ");
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
			label_1 = new JLabel(shopname + "���տ���Ϣ");
		} else {
			label_1 = new JLabel("�޴˱��Ӫҵ��");
		}
		label_1.setFont(new Font("����", Font.BOLD, 15));
		label_1.setBounds(285, 114, 246, 23);
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
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null }, }, new String[] { "������",
				"�տ���", "�տ�����", "���Ա����", "ҵ��Ա����" });
		table.setModel(tableModel);

		ArrayList<PayeeorderVO> payeevo = cbl.check(date, shop);
		showTable(payeevo);

		// frame
		this.setTitle("��ݹ���ϵͳMSE�ͻ���");
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
			table.setValueAt(vo.getDate(), count, 2);
			table.setValueAt(vo.getCarrierName(), count, 3);
			table.setValueAt(vo.getShopperName(), count, 4);
			count++;

			if (count >= table.getRowCount()) {
				String[] str = { "", "", "", "", "" };
				tableModel.addRow(str);
			}
		}
	}
}