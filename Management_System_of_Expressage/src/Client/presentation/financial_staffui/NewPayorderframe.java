package Client.presentation.financial_staffui;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import Client.businesslogic.financebl.PayorderBL;

public class NewPayorderframe extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	PayorderBL payorderBL = new PayorderBL();

	/**
	 * Create the panel.
	 */
	public NewPayorderframe() {
		getContentPane().setLayout(null);

		NewPayorderframe npf = this;

		JLabel label = new JLabel("财务人员>>成本管理>>新建付款单");
		label.setBounds(88, 5, 518, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 1, 68, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				npf.dispose();
				Payframe pf = new Payframe();
			}
		});
		getContentPane().add(button_4);

		JLabel label_1 = new JLabel("付款金额");
		label_1.setBounds(112, 148, 62, 15);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("付款人");
		label_2.setBounds(112, 205, 54, 15);
		getContentPane().add(label_2);

		JLabel label_4 = new JLabel("付款账号");
		label_4.setBounds(390, 148, 54, 15);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("付款日期");
		label_5.setBounds(392, 205, 62, 15);
		getContentPane().add(label_5);

		textField = new JTextField();
		textField.setBounds(179, 145, 157, 21);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(179, 202, 157, 21);
		textField_1.setColumns(10);
		getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBounds(465, 145, 157, 21);
		textField_2.setColumns(10);
		getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setBounds(465, 202, 157, 21);
		textField_3.setColumns(10);
		getContentPane().add(textField_3);
		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		textField_3.setText(date.format(dt));

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		getContentPane().add(toolBar);

		JLabel lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		JLabel label_3 = new JLabel("\u4ED8\u6B3E\u6761\u76EE");
		label_3.setBounds(112, 261, 54, 15);
		getContentPane().add(label_3);

		JLabel label_6 = new JLabel("\u5907\u6CE8");
		label_6.setBounds(112, 362, 45, 15);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("\u4ED8\u6B3E\u4FE1\u606F");
		label_7.setFont(new Font("黑体", Font.BOLD, 15));
		label_7.setBounds(338, 81, 78, 15);
		getContentPane().add(label_7);

		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(179, 261, 443, 69);
		getContentPane().add(jsp);

		JTextArea textArea = new JTextArea();
		jsp.setViewportView(textArea);
		JScrollPane jsp2 = new JScrollPane();
		jsp2.setBounds(179, 362, 443, 69);
		getContentPane().add(jsp2);

		JTextArea textArea_1 = new JTextArea();
		jsp2.setViewportView(textArea_1);

		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double money = 0;
				if (!textField.getText().equals(""))
					money = Double.parseDouble(textField.getText());
				String payname = textField_1.getText();
				String payaccount = textField_2.getText();
				String date = textField_3.getText();
				String list = textArea.getText();
				String comment = textArea_1.getText();
				boolean success = false;

				if (payname.equals("") || payaccount.equals("")
						|| date.equals("") || list.equals("")
						|| comment.equals("")) {
					lblNewLabel.setText("信息录入不完整，无法完成新建");
					success = false;
				} else {
					payorderBL.addPayorder(money, date, payname, payaccount,
							list, comment);
					lblNewLabel.setText("创建成功！");
					success = true;
				}

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (success) {
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textArea.setText("");
					textArea_1.setText("");
				}
			}
		});
		button.setBounds(238, 468, 93, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textArea.setText("");
				textArea_1.setText("");
				lblNewLabel.setText("状态栏");
			}
		});
		button_1.setBounds(413, 468, 93, 23);
		getContentPane().add(button_1);

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
