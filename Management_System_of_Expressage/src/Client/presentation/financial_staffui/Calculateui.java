package Client.presentation.financial_staffui;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTree;

public class Calculateui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Calculateui() {

		setLayout(null);

		JLabel label = new JLabel("财务人员>>结算管理");
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
