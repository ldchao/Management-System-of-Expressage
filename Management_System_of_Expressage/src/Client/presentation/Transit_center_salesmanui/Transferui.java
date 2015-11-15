package Client.presentation.Transit_center_salesmanui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Transferui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Transferui() {
		setLayout(null);
		
		JButton button = new JButton("返回");
		button.setBounds(10, 10, 57, 23);
		add(button);
		
		JLabel label = new JLabel("中转中心业务员>>录入中转单");
		label.setBounds(89, 14, 177, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(488, 14, 84, 15);
		add(label_1);
		
		JLabel lblNewLabel = new JLabel("查看消息提醒");
		lblNewLabel.setBounds(89, 176, 72, 15);
		add(lblNewLabel);
		
		JLabel label_2 = new JLabel("查看库存");
		label_2.setBounds(327, 176, 91, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("新建中转单");
		label_3.setBounds(552, 176, 72, 15);
		add(label_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(55, 222, 160, 128);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(287, 222, 160, 128);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(508, 222, 160, 128);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

	}

}
