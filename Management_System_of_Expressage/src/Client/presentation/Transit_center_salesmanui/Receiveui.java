package Client.presentation.Transit_center_salesmanui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import java.awt.Font;
import javax.swing.JTextField;

public class Receiveui extends JPanel {
	private JTextField textField;

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
		
		JLabel label_2 = new JLabel("����װ�˵����");
		label_2.setBounds(179, 255, 90, 23);
		add(label_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);
		
		JLabel label_3 = new JLabel("ѡ�񵽴��װ�˵�");
		label_3.setFont(new Font("΢���ź�", Font.BOLD, 20));
		label_3.setBounds(289, 134, 255, 23);
		add(label_3);
		
		textField = new JTextField();
		textField.setBounds(342, 254, 196, 23);
		add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("\u521B\u5EFA\u5230\u8FBE\u5355");
		button_1.setBounds(307, 368, 134, 23);
		add(button_1);

	}
}
