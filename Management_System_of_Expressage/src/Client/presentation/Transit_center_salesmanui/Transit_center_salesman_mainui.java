package Client.presentation.Transit_center_salesmanui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

public class Transit_center_salesman_mainui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transit_center_salesman_mainui frame = new Transit_center_salesman_mainui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Transit_center_salesman_mainui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		
        getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("��ת����ҵ��Ա");
		label.setBounds(76, 10, 127, 15);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(548, 10, 83, 15);
		getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("����");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 6, 65, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("��ת����");
		lblNewLabel.setBounds(112, 152, 54, 15);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(66, 191, 160, 128);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("¼����ת��");
		lblNewLabel_1.setBounds(331, 152, 83, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("װ������");
		lblNewLabel_2.setBounds(548, 152, 54, 15);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(292, 191, 160, 128);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(515, 191, 160, 128);
		getContentPane().add(btnNewButton_3);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		getContentPane().add(toolBar);
		
		JLabel label_2 = new JLabel("״̬��");
		toolBar.add(label_2);

	}

}
