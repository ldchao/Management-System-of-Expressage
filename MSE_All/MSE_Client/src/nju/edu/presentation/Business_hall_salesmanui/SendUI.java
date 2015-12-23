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

	@SuppressWarnings("unchecked")
	public SendUI(JFrame m, JPanel bf, LoginPO loginPO) {
		main = m;
		lastui = bf;
		nowPanel = this;
		setLayout(null);

		JButton button = new JButton("返回");
		button.setBounds(13, -9, 63, 63);
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
		add(button);

		JLabel label = new JLabel("营业厅业务员>>车辆信息管理");
		label.setBounds(100, 14, 200, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		setForeground(Color.WHITE);
		add(lblHello);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

		JLabel label_2 = new JLabel("派件单");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label_2.setBounds(239, 102, 100, 50);
		add(label_2);

		JLabel label_3 = new JLabel("派件日期：");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_3.setBounds(147, 208, 86, 15);
		add(label_3);

		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String sendDate = bartDateFormat.format(date);

		JLabel lblNewLabel = new JLabel(sendDate);
		lblNewLabel.setBounds(246, 208, 93, 15);
		add(lblNewLabel);

		JLabel label_5 = new JLabel("派件人：");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_5.setBounds(147, 272, 86, 15);
		add(label_5);

		textField = new JTextField();
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setBounds(246, 270, 93, 21);
		add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("审批状态：");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel_1.setBounds(147, 350, 86, 15);
		add(lblNewLabel_1);

		String[] checkState = { "未审批", "审批通过", "审批未通过" };
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox(checkState);
		comboBox.setEnabled(false);
		comboBox.setBounds(246, 347, 93, 21);
		add(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(402, 105, 219, 267);
		add(scrollPane);

		JLabel lblNewLabel_2 = new JLabel("需要派送的单号");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_2);

		JTextArea textArea = new JTextArea();
		textArea.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!(Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '\n')) {
					e.consume();
				}
			}
		});
		scrollPane.setViewportView(textArea);

		JButton btnNewButton = new JButton("确定");
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		@SuppressWarnings("static-access")
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(274, 459, 52, 52);

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

		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setBounds(425, 459, 52, 52);
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
