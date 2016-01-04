package nju.edu.presentation.Business_hall_salesmanui;

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
import javax.swing.JToolBar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

import PO.LoginPO;
import nju.edu.VO.SendorderVO;
import nju.edu.businesslogic.transferbl.SendFormBL;
import nju.edu.businesslogicservice.transferblservice.SendFormBlService;

@SuppressWarnings("serial")
public class SendUI extends JPanel implements Runnable {
	private JTextField textField;
	JFrame main;
	JPanel lastui;
	SendUI nowPanel;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/businessHall_stuff/SendUI.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings("unchecked")
	public SendUI(JFrame m, JPanel bf, LoginPO loginPO) {
		main = m;
		lastui = bf;
		nowPanel = this;

		JButton button = new JButton("");
		button.setBounds(14, -9, 63, 63);
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
			}
		});
		setLayout(null);
		add(button);

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setBounds(655, 12, 100, 15);
		lblHello.setForeground(Color.WHITE);
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

		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String sendDate = bartDateFormat.format(date);

		JLabel lblNewLabel = new JLabel(sendDate);
		lblNewLabel.setBounds(273, 255, 93, 15);
		add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(266, 293, 115, 25);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		add(textField);
		textField.setColumns(10);

		String[] checkState = { "未审批", "审批通过", "审批未通过" };
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox(checkState);
		comboBox.setBounds(257, 339, 93, 21);
		comboBox.setEnabled(false);
		add(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setBounds(432, 215, 140, 195);
		add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(88, 93, 103));
		textArea.setCaretColor(new Color(88, 93, 103));
		textArea.setOpaque(false);
		textArea.setBorder(null);
		textArea.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!(Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '\n')) {
					e.consume();
				}
			}
		});
		scrollPane.setViewportView(textArea);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(274, 443, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		@SuppressWarnings("static-access")
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sendPerson = textField.getText();
				String orderList = textArea.getText();
				if (sendPerson.length() == 0) {
					label_4.setText("请输入派件人");
				} else if (orderList.length() == 0) {
					label_4.setText("请输入订单号");
				} else {
					String[] sendOrder = orderList.split("\n");
					ArrayList<String> order = new ArrayList<String>();
					boolean isTrue = true;
					for (int i = 0; i < sendOrder.length; i++) {
						if (sendOrder[i].length() != 10) {
							isTrue = false;
							break;
						}
						order.add(sendOrder[i]);
					}

					if (isTrue) {
						SendorderVO sv = new SendorderVO(sendDate, sendPerson,
								order);
						SendFormBlService sb = new SendFormBL();
						sb.addReceiveOrder(sv);
						Thread t = new Thread(nowPanel);
						t.start();
					} else {
						label_4.setText("请检查订单号输入是否正确");
					}
				}
			}
		});
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(426, 443, 52, 52);
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SendUI su = new SendUI(main, lastui, loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(su);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(btnNewButton_1);

	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		main.remove(nowPanel);
		main.getContentPane().add(lastui);
		main.invalidate();
		main.repaint();
		main.setVisible(true);

	}
}
