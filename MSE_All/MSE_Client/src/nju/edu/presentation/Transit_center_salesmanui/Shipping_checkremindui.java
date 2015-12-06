package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogic.loadbl.ShippingBL;
import nju.edu.businesslogicservice.loadblservice.ShippingBLService;
import PO.LoginPO;
import PO.OrganizationNumPO;

public class Shipping_checkremindui extends JPanel {
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Shipping_checkremindui(JFrame m,JPanel jp,LoginPO loginPO) {
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
		
		JLabel label = new JLabel("中转中心业务员>>装运管理>>查看消息提醒");
		label.setBounds(100, 14, 260, 15);
		add(label);
		
		JLabel label_1 = new JLabel(loginPO.getName()+"，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel label_2 = new JLabel("装运消息提醒");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_2.setBounds(289, 80, 192, 35);
		add(label_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 150, 514, 299);
		add(scrollPane);
		
		
		JTextArea textArea = new JTextArea();
		ShippingBLService sb = new ShippingBL();
		ArrayList<ChangeorderVO> changeorderList = sb.checkRemind();
		String  remind_message = "";
		if (changeorderList != null) {
			OrganizationNumPO op = new OrganizationNumPO();
			for (ChangeorderVO cv : changeorderList) {
			    remind_message+="发往"+op.getName(cv.getArrivenum())+"的中转单需要在"
			    		+ cv.getDate()+"进行装运。\n";
			}
			 textArea.setText(remind_message);
		}		
		else
		   textArea.setText("暂时没有货物需要装运");
		scrollPane.setViewportView(textArea);
		
		JLabel label_3 = new JLabel("待处理的消息");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 14));
		scrollPane.setColumnHeaderView(label_3);

	}
}
