package Client.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Payframe extends JFrame {

	/**
	 * Create the panel.
	 */
	public Payframe() {
		getContentPane().setLayout(null);
		
		Payframe pf = this;
		
		JLabel label = new JLabel("财务人员>>成本管理");
		label.setBounds(87, 5, 518, 15);
		getContentPane().add(label);
		
		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pf.dispose();
				fsframe fs = new fsframe();
			}
		});
		button_4.setBounds(10, 1, 67, 23);
		getContentPane().add(button_4);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pf.dispose();
				NewPayorderframe npf = new NewPayorderframe();
			}
		});
		button.setBounds(51, 221, 160, 128);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pf.dispose();
				CheckPayorderframe cpf = new CheckPayorderframe();
			}
		});
		button_1.setBounds(298, 221, 160, 128);
		getContentPane().add(button_1);
		
		JLabel label_1 = new JLabel("\u65B0\u5EFA\u4ED8\u6B3E\u5355");
		label_1.setBounds(97, 190, 67, 15);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u67E5\u770B\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label_2.setBounds(338, 190, 101, 15);
		getContentPane().add(label_2);
		
		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pf.dispose();
				Profitframe pro = new Profitframe();
			}
		});
		button_2.setBounds(539, 221, 160, 128);
		getContentPane().add(button_2);
		
		JLabel label_3 = new JLabel("\u67E5\u770B\u6210\u672C\u6536\u76CA\u8868");
		label_3.setBounds(572, 190, 101, 15);
		getContentPane().add(label_3);
		
		
		//frame
		this.setTitle("快递管理系统MSE客户端");
    	this.setSize(750, 600);
    	this.setLocation(400, 100);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
	}
}
