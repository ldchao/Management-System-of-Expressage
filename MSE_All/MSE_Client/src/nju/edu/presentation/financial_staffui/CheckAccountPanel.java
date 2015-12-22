package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import PO.LoginPO;
import nju.edu.VO.AccountVO;
import nju.edu.businesslogic.accountbl.AccountBL;

@SuppressWarnings("serial")
public class CheckAccountPanel extends JPanel implements Runnable {
	private static JTable table;
	private int rowpos = -1;
	private static DefaultTableModel tableModel;
	private static JLabel lblNewLabel;
	AccountBL accountBL = new AccountBL();

	/**
	 * Create the panel.
	 */
	public CheckAccountPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);
		setSize(750, 600);

		CheckAccountPanel cap = this;

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		lblHello.setForeground(Color.WHITE);
		add(lblHello);

		JButton button_4 = new JButton("");
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(cap);
				AccountPanel acp = new AccountPanel(loginPO, main);
				main.getContentPane().add(acp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.setBounds(13, -9, 63, 63);
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
		button_1.setBounds(274, 459, 52, 52);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button_1.getWidth(),
						button_1.getHeight(),image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button_1.setIcon(image2);
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
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		table.setEnabled(false);
		table.setSelectionBackground(new Color(88, 93, 103,230));
		table.setSelectionForeground(new Color(255, 255, 255,200));
		tableModel = new DefaultTableModel(new Object[][] { { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, },
				new String[] { "\u8D26\u6237\u540D\u79F0",
						"\u8D26\u6237\u4F59\u989D" });
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(130);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);

		// 显示表格
		showTable(accountBL.check());

		// 删除行
		button_1.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				if (rowpos != -1
						&& !tableModel.getValueAt(rowpos, 0).equals("")) {
					String name = tableModel.getValueAt(rowpos, 0).toString();
					ConfirmFrame conFrame = new ConfirmFrame(cap, name);
				}
			}
		});

		JButton button = new JButton();
		// 修改行内容
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent arg0) {
				if (rowpos != -1) {
					String name = tableModel.getValueAt(rowpos, 0).toString();
					UpdateAccountframe up = new UpdateAccountframe(cap, name,
							rowpos);
				}
			}
		});
		button.setBounds(425, 459, 52, 52);
		ImageIcon image = new ImageIcon("image/transparent_circle.png");
		Image temp = image.getImage().getScaledInstance(button.getWidth(),
						button.getHeight(),image.getImage().SCALE_DEFAULT);
		image = new ImageIcon(temp);
		button.setIcon(image);
		add(button);
	}

	public static void showTable(ArrayList<AccountVO> acvo) {
		int i = 0;
		for (AccountVO ac : acvo) {
			tableModel.setValueAt(ac.getAcName(), i, 0);
			tableModel.setValueAt(ac.getMoney(), i, 1);
			i++;
			if (i >= table.getRowCount()) {
				String[] rowstr = { "", "" };
				tableModel.addRow(rowstr);
			}

		}
		while (i < table.getRowCount()) {
			tableModel.setValueAt("", i, 0);
			tableModel.setValueAt("", i, 1);
			i++;
		}
	}

	public static void setLblNewLabel(String str) {
		lblNewLabel.setText(str);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		lblNewLabel.setText("状态栏");
	}
	
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/financial_stuff/updateAccountMain.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
}
