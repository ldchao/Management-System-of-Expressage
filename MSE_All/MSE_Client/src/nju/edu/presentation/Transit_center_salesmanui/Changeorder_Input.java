package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Color;
import java.awt.Font;
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

public class Changeorder_Input extends JPanel {
	JFrame main;
	JRadioButton[] pai = new JRadioButton[10];

	/**
	 * Create the panel.
	 */
	public Changeorder_Input(JFrame m, JPanel jp,JPanel jp2,LoginPO loginPO) {
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

		JLabel label = new JLabel("中转中心业务员>>录入中转单>>新建中转单");
		label.setBounds(100, 14, 270, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JLabel lblNewLabel = new JLabel("航运区");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel.setBounds(130, 155, 72, 15);
		add(lblNewLabel);

		JLabel label_2 = new JLabel("铁运区");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_2.setBounds(130, 225, 91, 15);
		add(label_2);

		JLabel label_3 = new JLabel("汽运区");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_3.setBounds(130, 295, 72, 15);
		add(label_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

		JLabel lblNewLabel_1 = new JLabel("选择库区和排号");
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD, 20));
		lblNewLabel_1.setBounds(300, 72, 171, 52);
		add(lblNewLabel_1);

		ButtonGroup bg = new ButtonGroup();

		for (int i = 0; i < pai.length; i++) {
			pai[i] = new JRadioButton(((i == 9 ? 3 : (i % 3)) + 1) + " 排");
			pai[i].setBounds(260 + (i % 3) * 120, 150 + (i / 3) * 70, 70, 25);
			add(pai[i]);
			bg.add(pai[i]);
		}

		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBounds(203, 448, 52, 52);
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
								main, nowPanel,jp2, qu[quNum], paiNum,loginPO);
						main.remove(nowPanel);
						main.getContentPane().add(ctb);
					} else {
						Changeorder_choose_TC ctc = new Changeorder_choose_TC(
								main, nowPanel,jp2, qu[quNum], paiNum,loginPO);
						main.remove(nowPanel);
						main.getContentPane().add(ctc);
					}
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}
			}
		});		
		Image temp1 = image1.getImage().getScaledInstance(btnNewButton.getWidth(),
						btnNewButton.getHeight(),image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setBounds(379, 448, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_Input ti = new Changeorder_Input(main, lastui,jp2,loginPO);
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