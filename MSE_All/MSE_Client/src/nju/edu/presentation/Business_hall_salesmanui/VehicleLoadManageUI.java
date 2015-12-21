package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import nju.edu.VO.VehicleLoadorderVO;
import nju.edu.businesslogic.loadbl.LoadBL;
import nju.edu.businesslogicservice.loadblservice.LoadBlService;
import nju.edu.presentation.Transit_center_salesmanui.Shippingorder;
import nju.edu.presentation.financial_staffui.DateChooser;

import javax.swing.JTextArea;

import PO.LoginPO;
import PO.OrganizationNumPO;

public class VehicleLoadManageUI extends JPanel implements Runnable {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	JFrame main;
	JPanel lastui;
	VehicleLoadManageUI nowPanel;

	// create the panel
	public VehicleLoadManageUI(JFrame m, JPanel bf, LoginPO loginPO) {
		main = m;
		lastui = bf;
		nowPanel = this;
		setLayout(null);
		OrganizationNumPO op = new OrganizationNumPO();
		String offnum = op.getNum(loginPO.getShop());

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

		JLabel label = new JLabel("Ӫҵ��ҵ��Ա>>װ������");
		label.setBounds(100, 14, 200, 15);
		add(label);

		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
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

		JLabel lblNewLabel = new JLabel("Ӫҵ�����");
		lblNewLabel.setBounds(69, 172, 88, 15);
		add(lblNewLabel);

		textField = new JTextField();
		textField.setText(offnum);
		textField.setEditable(false);
		textField.setBounds(169, 169, 181, 21);
		add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("���˱��");
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

		JLabel lblNewLabel_3 = new JLabel("��������");
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

		String[] arriveAddress = { "", "������ת����", "�Ϻ���ת����", "�Ͼ���ת����", "������ת����" };
		JComboBox comboBox_1 = new JComboBox(arriveAddress);
		comboBox_1.setBounds(169, 299, 181, 21);
		add(comboBox_1);

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
		label_3.setBounds(182, 421, 72, 15);
		add(label_3);

		JLabel lblNewLabel_7 = new JLabel("����״̬");
		lblNewLabel_7.setBounds(392, 421, 54, 15);
		add(lblNewLabel_7);

		String[] checkState = { "δ����", "����ͨ��", "����δͨ��" };
		JComboBox comboBox = new JComboBox(checkState);
		comboBox.setEnabled(false);
		comboBox.setBounds(492, 418, 152, 21);
		add(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(403, 134, 241, 262);
		add(scrollPane);

		JLabel lblNewLabel_9 = new JLabel("�������˵��ţ�");
		lblNewLabel_9.setFont(new Font("΢���ź�", Font.BOLD, 14));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_9);

		JTextArea textArea = new JTextArea();
		textArea.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!(Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '\n')) {
					e.consume();
				}
			}
		});
		scrollPane.setViewportView(textArea);

		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadBlService lb = new LoadBL();
				String loadorderNum = textField_2.getText()
						+ textField_1.getText();
				String fee = "" + lb.getTotal(textArea.getText());
				label_3.setText(fee + "Ԫ");
				String monitorName = textField_4.getText();
				String transferName = textField_5.getText();
				String carNum = textField_2.getText();
				String orderList = textArea.getText();
				String arrivePlace=(String) comboBox_1
				.getSelectedItem();
				if (monitorName.length() == 0 || transferName.length() == 0
						|| carNum.length() != 4 || loadorderNum.length() != 10
						||arrivePlace.length()==0|| orderList.length() == 0) {
					label_4.setText("������Ϣ�Ƿ�������ȷ");
				} else {
					VehicleLoadorderVO vlv = new VehicleLoadorderVO(sendDate,
							loadorderNum, offnum, arrivePlace, monitorName,
							transferName, carNum, orderList, fee);
					lb.addLoadOrder(vlv);
					label_4.setText("�����ɹ�");
					Thread t = new Thread(nowPanel);
					t.start();
				}
			}
		});
		btnNewButton.setBounds(219, 485, 85, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VehicleLoadManageUI r = new VehicleLoadManageUI(main, lastui,
						loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(r);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(426, 485, 93, 23);
		add(btnNewButton_1);

		JLabel label_5 = new JLabel("Ӫҵ��װ����");
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
		main.remove(nowPanel);
		main.getContentPane().add(lastui);
		main.invalidate();
		main.repaint();
		main.setVisible(true);

	}
}
