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

public class ListApprove extends JPanel implements ItemListener{

	private static JTable table;
	private static DefaultTableModel tableModel;
	private int rowpos = -1;
	private Approvebl approvebl=new Approvebl();
	JComboBox comboBox ;
	
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
				main.add(newmanager);
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
		label.setBounds(96, 14, 108, 15);
		add(label);
		
//		String[] state={"δ����","������ͨ��","����δͨ��"};
		

		JLabel label_2 = new JLabel("\u5355\u636E\u79CD\u7C7B");
		label_2.setBounds(257, 63, 54, 15);
		add(label_2);
		
		String[] type={"�ļ���","װ����","Ӫҵ�����ﵥ","�տ","�ɼ���","��ת���ĵ��ﵥ","��ⵥ","��ת��","���ⵥ","���"};
		comboBox = new JComboBox(type);
		comboBox.setBounds(392, 59, 144, 23);
		comboBox.addItemListener(this);
		add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(85, 102, 566, 344);
		add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(40);
		// ʹ������
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);
		
		
		// ѡȡ��
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				Point mousepoint;
				mousepoint = e.getPoint();
				rowpos = table.rowAtPoint(mousepoint);
				table.setRowSelectionInterval(rowpos, rowpos);
			}
		});
		scrollPane.setViewportView(table);
		table.setEnabled(false);
		tableModel = new DefaultTableModel(
				new Object[][] {{null},{null},{null},{null},{null},{null},{null},{null}},
					new String[] {	"������Ϣ"
				});
		table.setModel(tableModel);
		//��ʼ��
		showTable(approvebl.showList(comboBox.getSelectedItem().toString()));
		
		JButton button_1 = new JButton("\u5BA1\u6279\u901A\u8FC7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos != -1) {
					approvebl.editList(rowpos, comboBox.getSelectedItem().toString());
					showTable(approvebl.showList(comboBox.getSelectedItem().toString()));
				}
			}
		});
		button_1.setBounds(274, 459, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button_1.getWidth(),
						button_1.getHeight(),image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button_1.setIcon(image1);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		add(button_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 534, 724, 28);
		add(toolBar);
		
		JLabel label_3 = new JLabel("\u72B6\u6001\u680F");
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
