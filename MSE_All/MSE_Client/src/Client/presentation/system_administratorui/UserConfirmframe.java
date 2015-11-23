package Client.presentation.system_administratorui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Client.businesslogic.staffbl.UserBL;

public class UserConfirmframe extends JFrame {
	UserBL usb = new UserBL();

	/**
	 * Create the panel.
	 */
	public UserConfirmframe(String name) {
		getContentPane().setLayout(null);

		UserConfirmframe conframe = this;

		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conframe.dispose();
				usb.deleteUser(name);
				CheckUserframe.showTable(usb.checkUsers());

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

		JLabel label = new JLabel("\u662F\u5426\u786E\u8BA4\u5220\u9664");
		label.setBounds(104, 42, 79, 15);
		getContentPane().add(label);

		// frame
		this.setSize(300, 180);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
