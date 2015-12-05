package nju.edu.presentation.Loginui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ForgetPassword extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ForgetPassword() {
		setSize(450, 300);
		setLocation(450, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JFrame frame = this;

		JLabel label = new JLabel("\u5FD8\u8BB0\u5BC6\u7801\uFF1F");
		label.setFont(new Font("华文行楷", Font.BOLD, 20));
		label.setBounds(164, 36, 121, 55);
		contentPane.add(label);

		JLabel label_1 = new JLabel(
				"\u5927\u9646\u7528\u6237\u8BF7\u53D1\u9001\u77ED\u4FE1\u81F3\u624B\u673A15651706602");
		label_1.setFont(new Font("华文行楷", Font.BOLD, 20));
		label_1.setBounds(45, 72, 364, 70);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel(
				"\u670D\u52A1\u8D39\u7528\u4E00\u767E\u5143\u81EA\u7406");
		label_2.setFont(new Font("华文行楷", Font.BOLD, 20));
		label_2.setBounds(124, 127, 242, 55);
		contentPane.add(label_2);

		JButton btnNewButton = new JButton("\u6715\u5DF2\u9605");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("华文楷体", Font.BOLD, 18));
		btnNewButton.setBounds(170, 202, 93, 23);
		contentPane.add(btnNewButton);
	}
}
