package nju.edu.presentation.general_managerui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.VO.StaffVO;
import nju.edu.businesslogic.staffbl.Staffbl;

public class addStaff extends JPanel implements ItemListener, Runnable {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JLabel label_5;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JRadioButton radioButton_2;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JRadioButton radioButton_6;
	private JButton button;
	private JButton button_1;
	JTextArea textArea;
	DefaultComboBoxModel citymodel;
	DefaultComboBoxModel comboBoxModel;
	String[] city = { "�Ͼ�", "����", "����", "�Ϻ�" };
	String[][] position = {
			{ "��ת����", "��¥��Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "�ػ���Ӫҵ��", "��ϼ��Ӫҵ��", "������Ӫҵ��", "�ֿ���Ӫҵ��", "������Ӫҵ��", "�ߴ���Ӫҵ��",
					"��ˮ��Ӫҵ��" },
			{ "��ת����", "������Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "ʯ��ɽ��Ӫҵ��", "������Ӫҵ��", "��̨��Ӫҵ��", "��ɽ��Ӫҵ��",
					"������Ӫҵ��", "ͨ����Ӫҵ��", "��ͷ����Ӫҵ��", "��ƽ��Ӫҵ��", "˳����Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "ƽ����Ӫҵ��", "������Ӫҵ��", "��ѧ��Ӫҵ��",
					"�йش�Ӫҵ��" },
			{ "��ת����", "Խ����Ӫҵ��", "�����Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "�ܸ���Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "��خ��Ӫҵ��", "������Ӫҵ��",
					"��ɳ��Ӫҵ��", "�ӻ���Ӫҵ��", "������Ӫҵ��", "��ɽ��Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��" },
			{ "��ת����", "������Ӫҵ��", "�����Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "�����Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "��ɽ��Ӫҵ��",
					"�ζ���Ӫҵ��", "�ֶ�����Ӫҵ��", "��ɽ��Ӫҵ��", "�ɽ���Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "������Ӫҵ��", "��ҵ��Ӫҵ��", "������Ӫҵ��", "��ó��Ӫҵ��",
					"������Ӫҵ��" } };
	private JLabel label_7;
	private JLabel label_8;
	private JTextField textField_3;
	Staffbl staffbl = new Staffbl();
	private addStaff thiStaff = this;
	private ManagerFrame main;
	private LoginPO loginPO;
	private boolean cleanSignal = false;

	public addStaff(JFrame main, LoginPO loginPO) {
		this.loginPO = loginPO;
		this.main = (ManagerFrame) main;
		setBounds(100, 100, 750, 600);
		setLayout(null);
		this.setVisible(true);

		textField = new JTextField();
		textField.setBounds(106, 130, 205, 21);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(454, 130, 205, 21);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(106, 186, 205, 21);
		textField_2.setForeground(new Color(88, 93, 103));
		textField_2.setCaretColor(new Color(88, 93, 103));
		add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(454, 186, 205, 21);
		textField_3.setForeground(new Color(88, 93, 103));
		textField_3.setCaretColor(new Color(88, 93, 103));
		add(textField_3);

		JLabel label = new JLabel("\u4EBA\u5458\u5177\u4F53\u4FE1\u606F");
		label.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		label.setBounds(312, 68, 96, 15);
		add(label);

		JLabel label_1 = new JLabel("\u7528\u6237\u540D");
		label_1.setBounds(58, 133, 54, 15);
		add(label_1);

		label_2 = new JLabel("\u59D3\u540D");
		label_2.setBounds(401, 133, 54, 15);
		add(label_2);

		label_3 = new JLabel("\u7535\u8BDD");
		label_3.setBounds(58, 189, 54, 15);
		add(label_3);

		label_4 = new JLabel("\u804C\u4F4D");
		label_4.setBounds(58, 336, 54, 15);
		add(label_4);

		rdbtnNewRadioButton = new JRadioButton("\u5FEB\u9012\u5458");
		rdbtnNewRadioButton.setBounds(118, 332, 86, 23);
		add(rdbtnNewRadioButton);

		radioButton = new JRadioButton("\u7CFB\u7EDF\u7BA1\u7406\u5458");
		radioButton.setBounds(235, 332, 126, 23);
		add(radioButton);

		radioButton_1 = new JRadioButton("\u603B\u7ECF\u7406");
		radioButton_1.setBounds(374, 332, 123, 23);
		add(radioButton_1);

		label_5 = new JLabel("\u5355\u4F4D");
		label_5.setBounds(58, 242, 54, 15);
		add(label_5);
		// ��ʼ��
		citymodel = new DefaultComboBoxModel(city);
		comboBox = new JComboBox(citymodel);
		comboBox.addItemListener(this);
		comboBox.setBounds(106, 239, 69, 21);
		add(comboBox);

		comboBoxModel = new DefaultComboBoxModel(position[0]);
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(comboBoxModel);
		comboBox_1.setBounds(185, 239, 126, 21);
		add(comboBox_1);

		radioButton_2 = new JRadioButton("\u8D22\u52A1\u4EBA\u5458");
		radioButton_2.setBounds(515, 332, 119, 23);
		add(radioButton_2);

		radioButton_3 = new JRadioButton("\u9AD8\u7EA7\u8D22\u52A1\u4EBA\u5458");
		radioButton_3.setBounds(118, 374, 119, 23);
		add(radioButton_3);

		radioButton_4 = new JRadioButton("\u8425\u4E1A\u5385\u4E1A\u52A1\u5458");
		radioButton_4.setBounds(235, 374, 97, 23);
		add(radioButton_4);

		radioButton_5 = new JRadioButton("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		radioButton_5.setBounds(374, 374, 139, 23);
		add(radioButton_5);

		radioButton_6 = new JRadioButton("\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u5458");
		radioButton_6.setBounds(515, 374, 154, 23);
		add(radioButton_6);

		ButtonGroup bg = new ButtonGroup();
		bg.add(radioButton);
		bg.add(radioButton_1);
		bg.add(radioButton_2);
		bg.add(radioButton_3);
		bg.add(radioButton_4);
		bg.add(radioButton_5);
		bg.add(radioButton_6);
		bg.add(rdbtnNewRadioButton);

		button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "ȷ���½���", "no", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					String position = "";
					Enumeration<AbstractButton> raditEnumeration = bg.getElements();

					do {
						AbstractButton abstractButton = raditEnumeration.nextElement();
						if (abstractButton.isSelected()) {
							position = abstractButton.getText();
						}
					} while (raditEnumeration.hasMoreElements());

					StaffVO vo = new StaffVO(textField.getText().trim(), textField_1.getText().trim(),
							textArea.getText().trim(), position, textField_2.getText().trim(),
							textField_3.getText().trim(),
							comboBox.getSelectedItem().toString() + "," + comboBox_1.getSelectedItem().toString());
					if (staffbl.JudgeNull(vo)) {
						label_8.setText("��Ϣ���������벹ȫ��Ϣ");
					} else {
						if(staffbl.checkStaff(textField.getText())!=null){
							label_8.setText("���û����Ѵ���");
						}else{
							staffbl.addStaff(vo);
							label_8.setText("�½��ɹ�");
							button.setEnabled(true);
							cleanSignal = true;
						}
					}
					Thread thread = new Thread(thiStaff);
					thread.start();
				}
			}
		});
		button.setBounds(274, 459, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button.getWidth(), button.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button.setIcon(image1);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		add(button);

		button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffManager staffManager = new StaffManager(main, loginPO);
				main.remove(thiStaff);
				main.add(staffManager);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(13, -9, 63, 63);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_1.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});

		add(button_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		label_8 = new JLabel("\u72B6\u6001");
		toolBar.add(label_8);

		JLabel label_6 = new JLabel("\u5730\u5740");
		label_6.setBounds(401, 242, 54, 15);
		add(label_6);

		label_7 = new JLabel("\u624B\u673A");
		label_7.setBounds(401, 189, 54, 15);
		add(label_7);

		textArea = new JTextArea();
		textArea.setBounds(454, 242, 205, 61);
		add(textArea);

		JButton button2 = new JButton("���");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "ȷ����գ�", "no", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					addStaff addStaff = new addStaff(main, loginPO);
					main.remove(thiStaff);
					main.add(addStaff);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}
			}
		});
		button2.setBounds(425, 459, 52, 52);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button2.getWidth(), button2.getHeight(),
				image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button2.setIcon(image2);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		add(button2);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < city.length; i++) {
			if (e.getSource() == comboBox) {
				comboBox_1.setModel(new DefaultComboBoxModel(position[comboBox.getSelectedIndex()]));
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		label_8.setText("״̬");
		if (cleanSignal == true) {
			StaffManager staffManager = new StaffManager(main, loginPO);
			main.remove(thiStaff);
			main.add(staffManager);
			main.invalidate();
			main.repaint();
			main.setVisible(true);
		}
	}
}
