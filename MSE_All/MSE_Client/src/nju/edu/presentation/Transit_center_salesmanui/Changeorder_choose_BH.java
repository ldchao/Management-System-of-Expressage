package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JComboBox;

import nju.edu.businesslogic.storebl.StoreMessageBL;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import PO.LoginPO;

public class Changeorder_choose_BH extends JPanel {
	JFrame main;
	JCheckBox[] weiNum = new JCheckBox[60];
	/**
	 * Create the panel.
	 */
	public Changeorder_choose_BH(JFrame m, JPanel jp, JPanel jp2,String qu, int pai,
			LoginPO loginPO) {
		main = m;
		JPanel lastui = jp;
		Changeorder_choose_BH nowPanel = this;
		setLayout(null);

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

		JLabel label = new JLabel("��ת����ҵ��Ա>>¼����ת��>>�½���ת��>>ѡ�����");
		label.setBounds(100, 14, 270, 15);
		add(label);

		JLabel label_1 = new JLabel(loginPO.getName() + "����ã�");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JLabel lblNewLabel_1 = new JLabel("ѡ��ܺ� ��");
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.BOLD, 14));
		lblNewLabel_1.setBounds(149, 101, 80, 15);
		add(lblNewLabel_1);

		String[] jiahao = { "", "        1��", "        2��", "        3��",
				"        4��", "        5��", "        6��", "        7��",
				"        8��", "        9��", "      10��", "      11��",
				"      12��", "      13��", "      14��", "      15��",
				"      16��", "      17��", "      18��", "      19��", "      20��" };
		JComboBox comboBox_1 = new JComboBox(jiahao);
		comboBox_1.setBounds(249, 99, 90, 20);
		add(comboBox_1);

		JLabel lblNewLabel_2 = new JLabel("ѡ��λ�� ��");
		lblNewLabel_2.setFont(new Font("΢���ź�", Font.BOLD, 14));
		lblNewLabel_2.setBounds(417, 101, 80, 15);
		add(lblNewLabel_2);

		JButton btnNewButton_2 = new JButton("ȫѡ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_2.getText().equals("ȫѡ")) {
					for (int i = 0; i < weiNum.length; i++) {
						weiNum[i].setSelected(true);
					}
					btnNewButton_2.setText("ȡ��ȫѡ");
				} else {
					for (int i = 0; i < weiNum.length; i++) {
						weiNum[i].setSelected(false);
					}
					btnNewButton_2.setText("ȫѡ");
				}
			}
		});
		btnNewButton_2.setBounds(520, 99, 90, 20);
		add(btnNewButton_2);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);

		JLabel lblNewLabel_3 = new JLabel("ѡ��Ҫ��ת������Ӫҵ���Ļ���");
		lblNewLabel_3.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_3.setBounds(217, 49, 327, 31);
		add(lblNewLabel_3);

		for (int i = 0; i < weiNum.length; i++) {
			weiNum[i] = new JCheckBox((i + 1) + " λ");
			weiNum[i].setBounds(85 + (i % 6) * 100, 130 + (i / 6) * 35, 80, 25);
			add(weiNum[i]);
		}

		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StoreinInfo storein = StoreMessageBL.getInstance();
				boolean isValue = false;
				int jia = -1;
				for (int i = 0; i < jiahao.length; i++) {
					if (jiahao[i].equals((String) comboBox_1.getSelectedItem())) {
						jia = i ;
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
				if (jia > -1 && isValue) {
					ArrayList<String> orderlist = storein.getId(jia, wei);
					Changeorder c = new Changeorder(main, nowPanel, jp2,loginPO,"����",9+jia,
							orderlist);
					main.remove(nowPanel);
					main.getContentPane().add(c);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				} else
					label_4.setText("��ѡ��ܺź�λ��");
			}
		});
		btnNewButton.setBounds(217, 500, 93, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_choose_BH ctb = new Changeorder_choose_BH(main,
						lastui,jp2, qu, pai, loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(ctb);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(394, 500, 93, 23);
		add(btnNewButton_1);

	}
}