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
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class CheckBillframe extends JFrame {
	private JTable table;
	private int rowpos;

	/**
	 * Create the panel.
	 */
	public CheckBillframe() {
		getContentPane().setLayout(null);

		CheckBillframe cbf = this;

		JLabel label = new JLabel("财务人员>>期初建账>>查看期初信息");
		label.setBounds(92, 8, 563, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cbf.dispose();
				Billframe bframe = new Billframe();
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		getContentPane().add(button_4);

		JLabel label_1 = new JLabel("期初信息");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(320, 124, 93, 15);
		getContentPane().add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(92, 180, 549, 244);
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
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{"", "", "", "", "", ""},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
					},
					new String[] {
						"\u8D26\u540D\u79F0", "\u94F6\u884C\u8D26\u6237", "\u673A\u6784", "\u4EBA\u5458", "\u8F66\u8F86", "\u5E93\u5B58"
					}
				));
				table.getColumnModel().getColumn(0).setPreferredWidth(85);
				table.getColumnModel().getColumn(1).setPreferredWidth(85);
				table.getColumnModel().getColumn(2).setPreferredWidth(110);
				table.getColumnModel().getColumn(2).setMinWidth(20);
				table.getColumnModel().getColumn(3).setPreferredWidth(110);
				table.getColumnModel().getColumn(3).setMinWidth(20);
				table.getColumnModel().getColumn(4).setPreferredWidth(110);
				table.getColumnModel().getColumn(5).setPreferredWidth(110);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
