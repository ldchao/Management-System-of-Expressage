package nju.edu.presentation.financial_staffui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import PO.LoginPO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class fsframe extends JFrame implements Runnable {
	private boolean signal;
	private JLabel label_6;

	/**
	 * Create the panel.
	 */

	public fsframe(LoginPO loginPO) {
		getContentPane().setLayout(null);
		signal = false;

		fsframe fs = this;

		JLabel label = new JLabel("财务人员");
		label.setBounds(90, 10, 470, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(650, 10, 54, 15);
		getContentPane().add(lblHello);

		JButton btnNewButton = new JButton("New button");
		// btnNewButton.setIcon(new ImageIcon("src/scene.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fs.dispose();
				Payframe paymain = new Payframe(loginPO);
			}
		});
		btnNewButton.setBounds(108, 161, 125, 100);
		getContentPane().add(btnNewButton);

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fs.dispose();
				Calculateframe calframe = new Calculateframe(loginPO);
				Thread t = new Thread(calframe);
				t.start();
			}
		});
		button.setBounds(316, 161, 125, 100);
		getContentPane().add(button);

		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fs.dispose();
				Statisticsframe sf = new Statisticsframe(loginPO);
				Thread t = new Thread(sf);
				t.start();
			}
		});
		button_1.setBounds(507, 161, 125, 100);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fs.dispose();
				Billframe billframe = new Billframe(loginPO);
			}
		});
		button_2.setBounds(214, 329, 125, 100);
		getContentPane().add(button_2);

		label_6 = new JLabel("");
		label_6.setForeground(Color.RED);
		label_6.setBounds(381, 447, 211, 15);
		getContentPane().add(label_6);

		JButton button_3 = new JButton("New button");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (loginPO.getLimit().equals("高级财务人员")) {
					fs.dispose();
					Accountframe acf = new Accountframe(loginPO);
				} else {
					label_6.setText("对不起，仅高级财务人员有此权限");
					signal = true;
				}
			}
		});
		button_3.setBounds(416, 329, 125, 100);
		getContentPane().add(button_3);

		JLabel label_1 = new JLabel("成本管理");
		label_1.setBounds(146, 129, 57, 15);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("结算管理");
		label_2.setBounds(352, 129, 81, 15);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("统计报表");
		label_3.setBounds(544, 129, 81, 15);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("期初建账");
		label_4.setBounds(250, 304, 67, 15);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("账户管理");
		label_5.setBounds(451, 304, 67, 15);
		getContentPane().add(label_5);

		JButton button_4 = new JButton("\u6CE8\u9500");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fs.dispose();
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		getContentPane().add(button_4);

		// frame
		this.setTitle("快递管理系统MSE客户端");
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
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label_6.setText("");
				signal = false;
			}
		}
	}
}
