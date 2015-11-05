package Client.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class CheckAccountframe extends JFrame {
	private JTable table;

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

		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(new Object[][] {
				{ "\u8D26\u540D\u79F0", "\u8D26\u6237\u4F59\u989D" },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, }, new String[] {
				"\u8D26\u6237\u540D\u79F0", "\u8D26\u6237\u4F59\u989D" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.setBounds(160, 132, 243, 176);
		getContentPane().add(table);

		JLabel label_1 = new JLabel("\u94F6\u884C\u8D26\u6237");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(320, 88, 93, 15);
		getContentPane().add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 412, 734, 32);
		getContentPane().add(toolBar);

		JLabel lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		JButton button = new JButton("\u4FEE\u6539");
		button.setBounds(413, 145, 70, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("\u5220\u9664");
		button_1.setBounds(493, 145, 70, 23);
		getContentPane().add(button_1);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 490);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
