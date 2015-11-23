package Client.presentation.courierui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Courier extends JFrame {

	public static void main(String []args){
		Courier aCourier=new Courier();
	}
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Courier() {
		Courier courierframe=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 750, 600);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.setBounds(10, 10, 65, 23);
		
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("\u5FEB\u9012\u5458");
		label.setBounds(96, 14, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8BA2\u5355\u8F93\u5165");
		label_1.setBounds(200, 149, 54, 15);
		contentPane.add(label_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courierframe.dispose();
				Order neworder=new Order();
				Thread thread=new Thread(neworder);
				thread.start();
			}
		});
		btnNewButton_1.setBounds(150, 190, 160, 128);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("收件人信息输入");
		lblNewLabel.setBounds(483, 149, 94, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courierframe.dispose();
				Receiver newreceiver=new Receiver();
			}
		});
		btnNewButton_2.setBounds(450, 190, 160, 128);
		contentPane.add(btnNewButton_2);
	}
}
