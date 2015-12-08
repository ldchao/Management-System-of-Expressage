package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JToolBar;

public class ListApprove extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ListApprove frame = new ListApprove();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public ListApprove() {
		ListApprove listApproveframe=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listApproveframe.dispose();
				Manager newmanager=new Manager();
			}
		});
		button.setBounds(10, 10, 76, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u5355\u636E\u5BA1\u6279");
		label.setBounds(96, 14, 108, 15);
		contentPane.add(label);
		
		String[] state={"未审批","审批已通过","审批未通过"};
		

		JLabel label_2 = new JLabel("\u5355\u636E\u79CD\u7C7B");
		label_2.setBounds(257, 63, 54, 15);
		contentPane.add(label_2);
		
		String[] type={"寄件单","装车单","营业厅到达单","收款单","派件单","中转中心到达单","入库单","中转单","出库单","付款单"};
		JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(392, 59, 144, 23);
		comboBox.addItemListener(this);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(85, 102, 566, 344);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(40);
		table.setModel(new DefaultTableModel(
			new Object[][] {{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},},
			new String[] {
				"\u5355\u636E\u4FE1\u606F"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton button_1 = new JButton("\u786E\u5B9A");
		button_1.setBounds(230, 474, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u53D6\u6D88");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(392, 474, 93, 23);
		contentPane.add(button_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 534, 724, 28);
		contentPane.add(toolBar);
		
		JLabel label_3 = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(label_3);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
