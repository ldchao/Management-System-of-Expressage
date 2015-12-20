package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

import nju.edu.VO.SendorderVO;
import nju.edu.businesslogic.transferbl.SendFormBL;
import nju.edu.businesslogicservice.transferblservice.SendFormBlService;
import nju.edu.presentation.Transit_center_storemasterui.SetWarnData;

public class SendUI extends JPanel {
	private JTextField textField;
	JFrame main;
	JPanel lastui;
	SendUI nowPanel;

	public SendUI(JFrame m, JPanel bf) {
		main = m;
		lastui = bf;
		nowPanel = this;
		setLayout(null);

		JButton button = new JButton("����");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
			}
		});
		button.setBounds(10, 10, 65, 23);
		add(button);

		JLabel label = new JLabel("Ӫҵ��ҵ��Ա>>������Ϣ����");
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

		JLabel label_2 = new JLabel("�ɼ���");
		label_2.setFont(new Font("΢���ź�", Font.BOLD, 24));
		label_2.setBounds(239, 102, 100, 50);
		add(label_2);

		JLabel label_3 = new JLabel("�ɼ����ڣ�");
		label_3.setFont(new Font("΢���ź�", Font.BOLD, 14));
		label_3.setBounds(147, 208, 86, 15);
		add(label_3);

		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String sendDate = bartDateFormat.format(date);

		JLabel lblNewLabel = new JLabel(sendDate);
		lblNewLabel.setBounds(246, 208, 93, 15);
		add(lblNewLabel);

		JLabel label_5 = new JLabel("�ɼ��ˣ�");
		label_5.setFont(new Font("΢���ź�", Font.BOLD, 14));
		label_5.setBounds(147, 272, 86, 15);
		add(label_5);

		textField = new JTextField();
		textField.setBounds(246, 270, 93, 21);
		add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("����״̬��");
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.BOLD, 14));
		lblNewLabel_1.setBounds(147, 350, 86, 15);
		add(lblNewLabel_1);

		String[] checkState = { "δ����", "����ͨ��", "����δͨ��" };
		JComboBox comboBox = new JComboBox(checkState);
		comboBox.setEnabled(false);
		comboBox.setBounds(246, 347, 93, 21);
		add(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(402, 105, 219, 267);
		add(scrollPane);

		JLabel lblNewLabel_2 = new JLabel("��Ҫ���͵ĵ���");
		lblNewLabel_2.setFont(new Font("΢���ź�", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_2);

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
				String sendPerson = textField.getText();
				String orderList = textArea.getText();
				if (sendPerson.length() == 0) {
					label_4.setText("�������ɼ���");
				} else if (orderList.length() == 0) {
					label_4.setText("�����붩����");
				} else {
					String[] sendOrder = orderList.split("\n");
					ArrayList<String> order = new ArrayList<>();
					boolean isTrue=true;
					for (int i = 0; i < sendOrder.length; i++) {
						if(sendOrder[i].length()!=10){
							isTrue=false;
						    break;
						}
						order.add(sendOrder[i]);
					}
					if(isTrue){
					SendorderVO sv=new SendorderVO(sendDate, sendPerson, order);
					SendFormBlService sb=new SendFormBL();
					sb.addReceiveOrder(sv);
					}else{
						label_4.setText("���鶩���������Ƿ���ȷ");
					}
				}
			}
		});
		btnNewButton.setBounds(221, 435, 93, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SendUI su = new SendUI(main, lastui);
				main.remove(nowPanel);
				main.getContentPane().add(su);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});

		btnNewButton_1.setBounds(412, 435, 93, 23);
		add(btnNewButton_1);

	}
}
