package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import nju.edu.businesslogic.storebl.Warehouse_inBL;
import nju.edu.businesslogicservice.storeblservice.Warehouse_inBLService;
import PO.LoginPO;

public class Warehouse_in_checkRemindui extends JPanel {
	Warehouse_inBLService wb;
	/**
	 * Create the panel.
	 */
	public Warehouse_in_checkRemindui(JFrame m, JPanel jp,LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = jp;
		Warehouse_in_checkRemindui nowPanel = this;
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);
		wb=new Warehouse_inBL();

		JButton button = new JButton("");
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(image1);
		button.addMouseListener(new MouseAdapter() {
					@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_circle.png"));
			}	
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button);

		JLabel label = new JLabel("仓库管理员>>入库管理>>查看消息提醒");
		label.setBounds(100, 14, 240, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JLabel label_2 = new JLabel("入库管理消息提醒");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_2.setBounds(289, 80, 192, 35);
		add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 150, 514, 299);
		add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setText(wb.checkRemind());
		scrollPane.setViewportView(textArea);

		JLabel label_3 = new JLabel("\u5F85\u5904\u7406\u7684\u6D88\u606F");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 14));
		scrollPane.setColumnHeaderView(label_3);

		JButton button_1 = new JButton("确认已查看上述消息，点击后消息将被清空");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   wb.deleteRemind();
			   textArea.setText("暂时没有新消息需要处理！");
			}
		});
		button_1.setBounds(223, 477, 340, 23);
		add(button_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);
	}

}
