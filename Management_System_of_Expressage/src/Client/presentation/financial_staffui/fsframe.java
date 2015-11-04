package Client.presentation.financial_staffui;

import javafx.scene.Scene;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fsframe extends JFrame {

	/**
	 * Create the panel.
	 */
	
	public fsframe() {
		getContentPane().setLayout(null);
		
		fsframe fs = this;
		
		JLabel label = new JLabel("财务人员");
		label.setBounds(87, 10, 470, 15);
		getContentPane().add(label);
		
		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(655, 10, 54, 15);
		getContentPane().add(lblHello);
		
		JButton btnNewButton = new JButton("New button");
	//	btnNewButton.setIcon(new ImageIcon("src/scene.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fs.dispose();
				Payframe paymain = new Payframe();
			}
		});
		btnNewButton.setBounds(96, 111, 124, 108);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fs.dispose();
				Calculateframe calframe = new Calculateframe();
			}
		});
		button.setBounds(294, 111, 124, 108);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fs.dispose();
				Statisticsframe sf = new Statisticsframe();
			}
		});
		button_1.setBounds(482, 111, 124, 108);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fs.dispose();
				Billframe billframe = new Billframe();
			}
		});
		button_2.setBounds(198, 289, 124, 108);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fs.dispose();
				Accountframe acf = new Accountframe();
			}
		});
		button_3.setBounds(392, 289, 124, 108);
		getContentPane().add(button_3);
		
		JLabel label_1 = new JLabel("成本管理");
		label_1.setBounds(132, 89, 81, 15);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("结算管理");
		label_2.setBounds(330, 89, 81, 15);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("统计报表");
		label_3.setBounds(525, 89, 81, 15);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("期初建账");
		label_4.setBounds(233, 264, 81, 15);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("账户管理");
		label_5.setBounds(427, 264, 81, 15);
		getContentPane().add(label_5);
		
		JButton button_4 = new JButton("\u9000\u51FA");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fs.dispose();
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		getContentPane().add(button_4);

		//frame
		this.setTitle("快递管理系统MSE客户端");
    	this.setSize(750, 490);
    	this.setLocation(400, 100);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
	}
	
	public static void main(String[] args) {
		fsframe fsframe = new fsframe();
	}
}
