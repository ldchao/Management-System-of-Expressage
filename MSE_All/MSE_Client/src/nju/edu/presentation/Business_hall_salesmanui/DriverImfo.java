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
import State.DriverState;
import nju.edu.VO.DriverVO;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
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

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/businessHall_stuff/DriverImfo.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	public DriverImfo(JFrame m, JPanel bf, LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = bf;
		DriverImfo nowPanel = this;
		setLayout(null);

		JButton button = new JButton("");

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
		button.setBounds(13, -9, 63, 63);
		add(button);

		JLabel label_1 = new JLabel("Hello£¡" + loginPO.getName());
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(655, 12, 100, 15);
		setForeground(Color.WHITE);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 541, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("×´Ì¬À¸");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		@SuppressWarnings("unused")
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(267, 96, 214, 144);
		add(panel);

		driverNum = new JLabel("New label");
		driverNum.setBounds(255, 276, 107, 16);
		add(driverNum);

		name = new JLabel("New label");
		name.setBounds(255, 314, 107, 16);
		add(name);

		sex = new JLabel("New label");
		sex.setBounds(255, 357, 107, 16);
		add(sex);

		shopNum = new JLabel("New label");
		shopNum.setBounds(255, 396, 107, 16);
		add(shopNum);

		phoneNum = new JLabel("New label");
		phoneNum.setBounds(506, 276, 107, 16);
		add(phoneNum);

		idNum = new JLabel("New label");
		idNum.setBounds(506, 314, 107, 16);
		add(idNum);

		birthDate = new JLabel("New label");
		birthDate.setBounds(506, 357, 107, 16);
		add(birthDate);

		licenseDue = new JLabel("New label");
		licenseDue.setBounds(506, 396, 107, 16);
		add(licenseDue);

		status = new JLabel("New label");
		status.setBounds(255, 435, 107, 16);
		add(status);

		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DriverChange driverChange = new DriverChange(main, nowPanel,
						loginPO);
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
				DriverVO vo = new DriverVO(driverNum.getText(), name.getText(),
						shopNum.getText(), birthDate.getText(),
						idNum.getText(), phoneNum.getText(), sex.getText(),
						licenseDue.getText(), state);
				driverChange.show(vo);
				main.remove(nowPanel);
				main.getContentPane().add(driverChange);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(345, 480, 52, 52);
		add(button_1);

	}

	public void show(DriverVO vo) {
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
