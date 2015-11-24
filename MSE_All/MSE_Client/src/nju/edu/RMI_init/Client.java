package nju.edu.RMI_init;

import javax.swing.JOptionPane;


public class Client {

	public static void main(String[] args) {
		try {
			RMIHelper.init();
			MainTest main = new MainTest(); // test用，最后用登录界面替换
			main.setVisible(true);  //
			System.out.println("Client is running now ……");
		} catch (ClientInitException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Client boots fail!\nCause: "
					+ e.getMessage(), "Fatal Error", JOptionPane.ERROR_MESSAGE);
		}

	}
}
