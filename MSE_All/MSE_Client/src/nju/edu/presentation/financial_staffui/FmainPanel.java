package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import nju.edu.presentation.Loginui.PersonalInfomation;
import PO.LoginPO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FmainPanel extends JPanel implements Runnable {
	private JLabel label_6;
	private Thread t;
	private PersonalInfomation perinfo;

	/**
	 * Create the panel.
	 */
	public FmainPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);
		setSize(750, 600);

		FmainPanel fmp = this;

		JLabel label = new JLabel("财务人员");
		label.setBounds(90, 10, 470, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				perinfo = new PersonalInfomation(loginPO, main);
				perinfo.setLocation(750, 115);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (perinfo.getMouseState() == true)
					perinfo.dispose();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				perinfo.setLocation(750, 115);
				perinfo.setAlwaysOnTop(true);
				perinfo.setMouseState(false);
			}
		});
		lblHello.setBounds(650, 10, 54, 15);
		add(lblHello);

		JButton btnNewButton = new JButton("New button");
		// btnNewButton.setIcon(new ImageIcon("src/scene.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(fmp);
				PayPanel paymain = new PayPanel(loginPO, main);
				main.getContentPane().add(paymain);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(108, 161, 125, 100);
		add(btnNewButton);

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(fmp);
				CalculatePanel calp = new CalculatePanel(loginPO, main);
				main.getContentPane().add(calp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(316, 161, 125, 100);
		add(button);

		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(fmp);
				StatisticsPanel stp = new StatisticsPanel(loginPO, main);
				main.getContentPane().add(stp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(507, 161, 125, 100);
		add(button_1);

		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(fmp);
				BillPanel billPanel = new BillPanel(loginPO, main);
				main.getContentPane().add(billPanel);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_2.setBounds(214, 329, 125, 100);
		add(button_2);

		label_6 = new JLabel("");
		label_6.setForeground(Color.RED);
		label_6.setBounds(381, 447, 211, 15);
		add(label_6);

		JButton button_3 = new JButton("New button");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (loginPO.getLimit().equals("高级财务人员")) {
					main.remove(fmp);
					AccountPanel acp = new AccountPanel(loginPO, main);
					main.getContentPane().add(acp);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				} else {
					label_6.setText("对不起，仅高级财务人员有此权限");
					t = new Thread(fmp);
					t.start();
				}
			}
		});
		button_3.setBounds(416, 329, 125, 100);
		add(button_3);

		JLabel label_1 = new JLabel("成本管理");
		label_1.setBounds(146, 129, 57, 15);
		add(label_1);

		JLabel label_2 = new JLabel("结算管理");
		label_2.setBounds(352, 129, 81, 15);
		add(label_2);

		JLabel label_3 = new JLabel("统计报表");
		label_3.setBounds(544, 129, 81, 15);
		add(label_3);

		JLabel label_4 = new JLabel("期初建账");
		label_4.setBounds(250, 304, 67, 15);
		add(label_4);

		JLabel label_5 = new JLabel("账户管理");
		label_5.setBounds(451, 304, 67, 15);
		add(label_5);

		JButton button_4 = new JButton("\u6CE8\u9500");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		add(button_4);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		label_6.setText("");
	}
}
