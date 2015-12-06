package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.JCheckBox;

import nju.edu.businesslogic.storebl.StoreMessageBL;
import nju.edu.businesslogic.transferbl.TransferBL;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.businesslogicservice.transferblservice.TransferBLService;
import PO.LoginPO;

public class Changeorder_choose_TC extends JPanel {
	JFrame main;
	JCheckBox[] choose_jia = new JCheckBox[20];

	/**
	 * Create the panel.
	 */
	public Changeorder_choose_TC(JFrame m, JPanel jp,String qu,int pai,LoginPO loginPO) {
		main = m;
		JPanel lastui = jp;
		Changeorder_choose_TC nowPanel = this;
		setLayout(null);

		JButton button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 65, 23);
		add(button);

		JLabel label = new JLabel("中转中心业务员>>录入中转单>>新建中转单");
		label.setBounds(100, 14, 270, 15);
		add(label);

		JLabel label_1 = new JLabel(loginPO.getName()+"，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

		JLabel lblNewLabel_1 = new JLabel("选择要中转到外市中转中心的货物");
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD, 20));
		lblNewLabel_1.setBounds(197, 80, 338, 31);
		add(lblNewLabel_1);

		for (int i = 0; i < choose_jia.length; i++) {
			choose_jia[i]=new JCheckBox((i+1)+ " 架");
			choose_jia[i].setBounds(140 + (i % 4) * 130, 150 + (i / 4) * 60, 80, 25);
			add(choose_jia[i]);
		}

		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StoreinInfo storein=StoreMessageBL.getInstance();
				boolean isValue=false;
				int[] jia={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				for (int i = 0; i < jia.length; i++) {
					if (choose_jia[i].isSelected()) {
						jia[i]=1;
						isValue=true;
					}
				}
				if(isValue){
				ArrayList<String> orderlist=storein.getId(qu+"区", pai, jia);
				Changeorder c = new Changeorder(main, nowPanel,loginPO,qu,pai,orderlist);
				main.remove(nowPanel);
				main.getContentPane().add(c);
				main.invalidate();
				main.repaint();
				main.setVisible(true);}
				else label_4.setText("请选择架号");
			}
		});
		btnNewButton.setBounds(190, 474, 93, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_choose_TC ctc = new Changeorder_choose_TC(main,
						lastui,qu,pai,loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(ctc);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(425, 474, 93, 23);
		add(btnNewButton_1);
	}

}