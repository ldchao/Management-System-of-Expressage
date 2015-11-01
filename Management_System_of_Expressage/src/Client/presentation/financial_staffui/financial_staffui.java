package Client.presentation.financial_staffui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class financial_staffui extends JPanel {

	/**
	 * Create the panel.
	 */
	
	public financial_staffui() {
		setLayout(null);
		
		JLabel label = new JLabel("财务人员");
		label.setBounds(87, 10, 470, 15);
		add(label);
		
		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(630, 10, 54, 15);
		add(lblHello);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(96, 111, 124, 108);
		add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(294, 111, 124, 108);
		add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(482, 111, 124, 108);
		add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(198, 289, 124, 108);
		add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(392, 289, 124, 108);
		add(button_3);
		
		JLabel label_1 = new JLabel("成本管理");
		label_1.setBounds(132, 89, 81, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("结算管理");
		label_2.setBounds(330, 89, 81, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("统计报表");
		label_3.setBounds(525, 89, 81, 15);
		add(label_3);
		
		JLabel label_4 = new JLabel("期初建账");
		label_4.setBounds(233, 264, 81, 15);
		add(label_4);
		
		JLabel label_5 = new JLabel("账户管理");
		label_5.setBounds(427, 264, 81, 15);
		add(label_5);
		
		JButton button_4 = new JButton("\u9000\u51FA");
		button_4.setBounds(10, 6, 67, 23);
		add(button_4);

	}
}
