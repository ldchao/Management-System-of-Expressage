package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import nju.edu.businesslogic.storebl.Inventory_managementBL;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementBLService;
import PO.LoginPO;

public class CheckInventory_show extends JPanel {
	private JTable table;
	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	public CheckInventory_show(JFrame m, JPanel jp, LoginPO loginPO,String startDate,String overDate) {
		JFrame main = m;
		JPanel lastui = jp;
		CheckInventory_show nowPanel = this;
		setLayout(null);
		Inventory_managementBLService imb=new Inventory_managementBL();
		String[][] storeMessage=imb.checkInventory(startDate, overDate);

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

		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>������>>�鿴���>>���������");
		lblNewLabel.setBounds(100, 14, 300, 15);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(loginPO.getName() + "����ã�");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel lblNewLabel_6 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_6);

		JLabel label = new JLabel("�����Ϣ��ʾ");
		label.setFont(new Font("΢���ź�", Font.BOLD, 20));
		label.setBounds(305, 120, 144, 28);
		add(label);

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(125, 246, 515, 125);
		add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(25);
		scrollPane.setViewportView(table);
		// ʹ������
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);

		table.setEnabled(false);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		tableModel = new DefaultTableModel(storeMessage, new String[] {
				"�������", "�������", "��������" });
		table.setModel(tableModel);
		
		JLabel lblNewLabel_2 = new JLabel("��ʼ����:");
		lblNewLabel_2.setFont(new Font("΢���ź�", Font.BOLD, 12));
		lblNewLabel_2.setBounds(179, 191, 79, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(startDate);
		lblNewLabel_3.setBounds(268, 191, 86, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("��������:");
		lblNewLabel_4.setFont(new Font("΢���ź�", Font.BOLD, 12));
		lblNewLabel_4.setBounds(421, 191, 71, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(overDate);
		lblNewLabel_5.setBounds(513, 191, 86, 15);
		add(lblNewLabel_5);
		
		JLabel lblZ = new JLabel("ע������������ͳ�ơ�");
		lblZ.setForeground(Color.RED);
		lblZ.setBounds(151, 392, 171, 15);
		add(lblZ);

	}
}
