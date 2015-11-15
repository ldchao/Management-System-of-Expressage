package Client.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class CheckStatisticsframe extends JFrame {
	private JTable table;
	private JTable table2;

	/**
	 * Create the panel.
	 */
	public CheckStatisticsframe() {
		getContentPane().setLayout(null);

		CheckStatisticsframe csf = this;

		JLabel label = new JLabel("财务人员>>统计报表>>查看收款信息和付款信息");
		label.setBounds(92, 8, 563, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				csf.dispose();
				Calculateframe clf = new Calculateframe();
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		getContentPane().add(button_4);

		//收款单
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u6536\u6B3E\u65E5\u671F", "\u6536\u6B3E\u5355\u4F4D", "\u6536\u6B3E\u4EBA", "\u6536\u6B3E\u65B9", "\u6536\u6B3E\u91D1\u989D", "\u6536\u6B3E\u5730\u70B9"},
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
				"\u4ED8\u6B3E\u65E5\u671F", "\u4ED8\u6B3E\u91D1\u989D", "\u4ED8\u6B3E\u8D26\u53F7", "\u4ED8\u6B3E\u6761\u76EE", "\u5907\u6CE8", "\u4ED8\u6B3E\u4EBA"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setMinWidth(20);
		table.getColumnModel().getColumn(3).setPreferredWidth(125);
		table.getColumnModel().getColumn(3).setMinWidth(20);
		table.getColumnModel().getColumn(4).setPreferredWidth(125);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.setBounds(92, 114, 549, 144);
		getContentPane().add(table);

		JLabel label_1 = new JLabel("收款信息");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(320, 78, 93, 15);
		getContentPane().add(label_1);
		
		//付款单
		table2 = new JTable();
		table2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table2.setEnabled(false);
		table2.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u4ED8\u6B3E\u65E5\u671F", "\u4ED8\u6B3E\u91D1\u989D", "\u4ED8\u6B3E\u8D26\u53F7", "\u4ED8\u6B3E\u6761\u76EE", "\u5907\u6CE8", "\u4ED8\u6B3E\u4EBA"},
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
				"\u4ED8\u6B3E\u65E5\u671F", "\u4ED8\u6B3E\u91D1\u989D", "\u4ED8\u6B3E\u8D26\u53F7", "\u4ED8\u6B3E\u6761\u76EE", "\u5907\u6CE8", "\u4ED8\u6B3E\u4EBA"
			}
		));
		table2.getColumnModel().getColumn(0).setPreferredWidth(85);
		table2.getColumnModel().getColumn(1).setPreferredWidth(85);
		table2.getColumnModel().getColumn(2).setPreferredWidth(90);
		table2.getColumnModel().getColumn(2).setMinWidth(20);
		table2.getColumnModel().getColumn(3).setPreferredWidth(125);
		table2.getColumnModel().getColumn(3).setMinWidth(20);
		table2.getColumnModel().getColumn(4).setPreferredWidth(125);
		table2.getColumnModel().getColumn(5).setPreferredWidth(80);
		table2.setBounds(92, 329, 549, 144);
		getContentPane().add(table2);
		
		JLabel label_2 = new JLabel("\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label_2.setFont(new Font("黑体", Font.BOLD, 15));
		label_2.setBounds(320, 294, 93, 15);
		getContentPane().add(label_2);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
