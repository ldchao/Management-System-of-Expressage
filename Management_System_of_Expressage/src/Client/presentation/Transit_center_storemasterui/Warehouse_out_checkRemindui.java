package Client.presentation.Transit_center_storemasterui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class Warehouse_out_checkRemindui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Warehouse_out_checkRemindui() {

setLayout(null);
		
		JButton button = new JButton("����");
		button.setBounds(10, 10, 57, 23);
		add(button);
		
		JLabel label = new JLabel("��ת���Ĳֿ����Ա>>�������>>�鿴��Ϣ����");
		label.setBounds(89, 14, 288, 15);
		add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(488, 14, 84, 15);
		add(label_1);
		

		JLabel label_2 = new JLabel("���������Ϣ����");
		label_2.setFont(new Font("΢���ź�", Font.BOLD, 20));
		label_2.setBounds(289, 80, 192, 35);
		add(label_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 150, 514, 299);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("��ʱû����Ҫ����Ļ���");
		scrollPane.setViewportView(textArea);
		
		JLabel label_3 = new JLabel("\u5F85\u5904\u7406\u7684\u6D88\u606F");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("΢���ź�", Font.BOLD, 14));
		scrollPane.setColumnHeaderView(label_3);
		
		JButton button_1 = new JButton("ȷ���Ѳ鿴������Ϣ���������Ϣ�������");
		button_1.setBounds(223, 477, 340, 23);
		add(button_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);
	}

}
