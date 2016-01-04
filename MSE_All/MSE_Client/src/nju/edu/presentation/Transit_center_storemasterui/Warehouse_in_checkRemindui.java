package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/TransitCenterStoreMaster/Warehouse_in_checkRemindui.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
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

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(92, 150, 563, 299);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		scrollPane.getViewport().setOpaque(false);
		add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setBorder(null);
		textArea.setForeground(new Color(255,255,255,200));
		textArea.setText("\n"+wb.checkRemind());
		scrollPane.setViewportView(textArea);

		JLabel label_3 = new JLabel("\u5F85\u5904\u7406\u7684\u6D88\u606F");
		label_3.setOpaque(false);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(88, 93, 103,230));
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		scrollPane.setColumnHeaderView(label_3);

		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   wb.deleteRemind();
			   textArea.setText("暂时没有新消息需要处理！");
			}
		});
		button_1.setBounds(349, 479, 52, 52);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button_1.getWidth(),
						button_1.getHeight(),image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp1);
		button_1.setIcon(image2);
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
