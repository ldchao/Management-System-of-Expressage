package nju.edu.presentation.system_administratorui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import nju.edu.businesslogic.staffbl.UserBL;

@SuppressWarnings("serial")
public class UpdateUserFrame extends JFrame implements Runnable {
	private JTextField textField;
	private JLabel label_5;
	UserBL userBL = new UserBL();

	/**
	 * Create the panel.
	 */
	public UpdateUserFrame(CheckUserPanel cup, String name, String limit,
			int pos) {

		/**
		 * Create the panel.
		 */
		getContentPane().setLayout(null);
		UpdateUserFrame up = this;

		Thread t1 = new Thread(this);

		JLabel label = new JLabel("\u8BF7\u5F55\u5165\u65B0\u7684\u4FE1\u606F");
		label.setBounds(140, 31, 93, 15);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("\u7528\u6237\u540D");
		label_1.setBounds(114, 70, 47, 15);
		getContentPane().add(label_1);

		textField = new JTextField();
		textField.setBounds(158, 67, 93, 21);
		getContentPane().add(textField);
		textField.setText(name);
		textField.setColumns(10);

		JLabel label_2 = new JLabel(
				"\uFF08\u7528\u6237\u5BC6\u7801\u65E0\u6CD5\u4FEE\u6539\uFF09");
		label_2.setBounds(124, 102, 137, 15);
		getContentPane().add(label_2);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 256, 374, 28);
		toolBar.setEnabled(false);
		getContentPane().add(toolBar);

		label_5 = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(label_5);

		JRadioButton rdbtnNewRadioButton = new JRadioButton(
				"\u5FEB\u9012\u5458");
		rdbtnNewRadioButton.setBounds(31, 127, 65, 23);
		getContentPane().add(rdbtnNewRadioButton);

		JRadioButton radioButton_1 = new JRadioButton(
				"\u8425\u4E1A\u5385\u4E1A\u52A1\u5458");
		radioButton_1.setBounds(122, 127, 103, 23);
		getContentPane().add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("\u603B\u7ECF\u7406");
		radioButton_2.setBounds(31, 163, 65, 23);
		getContentPane().add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton(
				"\u8D22\u52A1\u4EBA\u5458");
		radioButton_3.setBounds(122, 163, 84, 23);
		getContentPane().add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton(
				"\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		radioButton_4.setBounds(223, 127, 128, 23);
		getContentPane().add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton(
				"\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u5458");
		radioButton_5.setBounds(122, 198, 147, 23);
		getContentPane().add(radioButton_5);

		JRadioButton radioButton_6 = new JRadioButton(
				"\u7CFB\u7EDF\u7BA1\u7406\u5458");
		radioButton_6.setBounds(31, 198, 103, 23);
		getContentPane().add(radioButton_6);

		JRadioButton radioButton_7 = new JRadioButton(
				"\u9AD8\u7EA7\u8D22\u52A1\u4EBA\u5458");
		radioButton_7.setBounds(223, 163, 103, 23);
		getContentPane().add(radioButton_7);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(radioButton_1);
		bg.add(radioButton_2);
		bg.add(radioButton_3);
		bg.add(radioButton_4);
		bg.add(radioButton_5);
		bg.add(radioButton_6);
		bg.add(radioButton_7);

		// 设置原有权限
		Enumeration<AbstractButton> radioBtns = bg.getElements();
		while (radioBtns.hasMoreElements()) {
			AbstractButton btn = radioBtns.nextElement();
			if (btn.getText().equals(limit)) {
				btn.setSelected(true);
				break;
			}
		}

		JButton button = new JButton("\u786E\u8BA4");
		// 确认修改
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String newname = textField.getText();
				String newlimit = "";

				if (newname.equals("")
						|| newname.replaceAll(" ", "").equals("")) {
					label_5.setText("信息录入不完整，无法完成修改");
					t1.start();
				} else {
					Enumeration<AbstractButton> radioBtns2 = bg.getElements();
					AbstractButton btn2 = null;
					while (radioBtns2.hasMoreElements()) {
						btn2 = radioBtns2.nextElement();
						if (btn2.isSelected()) {
							newlimit = btn2.getText();
							break;
						}
					}
					up.dispose();
					CheckUserPanel.setlblNewLabel("修改成功！");
					CheckUserPanel.showTable(userBL.updateUser(pos + 1, name,
							newname, newlimit));
					Thread t = new Thread(cup);
					t.start();
				}
			}
		});
		button.setBounds(102, 227, 65, 23);
		getContentPane().add(button);

		// 取消修改
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				up.dispose();
			}
		});
		button_1.setBounds(210, 227, 65, 23);
		getContentPane().add(button_1);

		// frame
		this.setSize(390, 323);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		label_5.setText("状态栏");
	}
}
