package Client.presentation.system_administratorui;

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

import Client.presentation.financial_staffui.Accountframe;
import Client.presentation.financial_staffui.CheckAccountframe;

public class CheckUserframe extends JFrame {
	private JTable table;

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

		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(new Object[][] {
				{ "用户名", "用户密码", "用户权限" }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, }, new String[] { "\u7528\u6237\u540D",
				"\u7528\u6237\u5BC6\u7801", "\u7528\u6237\u6743\u9650" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.setBounds(116, 132, 335, 176);
		getContentPane().add(table);

		JLabel label_1 = new JLabel("用户属性");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(320, 88, 93, 15);
		getContentPane().add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 412, 734, 32);
		getContentPane().add(toolBar);

		JLabel lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);
		
		JButton button = new JButton("\u4FEE\u6539");
		button.setBounds(461, 145, 70, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("\u5220\u9664");
		button_1.setBounds(541, 145, 70, 23);
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
