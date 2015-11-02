package Client.presentation.Transit_center_storemasterui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Warehouse_inui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Warehouse_inui() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.setBounds(10, 10, 64, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("仓库管理员>>入库管理");
		lblNewLabel.setBounds(98, 14, 173, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("张三，你好！");
		lblNewLabel_1.setBounds(508, 14, 72, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("消息提醒");
		lblNewLabel_2.setBounds(143, 117, 54, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("新建入库单");
		lblNewLabel_3.setBounds(412, 117, 54, 15);
		add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(119, 142, 152, 118);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(388, 142, 137, 118);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 413, 652, 17);
		add(toolBar);
		
		JLabel lblNewLabel_4 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_4);

	}

}
