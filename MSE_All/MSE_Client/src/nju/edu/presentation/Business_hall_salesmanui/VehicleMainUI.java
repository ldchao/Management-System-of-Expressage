package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
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
import nju.edu.VO.VehicleVO;
import nju.edu.businesslogic.vehiclebl.VehicleBl;
import nju.edu.businesslogicservice.vehicleblservice.VehicleBlService;

@SuppressWarnings("serial")
public class VehicleMainUI extends JPanel {
	private JTextField textField;
	private boolean isValid = false;
	private VehicleVO vo;
	private VehicleBlService vehicleBl = new VehicleBl();

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/businessHall_stuff/VehicleMainUI.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	public VehicleMainUI(JFrame m, JPanel bf, LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = bf;
		VehicleMainUI nowPanel = this;
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

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		setForeground(Color.WHITE);
		add(lblHello);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 542, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("◊¥Ã¨¿∏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		textField = new JTextField("«Î ‰»Î≥µ¡æ¥˙∫≈");
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 20));
		textField.setForeground(new Color(255, 255, 255,100));
		textField.setCaretColor(new Color(248, 179, 28,230));
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 25));
				textField.setForeground(new Color(255, 255, 255, 200));
			}
		});
		textField.setColumns(10);
		textField.setBounds(204, 245, 345, 45);
		add(textField);

		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String carNum = textField.getText();
				if (carNum.length() == 0) {
					label_4.setText("Œ¥ ‰»Î≥µ¡æ¥˙∫≈");
				} else {
					isValid = vehicleBl.searchVehicle(carNum);
					if (isValid) {
						vo = vehicleBl.find(carNum);
						VehicleImfo imfo = new VehicleImfo(main, nowPanel,
								loginPO);
						imfo.show(vo);
						main.remove(nowPanel);
						main.getContentPane().add(imfo);
						main.invalidate();
						main.repaint();
					}

				}
			}
		});
		button_1.setBounds(280, 310, 52, 52);
		add(button_1);

		JButton button_2 = new JButton("");
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VehicleNew vn = new VehicleNew(main, nowPanel, loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(vn);
				main.invalidate();
				main.repaint();
			}
		});
		button_2.setBounds(411, 309, 52, 52);
		add(button_2);

	}

}
