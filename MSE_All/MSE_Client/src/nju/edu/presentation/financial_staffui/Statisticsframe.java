package nju.edu.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JToolBar;

import PO.LoginPO;

@SuppressWarnings("serial")
public class Statisticsframe extends JFrame implements Runnable {
	private boolean signal;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public Statisticsframe(LoginPO loginPO) {
		getContentPane().setLayout(null);
		Statisticsframe stf = this;
		signal = false;

		JLabel label = new JLabel(
				"\u8D22\u52A1\u4EBA\u5458>>\u7EDF\u8BA1\u62A5\u8868");
		label.setBounds(88, 5, 518, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stf.dispose();
				fsframe fs = new fsframe(loginPO);
			}
		});
		button_4.setBounds(10, 1, 68, 23);
		getContentPane().add(button_4);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate1 = new JLabel("�뵥��ѡ����ʼ����");
		showDate1.setBounds(182, 238, 122, 23);
		dateChooser1.register(showDate1);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate2 = new JLabel(
				"\u8BF7\u5355\u51FB\u9009\u62E9\u622A\u6B62\u65E5\u671F");
		showDate2.setBounds(500, 231, 122, 30);
		dateChooser2.register(showDate2);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		getContentPane().add(toolBar);

		lblNewLabel = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(lblNewLabel);

		// frame
		this.setTitle("��ݹ���ϵͳMSE�ͻ���");
		getContentPane().add(showDate1);
		getContentPane().add(showDate2);

		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date1 = showDate1.getText();
				String date2 = showDate2.getText();
				if (!date1.endsWith("�뵥��ѡ����ʼ����") && !date2.equals("�뵥��ѡ���ֹ����")) {
					int d1 = Integer.valueOf(date1.replaceAll("-", ""));
					int d2 = Integer.valueOf(date2.replaceAll("-", ""));
					if (d1 < d2) {
						stf.dispose();
						CheckStatisticsframe cstf = new CheckStatisticsframe(
								loginPO, date1, date2);
					} else {
						lblNewLabel.setText("��ֹ���ڲ�������ʼ����֮ǰ����˶���ֹ����");
					}
				} else {
					lblNewLabel.setText("��ѡ����ʼ���ںͽ�ֹ���ں�ȷ��");
				}
				signal = true;
			}
		});
		button.setBounds(309, 405, 93, 23);
		getContentPane().add(button);

		JLabel label_1 = new JLabel("\u8D77\u59CB\u65E5\u671F\uFF1A");
		label_1.setBounds(88, 242, 65, 15);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\u622A\u6B62\u65E5\u671F\uFF1A");
		label_2.setBounds(413, 239, 65, 15);
		getContentPane().add(label_2);

		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
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
				lblNewLabel.setText("״̬��");
				signal = false;
			}
		}
	}
}