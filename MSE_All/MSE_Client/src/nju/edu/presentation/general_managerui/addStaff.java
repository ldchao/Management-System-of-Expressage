package nju.edu.presentation.general_managerui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
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

@SuppressWarnings("serial")
public class addStaff extends JPanel implements ItemListener, Runnable {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_1;
	private JRadioButton radioButton_2;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JRadioButton radioButton_6;
	private JButton button;
	private JButton button_1;
	JTextArea textArea;
	@SuppressWarnings("rawtypes")
	DefaultComboBoxModel citymodel;
	@SuppressWarnings("rawtypes")
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
	private JLabel label_8;
	private JTextField textField_3;
	Staffbl staffbl = new Staffbl();
	private addStaff thiStaff = this;
	private ManagerFrame main;
	private LoginPO loginPO;
	private boolean cleanSignal = false;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/generalManager/addStuff.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public addStaff(JFrame main, LoginPO loginPO) {
		this.loginPO = loginPO;
		this.main = (ManagerFrame) main;
		setBounds(100, 100, 750, 600);
		setLayout(null);
		this.setVisible(true);

		textField = new JTextField();
		textField.setBounds(212, 186, 125, 26);
		textField.setText(staffbl.getnum());
		textField.setEnabled(false);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(492, 187, 125, 26);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(212, 228, 125, 26);
		textField_2.setForeground(new Color(88, 93, 103));
		textField_2.setCaretColor(new Color(88, 93, 103));
		textField_2.setOpaque(false);
		textField_2.setBorder(null);
		add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(492, 228, 125, 26);
		textField_3.setForeground(new Color(88, 93, 103));
		textField_3.setCaretColor(new Color(88, 93, 103));
		textField_3.setOpaque(false);
		textField_3.setBorder(null);
		add(textField_3);

		rdbtnNewRadioButton = new JRadioButton("\u5FEB\u9012\u5458");
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBorder(null);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.setBounds(207, 349, 86, 23);
		add(rdbtnNewRadioButton);

		radioButton = new JRadioButton("\u7CFB\u7EDF\u7BA1\u7406\u5458");
		radioButton.setForeground(Color.WHITE);
		radioButton.setOpaque(false);
		radioButton.setBorder(null);
		radioButton.setEnabled(false);
		radioButton.setBounds(306, 349, 119, 23);
		add(radioButton);

		radioButton_1 = new JRadioButton("\u603B\u7ECF\u7406");
		radioButton_1.setForeground(Color.WHITE);
		radioButton_1.setOpaque(false);
		radioButton_1.setBorder(null);
		radioButton_1.setEnabled(false);
		radioButton_1.setBounds(430, 349, 69, 23);
		add(radioButton_1);
		// ��ʼ��
		citymodel = new DefaultComboBoxModel(city);
		comboBox = new JComboBox(citymodel);
		comboBox.setOpaque(false);
		comboBox.setBorder(null);
		comboBox.addItemListener(this);
		comboBox.setBounds(215, 307, 69, 21);
		add(comboBox);

		comboBoxModel = new DefaultComboBoxModel(position[0]);
		comboBox_1 = new JComboBox();
		comboBox_1.setOpaque(false);
		comboBox_1.setBorder(null);
		comboBox_1.setModel(comboBoxModel);
		comboBox_1.setBounds(214, 274, 126, 21);
		add(comboBox_1);

		radioButton_2 = new JRadioButton("\u8D22\u52A1\u4EBA\u5458");
		radioButton_2.setForeground(Color.WHITE);
		radioButton_2.setOpaque(false);
		radioButton_2.setBorder(null);
		radioButton_2.setEnabled(false);
		radioButton_2.setBounds(207, 395, 91, 23);
		add(radioButton_2);

		radioButton_3 = new JRadioButton("\u9AD8\u7EA7\u8D22\u52A1\u4EBA\u5458");
		radioButton_3.setForeground(Color.WHITE);
		radioButton_3.setOpaque(false);
		radioButton_3.setBorder(null);
		radioButton_3.setEnabled(false);
		radioButton_3.setBounds(306, 395, 119, 23);
		add(radioButton_3);

		radioButton_4 = new JRadioButton("\u8425\u4E1A\u5385\u4E1A\u52A1\u5458");
		radioButton_4.setForeground(Color.WHITE);
		radioButton_4.setOpaque(false);
		radioButton_4.setBorder(null);
		radioButton_4.setEnabled(false);
		radioButton_4.setBounds(430, 395, 97, 23);
		add(radioButton_4);

		radioButton_5 = new JRadioButton("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		radioButton_5.setForeground(Color.WHITE);
		radioButton_5.setOpaque(false);
		radioButton_5.setBorder(null);
		radioButton_5.setEnabled(false);
		radioButton_5.setBounds(533, 395, 119, 23);
		add(radioButton_5);

		radioButton_6 = new JRadioButton("\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u5458");
		radioButton_6.setForeground(Color.WHITE);
		radioButton_6.setOpaque(false);
		radioButton_6.setBorder(null);
		radioButton_6.setEnabled(false);
		radioButton_6.setBounds(532, 349, 146, 23);
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

		button = new JButton("");
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
		@SuppressWarnings("static-access")
		Image temp1 = image1.getImage().getScaledInstance(button.getWidth(), button.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button.setIcon(image1);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		add(button);

		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffManager staffManager = new StaffManager(main, loginPO);
				main.remove(thiStaff);
				main.getContentPane().add(staffManager);
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
		toolBar.setBounds(13, 542, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		label_8 = new JLabel("\u72B6\u6001\u680F");
		label_8.setForeground(Color.WHITE);
		toolBar.add(label_8);

		textArea = new JTextArea();
		textArea.setBounds(489, 271, 125, 61);
		textArea.setOpaque(false);
		textArea.setBorder(null);
		add(textArea);

		JButton button2 = new JButton("");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "ȷ����գ�", "no", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					addStaff addStaff = new addStaff(main, loginPO);
					main.remove(thiStaff);
					main.getContentPane().add(addStaff);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}
			}
		});
		button2.setBounds(425, 459, 52, 52);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		@SuppressWarnings("static-access")
		Image temp2 = image2.getImage().getScaledInstance(button2.getWidth(), button2.getHeight(),
				image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button2.setIcon(image2);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		add(button2);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
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
			main.getContentPane().add(staffManager);
			main.invalidate();
			main.repaint();
			main.setVisible(true);
		}
	}
}
