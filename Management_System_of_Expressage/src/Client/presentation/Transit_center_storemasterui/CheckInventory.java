package Client.presentation.Transit_center_storemasterui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.DateChooser;

public class CheckInventory extends JPanel {

	/**
	 * Create the panel.
	 */
	public CheckInventory() {
        setLayout(null);
		
		JButton btnNewButton = new JButton("����");
		btnNewButton.setBounds(10, 10, 57, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("�ֿ����Ա>>������>>�鿴���");
		lblNewLabel.setBounds(92, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("��������ã�");
		lblNewLabel_1.setBounds(505, 14, 79, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("��ʼ����");
		lblNewLabel_2.setBounds(211, 129, 54, 15);
		add(lblNewLabel_2);
		
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("����ѡ������");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(334, 129, 96, 15);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_3 = new JLabel("��������");
		lblNewLabel_3.setBounds(211, 215, 54, 15);
		add(lblNewLabel_3);
		
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_9 = new JLabel("����ѡ������");
		dateChooser2.register(lblNewLabel_9);
		lblNewLabel_9.setBounds(334, 215, 96, 15);
		add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("ȷ��");
		btnNewButton_1.setBounds(146, 332, 130, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ȡ��");
		btnNewButton_2.setBounds(369, 332, 123, 25);
		add(btnNewButton_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 400, 650, 25);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("״̬��");
		toolBar.add(lblNewLabel_6);

	}

}
