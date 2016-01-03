package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
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

import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogic.storebl.Warehouse_outBL;
import nju.edu.businesslogicservice.storeblservice.Warehouse_outBLService;
import PO.LoginPO;
import PO.OrganizationNumPO;

public class Storeoutorder_Input extends JPanel {
	private JTable table;
	private int rowpos = -1;
	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	public Storeoutorder_Input(JFrame m, JPanel jp, LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = jp;
		Storeoutorder_Input nowPanel = this;
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);

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
		
		JLabel label = new JLabel("��ת���Ĳֿ����Ա>>�������>>�½����ⵥ");
		label.setBounds(100, 14, 288, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JLabel label_2 = new JLabel("ѡ��Ҫ���г���������ת��");
		label_2.setFont(new Font("΢���ź�", Font.BOLD, 20));
		label_2.setBounds(251, 80, 288, 35);
		add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 150, 514, 299);
		add(scrollPane);

		Warehouse_outBLService wb = new Warehouse_outBL();
		ArrayList<ChangeorderVO> changeorderList = wb.checkRemind();
		String[][] tablemessage = null;
		if (changeorderList != null) {
			tablemessage = new String[changeorderList.size()][3];
			OrganizationNumPO op = new OrganizationNumPO();
			int i = -1;
			for (ChangeorderVO cv : changeorderList) {
				i++;
				tablemessage[i][0] = cv.getNumberOfTransfer();
				tablemessage[i][1] = op.getName(cv.getArrivenum());
				tablemessage[i][2] = cv.getDate();
			}
		}

		table = new JTable();
		// ѡȡ��
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				Point mousepoint;
				mousepoint = e.getPoint();
				rowpos = table.rowAtPoint(mousepoint);
				table.setRowSelectionInterval(rowpos, rowpos);
			}
		});

		// ʹ������
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);

		scrollPane.setViewportView(table);
		table.setEnabled(false);
		table.setRowSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		tableModel = new DefaultTableModel(tablemessage, new String[] {
				"��ת�����", "�����", "װ������" });
		table.setModel(tableModel);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		JButton button_1 = new JButton("�������ⵥ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos == -1) {
					label_4.setText("��ѡ��һ����ת��");
				} else {
					Storeoutorder s = new Storeoutorder(main, nowPanel, lastui,
							loginPO, changeorderList.get(rowpos));
					main.remove(nowPanel);
					main.getContentPane().add(s);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}
			}
		});
		button_1.setBounds(300, 479, 150, 23);
		add(button_1);
	}

}
