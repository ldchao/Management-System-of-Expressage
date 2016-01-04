package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogic.transferbl.ReceiveBL;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;

@SuppressWarnings("serial")
public class ReceiFormUI extends JPanel {
	private JTextField textField;
	JFrame main;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/businessHall_stuff/ReceiFormUI.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	/**
	 * Create the panel.
	 */
	public ReceiFormUI(JFrame m, JPanel jp, LoginPO loginPO) {
		main = m;
		JPanel lastui = jp;
		ReceiFormUI nowPanel = this;
		setLayout(null);

		JButton button = new JButton("");
		button.setBounds(15, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(new ImageIcon("image/transparent_circle.png"));
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
		setForeground(Color.WHITE);
		add(lblHello);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 541, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		textField = new JTextField("请输入装运单编号");
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField.setForeground(new Color(255, 255, 255,100));
		textField.setCaretColor(new Color(248, 179, 28,230));
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField.setFont(new Font("微软雅黑", Font.PLAIN, 25));
				textField.setForeground(new Color(255, 255, 255, 200));
			}
		});
		textField.setColumns(10);
		textField.setBounds(204, 245, 345, 45);
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				label_4.setText("状态栏");
				if (!(Character.isDigit(e.getKeyChar()))) {
					e.consume();
				}
			}
		});
		add(textField);
		textField.setColumns(10);

		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() != 10) {
					label_4.setText("请输入正确的装运单号");
				} else {
					ReceiveBLService rbs = new ReceiveBL();
					LoadorderVO lv = rbs.checkUnreceive_loadorderPO(textField
							.getText());
					if (lv == null) {
						label_4.setText("未检测到该装运单");
					} else {
						ReceiFormorder r = new ReceiFormorder(main, nowPanel,
								lv, loginPO);
						main.remove(nowPanel);
						main.getContentPane().add(r);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
					}
				}
			}
		});
		button_1.setBounds(343, 313, 52, 52);
		add(button_1);

	}

}
