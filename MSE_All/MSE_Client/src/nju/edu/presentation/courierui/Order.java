/*
 * method:Frebin
 * function:interface of record the order
 */
package nju.edu.presentation.courierui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.table.DefaultTableModel;

import State.ApproveState;
import State.ExpressType;
import State.PackageType;
import sun.misc.Cleaner;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;

import nju.edu.VO.OrderVO;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogic.listinbl.ListinblController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Order extends JFrame implements Runnable{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField textField_2;
	private JLabel label_6;
	private JTextField textField_3;
	private JLabel label_7;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel label_8;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JScrollPane scrollPane;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblkg;
	private JTextField textField_12;
	private JLabel lblcm;
	private JTextField textField_13;
	private JLabel lblcm_1;
	private JTextField textField_14;
	private JLabel lblcm_2;
	private JTextField textField_15;
	private JLabel label_18;
	private JLabel label_19;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JToolBar toolBar;
	private JLabel lblNewLabel;
	private JLabel label_20;
	private JScrollPane scrollPane_2;
	private JLabel label_21;
	private JComboBox comboBox;
	private JLabel label_22;
	private JTextField textField_16;
	private JLabel label_23;
	private JTextField textField_17;
	private JTextArea textArea_2;
	private ListinblController listinblController;
	private ExpressType express=null;
	private PackageType pack=null;
	JTextArea textArea;
	JTextArea textArea_1; 
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Order() {
		Order orderframe=this;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 0, 712, 683);
		this.setVisible(true);
		listinblController=new ListinblController();
		
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5BC4\u4EF6\u4EBA\u4FE1\u606F");
		label.setBounds(22, 125, 94, 15);
		label.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(86, 57, 179, 21);
		textField.setColumns(10);
		contentPane.add(textField);

		
		textField_1 = new JTextField();
		textField_1.setBounds(451, 57, 179, 21);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		label_1 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F");
		label_1.setBounds(387, 125, 94, 15);
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		contentPane.add(label_1);
		
		label_2 = new JLabel("\u59D3\u540D");
		label_2.setBounds(22, 153, 54, 15);
		contentPane.add(label_2);
		
		label_3 = new JLabel("\u59D3\u540D");
		label_3.setBounds(387, 153, 54, 15);
		contentPane.add(label_3);
		
		label_4 = new JLabel("\u8BA2\u5355");
		label_4.setBounds(305, 10, 54, 33);
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		contentPane.add(label_4);
		
		label_5 = new JLabel("\u5FEB\u9012\u5458");
		label_5.setBounds(22, 60, 54, 15);
		contentPane.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 150, 179, 21);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		label_6 = new JLabel("\u8BA2\u5355\u53F7");
		label_6.setBounds(387, 60, 54, 15);
		contentPane.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(86, 181, 179, 21);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		label_7 = new JLabel("\u7535\u8BDD");
		label_7.setBounds(22, 184, 54, 15);
		contentPane.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(86, 212, 179, 21);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(86, 242, 179, 21);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(451, 150, 179, 21);
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		label_8 = new JLabel("\u7535\u8BDD");
		label_8.setBounds(387, 184, 54, 15);
		contentPane.add(label_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(451, 181, 179, 21);
		textField_7.setColumns(10);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(451, 211, 179, 21);
		textField_8.setColumns(10);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(451, 242, 179, 21);
		textField_9.setColumns(10);
		contentPane.add(textField_9);
		
		label_9 = new JLabel("\u624B\u673A");
		label_9.setBounds(22, 214, 54, 15);
		contentPane.add(label_9);
		
		label_10 = new JLabel("\u624B\u673A");
		label_10.setBounds(387, 214, 54, 15);
		contentPane.add(label_10);
		
		label_11 = new JLabel("\u5355\u4F4D");
		label_11.setBounds(22, 245, 54, 15);
		contentPane.add(label_11);
		
		label_12 = new JLabel("\u5355\u4F4D");
		label_12.setBounds(387, 245, 54, 15);
		contentPane.add(label_12);
		
		label_13 = new JLabel("\u5730\u5740");
		label_13.setBounds(22, 289, 54, 15);
		contentPane.add(label_13);
		
		label_14 = new JLabel("\u5730\u5740");
		label_14.setBounds(387, 289, 54, 15);
		contentPane.add(label_14);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 273, 179, 49);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(451, 273, 179, 49);
		contentPane.add(scrollPane_1);
		
		textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		textArea_1.setLineWrap(true);
		
		JLabel label_15 = new JLabel("\u6258\u8FD0\u7269\u4FE1\u606F");
		label_15.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label_15.setBounds(305, 355, 112, 15);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("\u7269\u54C1\u540D");
		label_16.setBounds(22, 389, 54, 15);
		contentPane.add(label_16);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.LEFT);
		textField_10.setColumns(10);
		textField_10.setBounds(86, 386, 179, 21);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(451, 386, 179, 21);
		contentPane.add(textField_11);
		
		JLabel label_17 = new JLabel("\u7269\u54C1\u6570");
		label_17.setBounds(387, 389, 54, 15);
		contentPane.add(label_17);
		
		lblkg = new JLabel("\u7269\u54C1\u5B9E\u9645\u91CD\u91CF\uFF08kg\uFF09");
		lblkg.setBounds(22, 414, 123, 15);
		contentPane.add(lblkg);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(144, 411, 43, 21);
		contentPane.add(textField_12);
		
		lblcm = new JLabel("\u7269\u54C1\u957F\u5EA6\uFF08cm\uFF09");
		lblcm.setBounds(196, 414, 99, 15);
		contentPane.add(lblcm);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(293, 411, 43, 21);
		contentPane.add(textField_13);
		
		lblcm_1 = new JLabel("\u7269\u54C1\u5BBD\u5EA6\uFF08cm\uFF09");
		lblcm_1.setBounds(344, 414, 97, 15);
		contentPane.add(lblcm_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(438, 411, 43, 21);
		contentPane.add(textField_14);
		
		lblcm_2 = new JLabel("\u7269\u54C1\u9AD8\u5EA6\uFF08cm\uFF09");
		lblcm_2.setBounds(492, 414, 106, 15);
		contentPane.add(lblcm_2);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(597, 411, 43, 21);
		contentPane.add(textField_15);
		
		label_18 = new JLabel("\u5FEB\u9012\u79CD\u7C7B");
		label_18.setBounds(22, 439, 54, 15);
		contentPane.add(label_18);
		
		JRadioButton radioButton = new JRadioButton("\u7ECF\u6D4E\u5FEB\u9012");
		radioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				express=ExpressType.Economy;
				System.out.println("1");
			}
		});
		radioButton.setBounds(86, 435, 78, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u6807\u51C6\u5FEB\u9012");
		radioButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				express=ExpressType.Standard;
				System.out.println("2");
			}
		});
		radioButton_1.setBounds(166, 435, 78, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u7279\u5FEB\u4E13\u9012");
		radioButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				express=ExpressType.Professional;
				System.out.println("3");
			}
		});
		radioButton_2.setBounds(246, 435, 90, 23);
		contentPane.add(radioButton_2);
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(radioButton);
		bg1.add(radioButton_1);
		bg1.add(radioButton_2);
		
		label_19 = new JLabel("\u5305\u88C5\u79CD\u7C7B");
		label_19.setBounds(387, 439, 54, 15);
		contentPane.add(label_19);
		
		radioButton_3 = new JRadioButton("\u7EB8\u7BB1");
		radioButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pack=PackageType.Carton;
			}
		});
		radioButton_3.setBounds(451, 435, 54, 23);
		contentPane.add(radioButton_3);
		
		radioButton_4 = new JRadioButton("\u6728\u7BB1");
		radioButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pack =PackageType.Wooden;
			}
		});
		radioButton_4.setBounds(507, 435, 54, 23);
		contentPane.add(radioButton_4);
		
		radioButton_5 = new JRadioButton("\u5FEB\u9012\u888B");
		radioButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pack=PackageType.bag;
			}
		});
		radioButton_5.setBounds(567, 435, 73, 23);
		contentPane.add(radioButton_5);
		ButtonGroup bg2=new ButtonGroup();
		
		bg2.add(radioButton_3);
		bg2.add(radioButton_4);
		bg2.add(radioButton_5);
		
		toolBar = new JToolBar();
		toolBar.setName("");
		toolBar.setBounds(10, 614, 686, 18);
		contentPane.add(toolBar);
		
		lblNewLabel = new JLabel("\u72B6\u6001");
		toolBar.add(lblNewLabel);
		
		label_20 = new JLabel("\u7269\u6D41\u4FE1\u606F");
		label_20.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label_20.setBounds(305, 489, 112, 15);
		contentPane.add(label_20);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(85, 514, 545, 57);
		contentPane.add(scrollPane_2);
		
		textArea_2 = new JTextArea();
		scrollPane_2.setViewportView(textArea_2);
		textArea_2.setEnabled(false);
		textArea_2.setLineWrap(true);
		
		label_21 = new JLabel("\u5BA1\u6279\u72B6\u6001");
		label_21.setBounds(22, 87, 54, 15);
		contentPane.add(label_21);
		
		String [] state={"未审批","已审批","审批未通过"};	
		comboBox = new JComboBox(state);
		comboBox.setEnabled(false);
		comboBox.setBounds(85, 84, 179, 21);
		contentPane.add(comboBox);
		
		label_22 = new JLabel("\u9884\u8BA1\u9001\u8FBE\u65F6\u95F4");
		label_22.setBounds(22, 464, 84, 15);
		contentPane.add(label_22);
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setHorizontalAlignment(SwingConstants.LEFT);
		textField_16.setColumns(10);
		textField_16.setBounds(116, 464, 179, 21);
		contentPane.add(textField_16);
		
		label_23 = new JLabel("\u4ED8\u6B3E");
		label_23.setBounds(387, 464, 43, 15);
		contentPane.add(label_23);
		
		textField_17 = new JTextField();
		textField_17.setEnabled(false);
		textField_17.setColumns(10);
		textField_17.setBounds(451, 464, 179, 21);
		contentPane.add(textField_17);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//获取数据
				String[] text=new String[18];
				text[0]=textField.getText();
				text[1]=textField_1.getText();
				text[2]=textField_2.getText();
				text[3]=textField_3.getText();
				text[4]=textField_4.getText();
				text[5]=textField_5.getText();
				text[6]=textField_6.getText();
				text[7]=textField_7.getText();
				text[8]=textField_8.getText();
				text[9]=textField_9.getText();
				text[10]=textField_10.getText();
				text[11]=textField_11.getText();
				text[12]=textField_12.getText();
				text[13]=textField_13.getText();
				text[14]=textField_14.getText();
				text[15]=textField_15.getText();
				text[16]=textField_16.getText();
				text[17]=textField_17.getText();
				String[] textareas=new String[3];
				textareas[0]=textArea.getText();
				textareas[1]=textArea_1.getText();
				textareas[2]=textArea_2.getText();
				
				//是否有空的判断
				Boolean valid=true;
				
				if(express==null||pack==null){
					valid=false;
				}else{
					for(int i=0;i<16;i++){
						if(text[i].equals("")){
							valid=false;
						}
					}
					for(int i=0;i<2;i++){
						if(textareas[i].equals("")){
							valid=false;
						}
					}
				}
				
				//执行相应操作
				if(valid==true){
					OrderVO vo=new OrderVO(text[0], text[1], ApproveState.NotApprove, 
							text[2], textareas[0], text[3], text[4], text[5],
							text[6], textareas[1], text[7], text[8], text[9],
							text[10], text[11], text[12], text[13], text[14], text[15], express, pack, 
							text[16], text[17], textareas[2]);

					lblNewLabel.setText("新建成功");
					clean();
				}else{
					lblNewLabel.setText("信息不完整，请补全信息");
				}
			}

		});
		btnNewButton.setBounds(216, 581, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("清空");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clean();
			}
		});
		button.setBounds(375, 581, 93, 23);
		contentPane.add(button);
	}
	
	public void clean(){
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		textField_6.setText("");
		textField_7.setText("");
		textField_8.setText("");
		textField_9.setText("");
		textField_10.setText("");
		textField_11.setText("");
		textField_12.setText("");
		textField_13.setText("");
		textField_14.setText("");
		textField_15.setText("");
		textField_16.setText("");
		textField_17.setText("");
		
		textArea.setText("");
		textArea_1.setText("");
		textArea_2.setText("");
	}
	
	/*function:
	 *update the expected time and bill
	*/
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!((textArea.getText().equals("")||textArea_1.getText().equals("")||
				textField_13.getText().equals("")||textField_14.equals("")||
				textField_15.equals("")||express==null||pack==null))){
					textField_16.setText(""+listinblController.getTotalTime(textArea.getText(), textArea_1.getText(), express));
					textField_17.setText(""+listinblController.getTotalMoney(
							textArea.getText(), textArea_1.getText(), textField_13.getText(), textField_14.getText(), textField_15.getText(), express, pack));
			}
		}
	}
}
