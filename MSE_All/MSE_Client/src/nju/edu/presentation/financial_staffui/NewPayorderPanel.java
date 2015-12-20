package nju.edu.presentation.financial_staffui;

import java.awt.Font;
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

import PO.LoginPO;
import nju.edu.businesslogic.financebl.PayorderBL;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class NewPayorderPanel extends JPanel implements Runnable {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JLabel lblNewLabel;
	private boolean success;
	PayorderBL payorderBL = new PayorderBL();

	/**
	 * Create the panel.
	 */
	public NewPayorderPanel(LoginPO loginPO, JFrame main) {
		success = false;
		setLayout(null);
		setSize(750, 600);

		NewPayorderPanel npp = this;

		JLabel label = new JLabel("������Ա>>�ɱ�����>>�½����");
		label.setBounds(88, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 1, 68, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(npp);
				PayPanel pp = new PayPanel(loginPO, main);
				main.getContentPane().add(pp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button_4);

		JLabel label_1 = new JLabel("������");
		label_1.setBounds(112, 148, 62, 15);
		add(label_1);

		JLabel label_2 = new JLabel("������");
		label_2.setBounds(112, 205, 54, 15);
		add(label_2);

		JLabel label_4 = new JLabel("�����˺�");
		label_4.setBounds(390, 148, 54, 15);
		add(label_4);

		JLabel label_5 = new JLabel("��������");
		label_5.setBounds(392, 205, 62, 15);
		add(label_5);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		textField.setBounds(179, 145, 157, 21);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(179, 202, 157, 21);
		textField_1.setColumns(10);
		add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBounds(465, 145, 157, 21);
		textField_2.setColumns(10);
		add(textField_2);

		textField_3 = new JTextField();
		textField_3.setBounds(465, 202, 157, 21);
		textField_3.setColumns(10);
		add(textField_3);
		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		textField_3.setText(date.format(dt));

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 543, 744, 28);
		toolBar.setEnabled(false);
		add(toolBar);

		lblNewLabel = new JLabel("״̬��");
		toolBar.add(lblNewLabel);

		JLabel label_3 = new JLabel("\u4ED8\u6B3E\u6761\u76EE");
		label_3.setBounds(112, 261, 54, 15);
		add(label_3);

		JLabel label_6 = new JLabel("\u5907\u6CE8");
		label_6.setBounds(112, 362, 45, 15);
		add(label_6);

		JLabel label_7 = new JLabel("\u4ED8\u6B3E\u4FE1\u606F");
		label_7.setFont(new Font("����", Font.BOLD, 15));
		label_7.setBounds(338, 81, 78, 15);
		add(label_7);

		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(179, 261, 443, 69);
		add(jsp);

		textArea = new JTextArea();
		jsp.setViewportView(textArea);
		JScrollPane jsp2 = new JScrollPane();
		jsp2.setBounds(179, 362, 443, 69);
		add(jsp2);

		textArea_1 = new JTextArea();
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

				if (payname.equals("") || payaccount.equals("")
						|| date.equals("") || list.equals("")
						|| comment.equals("")) {
					lblNewLabel.setText("��Ϣ¼�벻�������޷�����½�");
					success = false;
				} else {
					payorderBL.addPayorder(money, date, payname, payaccount,
							list, comment);
					lblNewLabel.setText("�����ɹ���");
					success = true;
				}

				Thread t = new Thread(npp);
				t.start();
			}
		});
		button.setBounds(238, 468, 93, 23);
		add(button);

		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textArea.setText("");
				textArea_1.setText("");
				lblNewLabel.setText("״̬��");
			}
		});
		button_1.setBounds(413, 468, 93, 23);
		add(button_1);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (success) {
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textArea.setText("");
			textArea_1.setText("");
		}

		lblNewLabel.setText("״̬��");
	}
}
