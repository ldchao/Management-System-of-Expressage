package nju.edu.presentation.financial_staffui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JToolBar;

import nju.edu.businesslogic.accountbl.AccountBL;

public class UpdateAccountframe extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	AccountBL accountBL = new AccountBL();

	/**
	 * Create the panel.
	 */
	public UpdateAccountframe(String name, int rowpos) {
		getContentPane().setLayout(null);
		UpdateAccountframe up = this;

		JLabel label = new JLabel("\u8BF7\u5F55\u5165\u65B0\u7684\u4FE1\u606F");
		label.setBounds(175, 30, 93, 15);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("\u8D26\u6237\u540D");
		label_1.setBounds(150, 67, 47, 15);
		getContentPane().add(label_1);

		textField = new JTextField();
		textField.setBounds(216, 64, 93, 21);
		getContentPane().add(textField);
		textField.setText(name);
		textField.setColumns(10);

		JLabel label_2 = new JLabel(
				"\uFF08\u8D26\u6237\u4F59\u989D\u4E3A\u81EA\u52A8\u751F\u6210\uFF0C\u65E0\u6CD5\u4FEE\u6539\uFF09");
		label_2.setBounds(134, 100, 234, 15);
		getContentPane().add(label_2);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(216, 133, 93, 21);
		getContentPane().add(textField_1);

		JLabel label_4 = new JLabel("\u4FEE\u6539\u4EBA");
		label_4.setBounds(150, 176, 54, 15);
		getContentPane().add(label_4);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(216, 173, 93, 21);
		getContentPane().add(textField_2);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 253, 444, 28);
		getContentPane().add(toolBar);

		JLabel label_5 = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(label_5);

		JButton button = new JButton("\u786E\u8BA4");
		// 确认修改
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				String creator = textField_1.getText();
				String date = textField_2.getText();

				if (name.equals("") || creator.equals("") || date.equals("")) {
					label_5.setText("信息录入不完整，无法完成修改");
				} else {
					CheckAccountframe.showTable(accountBL.updateAccount(
							rowpos + 1, name, date, creator)); // rowpos为修改的位置
					up.dispose();
				}

			}
		});
		button.setBounds(149, 216, 65, 23);
		getContentPane().add(button);

		// 取消修改
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				up.dispose();
			}
		});
		button_1.setBounds(241, 216, 65, 23);
		getContentPane().add(button_1);

		JLabel label_3 = new JLabel("\u4FEE\u6539\u65E5\u671F");
		label_3.setBounds(150, 136, 54, 15);
		getContentPane().add(label_3);

		// frame
		this.setSize(460, 320);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
