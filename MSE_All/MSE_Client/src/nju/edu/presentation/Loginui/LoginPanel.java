package nju.edu.presentation.Loginui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import nju.edu.businesslogic.loginbl.LoginBL;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import PO.LoginPO;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class LoginPanel extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private String user;
	private String key;
	LoginBL loginbl = new LoginBL();

	/**
	 * Create the panel.
	 */
	public LoginPanel(JFrame main) {
		this.setLayout(null);
		this.setSize(750, 600);
		JPanel loginPanel = this;

		// 密码
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(492, 255, 93, 20);
		add(lblNewLabel);

		// 用户名
		JLabel label_4 = new JLabel("");
		label_4.setForeground(Color.RED);
		label_4.setBounds(493, 310, 93, 20);
		add(label_4);

		// 记住用户名
		JCheckBox checkBox = new JCheckBox("记住用户名");
		checkBox.setSelected(true);
		checkBox.setBounds(270, 357, 103, 23);
		checkBox.setForeground(new Color(255, 255, 255, 99));
		this.add(checkBox);

		// 记住密码
		JCheckBox checkBox_1 = new JCheckBox("记住密码");
		checkBox_1.setBounds(390, 357, 84, 23);
		checkBox_1.setForeground(new Color(255, 255, 255, 99));
		this.add(checkBox_1);

		String str[] = loginbl.getUser();
		// 用户名
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setForeground(new Color(255, 255, 255, 200));
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				label_4.setText("");
				lblNewLabel.setText("");
			}
		});
		textField.setBounds(332, 257, 160, 34);
		this.add(textField);
		textField.setColumns(10);
		if (!str[0].equals("0"))
			textField.setText(str[0]);

		// 密码
		passwordField = new JPasswordField();
		passwordField.setOpaque(false);
		passwordField.setBorder(null);
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label_4.setText("");
			}
		});
		passwordField.setBounds(332, 308, 160, 34);
		passwordField.setEchoChar('*');
		this.add(passwordField);
		if (!str[1].equals("0")) {
			passwordField.setText(str[1]);
			checkBox_1.setSelected(true);
		}

		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ForgetPassword forgetPassword = new ForgetPassword();
				forgetPassword.setVisible(true);
			}
		});
		label_3.setBounds(249, 482, 77, 15);
		this.add(label_3);

		// 登录
		JButton button = new JButton() {
			public void paintComponent(Graphics g) {
				Graphics2D graphics2d = (Graphics2D)g;
				graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				graphics2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
						RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
				super.paintComponent(graphics2d);
			}
		};
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user = textField.getText();
				key = new String(passwordField.getPassword());
				if (user.equals("")) {
					lblNewLabel.setText("请输入用户名");
				} else if (key.equals("")) {
					label_4.setText("请输入密码");
				} else {
					int isLegal = loginbl.isLegal(user, key);
					if (isLegal == 0) {
						label_4.setText("密码错误");
						passwordField.setText("");
					} else if (isLegal < 0) {
						lblNewLabel.setText("用户不存在");
						passwordField.setText("");
					} else {
						// 获取用户信息
						LoginPO loginPO = loginbl.getUserInfo(user, key);
						loginbl.Enter(main, loginPO);

						if (checkBox.isSelected())
							loginbl.setUser(user, "0");
						else
							loginbl.setUser("0", "0");

						if (checkBox_1.isSelected() && checkBox.isSelected())
							loginbl.setUser(user, key);
					}
				}
			}
		});
		 button.setBounds(270, 409, 90, 40);
		 button.setContentAreaFilled(false);
		 button.setBorderPainted(false);
		 ImageIcon icon = new ImageIcon("image/LoginSure.png");
		 Image temp = icon.getImage().getScaledInstance(button.getWidth(),
		 button.getHeight(),icon.getImage().SCALE_DEFAULT);
		 icon = new ImageIcon(temp);
		 button.setIcon(icon);
		add(button);

		JButton button_1 = new JButton("");

		button_1.setBounds(390, 409, 90, 40);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);

		ImageIcon icon2 = new ImageIcon("image/LoginCancel.png");
		Image temp2 = icon2.getImage().getScaledInstance(button_1.getWidth(), button_1.getHeight(),
				icon2.getImage().SCALE_DEFAULT);
		icon2 = new ImageIcon(temp2);
		button_1.setIcon(icon2);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(loginPanel);
				ChoosePanel choose = new ChoosePanel(main);
				main.getContentPane().add(choose);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button_1);

	}

//	 class SureButton extends JButton {
//	 public void paintComponent(Graphics g){
//	// BufferedImage image = null;
//	 ImageIcon icon = new ImageIcon("image/LoginSure.png");
//	 BufferedImage image =
//	 icon.getImage().getScaledInstance(button.getWidth(), button.getHeight(),
//	 icon.getImage().SCALE_DEFAULT);
//	// BufferedImage image = ImageIO.read(new
//	 FileInputStream("image/LoginSure.png"));
//	 g = image.createGraphics();
//	 Graphics2D graphics = (Graphics2D) g;
//	 graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
//	 RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
//	 graphics.drawImage(image, 0, 0, getSize().width, getSize().height, this);
//	
//	
//	 }
//	 }

	public void paintComponent(Graphics g) {
		ImageIcon icon = new ImageIcon("image/mainLoginUI.png");
		g.drawImage(icon.getImage(), 0, 0, getSize().width, getSize().height, this);
	}
}
