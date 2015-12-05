package nju.edu.RMI_init;

import javax.swing.JOptionPane;

import nju.edu.presentation.Loginui.LoginFrame;

public class Client {

	public static void main(String[] args) {
		try {
			RMIHelper.init();
			@SuppressWarnings("unused")
			LoginFrame loginFrame = new LoginFrame();
			System.out.println("Client is running now бнбн");
		} catch (ClientInitException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Client boots fail!\nCause: "
					+ e.getMessage(), "Fatal Error", JOptionPane.ERROR_MESSAGE);
		}

	}
}
