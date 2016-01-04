package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import PO.LoginPO;
import PO.OrganizationNumPO;
import nju.edu.VO.ArriverorderVO;
import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogic.transferbl.ReceiveBL;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("serial")
public class Arriverorder extends JPanel implements Runnable {
	private JTextField textField;
	private JTextField textField_1;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton_2;
	JFrame main;
	JPanel lastui;
	LoadorderVO lv;
	Arriverorder nowPanel;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/TransitCenterSalesman/Arriverorder.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	/**
	 * Create the panel.
	 */
	@SuppressWarnings({ "unchecked", "static-access" })
	public Arriverorder(JFrame m, JPanel jp, LoadorderVO lv, LoginPO loginPO) {
		main = m;
		this.lv = lv;
		lastui = jp;
		nowPanel = this;
		OrganizationNumPO op = new OrganizationNumPO();
		setLayout(null);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");

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
		lblNewLabel_8.setBounds(377, 174, 96, 15);
		add(lblNewLabel_8);

		textField = new JTextField();
		textField.setText(op.getNum(loginPO.getShop()));
		textField.setEditable(false);
		textField.setBounds(373, 210, 125, 26);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setColumns(10);
		add(textField);

		textField_1 = new JTextField();
		textField_1.setText(lv.getOffName());
		textField_1.setEditable(false);
		textField_1.setBounds(373, 257, 125, 26);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.setColumns(10);
		add(textField_1);

		String[] approveState = { "未审批", "审批通过", "审批未通过" };
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox(approveState);
		comboBox.setOpaque(false);
		comboBox.setBorder(null);
		comboBox.setBounds(373, 347, 147, 26);
		comboBox.setEnabled(false);
		add(comboBox);

		rdbtnNewRadioButton = new JRadioButton("损坏");
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBorder(null);
		rdbtnNewRadioButton.setBounds(372, 304, 51, 23);
		add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("完整");
		rdbtnNewRadioButton_1.setOpaque(false);
		rdbtnNewRadioButton_1.setBorder(null);
		rdbtnNewRadioButton_1.setBounds(433, 304, 50, 23);
		add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_2 = new JRadioButton("丢失");
		rdbtnNewRadioButton_2.setOpaque(false);
		rdbtnNewRadioButton_2.setBorder(null);
		rdbtnNewRadioButton_2.setBounds(493, 304, 50, 23);
		add(rdbtnNewRadioButton_2);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(282, 417, 52, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isSelected()) {
					label_4.setText("请选择货物到达状态");
				} else {
					ArriverorderVO av = new ArriverorderVO(textField.getText(),
							sendDate, lv.getOffNum(), getSelection(), lv
									.getCarNum(), lv.getMonitorName(), lv
									.getTransferName(), lv.getOrder());
					ReceiveBLService rb = new ReceiveBL();
					rb.build(av, lv.getLoadNum());
					label_4.setText("到达单已提交总经理审批");
					Thread t = new Thread(nowPanel);
					t.start();

				}
			}
		});
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(413, 418, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arriverorder a = new Arriverorder(main, lastui, lv, loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(a);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		add(btnNewButton_1);
	}

	protected String getSelection() {
		if (rdbtnNewRadioButton.isSelected())
			return rdbtnNewRadioButton.getText();
		else if (rdbtnNewRadioButton_1.isSelected())
			return rdbtnNewRadioButton_1.getText();
		else
			return rdbtnNewRadioButton_2.getText();
	}

	protected boolean isSelected() {

		return (rdbtnNewRadioButton.isSelected()
				|| rdbtnNewRadioButton_1.isSelected() || rdbtnNewRadioButton_2
					.isSelected());
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