package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import nju.edu.businesslogic.storebl.StoreMessageBL;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import PO.LoginPO;
import PO.OrganizationNumPO;

@SuppressWarnings("serial")
public class Changeorder_choose_TC extends JPanel {
	JFrame main;
	JCheckBox[] choose_jia = new JCheckBox[20];

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/TransitCenterSalesman/Changeorder_choose_TC.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("static-access")
	public Changeorder_choose_TC(JFrame m, JPanel jp, JPanel jp2, String qu,
			int pai, LoginPO loginPO) {
		main = m;
		JPanel lastui = jp;
		Changeorder_choose_TC nowPanel = this;
		setLayout(null);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		OrganizationNumPO op = new OrganizationNumPO();
		String transferNum = op.getNum(loginPO.getShop());

		JButton button = new JButton("");
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(image1);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button);

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 539, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("×´Ì¬À¸");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		for (int i = 0; i < choose_jia.length; i++) {
			choose_jia[i] = new JCheckBox((i + 1) + " ¼Ü");
			choose_jia[i].setBounds(140 + (i % 4) * 130, 150 + (i / 4) * 60,
					80, 25);
			choose_jia[i].setOpaque(false);
			choose_jia[i].setBorder(null);
			add(choose_jia[i]);
		}

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(269, 488, 52, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StoreinInfo storein = StoreMessageBL.getInstance(transferNum);
				boolean isValue = false;
				int[] jia = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0 };
				for (int i = 0; i < jia.length; i++) {
					if (choose_jia[i].isSelected()) {
						jia[i] = 1;
						isValue = true;
					}
				}
				if (isValue) {
					ArrayList<String> orderlist = storein.getId(qu + "Çø", pai,
							jia);
					Changeorder c = new Changeorder(main, nowPanel, jp2,
							loginPO, qu, pai, orderlist);
					main.remove(nowPanel);
					main.getContentPane().add(c);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				} else
					label_4.setText("ÇëÑ¡Ôñ¼ÜºÅ");
			}
		});
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(431, 487, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_choose_TC ctc = new Changeorder_choose_TC(main,
						lastui, jp2, qu, pai, loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(ctc);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		add(btnNewButton_1);
	}

}