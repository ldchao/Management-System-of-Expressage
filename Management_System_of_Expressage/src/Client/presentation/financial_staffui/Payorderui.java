package Client.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Payorderui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Payorderui() {
		setLayout(null);
		
		JLabel label = new JLabel("财务人员>>成本管理");
		label.setBounds(87, 5, 518, 15);
		add(label);
		
		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fsframe fs = new fsframe();
			}
		});
		button_4.setBounds(10, 1, 67, 23);
		add(button_4);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Newpayframe npf = new Newpayframe();
			}
		});
		button.setBounds(163, 160, 186, 172);
		add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(441, 160, 175, 172);
		add(button_1);
		
		JLabel label_1 = new JLabel("\u65B0\u5EFA\u4ED8\u6B3E\u5355");
		label_1.setBounds(221, 124, 67, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u67E5\u770B\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label_2.setBounds(488, 124, 84, 15);
		add(label_2);
	}
}
