package Client.presentation.system_administratorui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Client.presentation.financial_staffui.NewPayorderframe;
import Client.presentation.financial_staffui.fsframe;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Administratorframe extends JFrame {

	/**
	 * Create the panel.
	 */
	public Administratorframe() {
		getContentPane().setLayout(null);

		Administratorframe adf = this;

		JLabel label = new JLabel("\u7CFB\u7EDF\u7BA1\u7406\u5458");
		label.setBounds(87, 10, 470, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(630, 10, 54, 15);
		getContentPane().add(lblHello);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adf.dispose();
				NewUserframe nuf = new NewUserframe();
			}
		});
		btnNewButton.setBounds(119, 142, 211, 198);
		getContentPane().add(btnNewButton);

		JLabel label_1 = new JLabel("\u65B0\u5EFA\u7528\u6237");
		label_1.setBounds(190, 117, 81, 15);
		getContentPane().add(label_1);

		JLabel label_4 = new JLabel("\u5DF2\u6709\u7528\u6237\u7BA1\u7406");
		label_4.setBounds(501, 117, 81, 15);
		getContentPane().add(label_4);

		JButton button_4 = new JButton("\u9000\u51FA");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adf.dispose();
			}
		});
		button_4.setBounds(10, 6, 67, 23);
		getContentPane().add(button_4);

		JButton button = new JButton("New button");
		button.setBounds(433, 142, 211, 198);
		getContentPane().add(button);

		// frame
		this.setTitle("��ݹ���ϵͳMSE�ͻ���");
		this.setSize(750, 490);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public static void main(String[] args) {
		Administratorframe adframe =  new Administratorframe();
	}

}
