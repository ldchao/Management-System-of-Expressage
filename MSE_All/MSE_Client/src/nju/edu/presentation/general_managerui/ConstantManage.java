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
import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.VO.ConstantVO;
import nju.edu.businesslogic.policybl.ConstantPolicybl;

@SuppressWarnings("serial")
public class ConstantManage extends JPanel {

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/generalManager/ConstantManage.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings({ "rawtypes", "unchecked", "static-access" })
	public ConstantManage(JFrame main, LoginPO loginPO) {
		ConstantManage constantManageframe = this;
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
				main.remove(constantManageframe);
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

		String[] city = { "南京", "北京", "广州", "上海" };
		JComboBox comboBox = new JComboBox(city);
		comboBox.setBounds(380, 218, 174, 29);
		add(comboBox);

		JComboBox comboBox_1 = new JComboBox(city);
		comboBox_1.setBounds(380, 305, 174, 29);
		add(comboBox_1);

		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConstantPolicybl constantPolicybl = new ConstantPolicybl();
				ConstantVO vo = constantPolicybl.checkConstant(comboBox
						.getSelectedItem().toString(), comboBox_1
						.getSelectedItem().toString());
				Constant constant = new Constant(vo, main, loginPO);
				main.remove(constantManageframe);
				main.getContentPane().add(constant);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(352, 417, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button_1.getWidth(),
				button_1.getHeight(), image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button_1.setIcon(image1);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		add(button_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel lblNewLabel = new JLabel("\u72B6\u6001\u680F");
		lblNewLabel.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel);
	}
}
