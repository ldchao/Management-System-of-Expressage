package nju.edu.presentation.Transit_center_salesmanui;

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

import nju.edu.businesslogic.transferbl.TransferBL;
import nju.edu.businesslogicservice.transferblservice.TransferBLService;
import PO.LoginPO;
import PO.OrganizationNumPO;

public class Transfer_checkRemindui extends JPanel {
	JFrame main;

	/**
	 * Create the panel.
	 */
	public Transfer_checkRemindui(JFrame m,JPanel jp,LoginPO loginPO) {
		main = m;
		JPanel lastui=jp;
		Transfer_checkRemindui nowPanel=this;
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);
		OrganizationNumPO op=new OrganizationNumPO();
		String transferNum=op.getNum(loginPO.getShop());

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

		JLabel label = new JLabel("中转中心业务员>>录入中转单>>查看消息提醒");
		label.setBounds(100, 14, 288, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JLabel label_2 = new JLabel("录入中转单消息提醒");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_2.setBounds(289, 80, 192, 35);
		add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 150, 514, 299);
		add(scrollPane);

		JTextArea textArea = new JTextArea();
		TransferBLService tb=new TransferBL();
		String remind=tb.checkRemind(transferNum);
		if(remind.length()==0)
		    textArea.setText("暂时没有库区的库存量达到提醒值");
		else 
			 textArea.setText(remind);
		scrollPane.setViewportView(textArea);

		JLabel label_3 = new JLabel("待处理的消息");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 14));
		scrollPane.setColumnHeaderView(label_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		toolBar.setEnabled(false);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);
	}

}
