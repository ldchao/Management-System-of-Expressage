package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Receiveui extends JPanel {
	private JTextField textField;
	JFrame main;

	/**
	 * Create the panel.
	 */
	public Receiveui(JFrame m,JPanel jp) {
		main=m;
		JPanel lastui=jp;
		Receiveui nowPanel=this;
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
		
		JLabel label = new JLabel("��ת����ҵ��Ա>>��ת����");
		label.setBounds(100, 14, 187, 15);
		add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("����װ�˵����");
		label_2.setBounds(179, 255, 110, 23);
		add(label_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);
		
		JLabel label_3 = new JLabel("ѡ�񵽴��װ�˵�");
		label_3.setFont(new Font("΢���ź�", Font.BOLD, 20));
		label_3.setBounds(289, 134, 255, 23);
		add(label_3);
		
		textField = new JTextField();
		textField.setBounds(342, 254, 196, 23);
		add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("�������ﵥ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arriverorder a=new Arriverorder(main, nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(a);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.setBounds(307, 368, 134, 23);
		add(button_1);

	}
}
