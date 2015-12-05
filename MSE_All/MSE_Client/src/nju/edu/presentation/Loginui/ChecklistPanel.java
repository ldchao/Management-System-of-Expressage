package nju.edu.presentation.Loginui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import nju.edu.VO.OrderVO;
import nju.edu.businesslogic.checklistbl.ChecklistController;
import nju.edu.businesslogic.listinbl.Receiverinbl;
import nju.edu.presentation.Business_hall_salesmanui.ChecklistImfo;
import nju.edu.presentation.Business_hall_salesmanui.VehicleLoadManageUI;

import javax.swing.JButton;
import java.awt.Color;

public class ChecklistPanel extends JPanel{
	private JTextField textField;
	private ChecklistController checklistController;
	private Receiverinbl receiverinbl;
	private boolean isValid = false;
	private OrderVO vo;
	
	
	public ChecklistPanel(JFrame m, JPanel bf){
		JFrame main = m;
		JPanel lastui = bf;
		ChecklistPanel nowPanel = this;
		setSize(750, 600);
		setLayout(null);
		
		
		JButton button = new JButton("∑µªÿ");
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

		JLabel label_1 = new JLabel("’≈»˝£¨ƒ„∫√£°");
		label_1.setBounds(644, 13, 100, 15);
		add(label_1);
		
		JLabel check = new JLabel("≤È—Ø∂©µ•");
		check.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.BOLD, 50));
		check.setBounds(277,185,205,83);
		this.add(check);
		
		textField = new JTextField();
		textField.setBounds(155, 315, 329, 60);
		textField.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 40));
		this.add(textField);
		textField.setColumns(10);
		
		JButton button2 = new JButton("»∑»œ");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				if (id.length() != 0) {
					isValid = receiverinbl.searchOrder(id);
				}
				if (isValid) {
					vo = checklistController.getOrder(id);
					ChecklistImfo imfo = new ChecklistImfo(main, nowPanel);
					main.remove(nowPanel);
					main.getContentPane().add(imfo);
					main.invalidate();
					main.repaint();
				}else{
					textField.setText("∂©µ•≤ª¥Ê‘⁄");
					textField.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.ITALIC, 28));
					textField.setForeground(Color.RED);
					
				}
				
				
			}
		});
		button2.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 20));
		button2.setBounds(511, 318, 82, 50);
		add(button2);
		
		
	}
}
