package Client.presentation.Transit_center_salesmanui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Shipping_checkremindui extends JPanel {
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Shipping_checkremindui(JFrame m,JPanel jp) {
		main=m;
		JPanel lastui=jp;
		Shipping_checkremindui nowPanel=this;

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
		
		JLabel label = new JLabel("中转中心业务员>>装运管理>>产看消息提醒");
		label.setBounds(100, 14, 260, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel label_2 = new JLabel("\u88C5\u8FD0\u6D88\u606F\u63D0\u9192");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_2.setBounds(289, 80, 192, 35);
		add(label_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 150, 514, 299);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\u6682\u65F6\u6CA1\u6709\u8D27\u7269\u9700\u8981\u88C5\u8FD0");
		scrollPane.setViewportView(textArea);
		
		JLabel label_3 = new JLabel("\u5F85\u5904\u7406\u7684\u6D88\u606F");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 14));
		scrollPane.setColumnHeaderView(label_3);
		
		JButton button_1 = new JButton("确认已查看上述消息，点击后消息将被清空");
		button_1.setBounds(223, 477, 340, 23);
		add(button_1);

	}
}
