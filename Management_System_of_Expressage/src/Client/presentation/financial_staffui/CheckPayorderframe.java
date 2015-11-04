package Client.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckPayorderframe extends JFrame {

	/**
	 * Create the panel.
	 */
	public CheckPayorderframe() {
		getContentPane().setLayout(null);

		CheckPayorderframe cpf = this;
		
		JLabel label = new JLabel("\u8D22\u52A1\u4EBA\u5458>>\u6210\u672C\u7BA1\u7406>>\u67E5\u770B\u4ED8\u6B3E\u5355\u8BB0\u5F55");
		label.setBounds(92, 8, 563, 15);
		getContentPane().add(label);
		
		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(700, 8, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpf.dispose();
				Payframe pf = new Payframe();
			}
		});
		button_4.setBounds(15, 6, 70, 23);
		getContentPane().add(button_4);
		
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 490);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
