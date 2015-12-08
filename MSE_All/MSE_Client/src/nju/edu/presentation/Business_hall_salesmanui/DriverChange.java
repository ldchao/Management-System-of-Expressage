package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import State.DriverState;
import State.TransportState;
import nju.edu.VO.DriverVO;
import nju.edu.VO.VehicleVO;
import nju.edu.businesslogic.vehiclebl.DriverBl;
import nju.edu.businesslogicservice.vehicleblservice.DriverBlService;
import nju.edu.presentation.financial_staffui.DateChooser;

public class DriverChange extends JPanel {
	private JTextField driverNum;
	private JTextField name;
	private JTextField shopNum;
	private JTextField phoneNum;
	private JTextField idNum;
	private JComboBox<String> sex;
	private JLabel birthDate;
	private JLabel licenseDue;
	DriverBlService bl = new DriverBl();

	public DriverChange(JFrame m, JPanel bf) {
		JFrame main = m;
		JPanel lastui = bf;
		DriverChange nowPanel = this;
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

		JLabel label = new JLabel("营业厅业务员>>修改司机信息");
		label.setBounds(100, 14, 200, 15);
		add(label);

		JLabel label_1 = new JLabel("阙帅，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		toolBar.setEnabled(false);

		driverNum = new JTextField();
		driverNum.setColumns(10);
		driverNum.setBounds(239, 305, 106, 26);
		add(driverNum);

		JLabel label_2 = new JLabel("司机编号");
		label_2.setBounds(160, 304, 57, 28);
		add(label_2);

		name = new JTextField();
		name.setColumns(10);
		name.setBounds(239, 343, 106, 26);
		add(name);

		JLabel label_3 = new JLabel("司机姓名");
		label_3.setBounds(160, 343, 57, 28);
		add(label_3);

		JLabel label_5 = new JLabel("营业厅编号");
		label_5.setBounds(160, 424, 67, 28);
		add(label_5);

		shopNum = new JTextField();
		shopNum.setColumns(10);
		shopNum.setBounds(239, 424, 106, 26);
		add(shopNum);

		JLabel label_6 = new JLabel("手机号码");
		label_6.setBounds(409, 305, 57, 28);
		add(label_6);

		phoneNum = new JTextField();
		phoneNum.setColumns(10);
		phoneNum.setBounds(488, 306, 106, 26);
		add(phoneNum);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		birthDate = new JLabel("请单击选择日期");
		birthDate.setBounds(495, 389, 93, 23);
		dateChooser2.register(birthDate);
		add(birthDate);

		JLabel label_7 = new JLabel("出生日期");
		label_7.setBounds(409, 386, 57, 28);
		add(label_7);

		JLabel label_8 = new JLabel("行驶证期限");
		label_8.setBounds(409, 424, 74, 28);
		add(label_8);

		DateChooser dateChooser = DateChooser.getInstance("yyyy-MM-dd");
		licenseDue = new JLabel("请单击选择日期");
		licenseDue.setBounds(495, 427, 93, 23);
		dateChooser.register(licenseDue);
		add(licenseDue);

		JLabel label_10 = new JLabel("性别");
		label_10.setBounds(160, 383, 57, 28);
		add(label_10);

		sex = new JComboBox<>();
		sex.addItem("请选择");
		sex.addItem("男");
		sex.addItem("女");
		sex.setBounds(240, 384, 105, 28);
		add(sex);

		JLabel label_11 = new JLabel("身份证号");
		label_11.setBounds(409, 343, 57, 28);
		add(label_11);

		idNum = new JTextField();
		idNum.setColumns(10);
		idNum.setBounds(488, 343, 106, 26);
		add(idNum);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(300, 90, 160, 160);
		add(panel);

		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DriverVO vo1 = bl.find(name.getText());
				DriverVO vo = new DriverVO(driverNum.getText(), name.getText(), shopNum.getText(), birthDate.getText(),
						idNum.getText(), phoneNum.getText(), sex.getSelectedItem().toString(), licenseDue.getText(),
						vo1.getDriverState());
				bl.updateDriver(vo);
			}
		});
		btnNewButton.setBounds(295, 478, 67, 29);
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
		button_1.setBounds(374, 478, 67, 29);
		add(button_1);

	}

	public void show(DriverVO vo) {
		this.driverNum.setText(vo.getDriverNum());
		this.name.setText(vo.getName());
		this.phoneNum.setText(vo.getName());
		this.sex.setSelectedItem(vo.getSex());
		this.shopNum.setText(vo.getShopNum());
		this.phoneNum.setText(vo.getPhoneNum());
		this.idNum.setText(vo.getIdNum());
		this.licenseDue.setText(vo.getLicenseDue());
		this.birthDate.setText(vo.getBirthDate());
	}
}
