package Client.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class CheckAccountframe extends JFrame {
	private JTable table;
	private int rowpos = -1;

	/**
	 * Create the panel.
	 */
	public CheckAccountframe() {
		getContentPane().setLayout(null);

		CheckAccountframe caf = this;

		JLabel label = new JLabel("财务人员>>账户管理>>查改删已有账户");
		label.setBounds(92, 8, 563, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				caf.dispose();
				Accountframe acf = new Accountframe();
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		getContentPane().add(button_4);

		JLabel label_1 = new JLabel("\u94F6\u884C\u8D26\u6237");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(332, 115, 70, 15);
		getContentPane().add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		getContentPane().add(toolBar);

		JLabel lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		JButton button = new JButton("\u4FEE\u6539");
		button.setBounds(225, 416, 70, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("\u5220\u9664");
		button_1.setBounds(448, 416, 70, 23);
		getContentPane().add(button_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 174, 434, 196);
		getContentPane().add(scrollPane);

		table = new JTable();

		// 选取行
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
		table.setModel(new DefaultTableModel(new Object[][] { { null, null },
				{ "123123", "123132" }, { "345345", null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, }, new String[] {
				"\u8D26\u6237\u540D\u79F0", "\u8D26\u6237\u4F59\u989D" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(130);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);

		// 删除行
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos != -1) {
					table.getModel().setValueAt("", rowpos, 0); // data,row,column
					table.getModel().setValueAt("", rowpos, 1);
					table.validate();
				}
			}
		});

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
