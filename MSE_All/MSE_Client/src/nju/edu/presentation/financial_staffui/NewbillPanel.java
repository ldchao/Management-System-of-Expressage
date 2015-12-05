package nju.edu.presentation.financial_staffui;

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

import PO.LoginPO;
import nju.edu.businesslogic.billbl.BillBL;

@SuppressWarnings("serial")
public class NewbillPanel extends JPanel implements Runnable {
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	private boolean signal;
	private boolean success;
	private Thread t;
	private JLabel lblNewLabel;
	BillBL billBL = new BillBL();

	/**
	 * Create the panel.
	 */
	public NewbillPanel(LoginPO loginPO, JFrame main) {
		success = false;
		signal = false;
		setLayout(null);
		setSize(750, 600);

		NewbillPanel nbp = this;
		
		t = new Thread(this);
	    t.start();

		JLabel label = new JLabel("财务人员>>期初建账>>新建账");
		label.setBounds(88, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 1, 68, 23);
		button_4.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				main.remove(nbp);
				BillPanel bp = new BillPanel(loginPO, main);
				main.add(bp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
				t.stop();
			}
		});
		add(button_4);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		toolBar.setEnabled(false);
		add(toolBar);

		lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);

		JLabel label_1 = new JLabel("\u8D26\u540D\u79F0");
		label_1.setBounds(118, 126, 42, 15);
		add(label_1);

		JLabel label_2 = new JLabel("\u94F6\u884C\u8D26\u6237");
		label_2.setBounds(395, 126, 61, 15);
		add(label_2);

		JLabel label_3 = new JLabel("\u673A\u6784");
		label_3.setBounds(118, 189, 42, 15);
		add(label_3);

		textField = new JTextField();
		textField.setBounds(170, 123, 172, 21);
		add(textField);
		textField.setColumns(10);
		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(170, 189, 172, 77);
		add(jsp);

		textArea = new JTextArea();
		jsp.setViewportView(textArea);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(466, 123, 172, 21);
		add(textField_1);

		JLabel label_4 = new JLabel("\u4EBA\u5458");
		label_4.setBounds(395, 189, 60, 15);
		add(label_4);
		JScrollPane jsp1 = new JScrollPane();
		jsp1.setBounds(466, 189, 172, 77);
		add(jsp1);

		textArea_1 = new JTextArea();
		jsp1.setViewportView(textArea_1);

		JLabel label_5 = new JLabel("\u8F66\u8F86");
		label_5.setBounds(118, 304, 42, 15);
		add(label_5);

		JLabel label_6 = new JLabel("\u5E93\u5B58");
		label_6.setBounds(395, 304, 36, 15);
		add(label_6);
		JScrollPane jsp2 = new JScrollPane();
		jsp2.setBounds(170, 304, 172, 77);
		add(jsp2);

		textArea_2 = new JTextArea();
		jsp2.setViewportView(textArea_2);
		JScrollPane jsp3 = new JScrollPane();
		jsp3.setBounds(466, 304, 172, 77);
		add(jsp3);

		textArea_3 = new JTextArea();
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

				signal = true;
			}
		});
		button.setBounds(231, 453, 93, 23);
		add(button);

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
		add(button_1);

		JLabel label_7 = new JLabel("\u8D26\u672C\u4FE1\u606F");
		label_7.setFont(new Font("黑体", Font.BOLD, 15));
		label_7.setBounds(331, 75, 82, 15);
		add(label_7);
	}

	@Override
	public void run() {
		while (true) {
			if (signal) {
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

				lblNewLabel.setText("状态栏");
				signal = false;
			}
		}
	}
}
