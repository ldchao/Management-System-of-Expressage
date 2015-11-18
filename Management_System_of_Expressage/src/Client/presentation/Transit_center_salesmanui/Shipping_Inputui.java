package Client.presentation.Transit_center_salesmanui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Shipping_Inputui extends JPanel {
	private JTable table;
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Shipping_Inputui(JFrame m,JPanel jp) {
		main=m;
		JPanel lastui=jp;
		Shipping_Inputui nowPanel=this;

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
		
		JLabel label = new JLabel("中转中心业务员>>装运管理");
		label.setBounds(100, 14, 163, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel label_2 = new JLabel("\u9009\u62E9\u8981\u88C5\u8FD0\u7684\u4E2D\u8F6C\u5355");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_2.setBounds(262, 78, 234, 28);
		add(label_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(96, 125, 557, 328);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"\u4E2D\u8F6C\u5355\u7F16\u53F7", "\u5230\u8FBE\u5730", "\u88C5\u8FD0\u65B9\u5F0F"
			}
		));
		scrollPane.setViewportView(table);
		
		//创建装运单
		JButton btnNewButton = new JButton("创建装运单");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shipping_Plane sp=new Shipping_Plane(main, nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(sp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(193, 486, 100, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("放弃创建");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);				
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(436, 486, 93, 23);
		add(btnNewButton_1);
	}
}
