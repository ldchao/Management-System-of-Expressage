package nju.edu.presentation.system_administratorui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
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

import nju.edu.businesslogic.staffbl.UserBL;
import PO.LoginPO;
import PO.StaffPO;

@SuppressWarnings("serial")
public class IDforManager extends JPanel {
	private static JTable table;
	private int rowpos = -1;
	private static DefaultTableModel tableModel;
	private static JLabel lblNewLabel;
	UserBL usb = new UserBL();

	/**
	 * Create the panel.
	 */

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/system_stuff/checkUserPanel.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings("static-access")
	public IDforManager(LoginPO loginPO, JFrame main) {
		setLayout(null);

		IDforManager ifm = this;

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(ifm);
				NewUserPanel nup = new NewUserPanel(loginPO, main);
				main.getContentPane().add(nup);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(13, -9, 63, 63);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_4.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});
		add(button_4);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		toolBar.setEnabled(false);
		add(toolBar);

		lblNewLabel = new JLabel("状态栏");
		lblNewLabel.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel);

		JButton button_1 = new JButton();
		// button_1.setContentAreaFilled(false);
		// button_1.setBorderPainted(false);
		button_1.setBounds(350, 459, 52, 52);
		ImageIcon image = new ImageIcon("image/transparent_circle.png");
		Image temp = image.getImage().getScaledInstance(button_1.getWidth(),
				button_1.getHeight(), image.getImage().SCALE_DEFAULT);
		image = new ImageIcon(temp);
		button_1.setIcon(image);
		add(button_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(168, 155, 415, 270);
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
			}
		});

		scrollPane.setViewportView(table);
		table.setEnabled(false);
		table.setRowSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		tableModel = new DefaultTableModel(new Object[][] { { "", "", "" },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, }, new String[] { "\u7528\u6237\u540D",
				"\u7528\u6237\u5BC6\u7801", "\u7528\u6237\u6743\u9650" });
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);

		showTable(usb.IDfromeManager());

		// 新建
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rowpos != -1) {
					main.remove(ifm);
					NewUserPanel nup = new NewUserPanel(loginPO, main);
					nup.setInfo(tableModel.getValueAt(rowpos, 0).toString(),
							tableModel.getValueAt(rowpos, 2).toString());
					main.getContentPane().add(nup);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}
			}
		});
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button_1.getWidth(),
				button_1.getHeight(), image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
	}

	public static void showTable(ArrayList<StaffPO> spo) {
		int i = 0;
		for (StaffPO uc : spo) {
			tableModel.setValueAt(uc.getId(), i, 0);
			tableModel.setValueAt("", i, 1);
			tableModel.setValueAt(uc.getPosition(), i, 2);
			i++;

			if (i >= table.getRowCount()) {
				String[] rowstr = { "", "", "" };
				tableModel.addRow(rowstr);
			}
		}
	}
}
