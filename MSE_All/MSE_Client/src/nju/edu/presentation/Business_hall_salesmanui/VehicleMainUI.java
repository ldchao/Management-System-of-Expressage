package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class VehicleMainUI extends JPanel{
	private JTextField textField;
	
	public VehicleMainUI(JFrame m, JPanel bf) {
		JFrame main = m;
		JPanel lastui = bf;
		VehicleMainUI nowPanel = this;
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

		JLabel label = new JLabel("Ӫҵ��ҵ��Ա>>������Ϣ����");
		label.setBounds(100, 14, 200, 15);
		add(label);

		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(313, 240, 133, 26);
		add(textField);
		
		JLabel label_2 = new JLabel("��������");
		label_2.setBounds(234, 239, 57, 28);
		add(label_2);
		
		JButton button_1 = new JButton("��ѯ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(221, 321, 105, 29);
		add(button_1);
		
		JButton button_2 = new JButton("�½�");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(345, 321, 105, 29);
		add(button_2);
		
		
		
		

}
	}