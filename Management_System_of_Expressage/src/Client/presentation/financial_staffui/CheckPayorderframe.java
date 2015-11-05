package Client.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class CheckPayorderframe extends JFrame {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public CheckPayorderframe() {
		getContentPane().setLayout(null);

		CheckPayorderframe cpf = this;
		
		JLabel label = new JLabel("\u8D22\u52A1\u4EBA\u5458>>\u6210\u672C\u7BA1\u7406>>\u67E5\u770B\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label.setBounds(92, 8, 563, 15);
		getContentPane().add(label);
		
		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(665, 8, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpf.dispose();
				Payframe pf = new Payframe();
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		getContentPane().add(button_4);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
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
		table.setBounds(92, 132, 549, 208);
		getContentPane().add(table);
		
		JLabel label_1 = new JLabel("\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(320, 90, 93, 15);
		getContentPane().add(label_1);
		
		//frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 490);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
