package Client.presentation.financial_staffui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import Client.businesslogic.accountbl.AccountBL;
import Client.presentation.general_managerui.checkAccount;

public class ConfirmFrame extends JFrame {
	AccountBL accountBL = new AccountBL();
	
	/**
	 * Create the panel.
	 */
	public ConfirmFrame(String name) {
		getContentPane().setLayout(null);
		
		ConfirmFrame conframe = this;
 
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conframe.dispose();
				accountBL.deleteAccount(name);
				CheckAccountframe.showTable(accountBL.check());
			}
		});
		btnNewButton.setBounds(53, 87, 71, 23);
		getContentPane().add(btnNewButton);

		JButton button = new JButton("\u53D6\u6D88");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conframe.dispose();
			}
		});
		button.setBounds(154, 87, 71, 23);
		getContentPane().add(button);

		JLabel label = new JLabel(
				"\u662F\u5426\u786E\u8BA4\u5220\u9664");
		label.setBounds(104, 42, 79, 15);
		getContentPane().add(label);

		
		// frame
		this.setSize(300, 180);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
