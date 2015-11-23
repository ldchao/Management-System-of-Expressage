package Client.presentation.financial_staffui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Statisticsframe extends JFrame {

	/**
	 * Create the panel.
	 */
	public Statisticsframe() {
		getContentPane().setLayout(null);

		Statisticsframe stf = this;

		JLabel label = new JLabel("\u8D22\u52A1\u4EBA\u5458>>\u7EDF\u8BA1\u62A5\u8868");
		label.setBounds(88, 5, 518, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stf.dispose();
				fsframe fs = new fsframe();
			}
		});
		button_4.setBounds(10, 1, 68, 23);
		getContentPane().add(button_4);
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate1 = new JLabel("请单击选择起始日期");
		showDate1.setBounds(182, 238, 122, 23);
		dateChooser1.register(showDate1);
		
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate2 = new JLabel("请单击选择结束日期");
		showDate2.setBounds(500, 231, 122, 30);
		dateChooser2.register(showDate2);
		
		//frame
		this.setTitle("快递管理系统MSE客户端");
		getContentPane().add(showDate1);
		getContentPane().add(showDate2);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stf.dispose();
				CheckStatisticsframe cstf = new CheckStatisticsframe();
			}
		});
		button.setBounds(309, 405, 93, 23);
		getContentPane().add(button);
		
		JLabel label_1 = new JLabel("\u8D77\u59CB\u65E5\u671F\uFF1A");
		label_1.setBounds(88, 242, 65, 15);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u8D77\u59CB\u65E5\u671F\uFF1A");
		label_2.setBounds(413, 239, 65, 15);
		getContentPane().add(label_2);
    	this.setSize(750, 600);
    	this.setLocation(400, 100);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
	}
}