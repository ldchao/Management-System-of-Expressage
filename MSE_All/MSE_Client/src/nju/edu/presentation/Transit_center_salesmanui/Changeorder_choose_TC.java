package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.JCheckBox;

public class Changeorder_choose_TC extends JPanel {
	JFrame main;
	JCheckBox[] jia = new JCheckBox[20];

	/**
	 * Create the panel.
	 */
	public Changeorder_choose_TC(JFrame m, JPanel jp,String qu,int pai) {
		main = m;
		JPanel lastui = jp;
		Changeorder_choose_TC nowPanel = this;
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

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);

		JLabel lblNewLabel_1 = new JLabel("ѡ��Ҫ��ת��������ת���ĵĻ���");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_1.setBounds(197, 80, 338, 31);
		add(lblNewLabel_1);

		

		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder c = new Changeorder(main, nowPanel);
				main.remove(nowPanel);
				main.getContentPane().add(c);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(190, 474, 93, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_choose_TC ctc = new Changeorder_choose_TC(main,
						lastui,qu,pai);
				main.remove(nowPanel);
				main.getContentPane().add(ctc);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(425, 474, 93, 23);
		add(btnNewButton_1);

		for (int i = 0; i < jia.length; i++) {
			jia[i]=new JCheckBox((i+1)+ " ��");
			jia[i].setBounds(140 + (i % 4) * 130, 150 + (i / 4) * 60, 80, 25);
			add(jia[i]);
		}

	}

}