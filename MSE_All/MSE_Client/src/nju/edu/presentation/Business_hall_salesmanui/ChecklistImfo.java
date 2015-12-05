package nju.edu.presentation.Business_hall_salesmanui;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.table.DefaultTableModel;

import State.ApproveState;
import State.ExpressType;
import State.PackageType;
import sun.misc.Cleaner;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;

import nju.edu.VO.OrderVO;
import nju.edu.businesslogic.listinbl.Listinbl;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.table.DefaultTableModel;

import State.ApproveState;
import State.ExpressType;
import State.PackageType;
import sun.misc.Cleaner;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;

import nju.edu.VO.OrderVO;
import nju.edu.businesslogic.listinbl.Listinbl;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class ChecklistImfo extends JPanel{
	
	/*
	 * method:Frebin
	 * function:interface of record the order
	 */
		private JPanel contentPane;
		private JLabel label_1;
		private JLabel label_2;
		private JLabel label_3;
		private JLabel label_4;
		private JLabel label_5;
		private JLabel label_6;
		private JLabel label_7;
		private JLabel label_8;
		private JLabel label_9;
		private JLabel label_10;
		private JLabel label_11;
		private JLabel label_12;
		private JLabel label_13;
		private JLabel label_14;
		private JLabel lblkg;
		private JLabel lblcm;
		private JLabel lblcm_1;
		private JLabel lblcm_2;
		private JLabel label_18;
		private JLabel label_19;
		private JLabel label_20;
		private JLabel label_21;
		private JLabel label_22;
		private JLabel label_23;
		private Listinbl listinbl;
		private ExpressType express;
		private PackageType pack;
		private JButton button_1;
		
		/**
		 * Launch the application.
		 */


		/**
		 * Create the frame.
		 */
		public ChecklistImfo(JFrame m, JPanel bf) {
			JFrame main = m;
			ChecklistImfo contentPane = this;
			this.setBounds(300, 0, 712, 683);
			this.setVisible(true);
			
			contentPane.setForeground(Color.WHITE);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(null);
			
			JLabel label = new JLabel("\u5BC4\u4EF6\u4EBA\u4FE1\u606F");
			label.setBounds(126, 183, 94, 15);
			label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
			contentPane.add(label);
			
			label_1 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F");
			label_1.setBounds(384, 183, 94, 15);
			label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
			contentPane.add(label_1);
			
			label_2 = new JLabel("\u59D3\u540D");
			label_2.setBounds(126, 208, 54, 15);
			contentPane.add(label_2);
			
			label_3 = new JLabel("\u59D3\u540D");
			label_3.setBounds(384, 210, 54, 15);
			contentPane.add(label_3);
			
			label_4 = new JLabel("\u8BA2\u5355");
			label_4.setBounds(315, 68, 54, 33);
			label_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 24));
			contentPane.add(label_4);
			
			label_5 = new JLabel("\u5FEB\u9012\u5458");
			label_5.setBounds(126, 118, 54, 15);
			contentPane.add(label_5);
			
			label_6 = new JLabel("\u8BA2\u5355\u53F7");
			label_6.setBounds(384, 118, 54, 15);
			contentPane.add(label_6);
			
			label_7 = new JLabel("\u7535\u8BDD");
			label_7.setBounds(126, 235, 54, 15);
			contentPane.add(label_7);
			
			label_8 = new JLabel("\u7535\u8BDD");
			label_8.setBounds(384, 235, 54, 15);
			contentPane.add(label_8);
			
			label_9 = new JLabel("\u624B\u673A");
			label_9.setBounds(126, 262, 54, 15);
			contentPane.add(label_9);
			
			label_10 = new JLabel("\u624B\u673A");
			label_10.setBounds(384, 262, 54, 15);
			contentPane.add(label_10);
			
			label_11 = new JLabel("\u5355\u4F4D");
			label_11.setBounds(126, 289, 54, 15);
			contentPane.add(label_11);
			
			label_12 = new JLabel("\u5355\u4F4D");
			label_12.setBounds(384, 289, 54, 15);
			contentPane.add(label_12);
			
			label_13 = new JLabel("\u5730\u5740");
			label_13.setBounds(126, 316, 54, 15);
			contentPane.add(label_13);
			
			label_14 = new JLabel("\u5730\u5740");
			label_14.setBounds(384, 316, 54, 15);
			contentPane.add(label_14);
			
			JLabel label_15 = new JLabel("\u6258\u8FD0\u7269\u4FE1\u606F");
			label_15.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
			label_15.setBounds(126, 366, 112, 15);
			contentPane.add(label_15);
			
			JLabel label_16 = new JLabel("\u7269\u54C1\u540D");
			label_16.setBounds(126, 393, 54, 15);
			contentPane.add(label_16);
			
			JLabel label_17 = new JLabel("\u7269\u54C1\u6570");
			label_17.setBounds(384, 389, 54, 15);
			contentPane.add(label_17);
			
			lblkg = new JLabel("\u7269\u54C1\u5B9E\u9645\u91CD\u91CF\uFF08kg\uFF09");
			lblkg.setBounds(126, 420, 123, 15);
			contentPane.add(lblkg);
			
			lblcm = new JLabel("\u7269\u54C1\u957F\u5EA6\uFF08cm\uFF09");
			lblcm.setBounds(126, 447, 99, 15);
			contentPane.add(lblcm);
			
			lblcm_1 = new JLabel("\u7269\u54C1\u5BBD\u5EA6\uFF08cm\uFF09");
			lblcm_1.setBounds(126, 474, 97, 15);
			contentPane.add(lblcm_1);
			
			lblcm_2 = new JLabel("\u7269\u54C1\u9AD8\u5EA6\uFF08cm\uFF09");
			lblcm_2.setBounds(126, 501, 106, 15);
			contentPane.add(lblcm_2);
			
			label_18 = new JLabel("\u5FEB\u9012\u79CD\u7C7B");
			label_18.setBounds(384, 420, 54, 15);
			contentPane.add(label_18);
			
			ButtonGroup bg1=new ButtonGroup();
			
			label_19 = new JLabel("\u5305\u88C5\u79CD\u7C7B");
			label_19.setBounds(384, 447, 54, 15);
			contentPane.add(label_19);
			ButtonGroup bg2=new ButtonGroup();
			
			label_20 = new JLabel("\u7269\u6D41\u4FE1\u606F");
			label_20.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
			label_20.setBounds(126, 545, 63, 15);
			contentPane.add(label_20);
			
			label_21 = new JLabel("\u5BA1\u6279\u72B6\u6001");
			label_21.setBounds(126, 143, 54, 15);
			contentPane.add(label_21);
			
			label_22 = new JLabel("\u9884\u8BA1\u9001\u8FBE\u65F6\u95F4");
			label_22.setBounds(384, 501, 84, 15);
			contentPane.add(label_22);
			
			label_23 = new JLabel("\u4ED8\u6B3E");
			label_23.setBounds(384, 474, 43, 15);
			contentPane.add(label_23);
			
			button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					dispose();
//					Courier courier=new Courier();
				}
			});
			button_1.setBounds(22, 20, 63, 23);
			contentPane.add(button_1);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(192, 117, 61, 16);
			contentPane.add(lblNewLabel);
		}
}
