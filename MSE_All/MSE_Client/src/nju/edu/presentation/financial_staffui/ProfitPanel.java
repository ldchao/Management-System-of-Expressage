package nju.edu.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.businesslogic.financebl.PayorderBL;

@SuppressWarnings("serial")
public class ProfitPanel extends JPanel {
	private JTable table;
	static DefaultTableModel tableModel;
	PayorderBL payorderBL = new PayorderBL();

	/**
	 * Create the panel.
	 */
	public ProfitPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);
		setSize(750, 600);
		ProfitPanel pfp = this;

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JButton button_4 = new JButton();
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
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(pfp);
				PayPanel payPanel = new PayPanel(loginPO, main);
				main.getContentPane().add(payPanel);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button_4);

		table = new JTable();
		table.setRowHeight(40);
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);
		
		table.setEnabled(false);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));

		tableModel = new DefaultTableModel(new Object[][] {
				{ "\u622A\u81F3\u65E5\u671F", null },
				{ "\u603B\u6536\u5165", null }, { "\u603B\u652F\u51FA", null },
				{ "\u603B\u5229\u6DA6", null }, }, new String[] { "", "" });
		table.setModel(tableModel);
		table.setBounds(188, 200, 374, 210);
		add(table);

		double[] pro = payorderBL.profit();
		for (int i = 0; i < 3; i++)
			table.setValueAt(pro[i], i + 1, 1);

		// 获取当前日期
		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		table.setValueAt(date.format(dt), 0, 1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		toolBar.setEnabled(false);
		add(toolBar);

		JLabel label_2 = new JLabel("\u72B6\u6001\u680F");
		label_2.setForeground(Color.WHITE);
		toolBar.add(label_2);

		JButton button = new JButton("");
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(349, 427, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button.getWidth(),
						button.getHeight(),image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button.setIcon(image1);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				payorderBL.excel(date.format(dt), pro[0], pro[1], pro[2]);
				label_2.setText("已成功导出到本地！");
			}
		});
		add(button);
	}
	
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/financial_stuff/lookIncomeForm.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
}
