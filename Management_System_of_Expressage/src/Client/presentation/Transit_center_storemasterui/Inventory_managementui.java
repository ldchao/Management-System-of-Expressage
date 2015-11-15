package Client.presentation.Transit_center_storemasterui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inventory_managementui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Inventory_managementui() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.setBounds(10, 10, 57, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("仓库管理员>>库存管理");
		lblNewLabel.setBounds(92, 14, 130, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("张三，你好！");
		lblNewLabel_1.setBounds(505, 14, 79, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("查看库存");
		lblNewLabel_2.setBounds(194, 99, 54, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("盘点库存");
		lblNewLabel_3.setBounds(489, 99, 54, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("警戒值管理");
		lblNewLabel_4.setBounds(190, 297, 69, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("提醒值管理");
		lblNewLabel_5.setBounds(474, 297, 69, 15);
		add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(160, 143, 125, 100);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(446, 143, 125, 100);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(160, 339, 125, 100);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(446, 339, 125, 100);
		add(btnNewButton_4);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_6);

	}

}
