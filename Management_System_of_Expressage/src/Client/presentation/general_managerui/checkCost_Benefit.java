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

public class checkCost_Benefit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					checkCost_Benefit frame = new checkCost_Benefit();
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
	public checkCost_Benefit() {
		checkCost_Benefit checkCost_Benefitframe=this;
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
				checkCost_Benefitframe.dispose();
				checkStatics_Analysis newcheckStatics_Analysis=new checkStatics_Analysis();
			}
		});
		button.setBounds(10, 10, 75, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u6210\u672C\u6536\u76CA\u8868\u67E5\u8BE2");
		label.setBounds(95, 14, 211, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u70B9\u51FB\u53F3\u4FA7\u6309\u94AE\u9009\u62E9\u8D77\u59CB\u65F6\u95F4");
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		label_1.setBounds(186, 194, 211, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u70B9\u51FB\u53F3\u4FA7\u6309\u94AE\u9009\u62E9\u7ED3\u675F\u65F6\u95F4");
		label_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		label_2.setBounds(186, 272, 211, 15);
		contentPane.add(label_2);
		
		JButton button_3 = new JButton("\u786E\u5B9A");
		button_3.setBounds(233, 353, 93, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("\u53D6\u6D88");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCost_Benefitframe.dispose();
			}
		});
		button_4.setBounds(391, 353, 93, 23);
		contentPane.add(button_4);
		
		JLabel label_3 = new JLabel("\u8D77\u59CB\u65E5\u671F");
		label_3.setBounds(450, 195, 54, 15);
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser1.register(label_3);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u7ED3\u675F\u65E5\u671F");
		label_4.setBounds(450, 273, 54, 15);
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser2.register(label_4);
		contentPane.add(label_4);
	}

}
