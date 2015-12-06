package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.NetworkChannel;
import java.util.ArrayList;

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

		setLayout(null);

		JButton button = new JButton("����");
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

		JLabel label = new JLabel("��ת����ҵ��Ա>>װ�˹���");
		label.setBounds(100, 14, 163, 15);
		add(label);

		JLabel label_1 = new JLabel(loginPO.getName() + "����ã�");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);

		JLabel label_2 = new JLabel("ѡ��Ҫװ�˵���ת��");
		label_2.setFont(new Font("΢���ź�", Font.BOLD, 20));
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
		// ѡȡ��
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				Point mousepoint;
				mousepoint = e.getPoint();
				rowpos = table.rowAtPoint(mousepoint);
				table.setRowSelectionInterval(rowpos, rowpos);
			}
		});

		// ʹ������
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);

		scrollPane.setViewportView(table);
		table.setEnabled(false);
		table.setRowSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		tableModel = new DefaultTableModel(tablemessage, new String[] {
				"��ת�����", "�����", "װ�˷�ʽ", "װ������" });
		table.setModel(tableModel);

		// ����װ�˵�
		JButton btnNewButton = new JButton("����װ�˵�");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos == -1) {
					label_4.setText("��ѡ��һ����ת��");
				} else {
					Shippingorder shipping_panel;
					if (tableModel.getValueAt(rowpos, 2).equals("����")) {
						shipping_panel = new Shippingorder(main, nowPanel,
								loginPO, changeorderList.get(rowpos), "�ɻ�");
					} else if (tableModel.getValueAt(rowpos, 2).equals("����")) {
						shipping_panel = new Shippingorder(main, nowPanel,
								loginPO, changeorderList.get(rowpos), "��");
					} else {
						shipping_panel = new Shippingorder(main, nowPanel,
								loginPO, changeorderList.get(rowpos), "����");
					}
					main.remove(nowPanel);
					main.getContentPane().add(shipping_panel);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(193, 486, 100, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("��������");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(436, 486, 93, 23);
		add(btnNewButton_1);
	}
}
