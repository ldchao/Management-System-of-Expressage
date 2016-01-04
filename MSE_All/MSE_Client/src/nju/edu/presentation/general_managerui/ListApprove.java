package nju.edu.presentation.general_managerui;

import java.awt.Graphics;
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

import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class ListApprove extends JPanel implements ItemListener {

	private static JTable table;
	private static DefaultTableModel tableModel;
	private int rowpos = -1;
	private Approvebl approvebl = new Approvebl();
	@SuppressWarnings("rawtypes")
	JComboBox comboBox;
	@SuppressWarnings("unused")
	private ApproveListInformation information;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/generalManager/ListApprove.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	public ListApprove(JFrame main, LoginPO loginPO) {
		ListApprove listApproveframe = this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager newmanager = new Manager(main, loginPO);
				main.remove(listApproveframe);
				main.getContentPane().add(newmanager);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(14, -9, 63, 63);
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

		String[] type = { "寄件单", "装车单", "营业厅到达单", "收款单", "派件单", "中转中心到达单",
				"入库单", "中转单", "出库单", "付款单" };
		comboBox = new JComboBox(type);
		comboBox.setBounds(165, 87, 144, 23);
		comboBox.addItemListener(this);
		add(comboBox);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setOpaque(false);
		scrollPane_1.setBorder(null);
		scrollPane_1.getViewport().setOpaque(false);
		scrollPane_1.setBounds(457, 131, 215, 320);
		add(scrollPane_1);

		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255,255,255,200));
		textArea.setOpaque(false);
		textArea.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		textArea.setBorder(null);
		scrollPane_1.setViewportView(textArea);
		textArea.setLineWrap(true);
		textArea.setEditable(false);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(80, 142, 259, 309);
		add(scrollPane);

		table = new JTable();
		table.setRowHeight(25);
		table.setSelectionBackground(new Color(88, 93, 103,230));
		table.setSelectionForeground(new Color(255, 255, 255,200));

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
				if (rowpos < approvebl.showList(
						comboBox.getSelectedItem().toString()).size()) {
					String info = approvebl.showList(
							comboBox.getSelectedItem().toString()).get(rowpos);
					textArea.setText(info);
				} else {
					textArea.setText("");
				}

			}

		});
		scrollPane.setViewportView(table);
		table.setEnabled(false);
		tableModel = new DefaultTableModel(new Object[][] { { null }, { null },
				{ null }, { null }, { null }, { null }, { null }, { null },
				{ null }, { null }, { null }, { null }, { null } },
				new String[] { "单据信息" });
		table.setModel(tableModel);
		// 初始化
		showTable(approvebl.showList(comboBox.getSelectedItem().toString()));

		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos != -1) {
					if (rowpos < approvebl.showList(
							comboBox.getSelectedItem().toString()).size()) {
						approvebl.editList(rowpos, comboBox.getSelectedItem()
								.toString());
						showTable(approvebl.showList(comboBox.getSelectedItem()
								.toString()));
						textArea.setText("");
					}
				}
			}
		});
		button_1.setBounds(183, 461, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button_1.getWidth(),
				button_1.getHeight(), image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button_1.setIcon(image1);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		add(button_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 541, 750, 35);
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
		if (e.getSource() == comboBox) {
			showTable(approvebl.showList(comboBox.getSelectedItem().toString()));
		}
	}

	public static void showTable(ArrayList<String> acvo) {
		int i = 0;
		for (String ac : acvo) {
			tableModel.setValueAt(ac, i, 0);
			i++;
			if (i >= table.getRowCount()) {
				String[] rowstr = { "" };
				tableModel.addRow(rowstr);
			}

		}
		while (i < table.getRowCount()) {
			tableModel.setValueAt("", i, 0);
			i++;
		}
	}
}
