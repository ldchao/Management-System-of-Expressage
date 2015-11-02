package Client.presentation.Transit_center_salesmanui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JToolBar;

public class Transit_center_salesmanmainui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Transit_center_salesmanmainui() {
		setLayout(null);
		
		JLabel label = new JLabel("中转中心业务员");
		label.setBounds(76, 10, 127, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(548, 10, 83, 15);
		add(label_1);
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 6, 57, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("中转接收");
		lblNewLabel.setBounds(82, 103, 54, 15);
		add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(76, 139, 127, 125);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("录入中转单");
		lblNewLabel_1.setBounds(277, 103, 83, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("装车管理");
		lblNewLabel_2.setBounds(470, 103, 54, 15);
		add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(261, 139, 127, 125);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(455, 139, 127, 125);
		add(btnNewButton_3);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 404, 662, 17);
		add(toolBar);
		
		JLabel label_2 = new JLabel("状态栏");
		toolBar.add(label_2);

	}
}
