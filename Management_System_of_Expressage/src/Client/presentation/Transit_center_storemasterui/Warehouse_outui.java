package Client.presentation.Transit_center_storemasterui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Warehouse_outui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Warehouse_outui() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("����");
		btnNewButton.setBounds(10, 10, 63, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>�������");
		lblNewLabel.setBounds(97, 14, 143, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("��������ã�");
		lblNewLabel_1.setBounds(517, 14, 72, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("��Ϣ����");
		lblNewLabel_2.setBounds(174, 177, 54, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("�½����ⵥ");
		lblNewLabel_3.setBounds(481, 177, 72, 15);
		add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(134, 214, 160, 128);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(441, 214, 160, 128);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);
		
		JLabel lblNewLabel_4 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_4);

	}
}
