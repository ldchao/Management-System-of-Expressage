package nju.edu.presentation.system_administratorui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import PO.LoginPO;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Enumeration;

import nju.edu.businesslogic.staffbl.UserBL;

@SuppressWarnings("serial")
public class NewUserPanel extends JPanel implements Runnable {
	private JTextField textField;
	private JTextField textField_1;
	private boolean success;
	private JLabel lblNewLabel;
	private AbstractButton btn;
	UserBL userBL = new UserBL();

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/system_stuff/newUserPanel.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
	public NewUserPanel(LoginPO loginPO, JFrame main) {
		success = false;
		setLayout(null);

		NewUserPanel nup = this;

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JButton button_4 = new JButton("");
		button_4.setBounds(13, -9, 63, 63);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_4.addMouseListener(new MouseAdapter() {
					@Override
			public void mousePressed(MouseEvent e) {
				button_4.setIcon(new ImageIcon("image/mask_circle.png"));
			}	
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nup);
				AdminPanel adp = new AdminPanel(loginPO, main);
				main.getContentPane().add(adp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button_4);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		toolBar.setEnabled(false);
		add(toolBar);

		lblNewLabel = new JLabel("状态栏");
		lblNewLabel.setForeground(Color.white);
		toolBar.add(lblNewLabel);

		textField = new JTextField();
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setBounds(237, 200, 128, 21);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.setBounds(476, 200, 128, 21);
		add(textField_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton(
				"\u5FEB\u9012\u5458");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255,200));
		rdbtnNewRadioButton.setBounds(230, 263, 84, 23);
		add(rdbtnNewRadioButton);

		JRadioButton radioButton_1 = new JRadioButton(
				"\u8425\u4E1A\u5385\u4E1A\u52A1\u5458");
		radioButton_1.setBounds(230, 380, 111, 23);
		radioButton_1.setForeground(new Color(255, 255, 255,200));
		add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("\u603B\u7ECF\u7406");
		radioButton_2.setBounds(230, 303, 84, 23);
		radioButton_2.setForeground(new Color(255, 255, 255,200));
		add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton(
				"\u8D22\u52A1\u4EBA\u5458");
		radioButton_3.setBounds(398, 340, 84, 23);
		radioButton_3.setForeground(new Color(255, 255, 255,200));
		add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton(
				"\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		radioButton_4.setBounds(398, 263, 128, 23);
		radioButton_4.setForeground(new Color(255, 255, 255,200));
		add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton(
				"\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u5458");
		radioButton_5.setBounds(398, 380, 178, 23);
		radioButton_5.setForeground(new Color(255, 255, 255,200));
		add(radioButton_5);

		JRadioButton radioButton_6 = new JRadioButton(
				"\u7CFB\u7EDF\u7BA1\u7406\u5458");
		radioButton_6.setBounds(230, 340, 103, 23);
		radioButton_6.setForeground(new Color(255, 255, 255,200));
		add(radioButton_6);

		JRadioButton radioButton_7 = new JRadioButton(
				"\u9AD8\u7EA7\u8D22\u52A1\u4EBA\u5458");
		radioButton_7.setBounds(398, 303, 111, 23);
		radioButton_7.setForeground(new Color(255, 255, 255,200));
		add(radioButton_7);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(radioButton_1);
		bg.add(radioButton_2);
		bg.add(radioButton_3);
		bg.add(radioButton_4);
		bg.add(radioButton_5);
		bg.add(radioButton_6);
		bg.add(radioButton_7);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String key = textField_1.getText();
				String limit = "";

				// 获取单选的内容
				Enumeration<AbstractButton> radioBtns = bg.getElements();
				btn = null;
				while (radioBtns.hasMoreElements()) {
					btn = radioBtns.nextElement();
					if (btn.isSelected()) {
						limit = btn.getText();
						break;
					}
				}

				if (name.equals("") || key.equals("") || limit.equals("")) {
					lblNewLabel.setText("信息录入不完整，无法完成新建");
					success = false;
				} else {
					if (key.contains(";")) {
						lblNewLabel.setText("含有非法字符“;”，请重新设置密码");
						success = false;
					} else {
						userBL.addUser(name, key, limit);
						lblNewLabel.setText("创建成功!");
						success = true;
					}
				}

				Thread t = new Thread(nup);
				t.start();
			}
		});
		button.setBounds(274, 459, 52, 52);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button.getWidth(),
						button.getHeight(),image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button.setIcon(image2);
		add(button);

		JButton button_1 = new JButton("");
		button_1.setBounds(425, 459, 52, 52);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		ImageIcon image = new ImageIcon("image/transparent_circle.png");
		Image temp = image.getImage().getScaledInstance(button_1.getWidth(),
						button_1.getHeight(),image.getImage().SCALE_DEFAULT);
		image = new ImageIcon(temp);
		button_1.setIcon(image);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				// 取消选择！
			}
		});
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
			btn.setSelected(false);
			// 怎么取消单选框的选择！
		}

		lblNewLabel.setText("状态栏");
	}
}