package nju.edu.presentation.Business_hall_salesmanui;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

import PO.LoginPO;
import State.TransportState;
import nju.edu.VO.VehicleVO;
import nju.edu.businesslogic.vehiclebl.VehicleBl;
import nju.edu.businesslogicservice.vehicleblservice.VehicleBlService;
import nju.edu.presentation.financial_staffui.DateChooser;

import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Image;

@SuppressWarnings("serial")
public class VehicleChange extends JPanel {
	private JTextField carNum;
	private JTextField engineNum;
	private JTextField car;
	private JTextField baseNum;
	private JTextField driver;
	private JLabel buyDate;
	private JLabel useDate;
	private JComboBox<String> carState;
	private VehicleBlService vehicleBl = new VehicleBl();

	public VehicleChange(JFrame m, JPanel bf, LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = bf;
		VehicleChange nowPanel = this;
		nowPanel.setBounds(0, 0, 750, 600);
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
				main.setVisible(true);
			}
		});
		add(button);

		JLabel label = new JLabel("营业厅业务员>>修改车辆信息");
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

		carNum = new JTextField();
		carNum.setForeground(new Color(88, 93, 103));
		carNum.setCaretColor(new Color(88, 93, 103));
		carNum.setColumns(10);
		carNum.setBounds(268, 312, 106, 26);
		add(carNum);

		JLabel carNumLabel = new JLabel("车辆代号");
		carNumLabel.setBounds(169, 311, 57, 28);
		add(carNumLabel);

		engineNum = new JTextField();
		engineNum.setForeground(new Color(88, 93, 103));
		engineNum.setCaretColor(new Color(88, 93, 103));
		engineNum.setColumns(10);
		engineNum.setBounds(268, 351, 106, 26);
		add(engineNum);

		JLabel engineNumLabel = new JLabel("发动机型号");
		engineNumLabel.setBounds(169, 350, 65, 28);
		add(engineNumLabel);

		JLabel carLabel = new JLabel("车辆号");
		carLabel.setBounds(169, 431, 67, 28);
		add(carLabel);

		car = new JTextField();
		car.setForeground(new Color(88, 93, 103));
		car.setCaretColor(new Color(88, 93, 103));
		car.setColumns(10);
		car.setBounds(268, 432, 106, 26);
		add(car);

		JLabel baseLabel = new JLabel("底盘号");
		baseLabel.setBounds(169, 391, 57, 28);
		add(baseLabel);

		baseNum = new JTextField();
		baseNum.setForeground(new Color(88, 93, 103));
		baseNum.setCaretColor(new Color(88, 93, 103));
		baseNum.setColumns(10);
		baseNum.setBounds(268, 394, 106, 26);
		add(baseNum);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		buyDate = new JLabel("请单击选择日期");
		buyDate.setBounds(500, 353, 93, 23);
		dateChooser2.register(buyDate);
		add(buyDate);

		JLabel label_7 = new JLabel("购买日期");
		label_7.setBounds(415, 350, 57, 28);
		add(label_7);

		JLabel label_8 = new JLabel("服役时间");
		label_8.setBounds(415, 391, 74, 28);
		add(label_8);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		useDate = new JLabel("请单击选择日期");
		useDate.setBounds(500, 394, 93, 23);
		dateChooser1.register(useDate);
		add(useDate);

		JLabel label_11 = new JLabel("驾驶员");
		label_11.setBounds(415, 312, 57, 28);
		add(label_11);

		driver = new JTextField();
		driver.setForeground(new Color(88, 93, 103));
		driver.setCaretColor(new Color(88, 93, 103));
		driver.setColumns(10);
		driver.setBounds(492, 312, 106, 26);
		add(driver);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(289, 104, 160, 160);
		add(panel);

		carState = new JComboBox<>();
		carState.addItem("Busy");
		carState.addItem("Available");
		carState.setBounds(492, 432, 113, 28);
		add(carState);

		JButton btnNewButton = new JButton("确认");
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
				TransportState state = TransportState.Available;
				switch (carState.getSelectedItem().toString()) {
				case "Busy":
					state = TransportState.Busy;
					break;
				case "Available":
					state = TransportState.Available;
				default:
					break;
				}
				VehicleVO vo = new VehicleVO(carNum.getText(), engineNum
						.getText(), car.getText(), driver.getText(), baseNum
						.getText(), buyDate.getText(), useDate.getText(), state);
				vehicleBl.updateVehicle(vo);
			}
		});
		add(btnNewButton);

		JButton button_1 = new JButton("取消");
		button_1.setIcon(image1);
		button_1.setBounds(425, 459, 52, 52);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);

		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button_1);

		JLabel label_2 = new JLabel("状态");
		label_2.setBounds(415, 431, 74, 28);
		add(label_2);

	}

	public void show(VehicleVO vo) {
		this.carNum.setText(vo.getCarNum());
		this.engineNum.setText(vo.getEngineNum());
		this.baseNum.setText(vo.getBaseNum());
		this.car.setText(vo.getCar());
		this.driver.setText(vo.getDriver());
		this.buyDate.setText(vo.getBuyDate());
		this.useDate.setText(vo.getUseDate());
		if (vo.getCarState().toString().equals("Busy")) {
			this.carState.setSelectedIndex(0);
		} else {
			this.carState.setSelectedIndex(1);
		}

	}
}
