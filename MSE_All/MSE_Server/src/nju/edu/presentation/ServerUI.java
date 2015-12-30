package nju.edu.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Graphics;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
