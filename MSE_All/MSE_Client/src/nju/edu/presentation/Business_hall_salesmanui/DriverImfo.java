package nju.edu.presentation.Business_hall_salesmanui;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import State.DriverState;
import State.TransportState;
import nju.edu.VO.DriverVO;
import nju.edu.VO.VehicleVO;
import nju.edu.presentation.financial_staffui.DateChooser;

import javax.swing.JTextField;
import java.awt.Color;

public class DriverImfo extends JPanel {
	private JLabel driverNum;
	private JLabel name;
	private JLabel sex;
	private JLabel shopNum;
	private JLabel phoneNum;
	private JLabel idNum;
	private JLabel birthDate;
	private JLabel licenseDue;
	private JLabel status;

	public DriverImfo(JFrame m, JPanel bf) {
		JFrame main = m;
		JPanel lastui = bf;
		DriverImfo nowPanel = this;
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

		JLabel label = new JLabel("营业厅业务员>>新建司机信息");
		label.setBounds(100, 14, 200, 15);
		add(label);

		JLabel label_1 = new JLabel("阙帅，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);
		toolBar.setEnabled(false);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

		JLabel label_2 = new JLabel("司机编号");
		label_2.setBounds(160, 289, 57, 28);
		add(label_2);

		JLabel label_3 = new JLabel("司机姓名");
		label_3.setBounds(160, 328, 57, 28);
		add(label_3);

		JLabel label_5 = new JLabel("营业厅编号");
		label_5.setBounds(160, 409, 67, 28);
		add(label_5);

		JLabel label_6 = new JLabel("手机号码");
		label_6.setBounds(409, 290, 57, 28);
		add(label_6);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");

		JLabel label_7 = new JLabel("出生日期");
		label_7.setBounds(409, 371, 57, 28);
		add(label_7);

		JLabel label_8 = new JLabel("行驶证期限");
		label_8.setBounds(409, 409, 74, 28);
		add(label_8);

		JLabel label_10 = new JLabel("性别");
		label_10.setBounds(160, 368, 57, 28);
		add(label_10);

		JLabel label_11 = new JLabel("身份证号");
		label_11.setBounds(409, 328, 57, 28);
		add(label_11);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(300, 90, 160, 160);
		add(panel);

		driverNum = new JLabel("New label");
		driverNum.setBounds(255, 295, 107, 16);
		add(driverNum);

		name = new JLabel("New label");
		name.setBounds(255, 334, 107, 16);
		add(name);

		sex = new JLabel("New label");
		sex.setBounds(255, 377, 107, 16);
		add(sex);

		shopNum = new JLabel("New label");
		shopNum.setBounds(255, 415, 107, 16);
		add(shopNum);

		phoneNum = new JLabel("New label");
		phoneNum.setBounds(506, 295, 107, 16);
		add(phoneNum);

		idNum = new JLabel("New label");
		idNum.setBounds(506, 334, 107, 16);
		add(idNum);

		birthDate = new JLabel("New label");
		birthDate.setBounds(506, 377, 107, 16);
		add(birthDate);

		licenseDue = new JLabel("New label");
		licenseDue.setBounds(506, 415, 107, 16);
		add(licenseDue);

		JLabel label_9 = new JLabel("状态");
		label_9.setBounds(160, 449, 67, 28);
		add(label_9);

		status = new JLabel("New label");
		status.setBounds(255, 455, 107, 16);
		add(status);

		JButton button_1 = new JButton("修改");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DriverChange driverChange = new DriverChange(main, nowPanel);
				DriverState state = DriverState.Available;
				switch (status.getText()) {
				case "Busy":
					state = DriverState.Busy;
					break;
				case "Available":
					state = DriverState.Available;
				default:
					break;
				}
				DriverVO vo = new DriverVO(driverNum.getText(), name.getText(), shopNum.getText(), birthDate.getText(),
						idNum.getText(), phoneNum.getText(), sex.getText(), licenseDue.getText(), state);
				driverChange.show(vo);
				main.remove(nowPanel);
				main.getContentPane().add(driverChange);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(337, 478, 117, 29);
		add(button_1);

	}
	
	public void show(DriverVO vo){
		this.driverNum.setText(vo.getDriverNum());
		this.name.setText(vo.getName());
		this.sex.setText(vo.getSex());
		this.shopNum.setText(vo.getShopNum());
		this.phoneNum.setText(vo.getPhoneNum());
		this.idNum.setText(vo.getIdNum());
		this.licenseDue.setText(vo.getLicenseDue());
		this.birthDate.setText(vo.getBirthDate());
		this.status.setText(vo.getDriverState().toString());
	}
}
