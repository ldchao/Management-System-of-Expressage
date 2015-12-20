package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import State.SalaryModel;
import nju.edu.VO.SalaryVO;
import nju.edu.businesslogic.policybl.SalaryPolicybl;
import nju.edu.presentation.courierui.InputNumber;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editSalary extends JPanel{

	private JTextField textField;
	private JTextField textField_1;
	private SalaryModel salaryModel;
	JLabel label_4;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton radioButton;
	JRadioButton radioButton_1 ;
	ButtonGroup buttonGroup;

	public editSalary(SalaryVO vo,JFrame main) {
		editSalary editSalary=this;
		setBounds(100, 100, 750,600);
		setLayout(null);
		this.setVisible(true);
		
		JLabel label = new JLabel("\u85AA\u6C34\u5177\u4F53\u4FE1\u606F");
		label.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 24));
		label.setBounds(283, 133, 179, 50);
		add(label);
		
		JLabel label_1 = new JLabel("\u804C\u4F4D\uFF1A");
		label_1.setBounds(219, 234, 54, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u85AA\u6C34\uFF08\u5143\uFF09\uFF1A");
		label_2.setBounds(219, 283, 72, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("\u85AA\u6C34\u6A21\u5F0F");
		label_3.setBounds(219, 333, 72, 15);
		add(label_3);
		//first
		rdbtnNewRadioButton = new JRadioButton("\u6309\u6708");
		rdbtnNewRadioButton.setBounds(307, 329, 54, 23);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				salaryModel=SalaryModel.ByMonth;
			}
		});
		add(rdbtnNewRadioButton);
		
		//second
		radioButton = new JRadioButton("\u6309\u6B21");
		radioButton.setBounds(363, 329, 54, 23);
		radioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				salaryModel=salaryModel.ByTimes;
			}
		});
		add(radioButton);
		
		//third
		radioButton_1 = new JRadioButton("\u6309\u63D0\u6210");
		radioButton_1.setBounds(419, 329, 100, 23);
		radioButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				salaryModel=salaryModel.ByBenefit;
			}
		});
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
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText().equals("")){
					label_4.setText("«Î ‰»Îº€∏Ò");
				}else{
					SalaryVO salaryVO=new SalaryVO(textField.getText(), Double.parseDouble(textField_1.getText()), salaryModel);
					SalaryPolicybl salaryPolicybl=new SalaryPolicybl();
					salaryPolicybl.editSalary(salaryVO);
					Salary salary=new Salary(salaryVO,main);
					main.remove(editSalary);
					main.add(salary);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(219, 391, 93, 23);
		add(btnNewButton);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salary salary=new Salary(vo,main);
				main.remove(editSalary);
				main.add(salary);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(393, 391, 93, 23);
		add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(332, 231, 154, 21);
		textField.setText(vo.getTypeOfStaff());
		textField.setEditable(false);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(332, 280, 154, 21);
		textField_1.addKeyListener(new InputNumber());
		textField_1.setText(vo.getSalary()+"");
		add(textField_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 533, 714, 28);
		add(toolBar);
		
		label_4 = new JLabel("\u72B6\u6001");
		toolBar.add(label_4);
	}

}
