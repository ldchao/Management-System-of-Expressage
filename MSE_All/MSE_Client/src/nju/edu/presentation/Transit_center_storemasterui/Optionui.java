package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.JTable;

import PO.LoginPO;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import nju.edu.businesslogic.storebl.StoreMessageBL;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class Optionui extends JPanel {
	private JTable table;
	private JTextField textField;
	boolean isEditable;
	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/TransitCenterStoreMaster/Optionui.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
	public Optionui(JFrame m, JPanel jp, LoginPO loginPO, StoreMessageBL sm) {
		JFrame main = m;
		JPanel lastui = jp;
		Optionui nowPanel = this;
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);
		isEditable = false;

		JButton button = new JButton("");
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(image1);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button);

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel lblNewLabel_6 = new JLabel("״̬��");
		lblNewLabel_6.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel_6);

		JLabel lblNewLabel_1 = new JLabel(loginPO.getShop() + "�ֿ�");
		lblNewLabel_1.setForeground(new Color(248, 179, 28));
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(307, 74, 183, 33);
		add(lblNewLabel_1);

		textField = new JTextField(sm.getIntervalTime() + "");
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setBounds(358, 129, 66, 27);
		textField.setEditable(isEditable);
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!(Character.isDigit(e.getKeyChar()) || e
						.getKeyChar() == '.')) {
					e.consume();
				}
			}
		});
		add(textField);
		textField.setColumns(10);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(532, 117, 52, 52);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(btnNewButton_1.getWidth(),
				btnNewButton_1.getHeight(),image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp1);
		btnNewButton_1.setIcon(image2);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isEditable) {
					isEditable = true;		
					btnNewButton_1.setIcon(new ImageIcon("image/TransitCenterStoreMaster/OK.png"));
				}else{
					
					double intervalTime=Double.parseDouble(textField.getText());
					if(intervalTime<0.01||intervalTime>=2000){
						lblNewLabel_6.setText("���������ļ��ʱ��!");
					}else{
						isEditable = false;
						btnNewButton_1.setIcon(null);
//						btnNewButton_1.setText("����");
						sm.setIntervalTime(intervalTime);
						lblNewLabel_6.setText("�洢���ʱ���������!");
					}
				} 
				textField.setEditable(isEditable);
			}
		});
		
		add(btnNewButton_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(106, 210, 537, 254);
		add(scrollPane);

        String[][] message=sm.getArriveAddress();
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table.setEnabled(false);
		table.setFont(new Font("����", Font.PLAIN, 12));
		// ʹ������
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);
		
		tableModel = new DefaultTableModel(message, new String[] { "�������",
				"�����" });
		table.setModel(tableModel);
		scrollPane.setViewportView(table);

	}
}
