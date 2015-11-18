package Client.presentation.Transit_center_storemasterui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

import Client.presentation.Transit_center_salesmanui.Transferui;

public class Warehouse_outui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Warehouse_outui(JFrame m, JPanel jp) {
		JFrame main = m;
		JPanel lastui = jp;
		Warehouse_outui nowPanel = this;
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

		JLabel lblNewLabel = new JLabel("仓库管理员>>出库管理");
		lblNewLabel.setBounds(100, 14, 143, 15);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("张三，你好！");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("消息提醒");
		lblNewLabel_2.setBounds(174, 177, 54, 15);
		add(lblNewLabel_2);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Warehouse_out_checkRemindui woc=new Warehouse_out_checkRemindui(main,nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(woc);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(134, 214, 160, 128);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("新建出库单");
		lblNewLabel_3.setBounds(481, 177, 72, 15);
		add(lblNewLabel_3);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Storeoutorder_Input si=new Storeoutorder_Input(main,nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(si);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(441, 214, 160, 128);
		add(btnNewButton_2);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel lblNewLabel_4 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_4);

	}
}
