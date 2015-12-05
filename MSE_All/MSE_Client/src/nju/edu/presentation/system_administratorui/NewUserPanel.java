package nju.edu.presentation.system_administratorui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import PO.LoginPO;

import java.awt.Font;
import java.util.Enumeration;

import nju.edu.businesslogic.staffbl.UserBL;

@SuppressWarnings("serial")
public class NewUserPanel extends JPanel implements Runnable {
	private JTextField textField;
	private JTextField textField_1;
	private boolean success;
	private JLabel lblNewLabel;
	private AbstractButton btn;
	UserBL userBL = new UserBL();

	/**
	 * Create the panel.
	 */
	public NewUserPanel(LoginPO loginPO, JFrame main) {
		success = false;
		setLayout(null);

		NewUserPanel nup = this;

		JLabel label = new JLabel("系统管理员>>新建用户");
		label.setBounds(88, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("返回");
		button_4.setBounds(10, 1, 68, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nup);
				AdminPanel adp = new AdminPanel(loginPO, main);
				main.add(adp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button_4);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		toolBar.setEnabled(false);
		add(toolBar);

		lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		JLabel label_1 = new JLabel("\u7528\u6237\u540D");
		label_1.setBounds(130, 145, 62, 15);
		add(label_1);

		JLabel label_2 = new JLabel("\u5BC6\u7801");
		label_2.setBounds(130, 205, 62, 15);
		add(label_2);

		JLabel label_3 = new JLabel("\u6743\u9650");
		label_3.setBounds(130, 267, 62, 15);
		add(label_3);

		textField = new JTextField();
		textField.setBounds(230, 145, 175, 21);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(230, 205, 175, 21);
		add(textField_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton(
				"\u5FEB\u9012\u5458");
		rdbtnNewRadioButton.setBounds(230, 263, 84, 23);
		add(rdbtnNewRadioButton);

		JRadioButton radioButton_1 = new JRadioButton(
				"\u8425\u4E1A\u5385\u4E1A\u52A1\u5458");
		radioButton_1.setBounds(335, 263, 111, 23);
		add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("\u603B\u7ECF\u7406");
		radioButton_2.setBounds(230, 303, 84, 23);
		add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton(
				"\u8D22\u52A1\u4EBA\u5458");
		radioButton_3.setBounds(335, 303, 84, 23);
		add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton(
				"\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		radioButton_4.setBounds(448, 263, 128, 23);
		add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton(
				"\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u5458");
		radioButton_5.setBounds(335, 340, 147, 23);
		add(radioButton_5);

		JRadioButton radioButton_6 = new JRadioButton(
				"\u7CFB\u7EDF\u7BA1\u7406\u5458");
		radioButton_6.setBounds(230, 340, 103, 23);
		add(radioButton_6);

		JRadioButton radioButton_7 = new JRadioButton(
				"\u9AD8\u7EA7\u8D22\u52A1\u4EBA\u5458");
		radioButton_7.setBounds(448, 303, 111, 23);
		add(radioButton_7);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(radioButton_1);
		bg.add(radioButton_2);
		bg.add(radioButton_3);
		bg.add(radioButton_4);
		bg.add(radioButton_5);
		bg.add(radioButton_6);
		bg.add(radioButton_7);

		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String key = textField_1.getText();
				String limit = "";

				// 获取单选的内容
				Enumeration<AbstractButton> radioBtns = bg.getElements();
				btn = null;
				while (radioBtns.hasMoreElements()) {
					btn = radioBtns.nextElement();
					if (btn.isSelected()) {
						limit = btn.getText();
						break;
					}
				}

				if (name.equals("") || key.equals("") || limit.equals("")) {
					lblNewLabel.setText("信息录入不完整，无法完成新建");
					success = false;
				} else {
					userBL.addUser(name, key, limit);
					lblNewLabel.setText("创建成功!");
					success = true;
				}

				Thread t = new Thread(nup);
				t.start();
			}
		});
		button.setBounds(216, 448, 93, 23);
		add(button);

		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				// 取消选择！
			}
		});
		button_1.setBounds(391, 448, 93, 23);
		add(button_1);

		JLabel label_4 = new JLabel("\u7528\u6237\u4FE1\u606F");
		label_4.setFont(new Font("黑体", Font.BOLD, 15));
		label_4.setBounds(326, 74, 69, 15);
		add(label_4);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (success) {
			textField.setText("");
			textField_1.setText("");
			btn.setSelected(false);
			// 怎么取消单选框的选择！
		}

		lblNewLabel.setText("状态栏");
	}
}