package Client.presentation.Transit_center_storemasterui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

public class Transit_center_storemaster_mainui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transit_center_storemaster_mainui frame = new Transit_center_storemaster_mainui();
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
	public Transit_center_storemaster_mainui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);

		getContentPane().setLayout(null);
		contentPane.setLayout(null);

		JButton button = new JButton("����");
		button.setBounds(10, 10, 57, 23);
		getContentPane().add(button);

		JLabel label = new JLabel("�ֿ����Ա");
		label.setBounds(90, 14, 73, 15);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(525, 14, 73, 15);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("������");
		label_2.setBounds(109, 172, 54, 15);
		getContentPane().add(label_2);

		JLabel lblNewLabel = new JLabel("������");
		lblNewLabel.setBounds(339, 172, 54, 15);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("�������");
		lblNewLabel_1.setBounds(557, 172, 54, 15);
		getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(62, 217, 160, 128);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(290, 217, 160, 128);
		getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(507, 217, 160, 128);
		getContentPane().add(btnNewButton_2);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		getContentPane().add(toolBar);

		JLabel label_3 = new JLabel("״̬��");
		toolBar.add(label_3);

	}

}
