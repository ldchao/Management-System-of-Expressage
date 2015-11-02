package Client.presentation.Transit_center_storemasterui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Transit_center_storemasterMainui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Transit_center_storemasterMainui() {
		setLayout(null);
		
		JButton button = new JButton("返回");
		button.setBounds(10, 10, 57, 23);
		add(button);
		
		JLabel label = new JLabel("仓库管理员");
		label.setBounds(90, 14, 73, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(525, 14, 73, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("入库管理");
		label_2.setBounds(109, 114, 54, 15);
		add(label_2);
		
		JLabel lblNewLabel = new JLabel("库存管理");
		lblNewLabel.setBounds(290, 114, 54, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("出库管理");
		lblNewLabel_1.setBounds(464, 114, 54, 15);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(65, 139, 135, 130);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(266, 139, 126, 130);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(449, 139, 126, 130);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 415, 650, 17);
		add(toolBar);
		
		JLabel label_3 = new JLabel("状态栏");
		toolBar.add(label_3);

	}
}
