package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

public class Transit_center_salesman_mainui extends JFrame {

	private JPanel contentPane;
	Transit_center_salesman_mainui main;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transit_center_salesman_mainui frame = new Transit_center_salesman_mainui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Transit_center_salesman_mainui() {
		main=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 750, 600);
		contentPane = new JPanel();
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("��ת����ҵ��Ա");
		label.setBounds(100, 14, 127, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(600, 14, 100, 15);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("ע��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
			}
		});
		btnNewButton.setBounds(10, 10, 65, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("��ת����");
		lblNewLabel.setBounds(112, 152, 54, 15);
		contentPane.add(lblNewLabel);
		
		//��ת���հ�ť
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receiveui r=new Receiveui(main,contentPane);
				main.remove(contentPane);				
				main.getContentPane().add(r);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(66, 191, 160, 128);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("¼����ת��");
		lblNewLabel_1.setBounds(331, 152, 83, 15);
		contentPane.add(lblNewLabel_1);		
		
		//¼����ת����ť
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transferui t=new Transferui(main,contentPane);
				main.remove(contentPane);
				main.getContentPane().add(t);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(292, 191, 160, 128);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("װ������");
		lblNewLabel_2.setBounds(548, 152, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		//װ������ť
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shippingui s=new Shippingui(main,contentPane);
				main.remove(contentPane);				
				main.getContentPane().add(s);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(515, 191, 160, 128);
		contentPane.add(btnNewButton_3);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		contentPane.add(toolBar);
		
		JLabel label_2 = new JLabel("״̬��");
		toolBar.add(label_2);

	}
}
