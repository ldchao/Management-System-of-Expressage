package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.SwingConstants;

import PO.LoginPO;
import PO.OrganizationNumPO;
import StaticValue.StoreNum;
import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogic.transferbl.TransferBL;
import nju.edu.businesslogicservice.transferblservice.TransferBLService;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;

public class Changeorder extends JPanel implements Runnable{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JFrame main;
	private JTextField textField_4;
	Changeorder nowPanel;
	JPanel returnui;
	LoginPO loginpo;
	/**
	 * Create the panel.
	 */
	public Changeorder(JFrame m,JPanel jp,JPanel jp2,LoginPO loginPO,String transferWay,int arriveNum,ArrayList<String> orderlist) {

		main=m;
		JPanel lastui=jp;
		nowPanel=this;
		returnui=jp2;
		loginpo=loginPO;
		setLayout(null);
		
		JButton button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);				
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 65, 23);
		add(button);
		
		JLabel label = new JLabel("中转中心业务员>>录入中转单>>新建中转单>>选择货物>>中转单");
		label.setBounds(100, 14, 393, 15);
		add(label);
		
		JLabel label_1 = new JLabel(loginPO.getName()+"，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel label_2 = new JLabel("装车日期");
		label_2.setBounds(70, 132, 54, 15);
		add(label_2);		
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(180, 132, 96, 15);
		add(lblNewLabel_8);
		
		JLabel label_3 = new JLabel("中转单编号");
		label_3.setBounds(70, 174, 96, 15);
		add(label_3);
		
		textField = new JTextField();
		textField.setBounds(180, 168, 134, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("出发地");
		lblNewLabel.setBounds(70, 216, 54, 15);
		add(lblNewLabel);
				
		textField_1 = new JTextField();
		textField_1.setText(loginPO.getShop());
		textField_1.setEditable(false);
		textField_1.setBounds(180, 213, 134, 21);
		add(textField_1);
		textField_1.setColumns(10);		
		
		JLabel lblNewLabel_3 = new JLabel("到达地");
		lblNewLabel_3.setBounds(70, 262, 54, 15);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setText(StoreNum.storeName[arriveNum-1]);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(180, 259, 134, 21);
		add(textField_2);
		
		JLabel label_6 = new JLabel("运输方式");
		label_6.setBounds(70, 307, 54, 15);
		add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setText(transferWay);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(180, 304, 134, 21);
		add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("监装员");
		lblNewLabel_1.setBounds(70, 355, 54, 15);
		add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(180, 352, 134, 21);
		add(textField_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(374, 131, 295, 289);
		add(scrollPane);
		
		String order="";
		for(String s:orderlist){
			order+=s+"\n";
		}
		
		JLabel lblNewLabel_4 = new JLabel("本次中转所有单号");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setText(order);
		scrollPane.setViewportView(textArea);
		
		JLabel label_5 = new JLabel("中转中心中转单");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label_5.setBounds(273, 60, 235, 33);
		add(label_5);
		
		JLabel lblNewLabel_2 = new JLabel("审批状态");
		lblNewLabel_2.setBounds(70, 402, 69, 15);
		add(lblNewLabel_2);
		
		
		String[] approveState = { "未审批", "审批通过", "审批未通过" };
		JComboBox comboBox = new JComboBox(approveState);
		comboBox.setBounds(180, 399, 134, 21);
		comboBox.setEnabled(false);
		add(comboBox);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrganizationNumPO op=new OrganizationNumPO();
				String date=lblNewLabel_8.getText();
				String transferNum=textField.getText();
				String offNum=op.getNum(textField_1.getText());
				String arriveNum=op.getNum(textField_2.getText());
				String moniterName=textField_4.getText();
				if(date.equals("单击选择日期")||
						transferNum.length()==0||moniterName.length()==0
						){
					label_4.setText("输入信息有误！");
				}else{
					ChangeorderVO cv=new ChangeorderVO(transferNum, date, offNum, arriveNum, 
							transferWay, moniterName, orderlist);
					TransferBLService tb=new TransferBL();
					tb.build(cv);
					Thread t=new Thread(nowPanel);
					t.start();
				}
				
			}
		});
		btnNewButton.setBounds(226, 457, 80, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder c=new Changeorder(main, lastui,jp2,loginPO,transferWay,arriveNum,orderlist);
				main.remove(nowPanel);				
				main.getContentPane().add(c);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(428, 457, 80, 23);
		add(btnNewButton_1);
	}
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Transferui tf=new Transferui(main, returnui, loginpo);
		main.remove(nowPanel);				
		main.getContentPane().add(tf);
		main.invalidate();
		main.repaint();
		main.setVisible(true);
	}
}