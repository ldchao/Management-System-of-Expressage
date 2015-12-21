package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
public class VehicleNew extends JPanel {

	private JTextField carNum;
	private JTextField engineNum;
	private JTextField car;
	private JTextField baseNum;
	private JTextField driver;
	private JLabel buyDate;
	private JLabel useDate;
	private VehicleBlService vehicleBl = new VehicleBl();

	@SuppressWarnings("static-access")
	public VehicleNew(JFrame m, JPanel bf, LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = bf;
		VehicleNew nowPanel = this;
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

		carNum = new JTextField();
		carNum.setForeground(new Color(88, 93, 103));
		carNum.setCaretColor(new Color(88, 93, 103));
		carNum.setColumns(10);
		carNum.setBounds(212, 319, 106, 26);
		add(carNum);

		JLabel carNumLabel = new JLabel("车辆代号");
		carNumLabel.setBounds(133, 318, 57, 28);
		add(carNumLabel);

		engineNum = new JTextField();
		engineNum.setForeground(new Color(88, 93, 103));
		engineNum.setCaretColor(new Color(88, 93, 103));
		engineNum.setColumns(10);
		engineNum.setBounds(212, 357, 106, 26);
		add(engineNum);

		JLabel engineNumLabel = new JLabel("发动机型号");
		engineNumLabel.setBounds(133, 357, 65, 28);
		add(engineNumLabel);

		JLabel carLabel = new JLabel("车辆号");
		carLabel.setBounds(133, 438, 67, 28);
		add(carLabel);

		car = new JTextField();
		car.setForeground(new Color(88, 93, 103));
		car.setCaretColor(new Color(88, 93, 103));
		car.setColumns(10);
		car.setBounds(212, 438, 106, 26);
		add(car);

		JLabel baseLabel = new JLabel("底盘号");
		baseLabel.setBounds(133, 398, 57, 28);
		add(baseLabel);

		baseNum = new JTextField();
		baseNum.setForeground(new Color(88, 93, 103));
		baseNum.setCaretColor(new Color(88, 93, 103));
		baseNum.setColumns(10);
		baseNum.setBounds(212, 399, 106, 26);
		add(baseNum);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		buyDate = new JLabel("请单击选择日期");
		buyDate.setBounds(465, 365, 93, 23);
		dateChooser2.register(buyDate);
		add(buyDate);

		JLabel label_7 = new JLabel("购买日期");
		label_7.setBounds(379, 362, 57, 28);
		add(label_7);

		JLabel label_8 = new JLabel("服役时间");
		label_8.setBounds(379, 400, 74, 28);
		add(label_8);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		useDate = new JLabel("请单击选择日期");
		useDate.setBounds(465, 403, 93, 23);
		dateChooser1.register(useDate);
		add(useDate);

		JLabel label_11 = new JLabel("驾驶员");
		label_11.setBounds(379, 319, 57, 28);
		add(label_11);

		driver = new JTextField();
		driver.setForeground(new Color(88, 93, 103));
		driver.setCaretColor(new Color(88, 93, 103));
		driver.setColumns(10);
		driver.setBounds(458, 319, 106, 26);
		add(driver);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(268, 104, 160, 160);
		add(panel);

		JButton btnNewButton = new JButton("确认");
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
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
				if (carNum.getText().length() == 0
						|| engineNum.getText().length() == 0
						|| car.getText().length() == 0
						|| driver.getText().length() == 0
						|| baseNum.getText().length() == 0
						|| buyDate.getText().length() == 0
						|| useDate.getText().length() == 0
						|| useDate.getText().equals("请单击选择日期")
						|| buyDate.getText().equals("请单击选择日期")) {
					label_4.setText("信息未填写完整！");
				} else {
					VehicleVO vo = new VehicleVO(carNum.getText(), engineNum
							.getText(), car.getText(), driver.getText(),
							baseNum.getText(), buyDate.getText(), useDate
									.getText(), TransportState.Available);
					vehicleBl.addVehicle(vo);
					label_4.setText("新建成功！");
				}
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

	}

	// public void show(VehicleVO vo) {
	// this.carNum.setText(vo.getCarNum());
	// this.engineNum.setText(vo.getEngineNum());
	// this.baseNum.setText(vo.getBaseNum());
	// this.car.setText(vo.getCar());
	// this.driver.setText(vo.getDriver());
	// this.buyDate.setText(vo.getBuyDate());
	// this.useDate.setText(vo.getUseDate());
	//
	// }
}
