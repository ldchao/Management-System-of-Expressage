package nju.edu.presentation.Transit_center_storemasterui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;

import PO.LoginPO;
import nju.edu.businesslogic.storebl.Inventory_managementBL;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementBLService;
import nju.edu.presentation.Transit_center_salesmanui.Transferui;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Take_Stock extends JPanel {

	JRadioButton[] radioButton=new JRadioButton[3];
	/**
	 * Create the panel.
	 */
	public Take_Stock(JFrame m,JPanel jp,LoginPO loginPO) {
		JFrame main=m;
		JPanel lastui=jp;
		Take_Stock nowPanel=this;
        setLayout(null);
        
		JButton button = new JButton("����");
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
		
		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>������>>�̵���");
		lblNewLabel.setBounds(100, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(loginPO.getName()+"����ã�");
		lblNewLabel_1.setBounds(600, 14, 100, 15);		
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533,734,28);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("ѡ�����");
		lblNewLabel_4.setBounds(163, 191, 54, 15);
		add(lblNewLabel_4);		

		radioButton[0] = new JRadioButton("������");
		radioButton[0].setBounds(312, 191, 79, 23);
		add(radioButton[0]);
		
		radioButton[1] = new JRadioButton("������");
		radioButton[1].setBounds(456, 191, 79, 23);
		add(radioButton[1]);
		
		radioButton[2] = new JRadioButton("������");
		radioButton[2].setBounds(312, 246, 121, 23);
		add(radioButton[2]);
		
		ButtonGroup bg1=new ButtonGroup();
		for (int i = 0; i < 3; i++) {
			add(radioButton[i]);
			bg1.add(radioButton[i]);
		}
		
		JLabel lblNewLabel_5 = new JLabel("ѡ��鿴��ʽ");
		lblNewLabel_5.setBounds(163, 336, 88, 15);
		add(lblNewLabel_5);		
		
		JRadioButton radioButton_3 = new JRadioButton("ҳ����ʾ");
		radioButton_3.setBounds(312, 332, 88, 23);
		add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("���Excel��");
		radioButton_4.setBounds(456, 332, 121, 23);
		add(radioButton_4);
		
		ButtonGroup bg2=new ButtonGroup();
		bg2.add(radioButton_3);
		bg2.add(radioButton_4);
		
		JLabel label = new JLabel("����̵�");
		label.setFont(new Font("΢���ź�", Font.BOLD, 24));
		label.setBounds(312, 101, 130, 33);
		add(label);
		
		JButton btnNewButton_1 = new JButton("ȷ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton_3.isSelected()&& isSelected_qu()){
					Take_Stock_show tss=new Take_Stock_show(main,nowPanel,loginPO,getString());
					main.remove(nowPanel);				
					main.getContentPane().add(tss);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}else if(radioButton_4.isSelected()&& isSelected_qu()){
					Inventory_managementBLService ib=new Inventory_managementBL();
					ib.InventoryOrderToExcel(getString());
				}else{
					lblNewLabel_6.setText("��ѡ������Ͳ鿴��ʽ");
				}
				
			}
		});
		btnNewButton_1.setBounds(220, 434, 98, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ȡ��");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Take_Stock ts=new Take_Stock(main,lastui,loginPO);
				main.remove(nowPanel);				
				main.getContentPane().add(ts);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});		
		btnNewButton_2.setBounds(400, 434, 88, 25);
		add(btnNewButton_2);
	}
	
	private boolean isSelected_qu(){
		if(radioButton[0].isSelected()||radioButton[1].isSelected()||radioButton[2].isSelected())
			return true;
		return false;
	}
	
	private String getString(){
		String[] s={"������","������","������"};
		for (int i = 0; i < 3; i++) {
			if(radioButton[i].isSelected())
				return s[i];
		}
		return "";
	}
}
