package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.VO.DriverVO;
import nju.edu.businesslogic.vehiclebl.DriverBl;
import nju.edu.businesslogicservice.vehicleblservice.DriverBlService;

@SuppressWarnings("serial")
public class DriverMainUI extends JPanel {
	private JTextField textField;
	private boolean isValid = false;
	private DriverVO vo;
	private DriverBlService driverBl = new DriverBl();

	public DriverMainUI(JFrame m, JPanel bf, LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = bf;
		DriverMainUI nowPanel = this;
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

		JLabel label = new JLabel("营业厅业务员>>司机信息管理");
		label.setBounds(100, 14, 200, 15);
		add(label);

		JLabel label_1 = new JLabel("Hello！" + loginPO.getName());
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(655, 12, 100, 15);
		setForeground(Color.WHITE);

		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(313, 240, 133, 26);
		add(textField);

		JLabel label_2 = new JLabel("司机姓名");
		label_2.setBounds(234, 239, 57, 28);
		add(label_2);

		JButton button_1 = new JButton("查询");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name = textField.getText();
				if (name.length() == 0) {
					label_4.setText("未输入司机姓名");
				} else {
					isValid = driverBl.searchDriver(name);
					if (isValid) {
						vo = driverBl.find(name);
						DriverImfo imfo = new DriverImfo(main, nowPanel,
								loginPO);
						imfo.show(vo);
						main.remove(nowPanel);
						main.getContentPane().add(imfo);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
					}

				}
			}
		});
		button_1.setBounds(221, 321, 105, 29);
		add(button_1);

		JButton button_2 = new JButton("新建");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DriverNew vn = new DriverNew(main, nowPanel, loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(vn);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_2.setBounds(345, 321, 105, 29);
		add(button_2);

	}

}
