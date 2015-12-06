package nju.edu.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;

import PO.LoginPO;
import nju.edu.businesslogic.accountbl.AccountBL;

@SuppressWarnings("serial")
public class NewAccountPanel extends JPanel implements Runnable {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private boolean success;
	AccountBL accountBL = new AccountBL();

	/**
	 * Create the panel.
	 */
	public NewAccountPanel(LoginPO loginPO, JFrame main) {
		success = false;
		setLayout(null);
		setSize(750, 600);

		NewAccountPanel nap = this;

		JLabel label = new JLabel(
				"\u8D22\u52A1\u4EBA\u5458>>\u8D26\u6237\u7BA1\u7406>>\u65B0\u5EFA\u8D26\u6237");
		label.setBounds(87, 10, 470, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(630, 10, 54, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(nap);
				AccountPanel acp = new AccountPanel(loginPO, main);
				main.add(acp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		add(button_4);

		JLabel label_1 = new JLabel("\u8D26\u6237\u4FE1\u606F");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(335, 109, 73, 15);
		add(label_1);

		JLabel label_2 = new JLabel("\u8D26\u6237\u540D\u79F0");
		label_2.setBounds(239, 178, 54, 15);
		add(label_2);

		JLabel label_3 = new JLabel("\u8D26\u6237\u4F59\u989D");
		label_3.setBounds(239, 233, 54, 15);
		add(label_3);

		JLabel label_4 = new JLabel("\u5EFA\u8D26\u65E5\u671F");
		label_4.setBounds(239, 290, 54, 15);
		add(label_4);

		JLabel label_5 = new JLabel("\u5EFA\u8D26\u4EBA");
		label_5.setBounds(239, 348, 54, 15);
		add(label_5);

		textField = new JTextField();
		textField.setBounds(359, 175, 181, 21);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(359, 287, 181, 21);
		add(textField_1);
		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		textField_1.setText(date.format(dt));

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(359, 345, 181, 21);
		add(textField_2);

		JLabel label_6 = new JLabel("0.0");
		label_6.setBounds(359, 233, 181, 15);
		add(label_6);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		toolBar.setEnabled(false);
		add(toolBar);

		lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		// 确认完成新建
		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				String creator = textField_1.getText();
				String date = textField_2.getText();
				Thread t = new Thread(nap);

				if (name.equals("") || creator.equals("") || date.equals("")) {
					lblNewLabel.setText("信息录入不完整，无法完成新建");
					success = false;
				} else {
					lblNewLabel.setText("创建成功！");
					accountBL.addAccount(name, "0.0", creator, date);
					success = true;
				}

				t.start();
			}
		});
		button.setBounds(258, 444, 93, 23);
		add(button);

		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_2.setText("");
				lblNewLabel.setText("状态栏");
			}
		});
		button_1.setBounds(411, 444, 93, 23);
		add(button_1);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		lblNewLabel.setText("状态栏");

		if (success) {
			textField.setText("");
			textField_2.setText("");
		}

		success = false;
	}
}