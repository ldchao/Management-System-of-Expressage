package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import PO.LoginPO;
import nju.edu.VO.AccountVO;
import nju.edu.businesslogic.accountbl.AccountBL;

@SuppressWarnings("serial")
public class CheckAccountframe extends JFrame implements Runnable {
	private static JTable table;
	private int rowpos = -1;
	private static DefaultTableModel tableModel;
	private static JLabel lblNewLabel;
	AccountBL accountBL = new AccountBL();
	private static boolean signal;

	/**
	 * Create the panel.
	 */
	public CheckAccountframe(LoginPO loginPO) {
		signal = false;
		getContentPane().setLayout(null);

		CheckAccountframe caf = this;

		JLabel label = new JLabel("������Ա>>�˻�����>>���ɾ�����˻�");
		label.setBounds(92, 8, 563, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				caf.dispose();
				Accountframe acf = new Accountframe(loginPO);
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		getContentPane().add(button_4);

		JLabel label_1 = new JLabel("\u94F6\u884C\u8D26\u6237");
		label_1.setFont(new Font("����", Font.BOLD, 15));
		label_1.setBounds(332, 115, 70, 15);
		getContentPane().add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		getContentPane().add(toolBar);

		lblNewLabel = new JLabel("״̬��");
		toolBar.add(lblNewLabel);

		JButton button_1 = new JButton("\u5220\u9664");
		button_1.setBounds(448, 416, 70, 23);
		getContentPane().add(button_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 174, 434, 196);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setRowHeight(25);

		// ѡȡ��
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
		tableModel = new DefaultTableModel(new Object[][] { { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, },
				new String[] { "\u8D26\u6237\u540D\u79F0",
						"\u8D26\u6237\u4F59\u989D" });
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(130);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);

		// ��ʾ���
		showTable(accountBL.check());

		// ɾ����
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos != -1) {
					String name = tableModel.getValueAt(rowpos, 0).toString();
					ConfirmFrame conFrame = new ConfirmFrame(name);
					signal = true;
				}
			}
		});

		JButton button = new JButton("\u4FEE\u6539");
		// �޸�������
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rowpos != -1) {
					String name = tableModel.getValueAt(rowpos, 0).toString();
					UpdateAccountframe up = new UpdateAccountframe(name, rowpos);
					Thread t=new Thread(up);
					t.start();
					signal = true;
				}
			}
		});
		button.setBounds(225, 416, 70, 23);
		getContentPane().add(button);

		// frame
		this.setTitle("��ݹ���ϵͳMSE�ͻ���");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void showTable(ArrayList<AccountVO> acvo) {
		int i = 0;
		for (AccountVO ac : acvo) {
			tableModel.setValueAt(ac.getAcName(), i, 0);
			tableModel.setValueAt(ac.getMoney(), i, 1);
			i++;
			if (i >= table.getRowCount()) {
				String[] rowstr = { "", "" };
				tableModel.addRow(rowstr);
			}

		}
		while (i < table.getRowCount()) {
			tableModel.setValueAt("", i, 0);
			tableModel.setValueAt("", i, 1);
			i++;
		}
	}

	public static void setLblNewLabel(String str) {
		lblNewLabel.setText(str);
		signal = true;
	}

	@Override
	public void run() {
		while (true) {
			if (signal) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				lblNewLabel.setText("״̬��");
				signal = false;
			}
		}
	}
}
