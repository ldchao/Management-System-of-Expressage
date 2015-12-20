package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PO.ConstantPO;
import nju.edu.VO.ConstantVO;
import nju.edu.businesslogic.policybl.ConstantPolicybl;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConstantManage extends JPanel {


	public ConstantManage(JFrame main) {
		ConstantManage constantManageframe=this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PolicyManage newpolicyManage=new PolicyManage(main);
				main.remove(constantManageframe);
				main.add(newpolicyManage);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 75, 23);
		add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u7B56\u7565\u7BA1\u7406>>\u5E38\u91CF\u7BA1\u7406");
		label.setBounds(95, 14, 211, 15);
		add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u9009\u62E9\u5730\u70B9\u4E00");
		label_1.setBounds(169, 194, 101, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u9009\u62E9\u5730\u70B9\u4E8C");
		label_2.setBounds(169, 288, 101, 15);
		add(label_2);
		
		String []city={"南京","北京","广州","上海"};
		JComboBox comboBox = new JComboBox(city);
		comboBox.setBounds(380, 187, 174, 29);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(city);
		comboBox_1.setBounds(380, 281, 174, 29);
		add(comboBox_1);
		
		JButton button_1 = new JButton("\u786E\u5B9A");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConstantPolicybl constantPolicybl=new ConstantPolicybl();
				ConstantVO vo=constantPolicybl.checkConstant(comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString());
				Constant constant=new Constant(vo,main);
				main.remove(constantManageframe);
				main.add(constant);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(304, 387, 93, 23);
		add(button_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 534, 724, 28);
		add(toolBar);
		
		JLabel lblNewLabel = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(lblNewLabel);
	}
}
