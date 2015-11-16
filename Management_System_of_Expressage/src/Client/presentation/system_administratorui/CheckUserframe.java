package Client.presentation.system_administratorui;

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

public class CheckUserframe extends JFrame {
	private JTable table;
	private int rowpos = -1;

	/**
	 * Create the panel.
	 */
	public CheckUserframe() {
		getContentPane().setLayout(null);

		CheckUserframe cuf = this;

		JLabel label = new JLabel("财务人员>>账户管理>>查改删已有账户");
		label.setBounds(92, 8, 563, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cuf.dispose();
				Administratorframe adf = new Administratorframe();
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		getContentPane().add(button_4);

		JLabel label_1 = new JLabel("用户属性");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(332, 127, 70, 15);
		getContentPane().add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		getContentPane().add(toolBar);

		JLabel lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		JButton button = new JButton("\u4FEE\u6539");
		button.setBounds(262, 434, 70, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("\u5220\u9664");
		button_1.setBounds(413, 434, 70, 23);
		getContentPane().add(button_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(149, 183, 436, 217);
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
		table.setEnabled(false);
		table.setRowSelectionAllowed(true);
		//table.setCellSelectionEnabled(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table.setModel(new DefaultTableModel(new Object[][] { { "", "", "" },
				{ "1231", null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, }, new String[] { "\u7528\u6237\u540D",
				"\u7528\u6237\u5BC6\u7801", "\u7528\u6237\u6743\u9650" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);

		// 删除行
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos != -1) {
					table.getModel().setValueAt("", rowpos, 0); // data,row,column
					table.getModel().setValueAt("", rowpos, 1);
					table.getModel().setValueAt("", rowpos, 2);
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
