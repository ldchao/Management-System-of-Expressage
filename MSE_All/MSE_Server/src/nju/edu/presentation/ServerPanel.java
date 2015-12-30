package nju.edu.presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ServerPanel extends JPanel implements Runnable {
	SimpleDateFormat bartDateFormat;
	Date date;
	String sendDate;
	ServerPanel serverui;
	JLabel time;

	/**
	 * Create the panel.
	 */



	public ServerPanel() {
		serverui = this;
		setLayout(null);

		String ip = "ÍøÂçÁ¬½Ó³ö´í£¡";
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		JLabel ipAddress = new JLabel(ip);
		ipAddress.setForeground(new Color(88, 93, 103));
		ipAddress.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		ipAddress.setBounds(277, 227, 189, 34);
		add(ipAddress);

		bartDateFormat = new SimpleDateFormat("yyyyÄêMMÔÂddÈÕ  EEE  HH:mm:ss");
		date = new Date();
		sendDate = bartDateFormat.format(date);
		time = new JLabel(sendDate);
		time.setForeground(new Color(88, 93, 103));
		time.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		time.setBounds(277, 326, 352, 28);
		add(time);
		repaint();

		Thread t=new Thread(this);		
		t.start();
	}

	@Override
	public void run() {
		while (serverui != null) {
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
	@Override
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/server.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}
}
