package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import nju.edu.businesslogic.storebl.Inventory_managementBL;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementBLService;
import PO.LoginPO;

public class Take_Stock extends JPanel {

	JRadioButton[] radioButton=new JRadioButton[3];
	/**
	 * Create the panel.
	 */
	public Take_Stock(JFrame m,JPanel jp,LoginPO loginPO) {
		JFrame main=m;
		JPanel lastui=jp;
		Take_Stock nowPanel=this;
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
        setLayout(null);
        
		JButton button = new JButton("");
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(image1);
		button.addMouseListener(new MouseAdapter() {
					@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_circle.png"));
			}	
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button);
		
		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>������>>�̵���");
		lblNewLabel.setBounds(100, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);		
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("״̬��");
		lblNewLabel_6.setForeground(Color.WHITE);
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
		btnNewButton_1.setBounds(220, 434, 52, 52);
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
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton_1.getWidth(), btnNewButton_1.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ȡ��");
		btnNewButton_2.setBounds(400, 434, 52, 52);
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
		btnNewButton_2.setIcon(image1);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
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
