package nju.edu.presentation.Loginui;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

import nju.edu.businesslogic.loginbl.LoginBL;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import PO.LoginPO;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class LoginPanel extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private String user;
	private String key;
	LoginBL loginbl = new LoginBL();

	/**
	 * Create the panel.
	 */
	public LoginPanel(JFrame main) {
		this.setLayout(null);
		this.setSize(750, 600);
		JPanel loginPanel = this;

		JLabel label = new JLabel("\u5FEB\u9012\u7BA1\u7406\u7CFB\u7EDF");
		label.setFont(new Font("隶书", Font.BOLD, 40));
		label.setBounds(240, 105, 263, 102);
		this.add(label);

		JLabel label_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		label_1.setFont(new Font("隶书", Font.BOLD, 20));
		label_1.setBounds(248, 255, 84, 15);
		this.add(label_1);

		JLabel label_2 = new JLabel("\u5BC6\u7801\uFF1A");
		label_2.setFont(new Font("隶书", Font.BOLD, 20));
		label_2.setBounds(248, 310, 73, 15);
		this.add(label_2);

		// 密码
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(492, 255, 93, 20);
		add(lblNewLabel);

		// 用户名
		JLabel label_4 = new JLabel("");
		label_4.setForeground(Color.RED);
		label_4.setBounds(493, 310, 93, 20);
		add(label_4);

		String str[] = loginbl.getUser();

		// 用户名
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				label_4.setText("");
				lblNewLabel.setText("");
			}
		});
		textField.setBounds(342, 250, 140, 28);
		this.add(textField);
		textField.setColumns(10);
		if (!str[0].equals("0"))
			textField.setText(str[0]);

		// 密码
		passwordField = new JPasswordField();
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label_4.setText("");
			}
		});
		passwordField.setBounds(342, 306, 140, 28);
		this.add(passwordField);
		if (!str[1].equals("0"))
			passwordField.setText(str[1]);

		JLabel label_3 = new JLabel("\u5FD8\u8BB0\u5BC6\u7801\uFF1F");
		label_3.setBounds(441, 361, 77, 15);
		this.add(label_3);

		// 记住用户名
		JCheckBox checkBox = new JCheckBox("\u8BB0\u4F4F\u7528\u6237\u540D");
		checkBox.setSelected(true);
		checkBox.setBounds(239, 357, 103, 23);
		this.add(checkBox);

		// 记住密码
		JCheckBox checkBox_1 = new JCheckBox("\u8BB0\u4F4F\u5BC6\u7801");
		checkBox_1.setBounds(345, 357, 84, 23);
		this.add(checkBox_1);

		// 登录
		JButton button = new JButton("\u767B\u5F55");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user = textField.getText();
				key = new String(passwordField.getPassword());
				if (user.equals("")) {
					lblNewLabel.setText("请输入用户名");
				} else if (key.equals("")) {
					label_4.setText("请输入密码");
				} else {
					int isLegal = loginbl.isLegal(user, key);
					if (isLegal == 0) {
						label_4.setText("密码错误");
						passwordField.setText("");
					} else if (isLegal < 0) {
						lblNewLabel.setText("用户不存在");
						passwordField.setText("");
					} else {
						LoginPO loginPO = loginbl.getUserInfo(user);
						loginbl.Enter(main, user); // 权限

						if (checkBox.isSelected())
							loginbl.setUser(user, "0");
						else
							loginbl.setUser("0", "0");

						if (checkBox_1.isSelected())
							loginbl.setUser(user, key);
					}
				}
			}
		});
		button.setFont(new Font("华文行楷", Font.PLAIN, 18));
		button.setBounds(250, 413, 93, 28);
		add(button);

		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(loginPanel);
				ChoosePanel choose = new ChoosePanel(main);
				main.getContentPane().add(choose);
				main.invalidate();
				main.repaint();
			}
		});
		button_1.setFont(new Font("华文行楷", Font.PLAIN, 18));
		button_1.setBounds(393, 413, 93, 28);
		add(button_1);

	}
}
