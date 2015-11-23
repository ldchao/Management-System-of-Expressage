package Client.presentation.Transit_center_storemasterui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;

import java.awt.Font;

public class CheckInventory extends JPanel {

	/**
	 * Create the panel.
	 */
	public CheckInventory(JFrame m,JPanel jp) {
		JFrame main=m;
		JPanel lastui=jp;
		CheckInventory nowPanel=this;
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
		
		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>������>>�鿴���");
		lblNewLabel.setBounds(100, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("��������ã�");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("��ʼ����");
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 12));
		lblNewLabel_2.setBounds(237, 224, 54, 15);
		add(lblNewLabel_2);
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("����ѡ������");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(402, 224, 96, 15);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_3 = new JLabel("��������");
		lblNewLabel_3.setFont(new Font("����", Font.BOLD, 12));
		lblNewLabel_3.setBounds(237, 313, 54, 15);
		add(lblNewLabel_3);
		
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_9 = new JLabel("����ѡ������");
		dateChooser2.register(lblNewLabel_9);
		lblNewLabel_9.setBounds(402, 313, 96, 15);
		add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("ȷ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckInventory_show cis=new CheckInventory_show(main,nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(cis);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(196, 405, 130, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ȡ��");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckInventory ci=new CheckInventory(main,lastui);
				main.remove(nowPanel);				
				main.getContentPane().add(ci);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(413, 405, 123, 25);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533,734,28);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_6);
		
		JLabel label = new JLabel("\u9009\u62E9\u8981\u67E5\u770B\u7684\u8D77\u6B62\u65E5\u671F");
		label.setFont(new Font("΢���ź�", Font.BOLD, 20));
		label.setBounds(241, 135, 257, 28);
		add(label);

	}

}
