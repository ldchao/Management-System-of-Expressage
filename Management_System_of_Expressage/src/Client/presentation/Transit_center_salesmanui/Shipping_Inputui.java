package Client.presentation.Transit_center_salesmanui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;

public class Shipping_Inputui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Shipping_Inputui() {
setLayout(null);
		
		JButton button = new JButton("����");
		button.setBounds(10, 10, 57, 23);
		add(button);
		
		JLabel label = new JLabel("��ת����ҵ��Ա>>װ�˹���");
		label.setBounds(77, 14, 163, 15);
		add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(533, 14, 72, 15);
		add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 401, 659, 23);
		add(toolBar);
		
		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);
	}
}
