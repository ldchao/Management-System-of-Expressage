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
		
		JLabel label = new JLabel("������Ա>>�ɱ�����");
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
		button.setBounds(163, 160, 186, 172);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pf.dispose();
				CheckPayorderframe cpf = new CheckPayorderframe();
			}
		});
		button_1.setBounds(441, 160, 175, 172);
		getContentPane().add(button_1);
		
		JLabel label_1 = new JLabel("\u65B0\u5EFA\u4ED8\u6B3E\u5355");
		label_1.setBounds(221, 124, 67, 15);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u67E5\u770B\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label_2.setBounds(488, 124, 101, 15);
		getContentPane().add(label_2);
		
		
		//frame
		this.setTitle("��ݹ���ϵͳMSE�ͻ���");
    	this.setSize(750, 490);
    	this.setLocation(400, 100);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
	}
}
