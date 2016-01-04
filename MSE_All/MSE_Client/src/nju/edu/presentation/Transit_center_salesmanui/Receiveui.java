package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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

@SuppressWarnings("serial")
public class Receiveui extends JPanel {
	private JTextField textField;
	JFrame main;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/TransitCenterSalesman/Receiveui.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	/**
	 * Create the panel.
	 */
	public Receiveui(JFrame m, JPanel jp, LoginPO loginPO) {
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

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 540, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		textField = new JTextField("输入装运单编号");
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				label_4.setText("状态栏");
				if (!(Character.isDigit(e.getKeyChar()))) {
					e.consume();
				}
			}
		});
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		textField.setBounds(205, 244, 347, 44);
		textField.setForeground(new Color(255,255,255,200));
		textField.setCaretColor(new Color(248,179,28));
		add(textField);
		textField.setColumns(10);

		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBounds(349, 316, 52, 52);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		@SuppressWarnings("static-access")
		Image temp1 = image2.getImage().getScaledInstance(button_1.getWidth(),
				button_1.getHeight(), image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp1);
		button_1.setIcon(image2);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() != 10) {
					label_4.setText("请输入正确装运单号");
				} else {
					ReceiveBLService rbs = new ReceiveBL();
					LoadorderVO lv = rbs.checkUnreceive_loadorderPO(textField
							.getText());
					if (lv == null) {
						label_4.setText("未检测到该装运单");
					} else {
						Arriverorder a = new Arriverorder(main, nowPanel, lv,
								loginPO);
						main.remove(nowPanel);
						main.getContentPane().add(a);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
					}
				}
			}
		});
		add(button_1);

	}
}
