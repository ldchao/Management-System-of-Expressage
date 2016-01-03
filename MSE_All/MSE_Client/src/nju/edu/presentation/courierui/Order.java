/*
 * method:Frebin
 * function:interface of record the order
 */
package nju.edu.presentation.courierui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;
import State.ApproveState;
import State.ExpressType;
import State.PackageType;
import nju.edu.VO.OrderVO;
import nju.edu.businesslogic.listinbl.Listinbl;

@SuppressWarnings("serial")
public class Order extends JPanel implements Runnable{

	private JTextField[] textField;
	private JScrollPane scrollPane;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JToolBar toolBar;
	private JLabel lblNewLabel;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	private Listinbl listinbl;
	private ExpressType express;
	private PackageType pack;
	JTextArea textArea;
	JTextArea textArea_1; 
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_1;
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_2;
	private JButton button_1;
	JFrame main;
	Order orderframe;
	LoginPO loginPO;
	ButtonGroup bg1;
	ButtonGroup bg2;
	int index=0;//快递类型的按钮编号
	boolean cleanSignal=false;//确认新建订单要清空
	String[] city={"南京鼓楼区","南京玄武区","南京建邺区","南京秦淮区","南京栖霞区","南京六合区","南京浦口区","南京江宁区","南京高淳区","南京溧水区",
			"北京宣武区","北京东城区","北京西城区","北京崇文区","北京朝阳区","北京石景山区","北京海淀区","北京丰台区","北京房山区","北京大兴区","北京通州区","北京门头沟区","北京昌平区","北京顺义区","北京怀柔区","北京密云县","北京平谷区","北京延庆县","北京大学城","北京中关村",
			"上海黄浦区","上海徐汇区","上海长宁区","上海静安区","上海普陀区","上海虹口区","上海杨浦区","上海闵行区","上海宝山区","上海嘉定区","上海浦东新区","上海金山区","上海松江区","上海青浦区","上海奉贤区","上海崇明县","上海工业区","上海开发区","上海外贸区","上海高新区",
			"广州越秀区","广州天河区","广州白云区","广州荔湾区","广州萝岗区","广州黄埔区","广州海珠区","广州番禺区","广州花都区","广州南沙区","广州从化市","广州增城市","广州东山区","广州开发区","广州高新区"};
	String[] num={"025001","025002","025003","025004","025005","025006","025007","025008","025009","025010",
			"010001","010002","010003","010004","010005","010006","010007","010008","010009","010010","010011","010012","010013","010014","010015","010016","010017","010018","010019","010020",
			"021001","021002","021003","021004","021005","021006","021007","021008","021009","021010","021011","021012","021013","021014","021015","021016","021017","021018","021019","021020",
			"020001","020002","020003","020004","020005","020006","020007","020008","020009","020010","020011","020012","020013","020014","020015"};
	
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/courier/Order.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings({ "static-access", "rawtypes", "unchecked" })
	public Order(JFrame main,LoginPO loginPO) {
		this.loginPO=loginPO;
		this.main=main;
		orderframe=this;
		
		this.setBounds(0, 0, 750, 600);
		this.setVisible(true);
		listinbl=new Listinbl();
		setLayout(null);
		express=ExpressType.Economy;
		pack=PackageType.Carton;
		
		textField=new JTextField[18];
		for(int i=0;i<textField.length;i++){
			textField[i] = new JTextField();
			textField[i].setColumns(10);
			textField[i].setForeground(new Color(88, 93, 103));
			textField[i].setCaretColor(new Color(88, 93, 103));
			this.add(textField[i]);
		}
		
		textField[0].setBounds(182, 85, 150, 21);
	
		textField[1].setBounds(474, 85, 145, 21);
		textField[1].setEnabled(false);
		
		textField[2].setBounds(182, 143, 150, 21);
		
		textField[3].setBounds(182, 170, 150, 21);
		
		textField[4].setBounds(182, 196, 150, 21);
		
		textField[5].setBounds(182, 222, 150, 21);
		
		textField[6].setBounds(474, 143, 145, 21);
		
		textField[7].setBounds(474, 170, 145, 21);
		
		textField[8].setBounds(474, 196, 145, 21);
		
		textField[9].setBounds(474, 222, 145, 21);
		
		textField[10].setBounds(182, 372, 150, 21);

		textField[11].setBounds(182, 448, 37, 21);
		textField[11].addKeyListener(new InputNumber());
		textField[11].setDocument(new JTextFieldLimit(4));
				
		textField[12].setBounds(182, 397, 37, 21);
		textField[12].addKeyListener(new InputNumber());
		textField[12].setDocument(new JTextFieldLimit(4));
		
		textField[13].setBounds(294, 397, 37, 21);
		textField[13].addKeyListener(new InputNumber());
		textField[13].setDocument(new JTextFieldLimit(4));
		
		textField[14].setBounds(182, 422, 37, 21);
		textField[14].addKeyListener(new InputNumber());
		textField[14].setDocument(new JTextFieldLimit(4));
		
		textField[15].setBounds(294, 422, 37, 21);
		textField[15].addKeyListener(new InputNumber());
		textField[15].setDocument(new JTextFieldLimit(4));
		
		textField[16].setEnabled(false);
		textField[16].setBounds(182, 477, 150, 21);

		textField[17].setEnabled(false);
		textField[17].setBounds(294, 448, 37, 21);
		
		JLabel lblHello = new JLabel("Hello!"+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		add(textField[3]);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(185, 275, 144, 49);
		add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(477, 275, 140, 49);
		add(scrollPane_1);
		
		textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		textArea_1.setLineWrap(true);
		
		radioButton = new JRadioButton("\u7ECF\u6D4E\u5FEB\u9012");
		radioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				express=ExpressType.Economy;
				index=0;
			}
		});
		radioButton.setBounds(393, 410, 100, 23);
		radioButton.setSelected(true);
		add(radioButton);
		
		radioButton_1 = new JRadioButton("\u6807\u51C6\u5FEB\u9012");
		radioButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				express=ExpressType.Standard;
				index=1;
			}
		});
		radioButton_1.setBounds(393, 450, 100, 23);
		add(radioButton_1);
		
		radioButton_2 = new JRadioButton("\u7279\u5FEB\u4E13\u9012");
		radioButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				express=ExpressType.Professional;
				index=2;
			}
		});
		radioButton_2.setBounds(393, 485, 90, 23);
		add(radioButton_2);
		
		bg1=new ButtonGroup();
		bg1.add(radioButton);
		bg1.add(radioButton_1);
		bg1.add(radioButton_2);
		
		radioButton_3 = new JRadioButton("\u7EB8\u7BB1");
		radioButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pack=PackageType.Carton;
			}
		});
		radioButton_3.setBounds(519, 410, 90, 23);
		radioButton_3.setSelected(true);
		add(radioButton_3);
		
		radioButton_4 = new JRadioButton("\u6728\u7BB1");
		radioButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pack =PackageType.Wooden;
			}
		});
		radioButton_4.setBounds(519, 449, 73, 23);
		add(radioButton_4);
		
		radioButton_5 = new JRadioButton("\u5FEB\u9012\u888B");
		radioButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pack=PackageType.bag;
			}
		});
		radioButton_5.setBounds(519, 484, 73, 23);
		add(radioButton_5);
		bg2=new ButtonGroup();
		
		bg2.add(radioButton_3);
		bg2.add(radioButton_4);
		bg2.add(radioButton_5);
		
		toolBar = new JToolBar();
		toolBar.setName("");
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);
		
		lblNewLabel = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(lblNewLabel);
		
		String [] state={"未审批","已审批","审批未通过"};	
		comboBox = new JComboBox(state);
		comboBox.setEnabled(false);
		comboBox.setBounds(168, 499, 84, 21);
		add(comboBox);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//显示确认按钮
				int n=JOptionPane.showConfirmDialog(null, "确认新建订单","no",JOptionPane.YES_NO_OPTION);
				if(n==JOptionPane.YES_OPTION){
					OrderVO vo=new OrderVO(textField[0].getText().trim(), textField[1].getText().trim(), ApproveState.NotApprove, 
						textField[2].getText().trim(), comboBox_1.getSelectedItem().toString()+" "+textArea.getText().trim(), textField[3].getText().trim(), textField[4].getText().trim(), textField[5].getText().trim(),
						textField[6].getText().trim(), comboBox_2.getSelectedItem().toString()+" "+textArea_1.getText().trim(), textField[7].getText().trim(),
						textField[8].getText().trim(), textField[9].getText().trim(),
						textField[10].getText().trim(), textField[11].getText().trim(), textField[12].getText().trim(), textField[13].getText().trim(), textField[14].getText().trim(),textField[15].getText().trim(), express, pack, 
						textField[16].getText().trim(), textField[17].getText().trim(), " ");
					//是否有空的判断
					Boolean valid=listinbl.JudgeNull(vo);
				
					//执行相应操作
					if(valid==true){
						listinbl.addOrder(vo);
						lblNewLabel.setText("新建成功");
						btnNewButton.setEnabled(false);
						cleanSignal=true;
					}else{
						lblNewLabel.setText("信息不完整，请补全信息");
					}
					Thread thread=new Thread(orderframe);
					thread.start();
				}
			}

		});
		
		btnNewButton.setBounds(274, 520, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(btnNewButton.getWidth(),
				btnNewButton.getHeight(),image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=JOptionPane.showConfirmDialog(null, "确认清空？","no", JOptionPane.YES_NO_OPTION);
				if(n==JOptionPane.YES_OPTION){
					clean();
				}
			}
		});
		
		button.setBounds(425, 520, 52, 52);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button.getWidth(),
				button.getHeight(),image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button.setIcon(image2);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		add(button);
		
		comboBox_1 = new JComboBox(city);
		comboBox_1.setBounds(182, 247, 150, 21);
		add(comboBox_1);
		comboBox_2= new JComboBox(city);
		comboBox_2.setBounds(474, 247, 150, 21);
		add(comboBox_2);
	
		//返回按钮 
		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Courier courier=new Courier(main,loginPO);
				main.remove(orderframe);
				main.getContentPane().add(courier);
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
		
		//计算价格和时间的线程
		Thread thread=new Thread(new count());
		thread.start();
	}
	
	public void clean(){
		main.remove(orderframe);
		main.getContentPane().add(new Order(main,loginPO));
		main.repaint();
		main.invalidate();
		main.setVisible(true);
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		lblNewLabel.setText("状态栏");
		if(cleanSignal==true){
			clean();
		}
	}
	
	
	//计算价格和时间的内部类
	class count implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if(!((textField[12].getText().trim().equals("")||textField[13].getText().trim().equals("")||
						textField[14].getText().trim().equals("")||textField[15].getText().trim().equals("")))){
						textField[16].setText(""+listinbl.getTotalTime(comboBox_1.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString(), express));
						textField[17].setText(""+listinbl.getTotalMoney(
								comboBox_1.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString(),textField[12].getText(), textField[13].getText(), textField[14].getText(), textField[15].getText(), express, pack));
				}
				
				String temp=comboBox_2.getSelectedItem().toString();
				int sign=0;
				for(int i=0;i<city.length;i++){
					if(temp.equals(city[i])){
						sign=i;
					}
				}
				String partOfID=num[sign].substring(1,3)+num[sign].substring(4,6)+index;
				textField[1].setText(listinbl.getID(partOfID));
			}
		}
		
	}
}
