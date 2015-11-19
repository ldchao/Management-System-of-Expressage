package Client.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTextArea;

import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.JTable;

import Client.businesslogic.billbl.BillBL;

public class Newbillframe extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	BillBL billBL = new BillBL();

	/**
	 * Create the panel.
	 */
	public Newbillframe() {
		getContentPane().setLayout(null);

		Newbillframe nbf = this;

		JLabel label = new JLabel("财务人员>>期初建账>>新建账");
		label.setBounds(88, 5, 518, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 1, 68, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbf.dispose();
				Billframe bf = new Billframe();
			}
		});
		getContentPane().add(button_4);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		getContentPane().add(toolBar);

		JLabel lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		JLabel label_1 = new JLabel("\u8D26\u540D\u79F0");
		label_1.setBounds(118, 126, 42, 15);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\u94F6\u884C\u8D26\u6237");
		label_2.setBounds(395, 126, 61, 15);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("\u673A\u6784");
		label_3.setBounds(118, 189, 42, 15);
		getContentPane().add(label_3);

		textField = new JTextField();
		textField.setBounds(170, 123, 172, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(170, 189, 172, 77);
		getContentPane().add(jsp);

		JTextArea textArea = new JTextArea();
		jsp.setViewportView(textArea);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(466, 123, 172, 21);
		getContentPane().add(textField_1);

		JLabel label_4 = new JLabel("\u4EBA\u5458");
		label_4.setBounds(395, 189, 60, 15);
		getContentPane().add(label_4);
		JScrollPane jsp1 = new JScrollPane();
		jsp1.setBounds(466, 189, 172, 77);
		getContentPane().add(jsp1);

		JTextArea textArea_1 = new JTextArea();
		jsp1.setViewportView(textArea_1);

		JLabel label_5 = new JLabel("\u8F66\u8F86");
		label_5.setBounds(118, 304, 42, 15);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("\u5E93\u5B58");
		label_6.setBounds(395, 304, 36, 15);
		getContentPane().add(label_6);
		JScrollPane jsp2 = new JScrollPane();
		jsp2.setBounds(170, 304, 172, 77);
		getContentPane().add(jsp2);

		JTextArea textArea_2 = new JTextArea();
		jsp2.setViewportView(textArea_2);
		JScrollPane jsp3 = new JScrollPane();
		jsp3.setBounds(466, 304, 172, 77);
		getContentPane().add(jsp3);

		JTextArea textArea_3 = new JTextArea();
		jsp3.setViewportView(textArea_3);

		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String name = textField.getText();
				String account = textField_1.getText();
				String organization = textArea.getText();
				String staff = textArea_1.getText();
				String vehicle = textArea_2.getText();
				String store = textArea_3.getText();
				boolean success = false;

				if (name.equals("") || account.equals("")
						|| organization.equals("") || staff.equals("")
						|| vehicle.equals("") || store.equals("")) {
					lblNewLabel.setText("信息录入不完整，无法完成新建");
					success = false;
				} else {
					billBL.addBill(name, account, organization, staff, vehicle,
							store);
					lblNewLabel.setText("创建成功！"); // 目标在线程前执行
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
					textArea.setText("");
					textArea_1.setText("");
					textArea_2.setText("");
					textArea_3.setText("");
				}
			}
		});
		button.setBounds(231, 453, 93, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textArea.setText("");
				textArea_1.setText("");
				textArea_2.setText("");
				textArea.setText("");
				lblNewLabel.setText("状态栏 ");
			}
		});
		button_1.setBounds(420, 453, 93, 23);
		getContentPane().add(button_1);

		JLabel label_7 = new JLabel("\u8D26\u672C\u4FE1\u606F");
		label_7.setFont(new Font("黑体", Font.BOLD, 15));
		label_7.setBounds(331, 75, 82, 15);
		getContentPane().add(label_7);

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
