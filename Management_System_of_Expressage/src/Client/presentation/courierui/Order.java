package Client.presentation.courierui;

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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Order extends JFrame {

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

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Order frame = new Order();
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
	public Order() {
		Order orderframe=this;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 0, 712, 792);
		this.setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5BC4\u4EF6\u4EBA\u4FE1\u606F");
		label.setBounds(22, 125, 94, 15);
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(85, 150, 179, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(451, 150, 179, 21);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		label_1 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F");
		label_1.setBounds(387, 125, 94, 15);
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		contentPane.add(label_1);
		
		label_2 = new JLabel("\u59D3\u540D");
		label_2.setBounds(22, 153, 54, 15);
		contentPane.add(label_2);
		
		label_3 = new JLabel("\u59D3\u540D");
		label_3.setBounds(387, 153, 54, 15);
		contentPane.add(label_3);
		
		label_4 = new JLabel("\u8BA2\u5355");
		label_4.setBounds(305, 10, 54, 33);
		label_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 24));
		contentPane.add(label_4);
		
		label_5 = new JLabel("\u5FEB\u9012\u5458");
		label_5.setBounds(22, 60, 54, 15);
		contentPane.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(85, 57, 179, 21);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		label_6 = new JLabel("\u8BA2\u5355\u53F7");
		label_6.setBounds(387, 60, 54, 15);
		contentPane.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(451, 57, 179, 21);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		label_7 = new JLabel("\u7535\u8BDD");
		label_7.setBounds(22, 184, 54, 15);
		contentPane.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(85, 181, 179, 21);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(85, 211, 179, 21);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(85, 242, 179, 21);
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
		label_13.setBounds(22, 316, 54, 15);
		contentPane.add(label_13);
		
		label_14 = new JLabel("\u5730\u5740");
		label_14.setBounds(387, 316, 54, 15);
		contentPane.add(label_14);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(85, 273, 179, 98);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(451, 273, 179, 98);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		scrollPane_1.setViewportView(textArea_1);
		
		JLabel label_15 = new JLabel("\u6258\u8FD0\u7269\u4FE1\u606F");
		label_15.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		label_15.setBounds(305, 400, 112, 15);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("\u7269\u54C1\u540D");
		label_16.setBounds(22, 434, 54, 15);
		contentPane.add(label_16);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.LEFT);
		textField_10.setColumns(10);
		textField_10.setBounds(85, 431, 179, 21);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(451, 431, 179, 21);
		contentPane.add(textField_11);
		
		JLabel label_17 = new JLabel("\u7269\u54C1\u6570");
		label_17.setBounds(387, 434, 54, 15);
		contentPane.add(label_17);
		
		lblkg = new JLabel("\u7269\u54C1\u5B9E\u9645\u91CD\u91CF\uFF08kg\uFF09");
		lblkg.setBounds(22, 472, 112, 15);
		contentPane.add(lblkg);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(128, 469, 54, 21);
		contentPane.add(textField_12);
		
		lblcm = new JLabel("\u7269\u54C1\u957F\u5EA6\uFF08cm\uFF09");
		lblcm.setBounds(192, 472, 84, 15);
		contentPane.add(lblcm);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(280, 469, 54, 21);
		contentPane.add(textField_13);
		
		lblcm_1 = new JLabel("\u7269\u54C1\u5BBD\u5EA6\uFF08cm\uFF09");
		lblcm_1.setBounds(344, 472, 84, 15);
		contentPane.add(lblcm_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(427, 469, 54, 21);
		contentPane.add(textField_14);
		
		lblcm_2 = new JLabel("\u7269\u54C1\u9AD8\u5EA6\uFF08cm\uFF09");
		lblcm_2.setBounds(491, 472, 84, 15);
		contentPane.add(lblcm_2);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(576, 469, 54, 21);
		contentPane.add(textField_15);
		
		label_18 = new JLabel("\u5FEB\u9012\u79CD\u7C7B");
		label_18.setBounds(22, 531, 54, 15);
		contentPane.add(label_18);
		
		JRadioButton radioButton = new JRadioButton("\u7ECF\u6D4E\u5FEB\u9012");
		radioButton.setBounds(85, 527, 73, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u6807\u51C6\u5FEB\u9012");
		radioButton_1.setBounds(163, 527, 73, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u7279\u5FEB\u4E13\u9012");
		radioButton_2.setBounds(238, 527, 73, 23);
		contentPane.add(radioButton_2);
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(radioButton);
		bg1.add(radioButton_1);
		bg1.add(radioButton_2);
		
		label_19 = new JLabel("\u5305\u88C5\u79CD\u7C7B");
		label_19.setBounds(387, 531, 54, 15);
		contentPane.add(label_19);
		
		radioButton_3 = new JRadioButton("\u7EB8\u7BB1");
		radioButton_3.setBounds(450, 527, 54, 23);
		contentPane.add(radioButton_3);
		
		radioButton_4 = new JRadioButton("\u6728\u7BB1");
		radioButton_4.setBounds(506, 527, 54, 23);
		contentPane.add(radioButton_4);
		
		radioButton_5 = new JRadioButton("\u5FEB\u9012\u888B");
		radioButton_5.setBounds(562, 527, 73, 23);
		contentPane.add(radioButton_5);
		ButtonGroup bg2=new ButtonGroup();
		bg2.add(radioButton_3);
		bg2.add(radioButton_4);
		bg2.add(radioButton_5);
		
		toolBar = new JToolBar();
		toolBar.setName("");
		toolBar.setBounds(10, 714, 686, 18);
		contentPane.add(toolBar);
		
		lblNewLabel = new JLabel("\u72B6\u6001");
		toolBar.add(lblNewLabel);
		
		label_20 = new JLabel("\u7269\u6D41\u4FE1\u606F");
		label_20.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		label_20.setBounds(316, 579, 112, 15);
		contentPane.add(label_20);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(85, 600, 545, 57);
		contentPane.add(scrollPane_2);
		
		textArea_2 = new JTextArea();
		textArea_2.setLineWrap(true);
		scrollPane_2.setViewportView(textArea_2);
		
		label_21 = new JLabel("\u5BA1\u6279\u72B6\u6001");
		label_21.setBounds(22, 87, 54, 15);
		contentPane.add(label_21);
		
		String [] state={"Î´ÉóÅú","ÒÑÉóÅú","ÉóÅúÎ´Í¨¹ý"};	
		comboBox = new JComboBox(state);
		comboBox.setBounds(85, 84, 179, 21);
		contentPane.add(comboBox);
		
		label_22 = new JLabel("\u9884\u8BA1\u9001\u8FBE\u65F6\u95F4");
		label_22.setBounds(22, 554, 84, 15);
		contentPane.add(label_22);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.LEFT);
		textField_16.setColumns(10);
		textField_16.setBounds(116, 551, 179, 21);
		contentPane.add(textField_16);
		
		label_23 = new JLabel("\u4ED8\u6B3E");
		label_23.setBounds(387, 554, 84, 15);
		contentPane.add(label_23);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(451, 551, 179, 21);
		contentPane.add(textField_17);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setBounds(202, 681, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u53D6\u6D88");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderframe.dispose();
				Courier courierframe=new Courier();
			}
		});
		button.setBounds(388, 681, 93, 23);
		contentPane.add(button);
		
	}
}
