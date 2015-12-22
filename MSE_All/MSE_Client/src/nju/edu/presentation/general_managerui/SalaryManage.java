package nju.edu.presentation.general_managerui;

import java.awt.Color;
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

import PO.LoginPO;
import nju.edu.VO.SalaryVO;
import nju.edu.businesslogic.policybl.SalaryPolicybl;

public class SalaryManage extends JPanel {

	 
	public SalaryManage(JFrame main,LoginPO loginPO) {
		SalaryManage salaryManageframe=this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);
		
		JLabel lblHello = new JLabel("Hello!"+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(677, 6, 67, 25);
		add(lblHello);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PolicyManage newpolicyManage=new PolicyManage(main,loginPO);
				main.remove(salaryManageframe);
				main.add(newpolicyManage);
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
				Salary salary=new Salary(salaryVO,main,loginPO);
				main.remove(salaryManageframe);
				main.add(salary);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(274, 459, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button_1.getWidth(),
						button_1.getHeight(),image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button_1.setIcon(image1);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		add(button_1);
	}
}
