package Client.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Billui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Billui() {

		setLayout(null);

		JLabel label = new JLabel("财务人员>>期初建账");
		label.setBounds(88, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 1, 68, 23);
		add(button_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(119, 142, 211, 198);
		add(btnNewButton);

		JLabel label_1 = new JLabel("\u65B0\u5EFA\u5E10");
		label_1.setBounds(199, 117, 81, 15);
		add(label_1);

		JLabel label_4 = new JLabel("\u67E5\u770B\u671F\u521D\u4FE1\u606F");
		label_4.setBounds(501, 117, 81, 15);
		add(label_4);
		
		JButton button = new JButton("New button");
		button.setBounds(433, 142, 211, 198);
		add(button);
	}

}
