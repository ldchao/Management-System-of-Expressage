package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import PO.LoginPO;
import PO.OrganizationNumPO;
import nju.edu.VO.ChangeorderVO;
import nju.edu.VO.VehicleLoadorderVO;
import nju.edu.businesslogic.loadbl.ShippingBL;
import nju.edu.businesslogicservice.loadblservice.ShippingBLService;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Shippingorder extends JPanel implements Runnable{

	/**
	 * Create the panel.
	 */
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JFrame main;
	Shippingorder nowPanel;
	JPanel returnui;
	LoginPO loginpo;

	public Shippingorder(JFrame m, JPanel jp,JPanel jp2, LoginPO loginPO,
			ChangeorderVO cv, String transport) {
		main = m;
		JPanel lastui = jp;
		nowPanel = this;
		returnui=jp2;
		loginpo=loginPO;
		setLayout(null);
		ShippingBLService sb = new ShippingBL();
		OrganizationNumPO op = new OrganizationNumPO();

		JButton button = new JButton("����");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 65, 23);
		add(button);

		JLabel label = new JLabel("��ת����ҵ��Ա>>װ�˹���>>�½�װ�˵�>>" + transport + "װ�˵�");
		label.setBounds(100, 14, 376, 15);
		add(label);

		JLabel label_1 = new JLabel(loginPO.getName() + "����ã�");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);

		JLabel label_2 = new JLabel("װ������");
		label_2.setBounds(69, 134, 54, 15);
		add(label_2);

		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String sendDate = bartDateFormat.format(date);
		JLabel lblNewLabel_8 = new JLabel(sendDate);
		lblNewLabel_8.setBounds(169, 134, 85, 15);
		add(lblNewLabel_8);

		JLabel lblNewLabel = new JLabel("��ת���ı��");
		lblNewLabel.setBounds(69, 172, 88, 15);
		add(lblNewLabel);

		textField = new JTextField();
		textField.setText(cv.getOffnum());
		textField.setEditable(false);
		textField.setBounds(169, 169, 181, 21);
		add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel(cv.getWayOfTransport() + "���");
		lblNewLabel_1.setBounds(71, 217, 54, 15);
		add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		textField_1.setBounds(169, 214, 181, 21);
		add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel(transport + "����");
		lblNewLabel_3.setBounds(71, 260, 54, 15);
		add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(169, 257, 181, 21);
		add(textField_2);

		JLabel lblNewLabel_2 = new JLabel("�����");
		lblNewLabel_2.setBounds(71, 302, 54, 15);
		add(lblNewLabel_2);

		textField_3 = new JTextField();
		textField_3.setText(op.getName(cv.getArrivenum()));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(169, 299, 181, 21);
		add(textField_3);

		JLabel lblNewLabel_4 = new JLabel("��װԱ");
		lblNewLabel_4.setBounds(71, 343, 54, 15);
		add(lblNewLabel_4);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(169, 340, 181, 21);
		add(textField_4);

		JLabel lblNewLabel_5 = new JLabel("Ѻ��Ա");
		lblNewLabel_5.setBounds(71, 381, 54, 15);
		add(lblNewLabel_5);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(169, 378, 181, 21);
		add(textField_5);

		JLabel lblNewLabel_6 = new JLabel("�˷�");
		lblNewLabel_6.setBounds(77, 421, 54, 15);
		add(lblNewLabel_6);

		JLabel label_3 = new JLabel("_ _ _ _ _");
		double total = sb.getTotal(cv.getOrder_number(), cv.getOffnum(),
		 cv.getArrivenum(), cv.getWayOfTransport());
		label_3.setText(total + "Ԫ");
		label_3.setBounds(182, 421, 72, 15);
		add(label_3);

		JLabel lblNewLabel_7 = new JLabel("����״̬");
		lblNewLabel_7.setBounds(392, 421, 54, 15);
		add(lblNewLabel_7);

		String[] approveState = { "δ����", "����ͨ��", "����δͨ��" };
		JComboBox comboBox = new JComboBox(approveState);
		comboBox.setBounds(480, 421, 181, 21);
		comboBox.setEnabled(false);
		add(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(403, 133, 241, 263);
		add(scrollPane);

		String order = "";
		for (String s : cv.getOrder_number()) {
			order += s + "\n";
		}

		JTextArea textArea = new JTextArea();
		textArea.setText(order);
		scrollPane.setViewportView(textArea);

		JLabel lblNewLabel_9 = new JLabel("�������˵��ţ�");
		lblNewLabel_9.setFont(new Font("΢���ź�", Font.BOLD, 14));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_9);

		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = lblNewLabel_8.getText(); // װ������ 2
				String loadorderNum = textField_2.getText()
						+ textField_1.getText(); // װ�˵���� 1
				String transferNum = cv.getOffnum(); // ��ת���ı��3
				String arriveNum = cv.getArrivenum(); // ����ر�� 4
				String monitorName = textField_4.getText(); // ��װԱ���� 5
				String transferName = textField_5.getText(); // Ѻ��Ա���� 6
				String transportNum = textField_1.getText(); // �����ţ����˱�ţ����˱�ţ����˱�ţ�
																// 7
				ArrayList<String> orderlist = cv.getOrder_number(); // ���ж������ 8
				String fee = total + ""; // �˷� 9
				if (transportNum.length()!=4 || loadorderNum.length() != 10
						|| monitorName.length() == 0
						|| transferName.length() == 0) {
					label_4.setText("����ȷ����װ�˵���Ϣ");
				} else {
					VehicleLoadorderVO vlv = new VehicleLoadorderVO(date,
							loadorderNum, transferNum, arriveNum, monitorName,
							transferName, transportNum, orderlist, fee,cv.getNumberOfTransfer());
					sb.build(vlv);
					label_4.setText("װ�˵������ɹ���");
					Thread t=new Thread(nowPanel);
					t.start();
				}
			}
		});
		btnNewButton.setBounds(219, 485, 85, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shippingorder sc = new Shippingorder(main, lastui,jp2, loginPO, cv,
						transport);
				main.remove(nowPanel);
				main.getContentPane().add(sc);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(426, 485, 93, 23);
		add(btnNewButton_1);

		JLabel label_5 = new JLabel("��ת����" + transport + "װ�˵�");
		label_5.setFont(new Font("΢���ź�", Font.BOLD, 20));
		label_5.setBounds(286, 74, 223, 28);
		add(label_5);

	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Shipping_Inputui si=new Shipping_Inputui(main, returnui, loginpo);
		main.remove(nowPanel);
		main.getContentPane().add(si);
		main.invalidate();
		main.repaint();
		main.setVisible(true);
	}

}