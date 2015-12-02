package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import nju.edu.businesslogic.storebl.Warehouse_inBL;
import nju.edu.businesslogicservice.storeblservice.Warehouse_inBLService;
import nju.edu.presentation.Transit_center_salesmanui.Transferui;

public class Warehouse_in_checkRemindui extends JPanel {
	Warehouse_inBLService wb;
	/**
	 * Create the panel.
	 */
	public Warehouse_in_checkRemindui(JFrame m, JPanel jp) {
		JFrame main = m;
		JPanel lastui = jp;
		Warehouse_in_checkRemindui nowPanel = this;
		setLayout(null);
		wb=new Warehouse_inBL();

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

		JLabel label = new JLabel("�ֿ����Ա>>������>>�鿴��Ϣ����");
		label.setBounds(100, 14, 240, 15);
		add(label);

		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JLabel label_2 = new JLabel("��������Ϣ����");
		label_2.setFont(new Font("΢���ź�", Font.BOLD, 20));
		label_2.setBounds(289, 80, 192, 35);
		add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 150, 514, 299);
		add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setText(wb.checkRemind());
		scrollPane.setViewportView(textArea);

		JLabel label_3 = new JLabel("\u5F85\u5904\u7406\u7684\u6D88\u606F");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("΢���ź�", Font.BOLD, 14));
		scrollPane.setColumnHeaderView(label_3);

		JButton button_1 = new JButton("ȷ���Ѳ鿴������Ϣ���������Ϣ�������");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   wb.deleteRemind();
			   textArea.setText("��ʱû������Ϣ��Ҫ����");
			}
		});
		button_1.setBounds(223, 477, 340, 23);
		add(button_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);
	}

}
