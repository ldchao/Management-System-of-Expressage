package nju.edu.presentation.Business_hall_salesmanui;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

import PO.LoginPO;
import State.TransportState;
import nju.edu.VO.VehicleVO;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Color;

@SuppressWarnings("serial")
public class VehicleImfo extends JPanel {
	private JLabel carNum;
	private JLabel engineNum;
	private JLabel baseNum;
	private JLabel car;
	private JLabel driver;
	private JLabel buyDate;
	private JLabel useDate;
	private JLabel status;

	@SuppressWarnings("unused")
	public VehicleImfo(JFrame m, JPanel bf, LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = bf;
		VehicleImfo nowPanel = this;
		nowPanel.setBounds(0, 0, 750, 600);
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
				main.setVisible(true);
			}
		});
		add(button);

		JLabel label = new JLabel("营业厅业务员>>新建车辆信息");
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

		JLabel carNumLabel = new JLabel("车辆代号");
		carNumLabel.setBounds(169, 311, 57, 28);
		add(carNumLabel);

		JLabel engineNumLabel = new JLabel("发动机型号");
		engineNumLabel.setBounds(169, 350, 65, 28);
		add(engineNumLabel);

		JLabel carLabel = new JLabel("车辆号");
		carLabel.setBounds(169, 431, 67, 28);
		add(carLabel);

		JLabel baseLabel = new JLabel("底盘号");
		baseLabel.setBounds(169, 391, 57, 28);
		add(baseLabel);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");

		JLabel label_7 = new JLabel("购买日期");
		label_7.setBounds(415, 350, 57, 28);
		add(label_7);

		JLabel label_8 = new JLabel("服役时间");
		label_8.setBounds(415, 391, 74, 28);
		add(label_8);

		JLabel label_11 = new JLabel("驾驶员");
		label_11.setBounds(415, 312, 57, 28);
		add(label_11);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(289, 104, 160, 160);
		add(panel);

		JLabel label_2 = new JLabel("状态");
		label_2.setBounds(415, 431, 74, 28);
		add(label_2);

		carNum = new JLabel("New label");
		carNum.setBounds(261, 317, 117, 16);
		add(carNum);

		engineNum = new JLabel("New label");
		engineNum.setBounds(261, 356, 117, 16);
		add(engineNum);

		baseNum = new JLabel("New label");
		baseNum.setBounds(261, 397, 117, 16);
		add(baseNum);

		car = new JLabel("New label");
		car.setBounds(261, 437, 117, 16);
		add(car);

		driver = new JLabel("New label");
		driver.setBounds(492, 317, 107, 16);
		add(driver);

		buyDate = new JLabel("New label");
		buyDate.setBounds(492, 356, 107, 16);
		add(buyDate);

		useDate = new JLabel("New label");
		useDate.setBounds(492, 397, 107, 16);
		add(useDate);

		status = new JLabel("New label");
		status.setBounds(492, 437, 107, 16);
		add(status);

		JButton button_1 = new JButton("修改");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VehicleChange vehicleChange = new VehicleChange(main, nowPanel,
						loginPO);
				TransportState state = TransportState.Available;
				switch (status.getText()) {
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
				vehicleChange.show(vo);
				main.remove(nowPanel);
				main.getContentPane().add(vehicleChange);
				main.invalidate();
				main.repaint();
			}
		});
		button_1.setBounds(306, 492, 117, 29);
		add(button_1);

	}

	public void show(VehicleVO vo) {
		this.carNum.setText(vo.getCarNum());
		this.engineNum.setText(vo.getEngineNum());
		this.baseNum.setText(vo.getBaseNum());
		this.car.setText(vo.getCar());
		this.driver.setText(vo.getDriver());
		this.buyDate.setText(vo.getBuyDate());
		this.useDate.setText(vo.getUseDate());
		this.status.setText(vo.getCarState().toString());
	}
}
