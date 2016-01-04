package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import PO.LoginPO;

@SuppressWarnings("serial")
public class Changeorder_Input extends JPanel {
	JFrame main;
	JRadioButton[] pai = new JRadioButton[10];

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/TransitCenterSalesman/Changeorder_Input.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("static-access")
	public Changeorder_Input(JFrame m, JPanel jp, JPanel jp2, LoginPO loginPO) {
		main = m;
		JPanel lastui = jp;
		Changeorder_Input nowPanel = this;
		setLayout(null);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");

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
		toolBar.setBounds(8, 541, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		ButtonGroup bg = new ButtonGroup();

		for (int i = 0; i < pai.length; i++) {
			pai[i] = new JRadioButton(((i == 9 ? 3 : (i % 3)) + 1) + " 排");
			pai[i].setBounds(260 + (i % 3) * 120, 175 + (i / 3) * 80, 70, 25);
			add(pai[i]);
			pai[i].setOpaque(false);
			pai[i].setBorder(null);
			bg.add(pai[i]);
		}

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(268, 479, 52, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quNum = 0, paiNum = 0;
				String[] qu = { "航运", "铁运", "汽运" };
				for (int i = 0; i < pai.length; i++) {
					if (pai[i].isSelected()) {
						quNum = (i == 9 ? 2 : (i / 3));
						paiNum = (i == 9 ? 4 : (i % 3 + 1));
					}
				}
				if (paiNum == 0) {
					label_4.setText("请选择对应库区的排号");
				} else {
					if (paiNum == 4) {
						Changeorder_choose_BH ctb = new Changeorder_choose_BH(
								main, nowPanel, jp2, qu[quNum], paiNum, loginPO);
						main.remove(nowPanel);
						main.getContentPane().add(ctb);
					} else {
						Changeorder_choose_TC ctc = new Changeorder_choose_TC(
								main, nowPanel, jp2, qu[quNum], paiNum, loginPO);
						main.remove(nowPanel);
						main.getContentPane().add(ctc);
					}
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}
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
		btnNewButton_1.setBounds(428, 482, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_Input ti = new Changeorder_Input(main, lastui, jp2,
						loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(ti);
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