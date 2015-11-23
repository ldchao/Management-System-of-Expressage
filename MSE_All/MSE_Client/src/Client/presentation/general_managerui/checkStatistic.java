package Client.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Client.presentation.financial_staffui.DateChooser;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class checkStatistic extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					checkStatistic frame = new checkStatistic();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public checkStatistic() {
		checkStatistic checkStatisticframe=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatisticframe.dispose();
				checkStatics_Analysis newcheckStatics_Analysis=new checkStatics_Analysis();
			}
		});
		button.setBounds(10, 10, 75, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u7EDF\u8BA1\u62A5\u8868\u67E5\u8BE2");
		label.setBounds(95, 14, 211, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u70B9\u51FB\u53F3\u4FA7\u6309\u94AE\u9009\u62E9\u8D77\u59CB\u65F6\u95F4");
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		label_1.setBounds(201, 164, 211, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("ÆðÊ¼ÈÕÆÚ");
		label_2.setBounds(449, 165, 54, 15);
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser1.register(label_2);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u8BF7\u70B9\u51FB\u53F3\u4FA7\u6309\u94AE\u9009\u62E9\u7ED3\u675F\u65F6\u95F4");
		label_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		label_3.setBounds(201, 268, 211, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u7ED3\u675F\u65E5\u671F");
		label_4.setBounds(449, 269, 54, 15);
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser2.register(label_4);
		contentPane.add(label_4);
		
		JButton button_1 = new JButton("\u786E\u5B9A");
		button_1.setBounds(251, 375, 75, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u53D6\u6D88");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatisticframe.dispose();
			}
		});
		button_2.setBounds(415, 375, 75, 23);
		contentPane.add(button_2);
	}

}
