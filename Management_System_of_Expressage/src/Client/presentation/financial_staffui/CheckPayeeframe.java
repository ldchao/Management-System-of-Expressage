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

public class CheckPayeeframe extends JFrame {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public CheckPayeeframe() {
		getContentPane().setLayout(null);

		CheckPayeeframe cpef = this;

		JLabel label = new JLabel("财务人员>>结算管理>>查看结算信息");
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

		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(new Object[][] {
				{ "收款日期", "收款单位", "收款人", "收款方", "收款金额", "收款地点" },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null }, }, new String[] {
				"\u4ED8\u6B3E\u65E5\u671F", "\u4ED8\u6B3E\u91D1\u989D",
				"\u4ED8\u6B3E\u8D26\u53F7", "\u4ED8\u6B3E\u6761\u76EE",
				"\u5907\u6CE8", "\u4ED8\u6B3E\u4EBA" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setMinWidth(20);
		table.getColumnModel().getColumn(3).setPreferredWidth(125);
		table.getColumnModel().getColumn(3).setMinWidth(20);
		table.getColumnModel().getColumn(4).setPreferredWidth(125);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.setBounds(92, 176, 549, 208);
		getContentPane().add(table);

		JLabel label_1 = new JLabel("收款信息");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(320, 120, 93, 15);
		getContentPane().add(label_1);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}