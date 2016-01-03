package nju.edu.presentation.general_managerui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;
import State.SalaryModel;
import nju.edu.VO.SalaryVO;
import nju.edu.businesslogic.policybl.SalaryPolicybl;
import nju.edu.presentation.courierui.InputNumber;
import nju.edu.presentation.courierui.JTextFieldLimit;

@SuppressWarnings("serial")
public class editSalary extends JPanel implements Runnable {

	private JTextField textField;
	private JTextField textField_1;
	private SalaryModel salaryModel;
	JLabel label_4;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton radioButton;
	JRadioButton radioButton_1;
	ButtonGroup buttonGroup;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/generalManager/editSalary.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings("static-access")
	public editSalary(SalaryVO vo, JFrame main, LoginPO loginPO) {
		editSalary editSalary = this;
		setBounds(100, 100, 750, 600);
		setLayout(null);
		this.setVisible(true);
		// first
		rdbtnNewRadioButton = new JRadioButton("\u6309\u6708");
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBorder(null);
		rdbtnNewRadioButton.setBounds(371, 290, 83, 23);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				salaryModel = SalaryModel.ByMonth;
			}
		});
		add(rdbtnNewRadioButton);

		// second
		radioButton = new JRadioButton("\u6309\u6B21");
		radioButton.setBounds(371, 326, 83, 23);
		radioButton.setOpaque(false);
		radioButton.setBorder(null);
		radioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				salaryModel = salaryModel.ByTimes;
			}
		});
		add(radioButton);

		// third
		radioButton_1 = new JRadioButton("\u6309\u63D0\u6210");
		radioButton_1.setBounds(371, 366, 100, 23);
		radioButton_1.setOpaque(false);
		radioButton_1.setBorder(null);
		radioButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				salaryModel = salaryModel.ByBenefit;
			}
		});
		add(radioButton_1);

		buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton_1);

		if (vo.getTypeOfStrategy() == SalaryModel.ByMonth) {
			rdbtnNewRadioButton.setSelected(true);
			salaryModel = SalaryModel.ByMonth;
		} else if (vo.getTypeOfStrategy() == salaryModel.ByTimes) {
			radioButton.setSelected(true);
			salaryModel = salaryModel.ByTimes;
		} else {
			radioButton_1.setSelected(true);
			salaryModel = salaryModel.ByBenefit;
		}

		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "确认修改？", "no",
						JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					if (textField_1.getText().equals("")) {
						label_4.setText("请输入价格");
						Thread thread = new Thread(editSalary);
						thread.start();
					} else {
						SalaryVO salaryVO = new SalaryVO(textField.getText(),
								Double.parseDouble(textField_1.getText()),
								salaryModel);
						SalaryPolicybl salaryPolicybl = new SalaryPolicybl();
						salaryPolicybl.editSalary(salaryVO);
						Salary salary = new Salary(salaryVO, main, loginPO);
						main.remove(editSalary);
						main.getContentPane().add(salary);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
					}
				}
			}
		});
		btnNewButton.setBounds(283, 419, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salary salary = new Salary(vo, main, loginPO);
				main.remove(editSalary);
				main.getContentPane().add(salary);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
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

		add(button);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(373, 189, 108, 21);
		textField.setText(vo.getTypeOfStaff());
		textField.setEnabled(false);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setDocument(new JTextFieldLimit(7));
		textField_1.setBounds(373, 239, 108, 21);
		textField_1.addKeyListener(new InputNumber());
		textField_1.setText(vo.getSalary() + "");
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		add(textField_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 541, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		label_4 = new JLabel("\u72B6\u6001\u680F");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		JButton button2 = new JButton("取消");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editSalary neweditSalary = new editSalary(vo, main, loginPO);
				main.remove(editSalary);
				main.getContentPane().add(neweditSalary);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});

		button2.setBounds(416, 418, 52, 52);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button2.getWidth(),
				button2.getHeight(), image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button2.setIcon(image2);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		add(button2);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		label_4.setText("状态");
	}

}
