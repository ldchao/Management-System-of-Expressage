package nju.edu.presentation.Loginui;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame {

	/**
	 * Create the panel.
	 */
	public LoginFrame() {

		ChoosePanel choose = new ChoosePanel(this);
		this.add(choose);

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
