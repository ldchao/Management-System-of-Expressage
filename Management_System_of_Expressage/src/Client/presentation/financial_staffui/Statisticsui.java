package Client.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Statisticsui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Statisticsui() {

		setLayout(null);

		JLabel label = new JLabel("\u8D22\u52A1\u4EBA\u5458>>\u7EDF\u8BA1\u62A5\u8868");
		label.setBounds(88, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 1, 68, 23);
		add(button_4);
	}

}
