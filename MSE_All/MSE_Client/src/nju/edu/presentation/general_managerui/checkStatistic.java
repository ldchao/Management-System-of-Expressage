package nju.edu.presentation.general_managerui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Color;

@SuppressWarnings("serial")
public class checkStatistic extends JPanel {

	JLabel label_2;
	JLabel label_4;
	JLabel label_5;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/generalManager/checkStatistic.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings("static-access")
	public checkStatistic(JFrame main, LoginPO loginPO) {
		checkStatistic checkStatisticframe = this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatics_Analysis newcheckStatics_Analysis = new checkStatics_Analysis(
						main, loginPO);
				main.remove(checkStatisticframe);
				main.getContentPane().add(newcheckStatics_Analysis);
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

		label_2 = new JLabel("起始日期");
		label_2.setBounds(357, 224, 129, 15);
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser1.register(label_2);
		add(label_2);

		label_4 = new JLabel("\u7ED3\u675F\u65E5\u671F");
		label_4.setBounds(357, 310, 129, 15);
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser2.register(label_4);
		add(label_4);

		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valid = true;
				if (label_2.getText().equals("起始日期")
						|| label_4.getText().equals("结束日期")) {
					valid = false;
				}
				if (valid == false) {
					label_5.setText("请选择完整的起始日期和结束日期");
				} else {
					int start = Integer.valueOf(label_2.getText().replaceAll(
							"-", ""));
					int end = Integer.valueOf(label_4.getText().replaceAll("-",
							""));
					if (start > end) {
						label_5.setText("起始日期应晚于结束日期");
					} else {
						checkStatisticInformation checkStatisticInformation = new checkStatisticInformation(
								label_2.getText(), label_4.getText(), main,
								loginPO);
						main.remove(checkStatisticframe);
						main.getContentPane().add(checkStatisticInformation);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
					}

				}

			}
		});
		button_1.setBounds(282, 417, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button_1.getWidth(),
				button_1.getHeight(), image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button_1.setIcon(image1);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		add(button_1);

		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_2.setText("起始日期");
				label_4.setText("结束日期");
			}
		});
		button_2.setBounds(411, 419, 52, 52);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button_2.getWidth(),
				button_2.getHeight(), image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button_2.setIcon(image2);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		add(button_2);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 539, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		label_5 = new JLabel("\u72B6\u6001\u680F");
		label_5.setForeground(Color.WHITE);
		toolBar.add(label_5);
	}
}
