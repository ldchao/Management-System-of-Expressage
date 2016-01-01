package nju.edu.presentation.general_managerui;

import java.awt.Color;
import java.awt.Graphics;
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

@SuppressWarnings("serial")
public class SalaryManage extends JPanel {

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/generalManager/SalaryManage.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings({ "rawtypes", "static-access", "unchecked" })
	public SalaryManage(JFrame main, LoginPO loginPO) {
		SalaryManage salaryManageframe = this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);

		JLabel lblHello = new JLabel("Hello!" + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(677, 6, 67, 25);
		add(lblHello);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PolicyManage newpolicyManage = new PolicyManage(main, loginPO);
				main.remove(salaryManageframe);
				main.getContentPane().add(newpolicyManage);
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

		String[] type = { "快递员", "营业厅业务员", "中转中心业务员", "中转中心仓库管理员", "高级财务人员",
				"低级财务人员", "总经理", "管理员" };
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(361, 282, 122, 29);
		add(comboBox);

		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalaryPolicybl salaryPolicybl = new SalaryPolicybl();
				SalaryVO salaryVO = salaryPolicybl.checkSalary(comboBox
						.getSelectedItem().toString());
				Salary salary = new Salary(salaryVO, main, loginPO);
				main.remove(salaryManageframe);
				main.getContentPane().add(salary);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(348, 430, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button_1.getWidth(),
				button_1.getHeight(), image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button_1.setIcon(image1);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		add(button_1);
	}
}
