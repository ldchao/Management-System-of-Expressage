package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import nju.edu.businesslogic.storebl.StoreMessageBL;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import PO.LoginPO;
import PO.OrganizationNumPO;
import StaticValue.StoreNum;

@SuppressWarnings("serial")
public class Changeorder_choose_BH extends JPanel {
	JFrame main;
	JCheckBox[] weiNum = new JCheckBox[60];

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/TransitCenterSalesman/Changeorder_choose_BH.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	/**
	 * Create the panel.
	 */
	@SuppressWarnings({ "static-access", "unchecked", "rawtypes" })
	public Changeorder_choose_BH(JFrame m, JPanel jp, JPanel jp2, String qu,
			int pai, LoginPO loginPO) {
		main = m;
		JPanel lastui = jp;
		Changeorder_choose_BH nowPanel = this;
		setLayout(null);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		OrganizationNumPO op = new OrganizationNumPO();
		String transferNum = op.getNum(loginPO.getShop());

		JButton button = new JButton("");
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

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		String[] jiahao = new String[StoreNum.getBHnum(transferNum) + 1];
		jiahao[0] = "";
		for (int i = 1; i < jiahao.length; i++) {
			jiahao[i] = "      " + (i > 9 ? "" : " ") + i + "架";
		}
		JComboBox comboBox_1 = new JComboBox(jiahao);
		comboBox_1.setBounds(249, 117, 90, 20);
		add(comboBox_1);

		JButton btnNewButton_2 = new JButton("全选");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_2.getText().equals("全选")) {
					for (int i = 0; i < weiNum.length; i++) {
						weiNum[i].setSelected(true);
					}
					btnNewButton_2.setText("取消全选");
				} else {
					for (int i = 0; i < weiNum.length; i++) {
						weiNum[i].setSelected(false);
					}
					btnNewButton_2.setText("全选");
				}
			}
		});
		btnNewButton_2.setBounds(520, 117, 90, 20);
		add(btnNewButton_2);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 540, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		for (int i = 0; i < weiNum.length; i++) {
			weiNum[i] = new JCheckBox((i + 1) + " 位");
			weiNum[i].setBounds(85 + (i % 6) * 100, 150 + (i / 6) * 33, 80, 25);
			weiNum[i].setOpaque(false);
			weiNum[i].setBorder(null);
			add(weiNum[i]);
		}

		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBounds(268, 481, 52, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StoreinInfo storein = StoreMessageBL.getInstance(transferNum);
				boolean isValue = false;
				int jia = -1;
				for (int i = 0; i < jiahao.length; i++) {
					if (jiahao[i].equals((String) comboBox_1.getSelectedItem())) {
						jia = i;
					}
				}
				int[] wei = new int[60];
				for (int i = 0; i < wei.length; i++) {
					if (weiNum[i].isSelected()) {
						wei[i] = 1;
						isValue = true;
					} else {
						wei[i] = 0;
					}
				}
				if (jia > 0 && isValue) {
					ArrayList<String> orderlist = storein.getId(jia, wei);
					Changeorder c = new Changeorder(main, nowPanel, jp2,
							loginPO, "汽运", 9 + jia, orderlist);
					main.remove(nowPanel);
					main.getContentPane().add(c);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				} else
					label_4.setText("请选择架号和位号");
			}
		});
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setBounds(430, 481, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_choose_BH ctb = new Changeorder_choose_BH(main,
						lastui, jp2, qu, pai, loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(ctb);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		add(btnNewButton_1);

	}
}