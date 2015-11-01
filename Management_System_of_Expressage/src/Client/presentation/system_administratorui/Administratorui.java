package Client.presentation.system_administratorui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Administratorui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Administratorui() {

		setLayout(null);

		JLabel label = new JLabel(
				"\u7CFB\u7EDF\u7BA1\u7406\u5458");
		label.setBounds(87, 10, 470, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(630, 10, 54, 15);
		add(lblHello);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(119, 142, 211, 198);
		add(btnNewButton);

		JLabel label_1 = new JLabel("\u65B0\u5EFA\u7528\u6237");
		label_1.setBounds(190, 117, 81, 15);
		add(label_1);

		JLabel label_4 = new JLabel("\u5DF2\u6709\u7528\u6237\u7BA1\u7406");
		label_4.setBounds(501, 117, 81, 15);
		add(label_4);

		JButton button_4 = new JButton("\u9000\u51FA");
		button_4.setBounds(10, 6, 67, 23);
		add(button_4);

		JButton button = new JButton("New button");
		button.setBounds(433, 142, 211, 198);
		add(button);
	}

}
