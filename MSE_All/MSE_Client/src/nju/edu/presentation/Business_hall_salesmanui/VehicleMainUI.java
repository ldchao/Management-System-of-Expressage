package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import State.TransportState;
import nju.edu.VO.VehicleVO;
import nju.edu.businesslogic.vehiclebl.VehicleBl;
import nju.edu.businesslogicservice.vehicleblservice.VehicleBlService;

public class VehicleMainUI extends JPanel{
	private JTextField textField;
	private boolean isValid = false;
	private VehicleVO vo;
	private VehicleBlService vehicleBl = new VehicleBl();
	
	public VehicleMainUI(JFrame m, JPanel bf) {
		JFrame main = m;
		JPanel lastui = bf;
		VehicleMainUI nowPanel = this;
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

		JLabel label = new JLabel("营业厅业务员>>车辆信息管理");
		label.setBounds(100, 14, 200, 15);
		add(label);

		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(313, 240, 133, 26);
		add(textField);
		
		JLabel label_2 = new JLabel("车辆代号");
		label_2.setBounds(234, 239, 57, 28);
		add(label_2);
		
		JButton button_1 = new JButton("查询");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String carNum = textField.getText();
				if (carNum.length() == 0) {
					label_4.setText("未输入车辆代号");
				}else {
					isValid = vehicleBl.searchVehicle(carNum);
					if (isValid) {
						vo = vehicleBl.find(carNum);
						VehicleImfo imfo = new VehicleImfo(main, nowPanel);
//						vo = new VehicleVO("11111111","1","1", "1", "1", "1", "1", TransportState.Busy);
						imfo.show(vo);
						main.remove(nowPanel);
						main.getContentPane().add(imfo);
						main.invalidate();
						main.repaint();
					}
					
					
				}
			}
		});
		button_1.setBounds(221, 321, 105, 29);
		add(button_1);
		
		JButton button_2 = new JButton("新建");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VehicleNew vn = new VehicleNew(main, nowPanel);
				main.remove(nowPanel);
				main.add(vn);
				main.invalidate();
				main.repaint();
			}
		});
		button_2.setBounds(345, 321, 105, 29);
		add(button_2);
		
		
}
	
	}
