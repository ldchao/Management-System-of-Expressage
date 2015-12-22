package nju.edu.presentation.general_managerui;

import java.awt.Color;
import java.awt.Font;
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

public class Salary extends JPanel{

	private JTextField textField;
	private JTextField textField_1;
	private SalaryModel salaryModel;
	JLabel label_4;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton radioButton;
	JRadioButton radioButton_1 ;
	ButtonGroup buttonGroup;

	public Salary(SalaryVO vo, JFrame main,LoginPO loginPO) {
		Salary salary=this;
		setBounds(100, 100, 750,600);
		setLayout(null);
		this.setVisible(true);
		
		JLabel label = new JLabel("\u85AA\u6C34\u5177\u4F53\u4FE1\u606F");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 24));
		label.setBounds(283, 133, 179, 50);
		add(label);
		
		JLabel label_1 = new JLabel("\u804C\u4F4D\uFF1A");
		label_1.setBounds(219, 234, 54, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u85AA\u6C34\uFF08\u5143\uFF09\uFF1A");
		label_2.setBounds(219, 283, 93, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("\u85AA\u6C34\u6A21\u5F0F");
		label_3.setBounds(219, 333, 72, 15);
		add(label_3);
		//first
		rdbtnNewRadioButton = new JRadioButton("\u6309\u6708");
		rdbtnNewRadioButton.setBounds(307, 329, 54, 23);
		rdbtnNewRadioButton.setEnabled(false);
		add(rdbtnNewRadioButton);
		
		//second
		radioButton = new JRadioButton("\u6309\u6B21");
		radioButton.setBounds(363, 329, 54, 23);
		radioButton.setEnabled(false);
		add(radioButton);
		
		//third
		radioButton_1 = new JRadioButton("\u6309\u63D0\u6210");
		radioButton_1.setBounds(419, 329, 100, 23);
		radioButton_1.setEnabled(false);
		add(radioButton_1);
		
		buttonGroup=new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton_1);
		
		if(vo.getTypeOfStrategy()==SalaryModel.ByMonth){
			rdbtnNewRadioButton.setSelected(true);
			salaryModel=SalaryModel.ByMonth;
		}else if(vo.getTypeOfStrategy()==salaryModel.ByTimes){
			radioButton.setSelected(true);
			salaryModel=salaryModel.ByTimes;
		}else{
			radioButton_1.setSelected(true);
			salaryModel=salaryModel.ByBenefit;
		}
		
		JButton btnNewButton = new JButton("\u7F16\u8F91");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editSalary editSalary=new editSalary(vo,main,loginPO);
				main.remove(salary);
				main.getContentPane().add(editSalary);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(274, 459, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(btnNewButton.getWidth(),
				btnNewButton.getHeight(),image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalaryManage salaryManage=new SalaryManage(main,loginPO);	
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
		textField.setBounds(332, 231, 154, 21);
		textField.setText(vo.getTypeOfStaff());
		textField.setEditable(false);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(332, 280, 154, 21);
		textField_1.setText(vo.getSalary()+"");
		textField_1.setEditable(false);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		add(textField_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);
		
		label_4 = new JLabel("\u72B6\u6001");
		toolBar.add(label_4);
	}

}
