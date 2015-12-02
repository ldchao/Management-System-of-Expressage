package nju.edu.presentation.courierui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sun.misc.Cleaner;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import nju.edu.VO.ReceiverVO;
import nju.edu.businesslogic.listinbl.Receiverinbl;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Receiver extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextArea textArea;
	private Receiverinbl receiverinbl;

	/**
	 * Create the frame.
	 */
	public Receiver() {
		receiverinbl=new Receiverinbl();
		Receiver receiverframe=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 750, 600);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel label = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F\u5355");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		label.setBounds(278, 10, 179, 33);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D");
		label_1.setBounds(34, 256, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5FEB\u9012\u5458");
		label_2.setBounds(34, 123, 54, 15);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(77, 120, 179, 21);
		contentPane.add(textField);
		
		JLabel label_3 = new JLabel("\u5FEB\u9012\u5458\u7535\u8BDD");
		label_3.setBounds(441, 123, 74, 15);
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(514, 120, 179, 21);
		contentPane.add(textField_1);
		
		JLabel label_4 = new JLabel("\u8BA2\u5355\u53F7");
		label_4.setBounds(34, 165, 36, 15);
		contentPane.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(77, 162, 179, 21);
		contentPane.add(textField_2);
		
		JLabel label_5 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F");
		label_5.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_5.setBounds(311, 210, 102, 15);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(77, 253, 179, 21);
		contentPane.add(textField_3);
		
		JLabel label_6 = new JLabel("\u7535\u8BDD");
		label_6.setBounds(461, 256, 54, 15);
		contentPane.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(514, 253, 179, 21);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(77, 297, 179, 21);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(514, 297, 179, 21);
		contentPane.add(textField_6);
		
		JLabel label_7 = new JLabel("\u624B\u673A");
		label_7.setBounds(34, 300, 54, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u5355\u4F4D");
		label_8.setBounds(461, 300, 54, 15);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("\u5730\u5740");
		label_9.setBounds(34, 345, 54, 15);
		contentPane.add(label_9);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(77, 345, 618, 111);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		JLabel label_10 = new JLabel("\u6536\u4EF6\u65F6\u95F4");
		label_10.setBounds(441, 165, 54, 15);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("点击选择日期");
		label_11.setBounds(545, 165, 179, 15);
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser1.register(label_11);
		contentPane.add(label_11);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 534, 598, 28);
		contentPane.add(toolBar);
		
		JLabel label_12 = new JLabel("\u72B6\u6001");
		toolBar.add(label_12);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReceiverVO receiverVO=new ReceiverVO(textField.getText(), textField_1.getText(), textField_2.getText(), label_11.getText(), 
						textField_3.getText(), textField_4.getText(), textField_5.getText(), textField_6.getText(), textArea.getText());
				//function:judge whether the information is not complete
				boolean complete=receiverinbl.JudgeNull(receiverVO);
				if(complete==true){
					boolean valid=receiverinbl.searchOrder(textField_2.getText());
					if(valid==false){
						label_12.setText("此订单不存在");
					}else{
						receiverinbl.addReceiver(receiverVO);
						label_12.setText("新建成功");
						clean();
					}
				}else{
					label_12.setText("信息填写不完整，请补全信息");
				}
			}
		});
		button.setBounds(234, 489, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				receiverframe.dispose();
				Courier newcourier=new Courier();
			}
		});
		button_1.setBounds(10, 10, 93, 23);
		contentPane.add(button_1);
		
		JLabel label_13 = new JLabel("\u6D3E\u4EF6\u5458\u4FE1\u606F");
		label_13.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_13.setBounds(311, 76, 85, 15);
		contentPane.add(label_13);
		
		JButton button_2 = new JButton("\u6E05\u7A7A");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clean();
			}
		});
		button_2.setBounds(384, 489, 93, 23);
		contentPane.add(button_2);
		
	}
	
	public void clean(){
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		textField_6.setText("");
		textArea.setText("");
	}
}
