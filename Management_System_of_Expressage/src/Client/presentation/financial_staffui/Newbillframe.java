package Client.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTextArea;

import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.JTable;

public class Newbillframe extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Newbillframe() {
		setLayout(null);
		
		Newbillframe nbf = this;

		JLabel label = new JLabel("财务人员>>期初建账>>新建账");
		label.setBounds(88, 5, 518, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		add(lblHello);

		JButton button_4 = new JButton("\u8FD4\u56DE");
		button_4.setBounds(10, 1, 68, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbf.dispose();
				Billframe bf = new Billframe();
			}
		});
		add(button_4);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 423, 815, 32);
		add(toolBar);
		
		JLabel lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u8D26\u540D\u79F0");
		label_1.setBounds(150, 126, 60, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u94F6\u884C\u8D26\u6237");
		label_2.setBounds(417, 126, 60, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("\u673A\u6784");
		label_3.setBounds(150, 181, 60, 15);
		add(label_3);
		
		textField = new JTextField();
		textField.setBounds(220, 123, 172, 21);
		add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		JScrollPane jsp = new JScrollPane(textArea);
		jsp.setBounds(220, 177, 172, 77);
		add(jsp);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(485, 123, 172, 21);
		add(textField_1);
		
		JLabel label_4 = new JLabel("\u4EBA\u5458");
		label_4.setBounds(417, 181, 60, 15);
		add(label_4);
		
		JTextArea textArea_1 = new JTextArea();
		JScrollPane jsp1 = new JScrollPane(textArea_1);
		jsp1.setBounds(485, 177, 172, 77);
		add(jsp1);
		
		JLabel label_5 = new JLabel("\u8F66\u8F86");
		label_5.setBounds(150, 280, 60, 15);
		add(label_5);
		
		JLabel label_6 = new JLabel("\u5E93\u5B58");
		label_6.setBounds(417, 280, 60, 15);
		add(label_6);
		
		JTextArea textArea_2 = new JTextArea();
		JScrollPane jsp2 = new JScrollPane(textArea_2);
		jsp2.setBounds(220, 276, 172, 77);
		add(jsp2);
		
		JTextArea textArea_3 = new JTextArea();
		JScrollPane jsp3 = new JScrollPane(textArea_3);
		jsp3.setBounds(485, 276, 172, 77);
		add(jsp3);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("创建成功！");
			}
		});
		button.setBounds(314, 390, 93, 23);
		add(button);

		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.setBounds(471, 390, 93, 23);
		add(button_1);
		
		JLabel label_7 = new JLabel("\u8D26\u672C\u4FE1\u606F");
		label_7.setFont(new Font("黑体", Font.BOLD, 15));
		label_7.setBounds(373, 75, 82, 15);
		add(label_7);

		
		//frame
		this.setTitle("快递管理系统MSE客户端");
    	this.setSize(750, 490);
    	this.setLocation(400, 100);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.setResizable(false);
	}
}
