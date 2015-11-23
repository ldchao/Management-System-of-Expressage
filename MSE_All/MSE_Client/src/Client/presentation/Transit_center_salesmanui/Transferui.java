package Client.presentation.Transit_center_salesmanui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Transferui extends JPanel {
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Transferui(JFrame m,JPanel jp) {
		main=m;
		JPanel lastui=jp;
		Transferui nowPanel=this;
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
		
		JLabel label = new JLabel("中转中心业务员>>录入中转单");
		label.setBounds(100, 14, 177, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JLabel lblNewLabel = new JLabel("消息提醒");
		lblNewLabel.setBounds(89, 176, 72, 15);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transfer_checkRemindui tr=new Transfer_checkRemindui(main, nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(tr);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(55, 222, 160, 128);
		add(btnNewButton);
		
		JLabel label_2 = new JLabel("查看库存");
		label_2.setBounds(327, 176, 91, 15);
		add(label_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transfer_checkStoreui tt=new Transfer_checkStoreui(main, nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(tt);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(287, 222, 160, 128);
		add(btnNewButton_1);
		
		JLabel label_3 = new JLabel("新建中转单");
		label_3.setBounds(552, 176, 72, 15);
		add(label_3);
				
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_Input ti=new Changeorder_Input(main, nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(ti);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(508, 222, 160, 128);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

	}

}
