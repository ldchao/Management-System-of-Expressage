package nju.edu.presentation.Transit_center_storemasterui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inventory_managementui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Inventory_managementui(JFrame m,JPanel jp) {
		JFrame main=m;
		JPanel lastui=jp;
		Inventory_managementui nowPanel=this;
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
		
		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>������");
		lblNewLabel.setBounds(100, 14, 150, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("��������ã�");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("�鿴���");
		lblNewLabel_2.setBounds(194, 99, 54, 15);
		add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckInventory ci=new CheckInventory(main,nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(ci);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(160, 143, 125, 100);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("�̵���");
		lblNewLabel_3.setBounds(489, 99, 54, 15);
		add(lblNewLabel_3);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Take_Stock ts=new Take_Stock(main,nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(ts);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(446, 143, 125, 100);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("����ֵ����");
		lblNewLabel_4.setBounds(190, 297, 69, 15);
		add(lblNewLabel_4);

		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetWarnData sw=new SetWarnData(main,nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(sw);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(160, 339, 125, 100);
		add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("����ֵ����");
		lblNewLabel_5.setBounds(474, 297, 69, 15);
		add(lblNewLabel_5);
	
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetRemindData sr=new SetRemindData(main,nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(sr);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(446, 339, 125, 100);
		add(btnNewButton_4);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_6);

	}

}