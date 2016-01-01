package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

import PO.LoginPO;
import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogic.transferbl.ReceiveBL;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;

public class Receiveui extends JPanel {
	private JTextField textField;
	JFrame main;

	/**
	 * Create the panel.
	 */
	public Receiveui(JFrame m, JPanel jp,LoginPO loginPO) {
		main = m;
		JPanel lastui = jp;
		Receiveui nowPanel = this;
		setLayout(null);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		
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

		JLabel label = new JLabel("中转中心业务员>>中转接收");
		label.setBounds(100, 14, 187, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JLabel label_2 = new JLabel("输入装运单编号");
		label_2.setBounds(179, 255, 110, 23);
		add(label_2);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		JLabel label_3 = new JLabel("选择到达的装运单");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_3.setBounds(289, 134, 255, 23);
		add(label_3);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				label_4.setText("状态栏");
				if (!(Character.isDigit(e.getKeyChar()))) {
					e.consume();
				}
			}
		});
		textField.setBounds(342, 254, 196, 23);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		add(textField);
		textField.setColumns(10);

		JButton button_1 = new JButton("创建到达单");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length()!=10) {
					label_4.setText("请输入正确装运单号");
				} else {
					ReceiveBLService rbs = new ReceiveBL();
					LoadorderVO lv = rbs.checkUnreceive_loadorderPO(textField
							.getText());
					if (lv == null) {
						label_4.setText("未检测到该装运单");
					} else {
						Arriverorder a = new Arriverorder(main, nowPanel, lv,loginPO);
						main.remove(nowPanel);
						main.getContentPane().add(a);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
					}
				}
			}
		});
		button_1.setBounds(307, 368, 134, 23);
		add(button_1);

	}
}
