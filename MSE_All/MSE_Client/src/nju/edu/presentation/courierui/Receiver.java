package nju.edu.presentation.courierui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PO.LoginPO;
import sun.misc.Cleaner;

import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import nju.edu.VO.ReceiverVO;
import nju.edu.businesslogic.listinbl.Receiverinbl;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Receiver extends JPanel implements Runnable{
	
	JTextField[] textFields;
	JLabel label_11;
	private JTextArea textArea;
	private Receiverinbl receiverinbl;
	private LoginPO loginPO;
	private JFrame main;
	private Receiver receiverframe;
	private JLabel label_12;
	private boolean cleanSignal=false;
	/**
	 * Create the frame.
	 */
	public Receiver(JFrame main,LoginPO loginPO) {
		this.main=main;
		this.loginPO=loginPO;
		receiverinbl=new Receiverinbl();
		receiverframe=this;
		setBounds(300, 100, 750, 600);
		setVisible(true);
		setLayout(null);
		
		textFields=new JTextField[7];
		for(int i=0;i<7;i++){
			textFields[i]=new JTextField(10);
			this.add(textFields[i]);
			textFields[i].setForeground(new Color(88, 93, 103));
			textFields[i].setCaretColor(new Color(88, 93, 103));
		}
		textFields[0].setBounds(77, 120, 179, 21);
		
		textFields[1].setBounds(514, 120, 179, 21);
		
		textFields[2].setBounds(77, 162, 179, 21);
		
		textFields[3].setBounds(77, 253, 179, 21);
		
		textFields[4].setBounds(514, 253, 179, 21);
		
		textFields[5].setBounds(77, 297, 179, 21);
		
		textFields[6].setBounds(514, 297, 179, 21);
		
		JLabel lblHello = new JLabel("Hello!"+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);
		
		JLabel label = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F\u5355");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		label.setBounds(278, 10, 179, 33);
		add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D");
		label_1.setBounds(34, 256, 54, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u5FEB\u9012\u5458");
		label_2.setBounds(34, 123, 54, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("\u5FEB\u9012\u5458\u7535\u8BDD");
		label_3.setBounds(441, 123, 74, 15);
		add(label_3);
		
		JLabel label_4 = new JLabel("\u8BA2\u5355\u53F7");
		label_4.setBounds(34, 165, 42, 15);
		add(label_4);
		
		JLabel label_5 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F");
		label_5.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_5.setBounds(311, 210, 102, 15);
		add(label_5);
		
		JLabel label_6 = new JLabel("\u7535\u8BDD");
		label_6.setBounds(461, 256, 54, 15);
		add(label_6);
		
		JLabel label_7 = new JLabel("\u624B\u673A");
		label_7.setBounds(34, 300, 54, 15);
		add(label_7);
		
		JLabel label_8 = new JLabel("\u5355\u4F4D");
		label_8.setBounds(461, 300, 54, 15);
		add(label_8);
		
		JLabel label_9 = new JLabel("\u5730\u5740");
		label_9.setBounds(34, 345, 54, 15);
		add(label_9);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(77, 345, 618, 63);
		add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		
		JLabel label_10 = new JLabel("\u6536\u4EF6\u65F6\u95F4");
		label_10.setBounds(441, 165, 54, 15);
		add(label_10);
		
		label_11 = new JLabel("点击选择日期");
		label_11.setBounds(545, 165, 179, 15);
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser1.register(label_11);
		add(label_11);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);
		
		label_12 = new JLabel("\u72B6\u6001\u680F");
		label_12.setForeground(Color.WHITE);
		toolBar.add(label_12);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//显示确认按钮
				int n=JOptionPane.showConfirmDialog(null, "确认新建收件人信息单？","no",JOptionPane.YES_NO_OPTION);
				if(n==JOptionPane.YES_OPTION){
					ReceiverVO receiverVO=new ReceiverVO(textFields[0].getText(), textFields[1].getText(), textFields[2].getText(), label_11.getText(), 
							textFields[3].getText(), textFields[4].getText(), textFields[5].getText(), textFields[6].getText(), textArea.getText());
					//function:judge whether the information is not complete
					boolean complete=receiverinbl.JudgeNull(receiverVO);
					if(complete==true){
						boolean valid=receiverinbl.searchOrder(textFields[2].getText());
						if(valid==false){
							label_12.setText("此订单不存在");
						}else{
							receiverinbl.addReceiver(receiverVO);
							label_12.setText("新建成功");
							button.setEnabled(false);
							cleanSignal=true;
						}
					}else{
						label_12.setText("信息填写不完整，请补全信息");
					}
					Thread thread=new Thread(receiverframe);
					thread.start();
				}
			}
		});
		button.setBounds(274, 459, 52, 52);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button.getWidth(),
						button.getHeight(),image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button.setIcon(image2);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Courier newcourier=new Courier(main,loginPO);
				main.remove(receiverframe);
				main.getContentPane().add(newcourier);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		
		button_1.setBounds(13, -9, 63, 63);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_1.addMouseListener(new MouseAdapter() {
					@Override
			public void mousePressed(MouseEvent e) {
						button_1.setIcon(new ImageIcon("image/mask_circle.png"));
			}	
		});

		add(button_1);
		
		JLabel label_13 = new JLabel("\u6D3E\u4EF6\u5458\u4FE1\u606F");
		label_13.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_13.setBounds(311, 76, 85, 15);
		add(label_13);
		
		JButton button_2 = new JButton("\u6E05\u7A7A");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=JOptionPane.showConfirmDialog(null, "确认清空？","no",JOptionPane.YES_NO_OPTION);
				if(n==JOptionPane.YES_OPTION){
					clean();
				}
			}
		});
		button_2.setBounds(425, 459, 52, 52);
		ImageIcon image3 = new ImageIcon("image/transparent_circle.png");
		Image temp3 = image3.getImage().getScaledInstance(button_2.getWidth(),
						button_2.getHeight(),image3.getImage().SCALE_DEFAULT);
		image3 = new ImageIcon(temp3);
		button_2.setIcon(image3);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		add(button_2);
		
	}
	
	public void clean(){
		main.remove(receiverframe);
		main.getContentPane().add(new Receiver(main, loginPO));
		main.repaint();
		main.invalidate();
		main.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		label_12.setText("状态栏");
		if(cleanSignal==true){
			clean();
		}
	}
}
