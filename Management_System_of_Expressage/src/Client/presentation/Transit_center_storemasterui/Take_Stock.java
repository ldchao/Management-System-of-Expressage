package Client.presentation.Transit_center_storemasterui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;

import javax.swing.JRadioButton;

public class Take_Stock extends JPanel {

	/**
	 * Create the panel.
	 */
	public Take_Stock() {

        setLayout(null);
		
		JButton btnNewButton = new JButton("����");
		btnNewButton.setBounds(10, 10, 57, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>������>>�̵���");
		lblNewLabel.setBounds(92, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("��������ã�");
		lblNewLabel_1.setBounds(505, 14, 79, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("��ʼ����");
		lblNewLabel_2.setBounds(117, 101, 54, 15);
		add(lblNewLabel_2);
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("����ѡ������");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(211, 101, 96, 15);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_3 = new JLabel("��������");
		lblNewLabel_3.setBounds(337, 101, 54, 15);
		add(lblNewLabel_3);
		
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_9 = new JLabel("����ѡ������");
		dateChooser2.register(lblNewLabel_9);
		lblNewLabel_9.setBounds(423, 101, 96, 15);
		add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("ȷ��");
		btnNewButton_1.setBounds(146, 332, 130, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ȡ��");
		btnNewButton_2.setBounds(369, 332, 123, 25);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 400, 650, 25);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("ѡ�����");
		lblNewLabel_4.setBounds(117, 173, 54, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ѡ��鿴��ʽ");
		lblNewLabel_5.setBounds(117, 252, 88, 15);
		add(lblNewLabel_5);
		
		JRadioButton radioButton = new JRadioButton("������");
		radioButton.setBounds(211, 169, 79, 23);
		add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("������");
		radioButton_1.setBounds(312, 169, 79, 23);
		add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("������");
		radioButton_2.setBounds(423, 169, 121, 23);
		add(radioButton_2);
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(radioButton_2);
		bg1.add(radioButton_1);
		bg1.add(radioButton);
		
		
		JRadioButton radioButton_3 = new JRadioButton("ҳ����ʾ");
		radioButton_3.setBounds(234, 248, 121, 23);
		add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("���Excel��");
		radioButton_4.setBounds(369, 248, 121, 23);
		add(radioButton_4);
		
		ButtonGroup bg2=new ButtonGroup();
		bg2.add(radioButton_3);
		bg2.add(radioButton_4);
	}
}
