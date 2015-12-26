package nju.edu.presentation.Business_hall_salesmanui;

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
import javax.swing.JToolBar;

import PO.LoginPO;
import State.DriverState;
import nju.edu.VO.DriverVO;
import nju.edu.businesslogic.vehiclebl.DriverBl;
import nju.edu.businesslogicservice.vehicleblservice.DriverBlService;
import nju.edu.presentation.financial_staffui.DateChooser;

import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Image;

@SuppressWarnings("serial")
public class DriverNew extends JPanel {
	private JTextField driverNum;
	private JTextField name;
	private JTextField shopNum;
	private JTextField phoneNum;
	private JTextField idNum;
	private JLabel licenseDue;
	private JLabel birthDate;
	private DriverBlService driverBl = new DriverBl();

	@SuppressWarnings("static-access")
	public DriverNew(JFrame m, JPanel bf, LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = bf;
		DriverNew nowPanel = this;
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

		JLabel label = new JLabel("Ӫҵ��ҵ��Ա>>˾����Ϣ����");
		label.setBounds(100, 14, 200, 15);
		add(label);

		JLabel label_1 = new JLabel("Hello��" + loginPO.getName());
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(655, 12, 100, 15);
		setForeground(Color.WHITE);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);

		driverNum = new JTextField();
		driverNum.setForeground(new Color(88, 93, 103));
		driverNum.setCaretColor(new Color(88, 93, 103));
		driverNum.setColumns(10);
		driverNum.setBounds(212, 319, 106, 26);
		add(driverNum);

		JLabel label_2 = new JLabel("˾�����");
		label_2.setBounds(133, 318, 57, 28);
		add(label_2);

		name = new JTextField();
		name.setForeground(new Color(88, 93, 103));
		name.setCaretColor(new Color(88, 93, 103));
		name.setColumns(10);
		name.setBounds(212, 357, 106, 26);
		add(name);

		JLabel label_3 = new JLabel("˾������");
		label_3.setBounds(133, 357, 57, 28);
		add(label_3);

		JLabel label_5 = new JLabel("Ӫҵ�����");
		label_5.setBounds(133, 438, 67, 28);
		add(label_5);

		shopNum = new JTextField();
		shopNum.setForeground(new Color(88, 93, 103));
		shopNum.setCaretColor(new Color(88, 93, 103));
		shopNum.setColumns(10);
		shopNum.setBounds(212, 438, 106, 26);
		add(shopNum);

		JLabel label_6 = new JLabel("�ֻ�����");
		label_6.setBounds(382, 319, 57, 28);
		add(label_6);

		phoneNum = new JTextField();
		phoneNum.setForeground(new Color(88, 93, 103));
		phoneNum.setCaretColor(new Color(88, 93, 103));
		phoneNum.setColumns(10);
		phoneNum.setBounds(461, 320, 106, 26);
		add(phoneNum);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		birthDate = new JLabel("�뵥��ѡ������");
		birthDate.setBounds(468, 403, 93, 23);
		dateChooser2.register(birthDate);
		add(birthDate);

		JLabel label_7 = new JLabel("��������");
		label_7.setBounds(382, 400, 57, 28);
		add(label_7);

		JLabel label_8 = new JLabel("��ʻ֤����");
		label_8.setBounds(382, 438, 74, 28);
		add(label_8);

		DateChooser dateChooser = DateChooser.getInstance("yyyy-MM-dd");
		licenseDue = new JLabel("�뵥��ѡ������");
		licenseDue.setBounds(468, 441, 93, 23);
		dateChooser.register(licenseDue);
		add(licenseDue);

		JLabel label_10 = new JLabel("�Ա�");
		label_10.setBounds(133, 397, 57, 28);
		add(label_10);

		JComboBox<String> sex = new JComboBox<>();
		sex.addItem("��ѡ��");
		sex.addItem("��");
		sex.addItem("Ů");
		sex.setBounds(213, 398, 105, 28);
		add(sex);

		JLabel label_11 = new JLabel("���֤��");
		label_11.setBounds(382, 357, 57, 28);
		add(label_11);

		idNum = new JTextField();
		idNum.setForeground(new Color(88, 93, 103));
		idNum.setCaretColor(new Color(88, 93, 103));
		idNum.setColumns(10);
		idNum.setBounds(461, 357, 106, 26);
		add(idNum);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(268, 104, 160, 160);
		add(panel);

		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.setBounds(274, 459, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (driverNum.getText().length() == 0
						|| name.getText().length() == 0
						|| shopNum.getText().length() == 0
						|| phoneNum.getText().length() == 0
						|| idNum.getText().length() == 0
						|| sex.getSelectedItem().equals("��ѡ��")
						|| birthDate.getText().equals("�뵥��ѡ������")
						|| licenseDue.getText().equals("�뵥��ѡ������")) {
					label_4.setText("��Ϣδ��д������");

				} else {
					DriverVO vo = new DriverVO(driverNum.getText(), name
							.getText(), shopNum.getText(), birthDate.getText(),
							idNum.getText(), phoneNum.getText(), sex
									.getSelectedItem().toString(), licenseDue
									.getText(), DriverState.Available);
					driverBl.addDriver(vo);
					label_4.setText("�½��ɹ���");
				}
			}
		});
		add(btnNewButton);

		JButton button_1 = new JButton("ȡ��");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setIcon(image1);
		button_1.setBounds(425, 459, 52, 52);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);

		add(button_1);

	}
}
