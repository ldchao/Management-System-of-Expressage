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
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
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
	private Listinbl listinbl;
	private ExpressType express;
	private PackageType pack;
	JTextArea textArea;
	JTextArea textArea_1; 
	JComboBox comboBox_1;
	JComboBox comboBox_2;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Order() {
		express=ExpressType.Economy;
		pack=PackageType.Carton;
		Order orderframe=this;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 0, 712, 683);
		this.setVisible(true);
		listinbl=new Listinbl();
		
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
		label_13.setBounds(22, 278, 54, 15);
		contentPane.add(label_13);
		
		label_14 = new JLabel("\u5730\u5740");
		label_14.setBounds(387, 278, 54, 15);
		contentPane.add(label_14);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 303, 179, 49);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(451, 303, 179, 49);
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
		
		radioButton = new JRadioButton("\u7ECF\u6D4E\u5FEB\u9012");
		radioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				express=ExpressType.Economy;
			}
		});
		radioButton.setBounds(86, 435, 78, 23);
		radioButton.setSelected(true);
		contentPane.add(radioButton);
		
		radioButton_1 = new JRadioButton("\u6807\u51C6\u5FEB\u9012");
		radioButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				express=ExpressType.Standard;
			}
		});
		radioButton_1.setBounds(166, 435, 78, 23);
		contentPane.add(radioButton_1);
		
		radioButton_2 = new JRadioButton("\u7279\u5FEB\u4E13\u9012");
		radioButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				express=ExpressType.Professional;
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
		radioButton_3.setSelected(true);
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
				OrderVO vo=new OrderVO(textField.getText(), textField_1.getText(), ApproveState.NotApprove, 
						textField_2.getText(), comboBox_1.getSelectedItem().toString()+" "+textArea.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText(),
						textField_6.getText(), comboBox_2.getSelectedItem().toString()+" "+textArea_1.getText(), textField_7.getText(),
						textField_8.getText(), textField_9.getText(),
						textField_10.getText(), textField_11.getText(), textField_12.getText(), textField_13.getText(), textField_14.getText(),textField_15.getText(), express, pack, 
						textField_16.getText(), textField_17.getText(), textArea_2.getText());
				//是否有空的判断
				Boolean valid=listinbl.JudgeNull(vo);
				
				//执行相应操作
				if(valid==true){
					listinbl.addOrder(vo);
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
		
		String[] city={"南京鼓楼区营业厅","南京玄武区营业厅","南京建邺区营业厅","南京秦淮区营业厅","南京栖霞区营业厅","南京六合区营业厅","南京浦口区营业厅","南京江宁区营业厅","南京高淳区营业厅","南京溧水区营业厅",
				"北京宣武区营业厅","北京东城区营业厅","北京西城区营业厅","北京崇文区营业厅","北京朝阳区营业厅","北京石景山区营业厅","北京海淀区营业厅","北京丰台区营业厅","北京房山区营业厅","北京大兴区营业厅","北京通州区营业厅","北京门头沟区营业厅","北京昌平区营业厅","北京顺义区营业厅","北京怀柔区营业厅","北京密云县营业厅","北京平谷区营业厅","北京延庆县营业厅","北京大学城营业厅","北京中关村营业厅",
				"上海黄浦区营业厅","上海徐汇区营业厅","上海长宁区营业厅","上海静安区营业厅","上海普陀区营业厅","上海虹口区营业厅","上海杨浦区营业厅","上海闵行区营业厅","上海宝山区营业厅","上海嘉定区营业厅","上海浦东新区营业厅","上海金山区营业厅","上海松江区营业厅","上海青浦区营业厅","上海奉贤区营业厅","上海崇明县营业厅","上海工业区营业厅","上海开发区营业厅","上海外贸区营业厅","上海高新区营业厅",
				"广州越秀区营业厅","广州天河区营业厅","广州白云区营业厅","广州荔湾区营业厅","广州萝岗区营业厅","广州黄埔区营业厅","广州海珠区营业厅","广州番禺区营业厅","广州花都区营业厅","广州南沙区营业厅","广州从化市营业厅","广州增城市营业厅","广州东山区营业厅","广州开发区营业厅","广州高新区营业厅"};
		
		comboBox_1 = new JComboBox(city);
		comboBox_1.setBounds(86, 273, 179, 21);
		contentPane.add(comboBox_1);
		comboBox_2= new JComboBox(city);
		comboBox_2.setBounds(451, 273, 179, 21);
		contentPane.add(comboBox_2);
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
		radioButton.setSelected(true);
		radioButton_3.setSelected(true);
		comboBox_1.setSelectedIndex(0);
		comboBox_2.setSelectedIndex(0);
		express=ExpressType.Economy;
		pack=PackageType.Carton;
		
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
			if(!((textField_12.getText().equals("")||textField_13.getText().equals("")||
					textField_14.getText().equals("")||textField_15.getText().equals("")))){
					textField_16.setText(""+listinbl.getTotalTime(comboBox_1.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString(), express));
					textField_17.setText(""+listinbl.getTotalMoney(
							textArea.getText(), textArea_1.getText(), textField_13.getText(), textField_14.getText(), textField_15.getText(), express, pack));
			}
		}
	}
}
