package nju.edu.presentation.Loginui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JPasswordField;

import nju.edu.businesslogic.staffbl.UserBL;
import nju.edu.businesslogicservice.loginblservice.UpdatePasswordService;
import PO.LoginPO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class UpdatePasswordFrame extends JFrame implements Runnable {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private String oldKey;
	private String newKey1;
	private String newkey2;
	private JLabel label_4;

	/**
	 * Create the frame.
	 */
	public UpdatePasswordFrame(LoginPO loginPO, JFrame main) {
		setSize(400, 310);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);

		UpdatePasswordFrame upframe = this;

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u4FEE\u6539\u5BC6\u7801");
		label.setFont(new Font("��������", Font.BOLD, 18));
		label.setBounds(147, 31, 87, 15);
		contentPane.add(label);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(-1, 257, 395, 23);
		toolBar.setEnabled(false);
		contentPane.add(toolBar);

		label_4 = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(label_4);

		passwordField = new JPasswordField();
		passwordField.setBounds(182, 70, 140, 21);
		contentPane.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(182, 109, 140, 21);
		contentPane.add(passwordField_1);

		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(182, 151, 140, 21);
		contentPane.add(passwordField_2);

		JLabel label_1 = new JLabel(
				"\u8BF7\u8F93\u5165\u539F\u5BC6\u7801\uFF1A");
		label_1.setBounds(58, 73, 93, 15);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel(
				"\u8BF7\u8F93\u5165\u65B0\u5BC6\u7801\uFF1A");
		label_2.setBounds(58, 112, 99, 15);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel(
				"\u8BF7\u518D\u6B21\u786E\u8BA4\u65B0\u5BC6\u7801\uFF1A");
		label_3.setBounds(58, 154, 119, 15);
		contentPane.add(label_3);

		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent arg0) {
				oldKey = new String(passwordField.getPassword());
				newKey1 = new String(passwordField_1.getPassword());
				newkey2 = new String(passwordField_2.getPassword());
				Thread t = new Thread(upframe);

				if (oldKey.equals("") || newKey1.equals("")
						|| newkey2.equals("")
						|| oldKey.replaceAll(" ", "").equals("")
						|| newKey1.replaceAll(" ", "").equals("")
						|| newkey2.replaceAll(" ", "").equals("")) {
					label_4.setText("��Ϣ���벻�������޷�����޸�");
					t.start();
				} else {
					if (oldKey.equals(loginPO.getPassword())) {
						if (newKey1.equals(newkey2)) {
							if (newKey1.contains(";")) {
								label_4.setText("���зǷ��ַ���;������������������");
								t.start();
							} else {
								UpdatePasswordService userbl = new UserBL();
								userbl.UpdatePassword(loginPO.getUser(),
										newKey1);
								label_4.setText("�޸ĳɹ��������µ�½");
								t.start();
								dispose();
								main.dispose();
								LoginFrame loginFrame = new LoginFrame();
							}
						} else {
							label_4.setText("�����������벻һ�£������º˶�");
							t.start();
						}
					} else {
						label_4.setText("ԭ�������");
						t.start();
					}
				}
			}
		});
		button.setBounds(104, 194, 68, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("\u653E\u5F03");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button_1.setBounds(207, 194, 68, 23);
		contentPane.add(button_1);

	}

	@Override
	public void run() {
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}

		label_4.setText("״̬��");
	}
}
