package Client.presentation.Transit_center_salesmanui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Transferui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Transferui() {
		setLayout(null);
		
		JButton button = new JButton("����");
		button.setBounds(10, 10, 57, 23);
		add(button);
		
		JLabel label = new JLabel("��ת����ҵ��Ա>>¼����ת��");
		label.setBounds(89, 14, 177, 15);
		add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(488, 14, 84, 15);
		add(label_1);
		
		JLabel lblNewLabel = new JLabel("�鿴��Ϣ����");
		lblNewLabel.setBounds(101, 98, 72, 15);
		add(lblNewLabel);
		
		JLabel label_2 = new JLabel("�鿴���");
		label_2.setBounds(287, 98, 91, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("�½���ת��");
		label_3.setBounds(456, 98, 72, 15);
		add(label_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(64, 138, 141, 120);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(259, 138, 132, 120);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(441, 138, 122, 120);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 392, 623, 23);
		add(toolBar);
		
		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);

	}

}