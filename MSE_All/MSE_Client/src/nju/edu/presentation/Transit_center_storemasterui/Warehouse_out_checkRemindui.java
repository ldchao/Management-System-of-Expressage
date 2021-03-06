package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogic.storebl.Warehouse_outBL;
import nju.edu.businesslogicservice.storeblservice.Warehouse_outBLService;
import PO.LoginPO;

public class Warehouse_out_checkRemindui extends JPanel {

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/TransitCenterStoreMaster/Warehouse_out_checkRemindui.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
	public Warehouse_out_checkRemindui(JFrame m, JPanel jp,LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = jp;
		Warehouse_out_checkRemindui nowPanel = this;
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);

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

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(95, 150, 565, 299);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		scrollPane.getViewport().setOpaque(false);
		add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setBorder(null);
		textArea.setForeground(new Color(255, 255, 255,200));
		Warehouse_outBLService wb=new Warehouse_outBL();
		ArrayList<ChangeorderVO> changeorderList = wb.checkRemind();
		String  remind_message = "";
		if (changeorderList != null) {
			for (ChangeorderVO cv : changeorderList) {
			    remind_message+="编号为"+cv.getNumberOfTransfer()+"的中转单上的订单需要在"
			    		+ cv.getDate()+"之前办理出库。\n";
			}
			 textArea.setText("\n"+remind_message);
		}		
		else
		   textArea.setText("暂时没有货物需要装运");
		scrollPane.setViewportView(textArea);

		JLabel label_3 = new JLabel("待处理的消息");
		label_3.setForeground(new Color(88, 93, 103));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		scrollPane.setColumnHeaderView(label_3);

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
