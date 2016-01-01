package nju.edu.presentation.general_managerui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import PO.LoginPO;
import nju.edu.VO.StaffVO;
import nju.edu.businesslogic.staffbl.Staffbl;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class StaffManager extends JPanel {

	private JTextField textField;
	private static JTable table;
	private JLabel label_3;
	private int rowpos = -1;
	private static DefaultTableModel tableModel;
	Staffbl staffbl;
	StaffManager thiStaffManager = this;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/generalManager/StuffManager.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings("static-access")
	public StaffManager(JFrame main, LoginPO loginPO) {
		staffbl = new Staffbl();
		StaffManager staffManagerframe = this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);

		JLabel lblHello = new JLabel("Hello!" + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(677, 6, 67, 25);
		add(lblHello);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager newmanager = new Manager(main, loginPO);
				main.remove(staffManagerframe);
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

		textField = new JTextField();
		textField.setBounds(331, 154, 125, 26);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		add(textField);
		textField.setColumns(10);

		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBounds(501, 139, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button_1.getWidth(),
				button_1.getHeight(), image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button_1.setIcon(image1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("")) {
					label_3.setText("请输入人员姓名");
				} else {
					StaffVO vo = staffbl.checkStaff(textField.getText());
					if (vo == null) {
						label_3.setText("查无此人");
					} else {
						Staff staff = new Staff(vo, main, loginPO);
						main.remove(thiStaffManager);
						main.getContentPane().add(staff);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
					}
				}
			}
		});
		add(button_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(174, 203, 428, 188);
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
			}
		});

		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table.setEnabled(false);
		tableModel = new DefaultTableModel(new Object[][] {
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, }, new String[] {
				"用户名", "姓名", "职位" });
		table.setModel(tableModel);

		// 显示表格
		showTable(staffbl.showStaff());

		JButton button_2 = new JButton("");
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBounds(316, 436, 52, 52);
		button_2.setIcon(image1);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos != -1) {
					String id = tableModel.getValueAt(rowpos, 0).toString();
					StaffVO selectVo = staffbl.checkStaff(id);
					Staff staff = new Staff(selectVo, main, loginPO);
					main.remove(staffManagerframe);
					main.getContentPane().add(staff);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}
			}
		});
		add(button_2);

		JButton button_3 = new JButton("");
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBounds(432, 436, 52, 52);
		button_3.setIcon(image1);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStaff addStaff = new addStaff(main, loginPO);
				main.remove(staffManagerframe);
				main.getContentPane().add(addStaff);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 540, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		label_3 = new JLabel("\u72B6\u6001\u680F");
		label_3.setForeground(Color.WHITE);
		toolBar.add(label_3);
	}

	public static void showTable(ArrayList<StaffVO> acvo) {
		int i = 0;
		for (StaffVO ac : acvo) {
			table.setValueAt(ac.getId(), i, 0);
			tableModel.setValueAt(ac.getName(), i, 1);
			tableModel.setValueAt(ac.getPosition(), i, 2);
			i++;
			if (i >= table.getRowCount()) {
				String[] rowstr = { "", "", "" };
				tableModel.addRow(rowstr);
			}

		}
		while (i < table.getRowCount()) {
			tableModel.setValueAt("", i, 0);
			tableModel.setValueAt("", i, 1);
			tableModel.setValueAt("", i, 2);
			i++;
		}
	}
}
