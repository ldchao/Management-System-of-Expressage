package Client.presentation.Transit_center_storemasterui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Transit_center_storemasterMainui extends JPanel {

	/**
	 * Create the panel.
	 */
	public Transit_center_storemasterMainui() {
		setLayout(null);
		
		JButton button = new JButton("����");
		button.setBounds(10, 10, 57, 23);
		add(button);
		
		JLabel label = new JLabel("�ֿ����Ա");
		label.setBounds(90, 14, 73, 15);
		add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(525, 14, 73, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("������");
		label_2.setBounds(109, 114, 54, 15);
		add(label_2);
		
		JLabel lblNewLabel = new JLabel("������");
		lblNewLabel.setBounds(290, 114, 54, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("�������");
		lblNewLabel_1.setBounds(464, 114, 54, 15);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(65, 139, 135, 130);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(266, 139, 126, 130);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(449, 139, 126, 130);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 415, 650, 17);
		add(toolBar);
		
		JLabel label_3 = new JLabel("״̬��");
		toolBar.add(label_3);

	}
}
