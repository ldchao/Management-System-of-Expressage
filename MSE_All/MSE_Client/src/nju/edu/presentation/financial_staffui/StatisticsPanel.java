package nju.edu.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JToolBar;

import PO.LoginPO;

@SuppressWarnings("serial")
public class StatisticsPanel extends JPanel implements Runnable {
	private boolean signal;
	private JLabel lblNewLabel;
	private Thread t;

	/**
	 * Create the panel.
	 */
	public StatisticsPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);
		setSize(750, 600);
		StatisticsPanel stp = this;
		signal = false;
		
		t = new Thread(this);
	    t.start();

		JLabel label = new JLabel(
				"\u8D22\u52A1\u4EBA\u5458>>\u7EDF\u8BA1\u62A5\u8868");
		label.setBounds(88, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				main.remove(stp);
				FmainPanel fm = new FmainPanel(loginPO, main);
				main.add(fm);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
				t.stop();
			}
		});
		button_4.setBounds(10, 1, 68, 23);
		add(button_4);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate1 = new JLabel("请单击选择起始日期");
		showDate1.setBounds(182, 238, 122, 23);
		dateChooser1.register(showDate1);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate2 = new JLabel(
				"\u8BF7\u5355\u51FB\u9009\u62E9\u622A\u6B62\u65E5\u671F");
		showDate2.setBounds(500, 231, 122, 30);
		dateChooser2.register(showDate2);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		add(toolBar);

		lblNewLabel = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(lblNewLabel);

		add(showDate1);
		add(showDate2);

		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
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
						main.add(cstp);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
						t.stop();
					} else {
						lblNewLabel.setText("截止日期不得在起始日期之前，请核对起止日期");
					}
				} else {
					lblNewLabel.setText("请选择起始日期和截止日期后确认");
				}
				signal = true;
			}
		});
		button.setBounds(309, 405, 93, 23);
		add(button);

		JLabel label_1 = new JLabel("\u8D77\u59CB\u65E5\u671F\uFF1A");
		label_1.setBounds(88, 242, 65, 15);
		add(label_1);

		JLabel label_2 = new JLabel("\u622A\u6B62\u65E5\u671F\uFF1A");
		label_2.setBounds(413, 239, 65, 15);
		add(label_2);

	}

	@Override
	public void run() {
		while (true) {
			if (signal) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				lblNewLabel.setText("状态栏");
				signal = false;
			}
		}
	}
}