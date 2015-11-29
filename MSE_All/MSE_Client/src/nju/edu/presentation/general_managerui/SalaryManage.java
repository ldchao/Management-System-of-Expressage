package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import nju.edu.VO.SalaryVO;
import nju.edu.businesslogic.policybl.SalaryPolicyblController;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SalaryManage extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SalaryManage() {
		SalaryManage salaryManageframe=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salaryManageframe.dispose();
				PolicyManage newpolicyManage=new PolicyManage();
			}
		});
		button.setBounds(10, 10, 75, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u7B56\u7565\u7BA1\u7406>>\u85AA\u6C34\u7BA1\u7406");
		label.setBounds(97, 14, 211, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u9009\u62E9\u4EBA\u5458\u7C7B\u578B");
		label_1.setBounds(327, 182, 94, 15);
		contentPane.add(label_1);
		
		String[] type={"快递员","营业厅业务员","中转中心业务员","中转中心仓库管理员","高级财务人员","低级财务人员","总经理","管理员"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(280, 235, 180, 29);
		contentPane.add(comboBox);

		
		JButton button_1 = new JButton("\u786E\u5B9A");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalaryPolicyblController salaryPolicyblController=new SalaryPolicyblController();
				SalaryVO salaryVO=salaryPolicyblController.checkSalary(comboBox.getSelectedItem().toString());
				Salary salary=new Salary(salaryVO);
				salaryManageframe.dispose();
			}
		});
		button_1.setBounds(328, 303, 93, 23);
		contentPane.add(button_1);
	}
}
