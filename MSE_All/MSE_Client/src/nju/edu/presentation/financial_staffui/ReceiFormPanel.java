package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import nju.edu.businesslogic.financebl.PayeeorderBL;
import nju.edu.presentation.Business_hall_salesmanui.Business_hall_salesmanMainUI;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JToolBar;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ReceiFormPanel extends JPanel implements Runnable {
	private JTable table;
	private JTable table1;
	private DefaultTableModel tableModel;
	private JTable table_1;
	private JLabel label_3;
	private boolean signal;
	private static int count;
	PayeeorderBL payeebl = new PayeeorderBL();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private boolean over;
	private Thread t;

	/**
	 * Create the panel.
	 */
	public ReceiFormPanel(JFrame main, JPanel panel) {
		over = true;
		ReceiFormPanel rfp = this;
		setLayout(null);
		setSize(750, 600);
		signal = false;

		t = new Thread(this);
		t.start();

		JLabel label = new JLabel("Ӫҵ��ҵ��Ա>>�տ����");
		label.setBounds(87, 10, 470, 15);
		add(label);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		add(toolBar);

		label_3 = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(label_3);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if (over) {
					main.remove(rfp);
					main.add(panel);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
					t.stop();
				} else {
					@SuppressWarnings("unused")
					ReciveConfirmFrame rcon = new ReciveConfirmFrame(main, rfp,
							panel);
				}
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		add(button_4);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(630, 10, 54, 15);
		add(lblHello);

		textField = new JTextField();
		textField.setBounds(94, 120, 92, 25);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(185, 120, 92, 25);
		add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(276, 120, 92, 25);
		add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(367, 120, 92, 25);
		add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(458, 120, 92, 25);
		add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(549, 120, 92, 25);
		add(textField_5);

		// �½����
		table1 = new JTable();
		table1.setRowSelectionAllowed(false);
		table1.setCellSelectionEnabled(true);
		table1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table1.setRowHeight(25);
		table1.setModel(new DefaultTableModel(new Object[][] { {
				"\u8BA2\u5355\u53F7", "\u6536\u6B3E\u91D1\u989D",
				"\u6536\u6B3E\u65E5\u671F", "\u5FEB\u9012\u5458\u59D3\u540D",
				"\u4E1A\u52A1\u5458\u59D3\u540D",
				"\u8425\u4E1A\u5385\u7F16\u53F7" }, }, new String[] {
				"New column", "New column", "New column", "New column",
				"New column", "New column" }));
		table1.setBounds(94, 95, 546, 25);
		add(table1);

		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		textField_2.setText(date.format(dt));

		// ����б�
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(92, 252, 549, 201);
		add(scrollPane);

		table = new JTable();
		table.setRowHeight(25);
		// ʹ�������
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);

		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table.setEnabled(false);
		tableModel = new DefaultTableModel(new Object[][] {
				{ "", "", "", "", "" }, { null, null, null, null, null },
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
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null }, }, new String[] { "������",
				"�տ���", "�տ�����", "���Ա����", "Ӫҵ�����" });
		table.setModel(tableModel);

		// �ܼƱ�
		table_1 = new JTable();
		table_1.setEnabled(false);
		table_1.setRowSelectionAllowed(false);
		table_1.setModel(new DefaultTableModel(new Object[][] { {
				"\u8BA2\u5355\u603B\u6570", null, "�տ��ܽ��", null }, },
				new String[] { "New column", "New column", "New column",
						"New column" }));
		table_1.setRowHeight(25);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBounds(92, 481, 549, 25);
		add(table_1);

		// �����ӡ���ť
		JButton button = new JButton("\u6DFB\u52A0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				over = false;
				String str[] = new String[6];
				str[0] = textField.getText();
				str[1] = textField_1.getText();
				str[2] = textField_2.getText();
				str[3] = textField_3.getText();
				str[4] = textField_4.getText();
				str[5] = textField_5.getText();
				if (str[0].equals("") || str[1].equals("") || str[3].equals("")
						|| str[4].equals("") || str[5].equals("")) {
					label_3.setText("��Ϣ¼�벻�������޷��������");
				} else {
					payeebl.addReceiForm(str[0], str[1], str[2], str[3],
							str[4], str[5], false);
					showList(str, count);
					label_3.setText("���ӳɹ���");
					count++;
					showTotal(count, payeebl.getTotal());
				}
				signal = true;
			}
		});
		button.setBounds(239, 171, 93, 23);
		add(button);

		JButton button_1 = new JButton("\u63D0\u4EA4\u5BA1\u6279");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				payeebl.addReceiForm("", "", "", "", "", "", true);
				over = true;
				label_3.setText("���ύ�ȴ�����");
				signal = true;
			}
		});
		button_1.setBounds(393, 171, 93, 23);
		add(button_1);

		JLabel label_1 = new JLabel(
				"\u5F55\u5165\u6536\u6B3E\u5355\u4FE1\u606F");
		label_1.setFont(new Font("����", Font.BOLD, 15));
		label_1.setBounds(311, 67, 121, 15);
		add(label_1);

		JLabel label_2 = new JLabel("\u6536\u6B3E\u5355\u5217\u8868");
		label_2.setFont(new Font("����", Font.BOLD, 15));
		label_2.setBounds(329, 227, 85, 15);
		add(label_2);

	}

	public void showList(String str[], int n) {
		for (int i = 0; i < 4; i++)
			table.setValueAt(str[i], n, i);
		table.setValueAt(str[5], n, 4);

		if (n >= table.getRowCount()) {
			String[] rowstr = { "", "", "", "", "" };
			tableModel.addRow(rowstr);
		}
	}

	public void showTotal(int count, double total) {
		table_1.setValueAt(count, 0, 1);
		table_1.setValueAt(total, 0, 3);
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
				textField.setText("");
				textField_1.setText("");
				label_3.setText("״̬��");
				signal = false;
			}
		}
	}
}