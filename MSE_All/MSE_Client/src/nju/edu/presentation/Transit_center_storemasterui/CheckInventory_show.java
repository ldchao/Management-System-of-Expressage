package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import nju.edu.presentation.Transit_center_salesmanui.Transferui;
import nju.edu.presentation.financial_staffui.DateChooser;

public class CheckInventory_show extends JPanel {

	/**
	 * Create the panel.
	 */
	public CheckInventory_show(JFrame m,JPanel jp) {
		JFrame main=m;
		JPanel lastui=jp;
		CheckInventory_show nowPanel=this;
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
		
		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>������>>�鿴���>>��ʾ");
		lblNewLabel.setBounds(100, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("��������ã�");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533,734,28);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_6);
		
		JLabel label = new JLabel("�����Ϣ��ʾ");
		label.setFont(new Font("΢���ź�", Font.BOLD, 20));
		label.setBounds(305, 120, 144, 28);
		add(label);
		
		JLabel label_1 = new JLabel("\u51FA\u5E93\u6570\u91CF");
		label_1.setBounds(227, 220, 54, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u5165\u5E93\u6570\u91CF");
		label_2.setBounds(227, 280, 54, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("\u51FA\u5E93\u91D1\u989D");
		label_3.setBounds(227, 340, 54, 15);
		add(label_3);
		
		JLabel label_4 = new JLabel("\u5165\u5E93\u91D1\u989D");
		label_4.setBounds(227, 400, 54, 15);
		add(label_4);
		
		JLabel label_5 = new JLabel("_________");
		label_5.setBounds(372, 220, 80, 15);
		add(label_5);
		
		JLabel label_6 = new JLabel("_________");
		label_6.setBounds(372, 280, 80, 15);
		add(label_6);
		
		JLabel lblNewLabel_2 = new JLabel("_________");
		lblNewLabel_2.setBounds(372, 340, 80, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("_________");
		lblNewLabel_3.setBounds(372, 400, 80, 15);
		add(lblNewLabel_3);
	}
}
