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

public class ServerUI extends JFrame implements Runnable {

	private Content contentPane;
	SimpleDateFormat bartDateFormat;
	Date date;
	String sendDate;
	JFrame serverui;
	JLabel time ;

	/**
	 * Create the frame.
	 */
	
	
	public ServerUI() {
		serverui = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		contentPane = new Content();
		contentPane.repaint();
		getContentPane().add(contentPane);
		contentPane.setLayout(null);

		Thread t=new Thread(this);		
		t.start();
	}
	
	public class Content extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			ImageIcon image = new ImageIcon("image/server.png");
			g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
		}
		
		public Content(){
			String ip = "ÍøÂçÁ¬½Ó³ö´í£¡";
			try {
				ip = InetAddress.getLocalHost().getHostAddress();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
			JLabel ipAddress = new JLabel(ip);
			ipAddress.setForeground(new Color(88, 93, 103));
			ipAddress.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
			ipAddress.setBounds(298, 246, 189, 34);
			add(ipAddress);
			
			bartDateFormat = new SimpleDateFormat("yyyyÄêMMÔÂddÈÕ  EEE  HH:mm:ss");
			date = new Date();
			sendDate = bartDateFormat.format(date);
			time= new JLabel(sendDate);
			time.setForeground(new Color(88, 93, 103));
			time.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
			time.setBounds(298, 339, 352, 28);
			add(time);
//			repaint();
		}
		
	}

	@Override
	public void run() {
		while (serverui!=null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			date = new Date();
			sendDate = bartDateFormat.format(date);
			time.setText(sendDate);
		}
	}

}
