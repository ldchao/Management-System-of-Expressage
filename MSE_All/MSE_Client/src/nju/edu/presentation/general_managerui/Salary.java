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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;
import State.SalaryModel;
import nju.edu.VO.SalaryVO;

@SuppressWarnings("serial")
public class Salary extends JPanel {

	private JTextField textField;
	private JTextField textField_1;
	private SalaryModel salaryModel;
	JLabel label_4;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton radioButton;
	JRadioButton radioButton_1;
	ButtonGroup buttonGroup;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/generalManager/Salary.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings("static-access")
	public Salary(SalaryVO vo, JFrame main, LoginPO loginPO) {
		Salary salary = this;
		setBounds(100, 100, 750, 600);
		setLayout(null);
		this.setVisible(true);
		// first
		rdbtnNewRadioButton = new JRadioButton("\u6309\u6708");
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(363, 290, 54, 23);
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBorder(null);
		rdbtnNewRadioButton.setEnabled(false);
		add(rdbtnNewRadioButton);

		// second
		radioButton = new JRadioButton("\u6309\u6B21");
		radioButton.setForeground(Color.WHITE);
		radioButton.setBounds(433, 290, 54, 23);
		radioButton.setOpaque(false);
		radioButton.setBorder(null);
		radioButton.setEnabled(false);
		add(radioButton);

		// third
		radioButton_1 = new JRadioButton("\u6309\u63D0\u6210");
		radioButton_1.setForeground(Color.WHITE);
		radioButton_1.setBounds(506, 290, 72, 23);
		radioButton_1.setOpaque(false);
		radioButton_1.setBorder(null);
		radioButton_1.setEnabled(false);
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

		JButton btnNewButton = new JButton("\u7F16\u8F91");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editSalary editSalary = new editSalary(vo, main, loginPO);
				main.remove(salary);
				main.getContentPane().add(editSalary);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(349, 424, 52, 52);
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
				SalaryManage salaryManage = new SalaryManage(main, loginPO);
				main.remove(salary);
				main.getContentPane().add(salaryManage);
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
		textField.setBounds(379, 190, 108, 21);
		textField.setText(vo.getTypeOfStaff());
		textField.setEditable(false);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(379, 239, 108, 21);
		textField_1.setText(vo.getSalary() + "");
		textField_1.setEditable(false);
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
	}

}
