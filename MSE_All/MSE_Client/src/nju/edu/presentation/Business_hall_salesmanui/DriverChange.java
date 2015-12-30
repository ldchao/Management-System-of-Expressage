package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.VO.DriverVO;
import nju.edu.businesslogic.vehiclebl.DriverBl;
import nju.edu.businesslogicservice.vehicleblservice.DriverBlService;
import nju.edu.presentation.financial_staffui.DateChooser;

@SuppressWarnings("serial")
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
	
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/businessHall_stuff/DriverChange.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}


	public DriverChange(JFrame m, JPanel bf, LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = bf;
		DriverChange nowPanel = this;
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

		JLabel label_1 = new JLabel("Hello！" + loginPO.getName());
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(655, 12, 100, 15);
		setForeground(Color.WHITE);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 541, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);
		toolBar.setEnabled(false);

		driverNum = new JTextField();
		driverNum.setOpaque(false);
		driverNum.setBorder(null);
		driverNum.setForeground(new Color(88, 93, 103));
		driverNum.setCaretColor(new Color(88, 93, 103));
		driverNum.setColumns(10);
		driverNum.setBounds(215, 276, 130, 26);
		add(driverNum);

		name = new JTextField();
		name.setOpaque(false);
		name.setBorder(null);
		name.setForeground(new Color(88, 93, 103));
		name.setCaretColor(new Color(88, 93, 103));
		name.setColumns(10);
		name.setBounds(215, 319, 126, 26);
		add(name);

		shopNum = new JTextField();
		shopNum.setOpaque(false);
		shopNum.setBorder(null);
		shopNum.setForeground(new Color(88, 93, 103));
		shopNum.setCaretColor(new Color(88, 93, 103));
		shopNum.setColumns(10);
		shopNum.setBounds(215, 404, 119, 26);
		add(shopNum);

		phoneNum = new JTextField();
		phoneNum.setOpaque(false);
		phoneNum.setBorder(null);
		phoneNum.setForeground(new Color(88, 93, 103));
		phoneNum.setCaretColor(new Color(88, 93, 103));
		phoneNum.setColumns(10);
		phoneNum.setBounds(499, 276, 120, 26);
		add(phoneNum);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		birthDate = new JLabel("请单击选择日期");
		birthDate.setBounds(499, 363, 93, 23);
		dateChooser2.register(birthDate);
		add(birthDate);

		DateChooser dateChooser = DateChooser.getInstance("yyyy-MM-dd");
		licenseDue = new JLabel("请单击选择日期");
		licenseDue.setBounds(499, 407, 93, 23);
		dateChooser.register(licenseDue);
		add(licenseDue);

		sex = new JComboBox<>();
		sex.addItem("请选择");
		sex.addItem("男");
		sex.addItem("女");
		sex.setBounds(213, 363, 121, 28);
		add(sex);

		idNum = new JTextField();
		idNum.setOpaque(false);
		idNum.setBorder(null);
		idNum.setForeground(new Color(88, 93, 103));
		idNum.setCaretColor(new Color(88, 93, 103));
		idNum.setColumns(10);
		idNum.setBounds(499, 317, 120, 26);
		add(idNum);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(264, 91, 215, 146);
		add(panel);

		JButton btnNewButton = new JButton("");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);

		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		btnNewButton.setBounds(274, 459, 52, 52);
		@SuppressWarnings("static-access")
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DriverVO vo1 = bl.find(name.getText());
				DriverVO vo = new DriverVO(driverNum.getText(), name.getText(),
						shopNum.getText(), birthDate.getText(),
						idNum.getText(), phoneNum.getText(), sex
								.getSelectedItem().toString(), licenseDue
								.getText(), vo1.getDriverState());
				bl.updateDriver(vo);
			}
		});
		add(btnNewButton);

		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBounds(425, 459, 52, 52);
		button_1.setIcon(image1);
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
