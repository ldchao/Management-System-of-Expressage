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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class Order extends JPanel implements Runnable{

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
	private JLabel label_21;
	private JComboBox comboBox;
	private JLabel label_22;
	private JTextField textField_16;
	private JLabel label_23;
	private JTextField textField_17;
	private Listinbl listinbl;
	private ExpressType express;
	private PackageType pack;
	JTextArea textArea;
	JTextArea textArea_1; 
	JComboBox comboBox_1;
	JComboBox comboBox_2;
	private JButton button_1;

	public Order(JFrame main) {
		express=ExpressType.Economy;
		pack=PackageType.Carton;
		Order orderframe=this;
		this.setBounds(0, 0, 750, 600);
		this.setVisible(true);
		listinbl=new Listinbl();
		
		setLayout(null);
		
		JLabel label = new JLabel("\u5BC4\u4EF6\u4EBA\u4FE1\u606F");
		label.setBounds(62, 125, 94, 15);
		label.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		add(label);
		
		textField = new JTextField();
		textField.setBounds(126, 57, 179, 21);
		textField.setColumns(10);
		add(textField);

		
		textField_1 = new JTextField();
		textField_1.setBounds(517, 57, 179, 21);
		textField_1.setColumns(10);
		add(textField_1);
		
		label_1 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F");
		label_1.setBounds(454, 125, 94, 15);
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		add(label_1);
		
		label_2 = new JLabel("\u59D3\u540D");
		label_2.setBounds(62, 153, 54, 15);
		add(label_2);
		
		label_3 = new JLabel("\u59D3\u540D");
		label_3.setBounds(454, 153, 54, 15);
		add(label_3);
		
		label_4 = new JLabel("\u8BA2\u5355");
		label_4.setBounds(362, 10, 54, 33);
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		add(label_4);
		
		label_5 = new JLabel("\u5FEB\u9012\u5458");
		label_5.setBounds(62, 60, 54, 15);
		add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 150, 179, 21);
		textField_2.setColumns(10);
		add(textField_2);
		
		label_6 = new JLabel("\u8BA2\u5355\u53F7");
		label_6.setBounds(453, 60, 54, 15);
		add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(126, 181, 179, 21);
		textField_3.setColumns(10);
		add(textField_3);
		
		label_7 = new JLabel("\u7535\u8BDD");
		label_7.setBounds(62, 184, 54, 15);
		add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(126, 212, 179, 21);
		textField_4.setColumns(10);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(126, 242, 179, 21);
		textField_5.setColumns(10);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(517, 150, 179, 21);
		textField_6.setColumns(10);
		add(textField_6);
		
		label_8 = new JLabel("\u7535\u8BDD");
		label_8.setBounds(454, 184, 54, 15);
		add(label_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(517, 181, 179, 21);
		textField_7.setColumns(10);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(517, 212, 179, 21);
		textField_8.setColumns(10);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(517, 242, 179, 21);
		textField_9.setColumns(10);
		add(textField_9);
		
		label_9 = new JLabel("\u624B\u673A");
		label_9.setBounds(62, 215, 54, 15);
		add(label_9);
		
		label_10 = new JLabel("\u624B\u673A");
		label_10.setBounds(454, 215, 54, 15);
		add(label_10);
		
		label_11 = new JLabel("\u5355\u4F4D");
		label_11.setBounds(62, 245, 54, 15);
		add(label_11);
		
		label_12 = new JLabel("\u5355\u4F4D");
		label_12.setBounds(454, 245, 54, 15);
		add(label_12);
		
		label_13 = new JLabel("\u5730\u5740");
		label_13.setBounds(62, 278, 54, 15);
		add(label_13);
		
		label_14 = new JLabel("\u5730\u5740");
		label_14.setBounds(454, 278, 54, 15);
		add(label_14);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(126, 303, 179, 49);
		add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(517, 303, 179, 49);
		add(scrollPane_1);
		
		textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		textArea_1.setLineWrap(true);
		
		JLabel label_15 = new JLabel("\u6258\u8FD0\u7269\u4FE1\u606F");
		label_15.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label_15.setBounds(344, 362, 112, 15);
		add(label_15);
		
		JLabel label_16 = new JLabel("\u7269\u54C1\u540D");
		label_16.setBounds(62, 389, 54, 15);
		add(label_16);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.LEFT);
		textField_10.setColumns(10);
		textField_10.setBounds(126, 386, 179, 21);
		add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(517, 386, 179, 21);
		textField_11.addKeyListener(new InputNumber());
		add(textField_11);
		
		JLabel label_17 = new JLabel("\u7269\u54C1\u6570");
		label_17.setBounds(454, 387, 54, 15);
		add(label_17);
		
		lblkg = new JLabel("\u7269\u54C1\u5B9E\u9645\u91CD\u91CF\uFF08kg\uFF09");
		lblkg.setBounds(45, 414, 123, 15);
		add(lblkg);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(172, 411, 43, 21);
		textField_12.addKeyListener(new InputNumber());
		add(textField_12);
		
		lblcm = new JLabel("\u7269\u54C1\u957F\u5EA6\uFF08cm\uFF09");
		lblcm.setBounds(225, 414, 99, 15);
		add(lblcm);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(334, 411, 43, 21);
		textField_13.addKeyListener(new InputNumber());
		add(textField_13);
		
		lblcm_1 = new JLabel("\u7269\u54C1\u5BBD\u5EA6\uFF08cm\uFF09");
		lblcm_1.setBounds(387, 414, 97, 15);
		add(lblcm_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(496, 411, 43, 21);
		textField_14.addKeyListener(new InputNumber());
		add(textField_14);
		
		lblcm_2 = new JLabel("\u7269\u54C1\u9AD8\u5EA6\uFF08cm\uFF09");
		lblcm_2.setBounds(549, 414, 106, 15);
		add(lblcm_2);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(653, 411, 43, 21);
		textField_15.addKeyListener(new InputNumber());
		add(textField_15);
		
		label_18 = new JLabel("\u5FEB\u9012\u79CD\u7C7B");
		label_18.setBounds(62, 439, 54, 15);
		add(label_18);
		
		radioButton = new JRadioButton("\u7ECF\u6D4E\u5FEB\u9012");
		radioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				express=ExpressType.Economy;
			}
		});
		radioButton.setBounds(126, 435, 78, 23);
		radioButton.setSelected(true);
		add(radioButton);
		
		radioButton_1 = new JRadioButton("\u6807\u51C6\u5FEB\u9012");
		radioButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				express=ExpressType.Standard;
			}
		});
		radioButton_1.setBounds(205, 435, 78, 23);
		add(radioButton_1);
		
		radioButton_2 = new JRadioButton("\u7279\u5FEB\u4E13\u9012");
		radioButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				express=ExpressType.Professional;
			}
		});
		radioButton_2.setBounds(287, 435, 90, 23);
		add(radioButton_2);
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(radioButton);
		bg1.add(radioButton_1);
		bg1.add(radioButton_2);
		
		label_19 = new JLabel("\u5305\u88C5\u79CD\u7C7B");
		label_19.setBounds(454, 439, 54, 15);
		add(label_19);
		
		radioButton_3 = new JRadioButton("\u7EB8\u7BB1");
		radioButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pack=PackageType.Carton;
			}
		});
		radioButton_3.setBounds(506, 435, 54, 23);
		radioButton_3.setSelected(true);
		add(radioButton_3);
		
		radioButton_4 = new JRadioButton("\u6728\u7BB1");
		radioButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pack =PackageType.Wooden;
			}
		});
		radioButton_4.setBounds(567, 435, 54, 23);
		add(radioButton_4);
		
		radioButton_5 = new JRadioButton("\u5FEB\u9012\u888B");
		radioButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pack=PackageType.bag;
			}
		});
		radioButton_5.setBounds(623, 435, 73, 23);
		add(radioButton_5);
		ButtonGroup bg2=new ButtonGroup();
		
		bg2.add(radioButton_3);
		bg2.add(radioButton_4);
		bg2.add(radioButton_5);
		
		toolBar = new JToolBar();
		toolBar.setName("");
		toolBar.setBounds(10, 544, 686, 18);
		add(toolBar);
		
		lblNewLabel = new JLabel("\u72B6\u6001");
		toolBar.add(lblNewLabel);
		
		label_21 = new JLabel("\u5BA1\u6279\u72B6\u6001");
		label_21.setBounds(62, 87, 54, 15);
		add(label_21);
		
		String [] state={"未审批","已审批","审批未通过"};	
		comboBox = new JComboBox(state);
		comboBox.setEnabled(false);
		comboBox.setBounds(126, 84, 179, 21);
		add(comboBox);
		
		label_22 = new JLabel("\u9884\u8BA1\u9001\u8FBE\u65F6\u95F4");
		label_22.setBounds(32, 464, 84, 15);
		add(label_22);
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setHorizontalAlignment(SwingConstants.LEFT);
		textField_16.setColumns(10);
		textField_16.setBounds(126, 461, 179, 21);
		add(textField_16);
		
		label_23 = new JLabel("\u4ED8\u6B3E");
		label_23.setBounds(465, 464, 43, 15);
		add(label_23);
		
		textField_17 = new JTextField();
		textField_17.setEnabled(false);
		textField_17.setColumns(10);
		textField_17.setBounds(517, 464, 179, 21);
		add(textField_17);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				OrderVO vo=listinbl.getOrder("141250089");
				OrderVO vo=new OrderVO(textField.getText(), textField_1.getText(), ApproveState.NotApprove, 
						textField_2.getText(), comboBox_1.getSelectedItem().toString()+" "+textArea.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText(),
						textField_6.getText(), comboBox_2.getSelectedItem().toString()+" "+textArea_1.getText(), textField_7.getText(),
						textField_8.getText(), textField_9.getText(),
						textField_10.getText(), textField_11.getText(), textField_12.getText(), textField_13.getText(), textField_14.getText(),textField_15.getText(), express, pack, 
						textField_16.getText(), textField_17.getText(), " ");
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
		btnNewButton.setBounds(267, 511, 93, 23);
		add(btnNewButton);
		
		JButton button = new JButton("清空");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clean();
			}
		});
		button.setBounds(446, 511, 93, 23);
		add(button);
				String[] city={"南京鼓楼区","南京玄武区","南京建邺区","南京秦淮区","南京栖霞区","南京六合区","南京浦口区","南京江宁区","南京高淳区","南京溧水区",
				"北京宣武区","北京东城区","北京西城区","北京崇文区","北京朝阳区","北京石景山区","北京海淀区","北京丰台区","北京房山区","北京大兴区","北京通州区","北京门头沟区","北京昌平区","北京顺义区","北京怀柔区","北京密云县","北京平谷区","北京延庆县","北京大学城","北京中关村",
				"上海黄浦区","上海徐汇区","上海长宁区","上海静安区","上海普陀区","上海虹口区","上海杨浦区","上海闵行区","上海宝山区","上海嘉定区","上海浦东新区","上海金山区","上海松江区","上海青浦区","上海奉贤区","上海崇明县","上海工业区","上海开发区","上海外贸区","上海高新区",
				"广州越秀区","广州天河区","广州白云区","广州荔湾区","广州萝岗区","广州黄埔区","广州海珠区","广州番禺区","广州花都区","广州南沙区","广州从化市","广州增城市","广州东山区","广州开发区","广州高新区"};
		
		comboBox_1 = new JComboBox(city);
		comboBox_1.setBounds(126, 273, 179, 21);
		add(comboBox_1);
		comboBox_2= new JComboBox(city);
		comboBox_2.setBounds(517, 273, 179, 21);
		add(comboBox_2);
	
		//返回按钮 
		button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Courier courier=new Courier(main);
				main.remove(orderframe);
				main.getContentPane().add(courier);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(22, 20, 63, 23);
		add(button_1);
		
		//计算价格和时间的线程
		Thread thread=new Thread(this);
		thread.start();
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
	}
	
	/*function:
	 *update the expected time and bill
	*/
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(!((textField_12.getText().equals("")||textField_13.getText().equals("")||
					textField_14.getText().equals("")||textField_15.getText().equals("")))){
					textField_16.setText(""+listinbl.getTotalTime(comboBox_1.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString(), express));
					textField_17.setText(""+listinbl.getTotalMoney(
							comboBox_1.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString(),textField_12.getText(), textField_13.getText(), textField_14.getText(), textField_15.getText(), express, pack));
			}
		}
	}
}
