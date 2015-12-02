package nju.edu.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;

@SuppressWarnings("serial")
public class Calculateframe extends JFrame implements Runnable {
	private boolean signal;
	private JTextField textField;
	private JLabel label_2;

	/**
	 * Create the panel.
	 */
	public Calculateframe(LoginPO loginPO) {

		Calculateframe cf = this;
		getContentPane().setLayout(null);
		signal = false;

		JLabel label = new JLabel("������Ա>>�������");
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
				fsframe fs = new fsframe(loginPO);
			}
		});
		getContentPane().add(button_4);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate2 = new JLabel("�뵥��ѡ������");
		showDate2.setBounds(320, 252, 93, 34);
		dateChooser2.register(showDate2);
		getContentPane().add(showDate2);

		textField = new JTextField();
		textField.setBounds(381, 177, 102, 21);
		getContentPane().add(textField);
		textField.setColumns(10);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		getContentPane().add(toolBar);

		label_2 = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(label_2);

		JButton button = new JButton("\u786E\u8BA4");
		button.setBounds(320, 426, 93, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String date = showDate2.getText();
				String shop = textField.getText();
				if (!date.equals("�뵥��ѡ������") && !shop.equals("")) {
					CheckPayeeframe cpef = new CheckPayeeframe(loginPO, date,
							shop);
					cf.dispose();
				} else {
					label_2.setText("������Ӫҵ����Ų�ѡ�����ں�ȷ��");
					signal = true;
				}
			}
		});
		getContentPane().add(button);

		JLabel label_1 = new JLabel(
				"\u8BF7\u8F93\u5165\u8425\u4E1A\u5385\u7F16\u53F7");
		label_1.setBounds(258, 180, 111, 15);
		getContentPane().add(label_1);

		// frame
		this.setTitle("��ݹ���ϵͳMSE�ͻ���");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				label_2.setText("״̬��");
				signal = false;
			}
		}

	}
}