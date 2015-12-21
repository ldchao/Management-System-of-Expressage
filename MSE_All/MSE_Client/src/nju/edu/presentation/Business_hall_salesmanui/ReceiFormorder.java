package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Color;
import java.awt.Font;
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

		JLabel label = new JLabel("营业厅业务员>>接收>>新建接收单");
		label.setBounds(100, 14, 360, 15);
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

		JLabel label_2 = new JLabel("到达日期");
		label_2.setBounds(180, 159, 54, 15);
		add(label_2);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(390, 159, 96, 15);
		add(lblNewLabel_8);

		JLabel label_3 = new JLabel("到达地");
		label_3.setBounds(180, 211, 96, 15);
		add(label_3);

		textField = new JTextField();
		textField.setText(loginPO.getShop());
		textField.setEditable(false);
		textField.setBounds(333, 208, 192, 21);
		add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("出发地");
		lblNewLabel.setBounds(180, 263, 54, 15);
		add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setText(lv.getOffName());
		textField_1.setEditable(false);
		textField_1.setBounds(333, 260, 192, 21);
		add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("货物到达状态");
		lblNewLabel_1.setBounds(180, 317, 96, 15);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("审批状态");
		lblNewLabel_2.setBounds(180, 372, 69, 15);
		add(lblNewLabel_2);

		String[] approveState = { "未审批", "审批通过", "审批未通过" };
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox comboBox = new JComboBox(approveState);
		comboBox.setBounds(333, 370, 181, 21);
		comboBox.setEnabled(false);
		add(comboBox);

		rdbtnNewRadioButton = new JRadioButton("损坏");
		rdbtnNewRadioButton.setBounds(333, 313, 64, 23);
		add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("完整");
		rdbtnNewRadioButton_1.setBounds(408, 313, 69, 23);
		add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_2 = new JRadioButton("丢失");
		rdbtnNewRadioButton_2.setBounds(479, 313, 80, 23);
		add(rdbtnNewRadioButton_2);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);

		JButton btnNewButton = new JButton("确定");

		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		button.setBounds(274, 459, 52, 52);

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
					rb.addReceiveOrder(rv);
					label_4.setText("接收单已提交总经理审批");
					Thread t = new Thread(nowPanel);
					t.start();
				}
			}
		});
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setBounds(425, 459, 52, 52);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReceiFormorder f = new ReceiFormorder(main, lastui, lv, loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(f);
				main.invalidate();
				main.repaint();
			}
		});
		add(btnNewButton_1);

		JLabel label_5 = new JLabel(
				"\u4E2D\u8F6C\u4E2D\u5FC3\u5230\u8FBE\u5355");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label_5.setBounds(260, 71, 226, 44);
		add(label_5);
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
