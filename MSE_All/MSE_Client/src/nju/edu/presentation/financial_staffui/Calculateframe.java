package nju.edu.presentation.financial_staffui;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;

public class Calculateframe extends JFrame {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Calculateframe() {

		Calculateframe cf = this;
		getContentPane().setLayout(null);

		JLabel label = new JLabel("财务人员>>结算管理");
		label.setBounds(88, 5, 518, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(661, 5, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 1, 68, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cf.dispose();
				fsframe fs = new fsframe();
			}
		});
		getContentPane().add(button_4);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate2 = new JLabel("请单击选择日期");
		showDate2.setBounds(320, 252, 93, 34);
		dateChooser2.register(showDate2);
		getContentPane().add(showDate2);

		textField = new JTextField();
		textField.setBounds(381, 177, 102, 21);
		getContentPane().add(textField);
		textField.setColumns(10);

		JButton button = new JButton("\u786E\u8BA4");
		button.setBounds(320, 426, 93, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String date = showDate2.getText();
				String shop = textField.getText();
				if (!date.equals("请单击选择日期") && !shop.equals("")) {
					CheckPayeeframe cpef = new CheckPayeeframe(date, shop);
					cf.dispose();
				}
			}
		});
		getContentPane().add(button);

		JLabel label_1 = new JLabel(
				"\u8BF7\u8F93\u5165\u8425\u4E1A\u5385\u7F16\u53F7");
		label_1.setBounds(258, 180, 111, 15);
		getContentPane().add(label_1);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}