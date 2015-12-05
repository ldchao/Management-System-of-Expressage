package nju.edu.presentation.Transit_center_salesmanui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import PO.LoginPO;
import nju.edu.businesslogic.transferbl.TransferBL;
import nju.edu.businesslogicservice.transferblservice.TransferBLService;

public class Transfer_checkRemindui extends JPanel {
	JFrame main;

	/**
	 * Create the panel.
	 */
	public Transfer_checkRemindui(JFrame m,JPanel jp,LoginPO loginPO) {
		main = m;
		JPanel lastui=jp;
		Transfer_checkRemindui nowPanel=this;

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

		JLabel label = new JLabel("��ת����ҵ��Ա>>¼����ת��>>�鿴��Ϣ����");
		label.setBounds(100, 14, 288, 15);
		add(label);

		JLabel label_1 = new JLabel(loginPO.getName()+"����ã�");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JLabel label_2 = new JLabel("¼����ת����Ϣ����");
		label_2.setFont(new Font("΢���ź�", Font.BOLD, 20));
		label_2.setBounds(289, 80, 192, 35);
		add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 150, 514, 299);
		add(scrollPane);

		JTextArea textArea = new JTextArea();
		TransferBLService tb=new TransferBL();
		String remind=tb.checkRemind();
		if(remind.length()==0)
		    textArea.setText("��ʱû�п����Ŀ�����ﵽ����ֵ");
		else 
			 textArea.setText(remind);
		scrollPane.setViewportView(textArea);

		JLabel label_3 = new JLabel("���������Ϣ");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("΢���ź�", Font.BOLD, 14));
		scrollPane.setColumnHeaderView(label_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		toolBar.setEnabled(false);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);
	}

}
