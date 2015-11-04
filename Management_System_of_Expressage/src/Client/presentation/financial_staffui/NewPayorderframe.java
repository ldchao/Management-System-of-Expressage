package Client.presentation.financial_staffui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class NewPayorderframe extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public NewPayorderframe() {
		setLayout(null);
		
		NewPayorderframe npf = this;

		JLabel label = new JLabel("财务人员>>成本管理>>新建付款单");
		label.setBounds(88, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 1, 68, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				npf.dispose();
				Payframe pf = new Payframe();
			}
		});
		add(button_4);

		JLabel label_1 = new JLabel("付款金额");
		label_1.setBounds(112, 109, 74, 15);
		add(label_1);

		JLabel label_2 = new JLabel("付款人");
		label_2.setBounds(112, 161, 74, 15);
		add(label_2);

		JLabel label_4 = new JLabel("付款账号");
		label_4.setBounds(392, 109, 74, 15);
		add(label_4);

		JLabel label_5 = new JLabel("付款日期");
		label_5.setBounds(392, 161, 74, 15);
		add(label_5);

		textField = new JTextField();
		textField.setBounds(179, 109, 157, 21);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(179, 158, 157, 21);
		textField_1.setColumns(10);
		add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBounds(465, 106, 157, 21);
		textField_2.setColumns(10);
		add(textField_2);

		textField_3 = new JTextField();
		textField_3.setBounds(465, 158, 157, 21);
		textField_3.setColumns(10);
		add(textField_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 423, 815, 32);
		add(toolBar);

		JLabel lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		JLabel label_3 = new JLabel("\u4ED8\u6B3E\u6761\u76EE");
		label_3.setBounds(112, 201, 74, 15);
		add(label_3);

		JLabel label_6 = new JLabel("\u5907\u6CE8");
		label_6.setBounds(112, 287, 74, 15);
		add(label_6);

		JLabel label_7 = new JLabel("\u4ED8\u6B3E\u4FE1\u606F");
		label_7.setFont(new Font("黑体", Font.BOLD, 15));
		label_7.setBounds(346, 66, 86, 15);
		add(label_7);

		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("创建成功！");
			}
		});
		button.setBounds(254, 373, 93, 23);
		add(button);

		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.setBounds(419, 373, 93, 23);
		add(button_1);

		JTextArea textArea = new JTextArea();
		JScrollPane jsp = new JScrollPane(textArea);
		jsp.setBounds(179, 197, 443, 69);
		add(jsp);

		JTextArea textArea_1 = new JTextArea();
		JScrollPane jsp2 = new JScrollPane(textArea_1);
		jsp2.setBounds(179, 283, 443, 69);
		add(jsp2);

		// frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 490);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}
