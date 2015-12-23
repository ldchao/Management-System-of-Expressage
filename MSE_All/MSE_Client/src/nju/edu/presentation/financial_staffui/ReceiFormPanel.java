package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import nju.edu.businesslogic.financebl.PayeeorderBL;

import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JToolBar;
import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class ReceiFormPanel extends JPanel implements Runnable {
	private JTable table;
	private JTable table1;
	private DefaultTableModel tableModel;
	private JTable table_1;
	private JLabel label_3;
	private static int count;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private boolean over;
	PayeeorderBL payeebl = new PayeeorderBL();

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/financial_stuff/payeeForm.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings("static-access")
	public ReceiFormPanel(JFrame main, JPanel panel) {
		over = true;
		ReceiFormPanel rfp = this;
		setLayout(null);
		setSize(750, 600);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		toolBar.setEnabled(false);
		add(toolBar);

		label_3 = new JLabel("\u72B6\u6001\u680F");
		label_3.setForeground(Color.WHITE);
		toolBar.add(label_3);

		JButton button_4 = new JButton();
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setBounds(13, -9, 63, 63);
		button_4.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_4.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (over) {
					main.remove(rfp);
					main.getContentPane().add(panel);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				} else {
					@SuppressWarnings("unused")
					ReciveConfirmFrame rcon = new ReciveConfirmFrame(main, rfp,
							panel);
				}
			}
		});
		add(button_4);

		JLabel lblHello = new JLabel("Hello! ");
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		textField = new JTextField();
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		textField.setBounds(131, 160, 89, 25);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(226, 160, 75, 25);
		add(textField_1);

		textField_2 = new JTextField();
		textField_2.setForeground(new Color(88, 93, 103));
		textField_2.setCaretColor(new Color(88, 93, 103));
		textField_2.setOpaque(false);
		textField_2.setBorder(null);
		textField_2.setColumns(10);
		textField_2.setBounds(305, 160, 89, 25);
		add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setForeground(new Color(88, 93, 103));
		textField_3.setCaretColor(new Color(88, 93, 103));
		textField_3.setOpaque(false);
		textField_3.setBorder(null);
		textField_3.setBounds(400, 160, 75, 25);
		add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setForeground(new Color(88, 93, 103));
		textField_4.setCaretColor(new Color(88, 93, 103));
		textField_4.setOpaque(false);
		textField_4.setBorder(null);
		textField_4.setBounds(480, 160, 75, 25);
		add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setForeground(new Color(88, 93, 103));
		textField_5.setCaretColor(new Color(88, 93, 103));
		textField_5.setOpaque(false);
		textField_5.setBorder(null);
		textField_5.setBounds(559, 160, 92, 25);
		add(textField_5);

		// 新建付款单
		table1 = new JTable();
		table1.setBackground(new Color(128, 132, 139, 0));
		table1.setForeground(new Color(255, 255, 255, 200));
		table1.setGridColor(new Color(0, 0, 0, 0));
		table1.setRowSelectionAllowed(false);
		table1.setCellSelectionEnabled(true);
		table1.setBorder(null);
		table1.setRowHeight(25);
		table1.setModel(new DefaultTableModel(new Object[][] { {
				"\u8BA2\u5355\u53F7", "\u6536\u6B3E\u91D1\u989D",
				"\u6536\u6B3E\u65E5\u671F", "\u5FEB\u9012\u5458\u59D3\u540D",
				"\u4E1A\u52A1\u5458\u59D3\u540D",
				"\u8425\u4E1A\u5385\u7F16\u53F7" }, }, new String[] {
				"New column", "New column", "New column", "New column",
				"New column", "New column" }));
		table1.setBounds(141, 133, 510, 25);
		add(table1);

		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		textField_2.setText(date.format(dt));

		// 付款单列表
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(100, 306, 574, 160);
		add(scrollPane);

		table = new JTable();
		table.setRowHeight(25);
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);

		scrollPane.setViewportView(table);
		table.setBorder(null);
		table.setSelectionBackground(new Color(88, 93, 103, 230));
		table.setSelectionForeground(new Color(255, 255, 255, 200));
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
				{ null, null, null, null, null }, }, new String[] { "订单号",
				"收款金额", "收款日期", "快递员姓名", "营业厅编号" });
		table.setModel(tableModel);

		// 总计表
		table_1 = new JTable();
		table_1.setEnabled(false);
		table_1.setBackground(new Color(255, 255, 255, 0));
		table_1.setForeground(new Color(255, 255, 255, 200));
		table_1.setGridColor(new Color(0, 0, 0, 0));
		table_1.setRowSelectionAllowed(false);
		table_1.setModel(new DefaultTableModel(new Object[][] { {
				"\u8BA2\u5355\u603B\u6570", null, "收款总金额", null }, },
				new String[] { "New column", "New column", "New column",
						"New column" }));
		table_1.setRowHeight(25);
		table_1.setBorder(null);
		table_1.setBounds(139, 468, 536, 25);
		add(table_1);

		// “添加”按钮
		JButton button = new JButton("");
		button.setBounds(299, 200, 43, 43);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button.getWidth(),
				button.getHeight(), image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button.setIcon(image1);
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
						|| str[4].equals("") || str[5].equals("")
						|| str[0].replaceAll(" ", "").equals("")
						|| str[1].replaceAll(" ", "").equals("")
						|| str[2].replaceAll(" ", "").equals("")
						|| str[3].replaceAll(" ", "").equals("")
						|| str[4].replaceAll(" ", "").equals("")
						|| str[5].replaceAll(" ", "").equals("")) {
					label_3.setText("信息录入不完整，无法完成添加");
				} else {
					payeebl.addReceiForm(str[0], str[1], str[2], str[3],
							str[4], str[5], false);
					showList(str, count);
					label_3.setText("添加成功！");
					count++;
					showTotal(count, payeebl.getTotal());
				}
				Thread t = new Thread(rfp);
				t.start();
			}
		});
		add(button);

		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				payeebl.addReceiForm("", "", "", "", "", "", true);
				over = true;
				label_3.setText("已提交等待审批");
				Thread t = new Thread(rfp);
				t.start();
			}
		});
		button_1.setBounds(407, 200, 43, 43);
		ImageIcon image = new ImageIcon("image/transparent_circle.png");
		Image temp = image.getImage().getScaledInstance(button_1.getWidth(),
				button_1.getHeight(), image.getImage().SCALE_DEFAULT);
		image = new ImageIcon(temp);
		button_1.setIcon(image);
		add(button_1);

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
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		textField.setText("");
		textField_1.setText("");
		label_3.setText("状态栏");
	}
}
