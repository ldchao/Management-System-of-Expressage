package nju.edu.presentation.general_managerui;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import PO.LoginPO;
import nju.edu.businesslogic.approvebl.Approvebl;
import nju.edu.presentation.Loginui.PersonalInfomation;
import javax.swing.JTextArea;
import java.awt.Color;

public class ListApprove extends JPanel implements ItemListener{

	private static JTable table;
	private static DefaultTableModel tableModel;
	private int rowpos = -1;
	private Approvebl approvebl=new Approvebl();
	JComboBox comboBox ;
	private ApproveListInformation information;
	
	
	public ListApprove(JFrame main,LoginPO loginPO) {
		ListApprove listApproveframe=this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager newmanager=new Manager(main,loginPO);
				main.remove(listApproveframe);
				main.getContentPane().add(newmanager);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(new ImageIcon("image/transparent_circle.png"));
		button.addMouseListener(new MouseAdapter() {
					@Override
			public void mousePressed(MouseEvent e) {
						button.setIcon(new ImageIcon("image/mask_circle.png"));
			}	
		});
		add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u5355\u636E\u5BA1\u6279");
		label.setBounds(96, 14, 271, 15);
		add(label);
		
//		String[] state={"未审批","审批已通过","审批未通过"};
		

		JLabel label_2 = new JLabel("\u5355\u636E\u79CD\u7C7B");
		label_2.setBounds(96, 62, 54, 15);
		add(label_2);
		
		String[] type={"寄件单","装车单","营业厅到达单","收款单","派件单","中转中心到达单","入库单","中转单","出库单","付款单"};
		comboBox = new JComboBox(type);
		comboBox.setBounds(162, 59, 144, 23);
		comboBox.addItemListener(this);
		add(comboBox);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(451, 102, 246, 308);
		add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		textArea.setLineWrap(true);
		textArea.setEnabled(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(85, 102, 259, 308);
		add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(25);
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);
		
		
		// 选取行
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				Point mousepoint;
				mousepoint = e.getPoint();
				rowpos = table.rowAtPoint(mousepoint);
				table.setRowSelectionInterval(rowpos, rowpos);
				if(rowpos<approvebl.showList(comboBox.getSelectedItem().toString()).size()){
					String info=approvebl.showList(comboBox.getSelectedItem().toString()).get(rowpos);
					textArea.setText(info);
				}else{
					textArea.setText("");
				}

			}
			

		});
		scrollPane.setViewportView(table);
		table.setEnabled(false);
		tableModel = new DefaultTableModel(
				new Object[][] {{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null},{null}},
					new String[] {	"单据信息"
				});
		table.setModel(tableModel);
		//初始化
		showTable(approvebl.showList(comboBox.getSelectedItem().toString()));
		
		JButton button_1 = new JButton("\u5BA1\u6279\u901A\u8FC7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos != -1) {
					approvebl.editList(rowpos, comboBox.getSelectedItem().toString());
					showTable(approvebl.showList(comboBox.getSelectedItem().toString()));
					textArea.setText("");
				}
			}
		});
		button_1.setBounds(304, 443, 63, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button_1.getWidth(),
						button_1.getHeight(),image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button_1.setIcon(image1);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		add(button_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);
		
		JLabel label_3 = new JLabel("\u72B6\u6001\u680F");
		label_3.setForeground(Color.WHITE);
		toolBar.add(label_3);
		

		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==comboBox){
			showTable(approvebl.showList(comboBox.getSelectedItem().toString()));
		}
	}
	
	public static void showTable(ArrayList<String> acvo) {
		int i = 0;
		for (String ac : acvo) {
			tableModel.setValueAt(ac, i, 0);
			i++;
			if (i >= table.getRowCount()) {
				String[] rowstr = { ""};
				tableModel.addRow(rowstr);
			}

		}
		while (i < table.getRowCount()) {
			tableModel.setValueAt("", i, 0);
			i++;
		}
	}
}
