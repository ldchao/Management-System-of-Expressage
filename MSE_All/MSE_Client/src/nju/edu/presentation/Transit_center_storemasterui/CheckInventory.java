package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import nju.edu.presentation.financial_staffui.DateChooser;
import PO.LoginPO;

public class CheckInventory extends JPanel {

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/TransitCenterStoreMaster/CheckInventory.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
	public CheckInventory(JFrame m,JPanel jp,LoginPO loginPO) {
		JFrame main=m;
		JPanel lastui=jp;
		CheckInventory nowPanel=this;
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
		
		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(362, 229, 96, 15);
		add(lblNewLabel_8);
		
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_9 = new JLabel("单击选择日期");
		dateChooser2.register(lblNewLabel_9);
		lblNewLabel_9.setBounds(362, 343, 96, 15);
		add(lblNewLabel_9);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("状态栏");
		lblNewLabel_6.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(272, 469, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String startData=lblNewLabel_8.getText();
				String overData=lblNewLabel_9.getText();
				if(startData.equals("单击选择日期")||overData.equals("单击选择日期")){
					lblNewLabel_6.setText("请选择日期！");
				}else{
				CheckInventory_show cis=new CheckInventory_show(main,nowPanel,loginPO,startData,overData);
				main.remove(nowPanel);				
				main.getContentPane().add(cis);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}}
		});
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton_1.getWidth(), btnNewButton_1.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(424, 468, 52, 52);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckInventory ci=new CheckInventory(main,lastui,loginPO);
				main.remove(nowPanel);				
				main.getContentPane().add(ci);
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

}
