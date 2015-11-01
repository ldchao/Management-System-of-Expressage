package Client.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckPayorder extends JPanel {

	/**
	 * Create the panel.
	 */
	public CheckPayorder() {
		setLayout(null);

		JLabel label = new JLabel("\u8D22\u52A1\u4EBA\u5458>>\u6210\u672C\u7BA1\u7406>>\u67E5\u770B\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label.setBounds(84, 10, 563, 15);
		add(label);
		
		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(700, 8, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(15, 6, 57, 23);
		add(button_4);
	}

}
