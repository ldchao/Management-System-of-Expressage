package Client.presentation.Transit_center_storemasterui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.presentation.Transit_center_salesmanui.Transferui;
import Client.presentation.financial_staffui.DateChooser;

import javax.swing.JRadioButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Take_Stock extends JPanel {

	/**
	 * Create the panel.
	 */
	public Take_Stock(JFrame m,JPanel jp) {
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
		
		JLabel lblNewLabel_1 = new JLabel("��������ã�");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		
		JLabel lblNewLabel_2 = new JLabel("��ʼ����");
		lblNewLabel_2.setBounds(129, 208, 54, 15);
		add(lblNewLabel_2);
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("����ѡ������");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(232, 208, 96, 15);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_3 = new JLabel("��������");
		lblNewLabel_3.setBounds(387, 208, 54, 15);
		add(lblNewLabel_3);
		
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_9 = new JLabel("����ѡ������");
		dateChooser2.register(lblNewLabel_9);
		lblNewLabel_9.setBounds(488, 208, 96, 15);
		add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("ȷ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Take_Stock_show tss=new Take_Stock_show(main,nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(tss);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(151, 445, 130, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ȡ��");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Take_Stock ts=new Take_Stock(main,lastui);
				main.remove(nowPanel);				
				main.getContentPane().add(ts);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});		
		btnNewButton_2.setBounds(421, 445, 123, 25);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533,734,28);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("ѡ�����");
		lblNewLabel_4.setBounds(129, 285, 54, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ѡ��鿴��ʽ");
		lblNewLabel_5.setBounds(129, 353, 88, 15);
		add(lblNewLabel_5);
		
		JRadioButton radioButton = new JRadioButton("������");
		radioButton.setBounds(260, 281, 79, 23);
		add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("������");
		radioButton_1.setBounds(389, 281, 79, 23);
		add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("������");
		radioButton_2.setBounds(511, 281, 121, 23);
		add(radioButton_2);
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(radioButton_2);
		bg1.add(radioButton_1);
		bg1.add(radioButton);
		
		
		JRadioButton radioButton_3 = new JRadioButton("ҳ����ʾ");
		radioButton_3.setBounds(260, 349, 121, 23);
		add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("���Excel��");
		radioButton_4.setBounds(410, 349, 121, 23);
		add(radioButton_4);
		
		ButtonGroup bg2=new ButtonGroup();
		bg2.add(radioButton_3);
		bg2.add(radioButton_4);
		
		JLabel label = new JLabel("\u5E93\u5B58\u76D8\u70B9");
		label.setFont(new Font("΢���ź�", Font.BOLD, 24));
		label.setBounds(283, 118, 130, 33);
		add(label);
	}
}
