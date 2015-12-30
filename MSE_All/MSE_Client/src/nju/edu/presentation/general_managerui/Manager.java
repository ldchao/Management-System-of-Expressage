package nju.edu.presentation.general_managerui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PO.LoginPO;
import nju.edu.presentation.Loginui.PersonalInfomation;

public class Manager extends JPanel{
	private PersonalInfomation perinfo;
	
	public Manager(JFrame main,LoginPO loginPO) {
		Manager managerframe=this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		lblHello.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				perinfo = new PersonalInfomation(loginPO, main);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (perinfo.getMouseState() == true)
					perinfo.dispose();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				perinfo.setAlwaysOnTop(true);
				perinfo.setMouseState(false);
			}
		});
		setForeground(Color.WHITE);

		
		JLabel label = new JLabel("\u603B\u7ECF\u7406");
		label.setBounds(107, 10, 62, 23);
		add(label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffManager staffManager=new StaffManager(main,loginPO);
				main.remove(managerframe);
				main.getContentPane().add(staffManager);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(166, 140, 125, 100);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatics_Analysis checkStatics_Analysis=new checkStatics_Analysis(main,loginPO);
				main.remove(managerframe);
				main.getContentPane().add(checkStatics_Analysis);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(453, 140, 125, 100);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PolicyManage policyManage=new PolicyManage(main,loginPO);
				main.remove(managerframe);
				main.getContentPane().add(policyManage);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(166, 356, 125, 100);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListApprove newlistApprove=new ListApprove(main,loginPO);
				main.remove(managerframe);
				main.getContentPane().add(newlistApprove);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(453, 356, 125, 100);
		add(btnNewButton_3);
		
		JLabel label_1 = new JLabel("\u4EBA\u5458\u673A\u6784\u7BA1\u7406");
		label_1.setBounds(191, 115, 98, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u7B56\u7565\u7BA1\u7406");
		label_2.setBounds(205, 327, 54, 15);
		add(label_2);
		
		JLabel lblNewLabel = new JLabel("查看统计分析");
		lblNewLabel.setBounds(481, 115, 83, 15);
		add(lblNewLabel);
		
		JLabel label_3 = new JLabel("\u5355\u636E\u5BA1\u6279");
		label_3.setBounds(488, 327, 54, 15);
		add(label_3);
		
		String[] s={"1","2"};
	}
}
