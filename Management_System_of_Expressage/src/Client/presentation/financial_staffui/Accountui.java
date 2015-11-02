package Client.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Accountui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Accountui() {

		setLayout(null);

		JLabel label = new JLabel(
				"\u8D22\u52A1\u4EBA\u5458>>\u8D26\u6237\u7BA1\u7406");
		label.setBounds(87, 10, 470, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(630, 10, 54, 15);
		add(lblHello);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(115, 142, 211, 198);
		add(btnNewButton);

		JLabel label_1 = new JLabel("\u65B0\u5EFA\u8D26\u6237");
		label_1.setBounds(190, 117, 81, 15);
		add(label_1);

		JLabel label_4 = new JLabel("\u5DF2\u6709\u8D26\u6237\u7BA1\u7406");
		label_4.setBounds(501, 117, 81, 15);
		add(label_4);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 6, 67, 23);
		add(button_4);

		JButton button = new JButton("New button");
		button.setBounds(433, 142, 211, 198);
		add(button);
	}
}
