package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import nju.edu.VO.StaffVO;
import nju.edu.businesslogic.staffbl.Staffbl;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class editStaff extends JFrame implements ItemListener,Runnable{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JLabel label_5;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JRadioButton radioButton_2;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JRadioButton radioButton_6;
	private JButton button;
	private JButton button_1;
	String [] city={"南京", "北京", "广州", "上海"};
	String [][] position={
			{"中转中心","鼓楼区营业厅","玄武区营业厅","建邺区营业厅","秦淮区营业厅","栖霞区营业厅",
					"六合区营业厅","浦口区营业厅","江宁区营业厅","高淳区营业厅","溧水区营业厅"},
	{"中转中心","宣武区营业厅","东城区营业厅","西城区营业厅","崇文区营业厅","朝阳区营业厅",
			"石景山区营业厅","海淀区营业厅","丰台区营业厅","房山区营业厅","大兴区营业厅",
			"通州区营业厅","门头沟区营业厅","昌平区营业厅","顺义区营业厅","怀柔区营业厅",
			"密云县营业厅","平谷区营业厅","延庆县营业厅","大学城营业厅","中关村营业厅"},
	{"中转中心","越秀区营业厅","天河区营业厅","白云区营业厅","荔湾区营业厅","萝岗区营业厅",
				"黄埔区营业厅","海珠区营业厅","番禺区营业厅","花都区营业厅","南沙区营业厅",
				"从化市营业厅","增城市营业厅","东山区营业厅","开发区营业厅","高新区营业厅"},
	{"中转中心","黄浦区营业厅","徐汇区营业厅","长宁区营业厅","静安区营业厅","普陀区营业厅",
			"虹口区营业厅","杨浦区营业厅","闵行区营业厅","宝山区营业厅","嘉定区营业厅",
			"浦东新区营业厅","金山区营业厅","松江区营业厅","青浦区营业厅","奉贤区营业厅",
			"崇明县营业厅","工业区营业厅","开发区营业厅","外贸区营业厅","高新区营业厅"}};
	JLabel label_8;
	private JTextField textField_3;
	JTextArea textArea;
	Staffbl staffbl=new Staffbl();
	private editStaff thiStaff=this;
	DefaultComboBoxModel citymodel;
	DefaultComboBoxModel comboBoxModel;
	

	public editStaff(StaffVO vo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setVisible(true);
		
		JLabel label = new JLabel("\u4EBA\u5458\u5177\u4F53\u4FE1\u606F");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label.setBounds(312, 68, 96, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D");
		label_1.setBounds(55, 133, 54, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(119, 130, 217, 21);
		textField.setText(vo.getId());
		textField.setEnabled(false);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(481, 130, 217, 21);
		textField_1.setText(vo.getName());
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 186, 217, 21);
		textField_2.setText(vo.getPhone());
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(481, 186, 217, 21);
		textField_3.setText(vo.getCellphone());
		contentPane.add(textField_3);
		
		label_2 = new JLabel("\u59D3\u540D");
		label_2.setBounds(421, 133, 54, 15);
		contentPane.add(label_2);
		
		label_3 = new JLabel("\u7535\u8BDD");
		label_3.setBounds(55, 189, 54, 15);
		contentPane.add(label_3);
		
		label_4 = new JLabel("\u804C\u4F4D");
		label_4.setBounds(55, 336, 54, 15);
		contentPane.add(label_4);
		
		label_5 = new JLabel("\u5355\u4F4D");
		label_5.setBounds(55, 243, 54, 15);
		contentPane.add(label_5);
		//初始化
		int a=-1,b=-1;
		String[] temp=vo.getShop().split(",");
		for(int i=0;i<city.length;i++){
			if(temp[0].equals(city[i])){
				a=i;
				break;
			}
		}
		for(int i=0;i<position[a].length;i++){
			if(temp[1].equals(position[a][i])){
				b=i;
				break;
			}
		}
		
		
		citymodel=new DefaultComboBoxModel(city);
		comboBox = new JComboBox(citymodel);
		comboBox.setSelectedIndex(a);
		comboBox.addItemListener(this);
		comboBox.setBounds(119, 240, 69, 21);
		contentPane.add(comboBox);
		
		
		comboBoxModel=new DefaultComboBoxModel(position[a]);
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(comboBoxModel);
		comboBox_1.setSelectedIndex(b);
		comboBox_1.setBounds(198, 240, 138, 21);
		contentPane.add(comboBox_1);
		
		rdbtnNewRadioButton = new JRadioButton("\u5FEB\u9012\u5458");
		rdbtnNewRadioButton.setBounds(119, 332, 96, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		radioButton = new JRadioButton("\u7BA1\u7406\u5458");
		radioButton.setBounds(253, 332, 126, 23);
		contentPane.add(radioButton);
		
		radioButton_1 = new JRadioButton("\u603B\u7ECF\u7406");
		radioButton_1.setBounds(393, 332, 123, 23);
		contentPane.add(radioButton_1);
		
		radioButton_2 = new JRadioButton("\u4F4E\u7EA7\u8D22\u52A1\u4EBA\u5458");
		radioButton_2.setBounds(543, 332, 119, 23);
		contentPane.add(radioButton_2);
		
		radioButton_3 = new JRadioButton("\u9AD8\u7EA7\u8D22\u52A1\u4EBA\u5458");
		radioButton_3.setBounds(119, 374, 126, 23);
		contentPane.add(radioButton_3);
		
		radioButton_4 = new JRadioButton("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		radioButton_4.setBounds(393, 374, 145, 23);
		contentPane.add(radioButton_4);
		
		radioButton_5 = new JRadioButton("\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u4EBA\u5458");
		radioButton_5.setBounds(543, 374, 145, 23);
		contentPane.add(radioButton_5);
		
		radioButton_6 = new JRadioButton("\u8425\u4E1A\u5385\u4E1A\u52A1\u5458");
		radioButton_6.setBounds(253, 374, 138, 23);
		contentPane.add(radioButton_6);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(radioButton);
		bg.add(radioButton_1);
		bg.add(radioButton_2);
		bg.add(radioButton_3);
		bg.add(radioButton_4);
		bg.add(radioButton_5);
		bg.add(radioButton_6);
		bg.add(rdbtnNewRadioButton);
		Enumeration<AbstractButton> enumeration=bg.getElements();
		do{
			AbstractButton abstractButton=enumeration.nextElement();
			if(abstractButton.getText().equals(vo.getPosition()))
				abstractButton.setSelected(true);
		}while(enumeration.hasMoreElements());
		button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String position="";
				Enumeration<AbstractButton> raditEnumeration=bg.getElements();
				do{
					AbstractButton abstractButton=raditEnumeration.nextElement();
					if(abstractButton.isSelected()){
						position=abstractButton.getText();
					}
				}while(raditEnumeration.hasMoreElements());
				StaffVO vo=new StaffVO(textField.getText(), textField_1.getText(),textArea.getText(), 
								position,textField_2.getText(), textField_3.getText(), 
								comboBox.getSelectedItem().toString()+","+comboBox_1.getSelectedItem().toString());
				if(staffbl.JudgeNull(vo)){
					label_8.setText("信息不完整，请补全信息");
				}else{
					staffbl.editStaff(vo);
					StaffVO staffVO=staffbl.checkStaff(textField.getText());
					Staff staff=new Staff(staffVO);
					dispose();
				}
			}
		});
		button.setBounds(243, 481, 93, 23);
		contentPane.add(button);
		
		button_1 = new JButton("\u5220\u9664\u6B64\u4EBA\u5458");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffbl.deleteStaff(textField.getText());
				thiStaff.setEnabled(false);
				Thread thread=new Thread(thiStaff);
				thread.start();
				StaffManager staffManager=new StaffManager();
				dispose();
			}
		});
		button_1.setBounds(423, 481, 93, 23);
		contentPane.add(button_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 533, 714, 28);
		contentPane.add(toolBar);
		
		label_8 = new JLabel("\u72B6\u6001");
		toolBar.add(label_8);
		
		JLabel label_6 = new JLabel("\u624B\u673A");
		label_6.setBounds(421, 189, 54, 15);
		contentPane.add(label_6);
		
		
		JLabel label_7 = new JLabel("\u5730\u5740");
		label_7.setBounds(421, 243, 54, 15);
		contentPane.add(label_7);
		
		textArea = new JTextArea();
		textArea.setBounds(481, 239, 217, 52);
		textArea.setText(vo.getAddress());
		contentPane.add(textArea);
		
		JButton button_2 = new JButton("\u8FD4\u56DE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Staff staff=new Staff(vo);
				dispose();
			}
		});
		button_2.setBounds(10, 10, 93, 23);
		contentPane.add(button_2);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<city.length;i++){
			if(e.getSource()==comboBox){
				comboBox_1.setModel(new DefaultComboBoxModel(position[comboBox.getSelectedIndex()]));
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label_8.setText("删除成功");
	}
}
