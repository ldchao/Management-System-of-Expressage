package Client.presentation.Transit_center_salesmanui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Receiveui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Receiveui() {
		setLayout(null);
		
		JButton button = new JButton("����");
		button.setBounds(10, 10, 57, 23);
		add(button);
		
		JLabel label = new JLabel("��ת����ҵ��Ա>>��ת����");
		label.setBounds(82, 14, 187, 15);
		add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(525, 14, 72, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("�鿴��Ϣ����");
		label_2.setBounds(139, 111, 90, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("�½����ﵥ");
		label_3.setBounds(392, 111, 78, 15);
		add(label_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(117, 136, 138, 134);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(374, 136, 138, 134);
		add(btnNewButton_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 399, 642, 23);
		add(toolBar);
		
		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);

	}
}
