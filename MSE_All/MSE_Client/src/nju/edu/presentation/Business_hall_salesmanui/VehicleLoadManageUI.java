package nju.edu.presentation.Business_hall_salesmanui;

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
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import nju.edu.VO.VehicleLoadorderVO;
import nju.edu.businesslogic.loadbl.LoadBL;
import nju.edu.businesslogicservice.loadblservice.LoadBlService;

import javax.swing.JTextArea;

import PO.LoginPO;
import PO.OrganizationNumPO;

@SuppressWarnings("serial")
public class VehicleLoadManageUI extends JPanel implements Runnable {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	JFrame main;
	JPanel lastui;
	VehicleLoadManageUI nowPanel;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/businessHall_stuff/VehicleLoadManageUI.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	// create the panel
	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	public VehicleLoadManageUI(JFrame m, JPanel bf, LoginPO loginPO) {
		main = m;
		lastui = bf;
		nowPanel = this;
		setLayout(null);
		OrganizationNumPO op = new OrganizationNumPO();
		String offnum = op.getNum(loginPO.getShop());

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
		toolBar.setBounds(8, 539, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String sendDate = bartDateFormat.format(date);
		JLabel lblNewLabel_8 = new JLabel(sendDate);
		lblNewLabel_8.setBounds(260, 159, 85, 15);
		add(lblNewLabel_8);

		textField = new JTextField();
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setText(offnum);
		textField.setEditable(false);
		textField.setBounds(261, 189, 115, 25);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		textField_1.setBounds(257, 224, 115, 25);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setForeground(new Color(88, 93, 103));
		textField_2.setCaretColor(new Color(88, 93, 103));
		textField_2.setOpaque(false);
		textField_2.setBorder(null);
		textField_2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(257, 260, 115, 25);
		add(textField_2);

		String[] arriveAddress = { "", "北京中转中心", "上海中转中心", "南京中转中心", "广州中转中心" };
		JComboBox comboBox_1 = new JComboBox(arriveAddress);
		comboBox_1.setBounds(254, 295, 115, 25);
		add(comboBox_1);

		textField_4 = new JTextField();
		textField_4.setForeground(new Color(88, 93, 103));
		textField_4.setCaretColor(new Color(88, 93, 103));
		textField_4.setOpaque(false);
		textField_4.setBorder(null);
		textField_4.setColumns(10);
		textField_4.setBounds(256, 333, 115, 25);
		add(textField_4);

		textField_5 = new JTextField();
		textField_5.setForeground(new Color(88, 93, 103));
		textField_5.setCaretColor(new Color(88, 93, 103));
		textField_5.setOpaque(false);
		textField_5.setBorder(null);
		textField_5.setColumns(10);
		textField_5.setBounds(257, 370, 115, 25);
		add(textField_5);

		JLabel label_3 = new JLabel("_ _ _ _ _");
		label_3.setBounds(257, 406, 72, 14);
		add(label_3);

		String[] checkState = { "未审批", "审批通过", "审批未通过" };
		JComboBox comboBox = new JComboBox(checkState);
		comboBox.setEnabled(false);
		comboBox.setBounds(255, 436, 115, 25);
		add(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(437, 149, 189, 318);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		scrollPane.getViewport().setOpaque(false);

		add(scrollPane);

		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_9);

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
		scrollPane.setRowHeaderView(textArea);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(271, 479, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadBlService lb = new LoadBL();
				String loadorderNum = textField_2.getText()
						+ textField_1.getText();
				String fee = "" + lb.getTotal(textArea.getText());
				label_3.setText(fee + "元");
				String monitorName = textField_4.getText();
				String transferName = textField_5.getText();
				String carNum = textField_2.getText();
				String orderList = textArea.getText();
				String arrivePlace = (String) comboBox_1.getSelectedItem();
				if (monitorName.length() == 0 || transferName.length() == 0
						|| carNum.length() != 4 || loadorderNum.length() != 10
						|| arrivePlace.length() == 0 || orderList.length() == 0) {
					label_4.setText("请检查信息是否输入正确");
				} else {
					VehicleLoadorderVO vlv = new VehicleLoadorderVO(sendDate,
							loadorderNum, offnum, arrivePlace, monitorName,
							transferName, carNum, orderList, fee);
					lb.addLoadOrder(vlv);
					label_4.setText("创建成功");
					Thread t = new Thread(nowPanel);
					t.start();
				}
			}
		});
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setBounds(425, 479, 52, 52);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VehicleLoadManageUI r = new VehicleLoadManageUI(main, lastui,
						loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(r);
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
