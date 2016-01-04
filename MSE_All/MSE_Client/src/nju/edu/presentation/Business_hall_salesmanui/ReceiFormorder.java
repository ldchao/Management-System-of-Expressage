package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;
import PO.OrganizationNumPO;
import nju.edu.VO.LoadorderVO;
import nju.edu.VO.ReceiFormVO;
import nju.edu.businesslogic.transferbl.ReceiFormBL;
import nju.edu.businesslogicservice.transferblservice.ReceiFormBlService;
import nju.edu.presentation.financial_staffui.DateChooser;

@SuppressWarnings("serial")
public class ReceiFormorder extends JPanel implements Runnable {

	private JTextField textField;
	private JTextField textField_1;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton_2;
	JFrame main;
	LoadorderVO lv;
	ReceiFormorder nowPanel;
	JPanel lastui;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/businessHall_stuff/ReceiFormorder.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("static-access")
	public ReceiFormorder(JFrame m, JPanel jp, LoadorderVO lv, LoginPO loginPO) {
		main = m;
		this.lv = lv;
		lastui = jp;
		nowPanel = this;
		setLayout(null);

		JButton button = new JButton("");

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
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(372, 207, 96, 15);
		add(lblNewLabel_8);

		textField = new JTextField();
		textField.setText(loginPO.getShop());
		textField.setEditable(false);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setBounds(370, 240, 125, 26);
		
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setText(lv.getOffName());
		textField_1.setEditable(false);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.setBounds(370, 287, 125, 26);
		add(textField_1);
		textField_1.setColumns(10);

		String[] approveState = { "未审批", "审批通过", "审批未通过" };
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox comboBox = new JComboBox(approveState);
		comboBox.setBounds(371, 370, 125, 26);
		comboBox.setEnabled(false);
		add(comboBox);

		rdbtnNewRadioButton = new JRadioButton("损坏");
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBorder(null);
		rdbtnNewRadioButton.setBounds(368, 332, 64, 23);
		add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("完整");
		rdbtnNewRadioButton_1.setOpaque(false);
		rdbtnNewRadioButton_1.setBorder(null);
		rdbtnNewRadioButton_1.setBounds(433, 332, 62, 23);
		add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_2 = new JRadioButton("丢失");
		rdbtnNewRadioButton_2.setOpaque(false);
		rdbtnNewRadioButton_2.setBorder(null);
		rdbtnNewRadioButton_2.setBounds(491, 332, 80, 23);
		add(rdbtnNewRadioButton_2);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);

		JButton btnNewButton = new JButton("");

		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		btnNewButton.setBounds(272, 457, 52, 52);
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblNewLabel_8.getText().equals("单击选择日期") || !isSelected()) {
					label_4.setText("输入信息有误");
				} else {
					OrganizationNumPO op = new OrganizationNumPO();
					ReceiFormVO rv = new ReceiFormVO(lblNewLabel_8.getText(),
							textField_1.getText(),
							op.getNum(loginPO.getShop()), getSelection(), lv
									.getCarNum(), lv.getMonitorName(), lv
									.getTransferName(), lv.getOrder());
					ReceiFormBlService rb = new ReceiFormBL();
					rb.addReceiveOrder(rv, lv.getLoadNum());
					label_4.setText("接收单已提交总经理审批");
					Thread t = new Thread(nowPanel);
					t.start();
				}
			}
		});
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setBounds(424, 456, 52, 52);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReceiFormorder f = new ReceiFormorder(main, lastui, lv, loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(f);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
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
