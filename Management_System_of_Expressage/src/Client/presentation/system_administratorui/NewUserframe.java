package Client.presentation.system_administratorui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.businesslogic.staffbl.UserBL;
import Client.presentation.financial_staffui.Payframe;

import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.Font;
import java.util.Enumeration;

import javax.swing.JRadioButton;

public class NewUserframe extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	UserBL userBL = new UserBL();

	/**
	 * Create the panel.
	 */
	public NewUserframe() {
		getContentPane().setLayout(null);

		NewUserframe nuf = this;

		JLabel label = new JLabel("系统管理员>>新建用户");
		label.setBounds(88, 5, 518, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("返回");
		button_4.setBounds(10, 1, 68, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuf.dispose();
				Administratorframe adf = new Administratorframe();
			}
		});
		getContentPane().add(button_4);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		getContentPane().add(toolBar);

		JLabel lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		JLabel label_1 = new JLabel("\u7528\u6237\u540D");
		label_1.setBounds(130, 145, 62, 15);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\u5BC6\u7801");
		label_2.setBounds(130, 205, 62, 15);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("\u6743\u9650");
		label_3.setBounds(130, 267, 62, 15);
		getContentPane().add(label_3);

		textField = new JTextField();
		textField.setBounds(230, 145, 175, 21);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(230, 205, 175, 21);
		getContentPane().add(textField_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton(
				"\u5FEB\u9012\u5458");
		rdbtnNewRadioButton.setBounds(230, 263, 84, 23);
		getContentPane().add(rdbtnNewRadioButton);

		JRadioButton radioButton_1 = new JRadioButton(
				"\u8425\u4E1A\u5385\u4E1A\u52A1\u5458");
		radioButton_1.setBounds(335, 263, 111, 23);
		getContentPane().add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("\u603B\u7ECF\u7406");
		radioButton_2.setBounds(230, 303, 84, 23);
		getContentPane().add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton(
				"\u8D22\u52A1\u4EBA\u5458");
		radioButton_3.setBounds(335, 303, 84, 23);
		getContentPane().add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton(
				"\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		radioButton_4.setBounds(448, 263, 128, 23);
		getContentPane().add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton(
				"\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u5458");
		radioButton_5.setBounds(448, 303, 147, 23);
		getContentPane().add(radioButton_5);

		JRadioButton radioButton_6 = new JRadioButton(
				"\u7CFB\u7EDF\u7BA1\u7406\u5458");
		radioButton_6.setBounds(230, 339, 103, 23);
		getContentPane().add(radioButton_6);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(radioButton_1);
		bg.add(radioButton_2);
		bg.add(radioButton_3);
		bg.add(radioButton_4);
		bg.add(radioButton_5);
		bg.add(radioButton_6);

		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String key = textField_1.getText();
				String limit = "";

				// 获取单选的内容
				Enumeration<AbstractButton> radioBtns = bg.getElements();
				AbstractButton btn = null;
				while (radioBtns.hasMoreElements()) {
					btn = radioBtns.nextElement();
					if (btn.isSelected()) {
						limit = btn.getText();
						break;
					}
				}

				userBL.addUser(name, key, limit);
				lblNewLabel.setText("创建成功!");

				try {
					Thread.sleep(1000);
				} catch (Exception ex) {
					ex.printStackTrace();
				}

				textField.setText("");
				textField_1.setText("");
				btn.setSelected(false);
				// 怎么取消单选框的选择！
			}
		});
		button.setBounds(216, 448, 93, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				// 取消选择！
			}
		});
		button_1.setBounds(391, 448, 93, 23);
		getContentPane().add(button_1);

		JLabel label_4 = new JLabel("\u7528\u6237\u4FE1\u606F");
		label_4.setFont(new Font("黑体", Font.BOLD, 15));
		label_4.setBounds(326, 74, 69, 15);
		getContentPane().add(label_4);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}
