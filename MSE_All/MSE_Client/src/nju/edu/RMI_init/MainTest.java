package nju.edu.RMI_init;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import nju.edu.presentation.Business_hall_salesmanui.Business_hall_salesmanMainUI;
import nju.edu.presentation.Transit_center_salesmanui.Transit_center_salesman_mainui;
import nju.edu.presentation.Transit_center_storemasterui.Transit_center_storemaster_mainui;
import nju.edu.presentation.courierui.Courier;
import nju.edu.presentation.financial_staffui.fsframe;
import nju.edu.presentation.general_managerui.Manager;
import nju.edu.presentation.system_administratorui.Administratorframe;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainTest extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainTest frame = new MainTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainTest() {
		MainTest main = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u5FEB\u9012\u5458");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
				Courier aCourier=new Courier();
				aCourier.setVisible(true);
			}
		});
		btnNewButton.setBounds(105, 85, 121, 88);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u8425\u4E1A\u5385\u4E1A\u52A1\u5458");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Business_hall_salesmanMainUI frame = new Business_hall_salesmanMainUI();
				frame.setVisible(true);
				main.dispose();
			}
		});
		button.setBounds(317, 85, 121, 88);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
				Transit_center_salesman_mainui tcs = new Transit_center_salesman_mainui();
				tcs.setVisible(true);
			}
		});
		button_1.setBounds(515, 85, 121, 88);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u4ED3\u5E93\u7BA1\u7406\u5458");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
				Transit_center_storemaster_mainui ts = new Transit_center_storemaster_mainui();
				ts.setVisible(true);
			}
		});
		button_2.setBounds(105, 216, 121, 88);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u8D22\u52A1\u4EBA\u5458");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.dispose();
				fsframe fs = new fsframe();
			}
		});
		button_3.setBounds(283, 216, 121, 88);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("\u603B\u7ECF\u7406");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager frame = new Manager();
				frame.setVisible(true);
				main.dispose();
			}
		});
		button_4.setBounds(436, 216, 121, 88);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("\u7CFB\u7EDF\u7BA1\u7406\u5458");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
				Administratorframe adf = new Administratorframe();
			}
		});
		button_5.setBounds(588, 216, 121, 88);
		contentPane.add(button_5);
	}
}
