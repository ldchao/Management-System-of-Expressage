package nju.edu.presentation.financial_staffui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.JToolBar;

import PO.LoginPO;
import java.awt.Color;

@SuppressWarnings("serial")
public class StatisticsPanel extends JPanel implements Runnable {
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/financial_stuff/statisticsPanel.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
	public StatisticsPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);
		setSize(750, 600);
		StatisticsPanel stp = this;

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JButton button_4 = new JButton("");
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(stp);
				FmainPanel fm = new FmainPanel(loginPO, main);
				main.getContentPane().add(fm);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(13, -9, 63, 63);
		button_4.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_4.addMouseListener(new MouseAdapter() {
					@Override
			public void mousePressed(MouseEvent e) {
				button_4.setIcon(new ImageIcon("image/mask_circle.png"));
			}	
		});
		add(button_4);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate1 = new JLabel("请单击选择起始日期");
		showDate1.setBounds(361, 225, 122, 23);
		dateChooser1.register(showDate1);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate2 = new JLabel(
				"\u8BF7\u5355\u51FB\u9009\u62E9\u622A\u6B62\u65E5\u671F");
		showDate2.setBounds(361, 304, 122, 30);
		dateChooser2.register(showDate2);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		lblNewLabel = new JLabel("\u72B6\u6001\u680F");
		lblNewLabel.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel);

		add(showDate1);
		add(showDate2);

		JButton button = new JButton("");
		button.setBounds(349, 422, 52, 52);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date1 = showDate1.getText();
				String date2 = showDate2.getText();
				if (!date1.endsWith("请单击选择起始日期") && !date2.equals("请单击选择截止日期")) {
					int d1 = Integer.valueOf(date1.replaceAll("-", ""));
					int d2 = Integer.valueOf(date2.replaceAll("-", ""));
					if (d1 < d2) {
						main.remove(stp);
						CheckStatisticsPanel cstp = new CheckStatisticsPanel(
								main, loginPO, date1, date2);
						main.getContentPane().add(cstp);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
					} else {
						lblNewLabel.setText("截止日期不得在起始日期之前，请核对起止日期");
					}
				} else {
					lblNewLabel.setText("请选择起始日期和截止日期后确认");
				}
				Thread t = new Thread(stp);
				t.start();
			}
		});
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button.getWidth(),
						button.getHeight(),image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button.setIcon(image1);
		add(button);

	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		lblNewLabel.setText("状态栏");
	}
}