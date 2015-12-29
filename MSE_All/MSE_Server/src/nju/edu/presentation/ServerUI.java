package nju.edu.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerUI extends JFrame implements Runnable {

	private JPanel contentPane;
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
		contentPane = new JPanel();
		getContentPane().add(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("快递管理系统服务器");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel.setBounds(229, 113, 310, 68);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("IP地址：");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_1.setBounds(172, 246, 116, 34);
		contentPane.add(lblNewLabel_1);

		String ip = "网络连接出错！";
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		JLabel ipAddress = new JLabel(ip);
		ipAddress.setFont(new Font("微软雅黑", Font.BOLD, 20));
		ipAddress.setBounds(298, 246, 189, 34);
		contentPane.add(ipAddress);

		JLabel lblNewLabel_3 = new JLabel("当前时间：");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_3.setBounds(172, 339, 101, 34);
		contentPane.add(lblNewLabel_3);
		
		bartDateFormat = new SimpleDateFormat("yyyy年MM月dd日  EEE  HH:mm:ss");
		date = new Date();
		sendDate = bartDateFormat.format(date);
		time= new JLabel(sendDate);
		time.setFont(new Font("微软雅黑", Font.BOLD, 20));
		time.setBounds(298, 339, 352, 28);
		contentPane.add(time);
		repaint();

		Thread t=new Thread(this);		
		t.start();
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
