package Client.presentation.Transit_center_storemasterui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;

import Client.presentation.Transit_center_salesmanui.Transferui;

public class Storeoutorder_Input extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Storeoutorder_Input(JFrame m, JPanel jp) {
		JFrame main = m;
		JPanel lastui = jp;
		Storeoutorder_Input nowPanel = this;

		setLayout(null);

		JButton button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 65, 23);
		add(button);
		JLabel label = new JLabel("中转中心仓库管理员>>出库管理>>新建出库单");
		label.setBounds(100, 14, 288, 15);
		add(label);

		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JLabel label_2 = new JLabel("选择要进行出库管理的中转单");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_2.setBounds(251, 80, 288, 35);
		add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 150, 514, 299);
		add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null },
				{ null }, { null }, { null }, { null }, { null }, { null },
				{ null }, { null }, { null }, { null }, { null }, { null },
				{ null }, { null }, { null }, { null }, { null }, { null },
				{ null }, { null }, { null }, { null }, { null }, },
				new String[] { "中转单编号" }));
		scrollPane.setViewportView(table);

		JButton button_1 = new JButton("创建出库单");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Storeoutorder s=new Storeoutorder(main,nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(s);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(300, 479, 150, 23);
		add(button_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

	}

}
