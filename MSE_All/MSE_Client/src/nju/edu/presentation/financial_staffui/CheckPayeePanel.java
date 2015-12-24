package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
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
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import nju.edu.VO.PayeeorderVO;
import nju.edu.businesslogic.financebl.CalculateBL;
import PO.LoginPO;
import PO.OrganizationNumPO;

@SuppressWarnings("serial")
public class CheckPayeePanel extends JPanel {
	private JTable table;
	private DefaultTableModel tableModel;
	CalculateBL cbl = new CalculateBL();

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/financial_stuff/checkPayeePanel.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	public CheckPayeePanel(JFrame main, LoginPO loginPO, String date,
			String shop) {

		setLayout(null);
		setSize(750, 600);

		CheckPayeePanel cpep = this;

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JButton button_4 = new JButton();
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(cpep);
				CalculatePanel clf = new CalculatePanel(loginPO, main);
				main.getContentPane().add(clf);
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

		JLabel label_1;
		OrganizationNumPO opo = new OrganizationNumPO();
		String shopname = opo.getName(shop);
		if (shopname != null) {
			label_1 = new JLabel(shopname + date + "的收款信息");
		} else {
			label_1 = new JLabel("无此编号营业厅");
		}
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		label_1.setBounds(150, 111, 500, 23);
		label_1.setForeground(new Color(248, 179, 28));
		add(label_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 177, 638, 259);
		add(scrollPane);

		table = new JTable();
		table.setRowHeight(25);
		table.setSelectionBackground(new Color(88, 93, 103, 230));
		table.setSelectionForeground(new Color(255, 255, 255, 200));
		// 使表格居中
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);

		scrollPane.setViewportView(table);
		table.setRowSelectionAllowed(true);
		table.setEnabled(false);

		table.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		tableModel = new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, }, new String[] { "订单号", "收款金额",
				"快递员姓名", "业务员姓名" });
		table.setModel(tableModel);

		ArrayList<PayeeorderVO> payeevo = cbl.check(date, shop);
		showTable(payeevo);

		JLabel label_2 = new JLabel("");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 15));
		label_2.setForeground(new Color(255, 255, 255, 200));
		label_2.setBounds(509, 448, 100, 23);
		add(label_2);

		JLabel lblMoney = new JLabel("");
		lblMoney.setFont(new Font("微软雅黑", Font.BOLD, 15));
		lblMoney.setForeground(new Color(255, 255, 255, 200));
		lblMoney.setBounds(610, 448, 63, 23);
		add(lblMoney);

		JLabel label = new JLabel("\u5408\u8BA1");
		label.setBounds(406, 473, 54, 15);
		add(label);
		label.setVisible(false);
		// 合计
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label.setVisible(false);
			}
		});
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double total = cbl.total(payeevo);
				label_2.setText("收款总金额：");
				lblMoney.setText(total + "");
			}
		});
		button.setBounds(350, 478, 50, 50);
		add(button);

	}

	public void showTable(ArrayList<PayeeorderVO> payeevo) {
		int count = 0;

		for (PayeeorderVO vo : payeevo) {
			table.setValueAt(vo.getOrder(), count, 0);
			table.setValueAt(vo.getMoney(), count, 1);
			table.setValueAt(vo.getCarrierName(), count, 2);
			table.setValueAt(vo.getShopperName(), count, 3);
			count++;

			if (count >= table.getRowCount()) {
				String[] str = { "", "", "", "", "" };
				tableModel.addRow(str);
			}
		}
	}
}