package Client.presentation.Transit_center_storemasterui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Storeinorder_Input extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Storeinorder_Input() {

setLayout(null);
		
		JButton button = new JButton("返回");
		button.setBounds(10, 10, 57, 23);
		add(button);
		
		JLabel label = new JLabel("中转中心仓库管理员>>入库管理>>新建入库单");
		label.setBounds(89, 14, 288, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(488, 14, 84, 15);
		add(label_1);
		

		JLabel label_2 = new JLabel("选择要进行入库管理的到达单");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_2.setBounds(251, 80, 288, 35);
		add(label_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 150, 514, 299);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"\u5230\u8FBE\u5355\u7F16\u53F7"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton button_1 = new JButton("创建入库单");
		button_1.setBounds(193, 479, 146, 23);
		add(button_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JButton button_2 = new JButton("\u653E\u5F03\u521B\u5EFA");
		button_2.setBounds(434, 479, 138, 23);
		add(button_2);
	}

}
