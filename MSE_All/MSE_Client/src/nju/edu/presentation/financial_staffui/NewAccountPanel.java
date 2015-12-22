package nju.edu.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;

import PO.LoginPO;
import nju.edu.businesslogic.accountbl.AccountBL;
import java.awt.Color;

@SuppressWarnings("serial")
public class NewAccountPanel extends JPanel implements Runnable {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private boolean success;
	AccountBL accountBL = new AccountBL();

	/**
	 * Create the panel.
	 */
	public NewAccountPanel(LoginPO loginPO, JFrame main) {
		success = false;
		setLayout(null);
		setSize(750, 600);

		NewAccountPanel nap = this;

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JButton button_4 = new JButton("");
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(nap);
				AccountPanel acp = new AccountPanel(loginPO, main);
				main.getContentPane().add(acp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(13, -9, 63, 63);
		add(button_4);

		textField = new JTextField();
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setBounds(354, 211, 140, 27);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.setBounds(354, 346, 140, 27);
		add(textField_1);
		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		textField_1.setText(date.format(dt));

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setForeground(new Color(88, 93, 103));
		textField_2.setCaretColor(new Color(88, 93, 103));
		textField_2.setOpaque(false);
		textField_2.setBorder(null);
		textField_2.setBounds(354, 256, 140, 27);
		add(textField_2);

		JLabel label_6 = new JLabel("0.0");
		label_6.setForeground(new Color(248, 179, 28));
		label_6.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label_6.setBounds(358, 307, 54, 15);
		add(label_6);

		JToolBar toolBar = new JToolBar();
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		toolBar.setBounds(0, 543, 744, 28);
		toolBar.setEnabled(false);
		add(toolBar);

		lblNewLabel = new JLabel("状态栏");
		lblNewLabel.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel);

		// 确认完成新建
		JButton button = new JButton("");
		button.setBounds(274, 459, 52, 52);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button.getWidth(),
						button.getHeight(),image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button.setIcon(image1);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				String creator = textField_1.getText();
				String date = textField_2.getText();
				Thread t = new Thread(nap);

				if (name.equals("") || creator.equals("") || date.equals("")) {
					lblNewLabel.setText("信息录入不完整，无法完成新建");
					success = false;
				} else {
					lblNewLabel.setText("创建成功！");
					accountBL.addAccount(name, "0.0", creator, date);
					success = true;
				}

				t.start();
			}
		});
		add(button);

		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBounds(425, 459, 52, 52);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_2.setText("");
				lblNewLabel.setText("状态栏");
			}
		});
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button_1.getWidth(),
						button_1.getHeight(),image1.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button_1.setIcon(image2);
		add(button_1);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/financial_stuff/newAccount.png");
		g.drawImage(image.getImage(), 0, 0,getSize().width,getSize().height, this);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		lblNewLabel.setText("状态栏");

		if (success) {
			textField.setText("");
			textField_2.setText("");
		}

		success = false;
	}
}