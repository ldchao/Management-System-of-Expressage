package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import nju.edu.VO.SalaryVO;
import nju.edu.businesslogic.policybl.SalaryPolicybl;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SalaryManage extends JPanel {

	 
	public SalaryManage(JFrame main) {
		SalaryManage salaryManageframe=this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PolicyManage newpolicyManage=new PolicyManage(main);
				main.remove(salaryManageframe);
				main.add(newpolicyManage);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 75, 23);
		add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u7B56\u7565\u7BA1\u7406>>\u85AA\u6C34\u7BA1\u7406");
		label.setBounds(97, 14, 211, 15);
		add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u9009\u62E9\u4EBA\u5458\u7C7B\u578B");
		label_1.setBounds(327, 182, 94, 15);
		add(label_1);
		
		String[] type={"快递员","营业厅业务员","中转中心业务员","中转中心仓库管理员","高级财务人员","低级财务人员","总经理","管理员"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(280, 235, 180, 29);
		add(comboBox);

		
		JButton button_1 = new JButton("\u786E\u5B9A");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalaryPolicybl salaryPolicybl=new SalaryPolicybl();
				SalaryVO salaryVO=salaryPolicybl.checkSalary(comboBox.getSelectedItem().toString());
				Salary salary=new Salary(salaryVO,main);
				main.remove(salaryManageframe);
				main.add(salary);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(328, 303, 93, 23);
		add(button_1);
	}
}
