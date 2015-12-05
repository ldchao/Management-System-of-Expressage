package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Changeorder_Input extends JPanel {
	JFrame main;
	JRadioButton[] pai = new JRadioButton[10];

	/**
	 * Create the panel.
	 */
	public Changeorder_Input(JFrame m, JPanel jp) {
		main = m;
		JPanel lastui = jp;
		Changeorder_Input nowPanel = this;
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

		JLabel label = new JLabel("��ת����ҵ��Ա>>¼����ת��>>�½���ת��");
		label.setBounds(100, 14, 270, 15);
		add(label);

		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JLabel lblNewLabel = new JLabel("������");
		lblNewLabel.setFont(new Font("΢���ź�", Font.BOLD, 14));
		lblNewLabel.setBounds(130, 155, 72, 15);
		add(lblNewLabel);

		JLabel label_2 = new JLabel("������");
		label_2.setFont(new Font("΢���ź�", Font.BOLD, 14));
		label_2.setBounds(130, 225, 91, 15);
		add(label_2);

		JLabel label_3 = new JLabel("������");
		label_3.setFont(new Font("΢���ź�", Font.BOLD, 14));
		label_3.setBounds(130, 295, 72, 15);
		add(label_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);

		JLabel lblNewLabel_1 = new JLabel("ѡ��������ź�");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_1.setBounds(300, 72, 171, 52);
		add(lblNewLabel_1);

		ButtonGroup bg = new ButtonGroup();

		for (int i = 0; i < pai.length; i++) {
			pai[i] = new JRadioButton(((i == 9 ? 3 : (i % 3)) + 1) + " ��");
			pai[i].setBounds(260 + (i % 3) * 120, 150 + (i / 3) * 70, 70, 25);
			add(pai[i]);
			bg.add(pai[i]);
		}

		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quNum = 0, paiNum = 0;
				String[] qu = { "������", "������", "������" };
				for (int i = 0; i < pai.length; i++) {
					if (pai[i].isSelected()) {
						quNum = (i == 9 ? 2 : (i / 3));
						paiNum = (i == 9 ? 4 : (i % 3 + 1));
					}
				}
				if (paiNum == 0) {
					label_4.setText("��ѡ���Ӧ�������ź�");
				} else {
					if (paiNum == 4) {
						Changeorder_choose_BH ctb = new Changeorder_choose_BH(
								main, nowPanel, qu[quNum], paiNum);
						main.remove(nowPanel);
						main.getContentPane().add(ctb);
					} else {
						Changeorder_choose_TC ctc = new Changeorder_choose_TC(
								main, nowPanel, qu[quNum], paiNum);
						main.remove(nowPanel);
						main.getContentPane().add(ctc);
					}
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(203, 448, 93, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_Input ti = new Changeorder_Input(main, lastui);
				main.remove(nowPanel);
				main.getContentPane().add(ti);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(379, 448, 93, 23);
		add(btnNewButton_1);

	}
}