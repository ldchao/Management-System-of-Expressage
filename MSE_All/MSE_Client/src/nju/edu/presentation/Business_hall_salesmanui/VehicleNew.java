package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import State.TransportState;
import nju.edu.VO.VehicleVO;
import nju.edu.businesslogic.vehiclebl.VehicleBl;
import nju.edu.businesslogicservice.vehicleblservice.VehicleBlService;
import nju.edu.presentation.financial_staffui.DateChooser;

import javax.swing.JTextField;
import java.awt.Color;

public class VehicleNew extends JPanel {

	private JTextField carNum;
	private JTextField engineNum;
	private JTextField car;
	private JTextField baseNum;
	private JTextField driver;
	private JLabel buyDate;
	private JLabel useDate;
	private VehicleBlService vehicleBl = new VehicleBl();

	public VehicleNew(JFrame m, JPanel bf) {
		JFrame main = m;
		JPanel lastui = bf;
		VehicleNew nowPanel = this;
		nowPanel.setBounds(0, 0, 750, 600);
		setLayout(null);

		JButton button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 65, 23);
		add(button);

		JLabel label = new JLabel("营业厅业务员>>新建车辆信息");
		label.setBounds(100, 14, 200, 15);
		add(label);

		JLabel label_1 = new JLabel("阙帅，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

		carNum = new JTextField();
		carNum.setColumns(10);
		carNum.setBounds(212, 319, 106, 26);
		add(carNum);

		JLabel carNumLabel = new JLabel("车辆代号");
		carNumLabel.setBounds(133, 318, 57, 28);
		add(carNumLabel);

		engineNum = new JTextField();
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
		car.setColumns(10);
		car.setBounds(212, 438, 106, 26);
		add(car);

		JLabel baseLabel = new JLabel("底盘号");
		baseLabel.setBounds(133, 398, 57, 28);
		add(baseLabel);

		baseNum = new JTextField();
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
		driver.setColumns(10);
		driver.setBounds(458, 319, 106, 26);
		add(driver);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(268, 104, 160, 160);
		add(panel);

		JButton btnNewButton = new JButton("确认");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (carNum.getText().length() == 0 || engineNum.getText().length() == 0 || car.getText().length() == 0
						|| driver.getText().length() == 0 || baseNum.getText().length() == 0
						|| buyDate.getText().length() == 0 || useDate.getText().length() == 0||useDate.getText().equals("请单击选择日期")||buyDate.getText().equals("请单击选择日期")) {
					label_4.setText("信息未填写完整！");
				}else{
				VehicleVO vo = new VehicleVO(carNum.getText(), engineNum.getText(), car.getText(), driver.getText(),
						baseNum.getText(), buyDate.getText(), useDate.getText(), TransportState.Available);
				vehicleBl.addVehicle(vo);
				label_4.setText("新建成功！");
				}
			}
		});
		btnNewButton.setBounds(268, 492, 67, 29);
		add(btnNewButton);

		JButton button_1 = new JButton("取消");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(347, 492, 67, 29);
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
