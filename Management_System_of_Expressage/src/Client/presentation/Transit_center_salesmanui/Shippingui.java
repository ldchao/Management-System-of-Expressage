package Client.presentation.Transit_center_salesmanui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Shippingui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Shippingui() {
		setLayout(null);
		
		JButton button = new JButton("返回");
		button.setBounds(10, 10, 57, 23);
		add(button);
		
		JLabel label = new JLabel("中转中心业务员>>装运管理");
		label.setBounds(77, 14, 163, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(533, 14, 72, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("消息提醒");
		label_2.setBounds(136, 117, 54, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("新建装运单");
		label_3.setBounds(405, 117, 83, 15);
		add(label_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(114, 142, 126, 120);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(389, 142, 118, 120);
		add(btnNewButton_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 401, 659, 23);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

	}

}
