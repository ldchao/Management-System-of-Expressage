package nju.edu.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;

@SuppressWarnings("serial")
public class CalculatePanel extends JPanel implements Runnable {
	private boolean signal;
	private JTextField textField;
	private JLabel label_2;

	/**
	 * Create the panel.
	 */
	public CalculatePanel(LoginPO loginPO, JFrame main) {

		CalculatePanel cp = this;
		setLayout(null);
		setSize(750, 600);
		signal = false;

		JLabel label = new JLabel("财务人员>>结算管理");
		label.setBounds(88, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(661, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 1, 68, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(cp);
				FmainPanel fm = new FmainPanel(loginPO, main);
				main.add(fm);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button_4);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate2 = new JLabel("请单击选择日期");
		showDate2.setBounds(320, 252, 93, 34);
		dateChooser2.register(showDate2);
		add(showDate2);

		textField = new JTextField();
		textField.setBounds(381, 177, 102, 21);
		add(textField);
		textField.setColumns(10);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		add(toolBar);

		label_2 = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(label_2);

		JButton button = new JButton("\u786E\u8BA4");
		button.setBounds(320, 426, 93, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String date = showDate2.getText();
				String shop = textField.getText();
				if (!date.equals("请单击选择日期") && !shop.equals("")) {
					main.remove(cp);
					CheckPayeePanel cpep = new CheckPayeePanel(main,loginPO, date,
							shop);
					main.add(cpep);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				} else {
					label_2.setText("请输入营业厅编号并选择日期后确认");
					signal = true;
				}
			}
		});
		add(button);

		JLabel label_1 = new JLabel(
				"\u8BF7\u8F93\u5165\u8425\u4E1A\u5385\u7F16\u53F7");
		label_1.setBounds(258, 180, 111, 15);
		add(label_1);
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
				label_2.setText("状态栏");
				signal = false;
			}
		}

	}
}