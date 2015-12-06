package nju.edu.presentation.Loginui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import State.ApproveState;
import State.ExpressType;
import State.PackageType;
import nju.edu.VO.OrderVO;
import nju.edu.businesslogic.checklistbl.ChecklistController;
import nju.edu.businesslogic.listinbl.Receiverinbl;
import nju.edu.presentation.Business_hall_salesmanui.ChecklistImfo;
import nju.edu.presentation.Business_hall_salesmanui.VehicleLoadManageUI;

import javax.swing.JButton;
import java.awt.Color;

public class ChecklistPanel extends JPanel implements Runnable{
	private JTextField textField;
	private ChecklistController checklistController;
	private Receiverinbl receiverinbl;
	private boolean isValid = false;
	private OrderVO vo = null;
	private boolean signal;
	
	
	public ChecklistPanel(JFrame m, JPanel bf){
		JFrame main = m;
		JPanel lastui = bf;
		ChecklistPanel nowPanel = this;
		setSize(750, 600);
		setLayout(null);
		
		
		JButton button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
			}
		});
		button.setBounds(10, 10, 65, 23);
		add(button);

		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(644, 13, 100, 15);
		add(label_1);
		
		JLabel check = new JLabel("查询订单");
		check.setFont(new Font("微软雅黑", Font.BOLD, 50));
		check.setBounds(277,185,205,83);
		this.add(check);
		
		textField = new JTextField();
		textField.setBounds(155, 315, 329, 60);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 40));
		this.add(textField);
		textField.setColumns(10);
		
		JButton button2 = new JButton("确认");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signal=true;
				String id = textField.getText();
				if (id.length() != 0) {
					receiverinbl = new Receiverinbl();
					isValid = receiverinbl.searchOrder(id);
				}
				if (isValid) {
					checklistController = new ChecklistController();
					vo = checklistController.getOrder(id);
//					OrderVO vo1 = new OrderVO("1234","1231",ApproveState.NotApprove,"1","南京鼓楼区营业厅 1","1","1","11","1","南京鼓楼区营业厅 1","1","1","1","1","1.0","1.0","1.0","1.0","1000", ExpressType.Economy,PackageType.Carton,"1月1日","0","aaa");
					ChecklistImfo imfo = new ChecklistImfo(main, nowPanel);
					imfo.show(vo);
					main.remove(nowPanel);
					main.getContentPane().add(imfo);
					main.invalidate();
					main.repaint();
				
				}else{
					textField.setText("订单不存在");
					textField.setFont(new Font("微软雅黑", Font.ITALIC, 28));
					textField.setForeground(Color.RED);
					Thread t = new Thread(nowPanel);
					t.start();
					
					
					
				}
				

				
			}
		});
		button2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button2.setBounds(511, 318, 82, 50);
		add(button2);
		
		
	}


	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			textField.setText("");
			textField.setForeground(Color.BLACK);
			textField.setFont(new Font("微软雅黑", Font.PLAIN, 28));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
