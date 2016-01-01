package nju.edu.presentation.general_managerui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import nju.edu.businesslogic.financebl.PayorderBL;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import PO.LoginPO;

@SuppressWarnings("serial")
public class checkCost_Benefit extends JPanel {

	private JTable table;
	static DefaultTableModel tableModel;
	PayorderBL payorderBL = new PayorderBL();

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/generalManager/checkCost_Benefit.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	public checkCost_Benefit(JFrame main, LoginPO loginPO) {
		checkCost_Benefit checkCost_Benefitframe = this;
		setBounds(100, 100, 750, 600);
		setVisible(true);
		setLayout(null);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStatics_Analysis newcheckStatics_Analysis = new checkStatics_Analysis(
						main, loginPO);
				main.remove(checkCost_Benefitframe);
				main.getContentPane().add(newcheckStatics_Analysis);
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
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);

		tableModel = new DefaultTableModel(new Object[][] {
				{ "\u622A\u81F3\u65E5\u671F", null },
				{ "\u603B\u6536\u5165", null }, { "\u603B\u652F\u51FA", null },
				{ "\u603B\u5229\u6DA6", null }, }, new String[] { "", "" });

		table = new JTable();
		table.setSelectionBackground(new Color(88, 93, 103,230));
		table.setSelectionForeground(new Color(255, 255, 255,200));
		table.setBounds(134, 226, 476, 160);
		add(table);
		table.setRowHeight(40);
		table.setDefaultRenderer(Object.class, r);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setEnabled(false);
		table.setModel(tableModel);
		double[] pro = payorderBL.profit();
		for (int i = 0; i < 3; i++)
			table.setValueAt(pro[i], i + 1, 1);

		// 获取当前日期
		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		table.setValueAt(date.format(dt), 0, 1);
	}

}
