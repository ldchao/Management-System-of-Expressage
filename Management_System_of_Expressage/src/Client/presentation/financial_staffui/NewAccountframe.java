package Client.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import java.awt.Font;

import javax.swing.JTextField;

public class NewAccountframe extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public NewAccountframe() {

		setLayout(null);
		
		NewAccountframe naf = this;

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
				naf.dispose();
				Accountframe fs = new Accountframe();
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		add(button_4);
		
		JLabel label_1 = new JLabel("\u8D26\u6237\u4FE1\u606F");
		label_1.setFont(new Font("黑体", Font.BOLD, 15));
		label_1.setBounds(342, 88, 84, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u8D26\u6237\u540D\u79F0");
		label_2.setBounds(239, 140, 54, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("\u8D26\u6237\u4F59\u989D");
		label_3.setBounds(239, 194, 54, 15);
		add(label_3);
		
		JLabel label_4 = new JLabel("\u5EFA\u8D26\u65E5\u671F");
		label_4.setBounds(239, 252, 54, 15);
		add(label_4);
		
		JLabel label_5 = new JLabel("\u5EFA\u8D26\u4EBA");
		label_5.setBounds(239, 306, 54, 15);
		add(label_5);
		
		textField = new JTextField();
		textField.setBounds(359, 137, 181, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(359, 249, 181, 21);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(359, 303, 181, 21);
		add(textField_2);
		
		JLabel label_6 = new JLabel("0");
		label_6.setBounds(359, 194, 181, 15);
		add(label_6);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 423, 783, 32);
		add(toolBar);
		
		JLabel lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("创建成功！");
			}
		});
		button.setBounds(271, 368, 93, 23);
		add(button);

		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.setBounds(418, 368, 93, 23);
		add(button_1);
		
		//frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 490);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}
