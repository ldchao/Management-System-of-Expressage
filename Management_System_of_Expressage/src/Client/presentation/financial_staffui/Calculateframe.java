package Client.presentation.financial_staffui;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;

public class Calculateframe extends JFrame {

	/**
	 * Create the panel.
	 */
	public Calculateframe() {
		
		Calculateframe cf = this;
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);

		JLabel label = new JLabel("财务人员>>结算管理");
		springLayout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, label, 88, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, label, 606, SpringLayout.WEST, getContentPane());
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		springLayout.putConstraint(SpringLayout.NORTH, lblHello, 0, SpringLayout.NORTH, label);
		springLayout.putConstraint(SpringLayout.EAST, lblHello, -37, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		springLayout.putConstraint(SpringLayout.NORTH, button_4, 1, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, button_4, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, button_4, 78, SpringLayout.WEST, getContentPane());
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cf.dispose();
				fsframe fs = new fsframe();
			}
		});
		getContentPane().add(button_4);
	
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate2 = new JLabel("请单击选择日期");
		springLayout.putConstraint(SpringLayout.NORTH, showDate2, 215, SpringLayout.SOUTH, label);
		springLayout.putConstraint(SpringLayout.WEST, showDate2, 320, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, showDate2, -292, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, showDate2, -321, SpringLayout.EAST, getContentPane());
		dateChooser2.register(showDate2);
		
		//frame
		getContentPane().add(showDate2);
		
		JButton button = new JButton("\u786E\u8BA4");
		springLayout.putConstraint(SpringLayout.NORTH, button, 134, SpringLayout.SOUTH, showDate2);
		springLayout.putConstraint(SpringLayout.WEST, button, 0, SpringLayout.WEST, showDate2);
		springLayout.putConstraint(SpringLayout.EAST, button, -321, SpringLayout.EAST, getContentPane());
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cf.dispose();
				CheckPayeeframe cpef =  new CheckPayeeframe();
			}
		});
		getContentPane().add(button);
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 600);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
