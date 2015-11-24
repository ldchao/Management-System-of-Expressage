package nju.edu.presentation.Transit_center_storemasterui;

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

import nju.edu.presentation.Transit_center_salesmanui.Receiveui;
import nju.edu.presentation.Transit_center_salesmanui.Transit_center_salesman_mainui;

public class Transit_center_storemaster_mainui extends JFrame {

	private JPanel contentPane;
	Transit_center_storemaster_mainui main;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transit_center_storemaster_mainui frame = new Transit_center_storemaster_mainui();
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
	public Transit_center_storemaster_mainui() {
		main=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 750, 600);
		contentPane = new JPanel();
		this.add(contentPane);
		contentPane.setLayout(null);

		JButton button = new JButton("注销");
		button.setBounds(10, 10, 65, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
			}
		});
		contentPane.add(button);

		JLabel label = new JLabel("仓库管理员");
		label.setBounds(100, 14, 73, 15);
		contentPane.add(label);

		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("入库管理");
		label_2.setBounds(109, 172, 54, 15);
		contentPane.add(label_2);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Warehouse_inui wi=new Warehouse_inui(main,contentPane);
				main.remove(contentPane);				
				main.getContentPane().add(wi);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(62, 217, 160, 128);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("库存管理");
		lblNewLabel.setBounds(339, 172, 54, 15);
		contentPane.add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory_managementui im=new Inventory_managementui(main,contentPane);
				main.remove(contentPane);				
				main.getContentPane().add(im);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(290, 217, 160, 128);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("出库管理");
		lblNewLabel_1.setBounds(557, 172, 54, 15);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Warehouse_outui wo=new Warehouse_outui(main,contentPane);
				main.remove(contentPane);				
				main.getContentPane().add(wo);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(507, 217, 160, 128);
		contentPane.add(btnNewButton_2);
	
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		contentPane.add(toolBar);

		JLabel label_3 = new JLabel("状态栏");
		toolBar.add(label_3);

	}

}
