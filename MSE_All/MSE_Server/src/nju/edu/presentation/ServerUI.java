package nju.edu.presentation;

import javax.swing.JFrame;

public class ServerUI extends JFrame  {

	private ServerPanel contentPane;
	

	/**
	 * Create the frame.
	 */
	
	
	public ServerUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		contentPane = new ServerPanel();
		getContentPane().add(contentPane);

	
	}	

}
