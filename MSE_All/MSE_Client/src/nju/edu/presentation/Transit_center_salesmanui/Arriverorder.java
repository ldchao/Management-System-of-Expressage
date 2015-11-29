package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;

import PO.ArriverorderPO;
import nju.edu.VO.ArriverorderVO;
import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogic.transferbl.ReceiveBL;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arriverorder extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton_2;
	JFrame main;
	LoadorderVO lv;

	/**
	 * Create the panel.
	 */
	public Arriverorder(JFrame m, JPanel jp, LoadorderVO lv) {
		main = m;
		this.lv = lv;
		JPanel lastui = jp;
		Arriverorder nowPanel = this;
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

		JLabel label = new JLabel("��ת����ҵ��Ա>>��ת����>>�½����ﵥ");
		label.setBounds(100, 14, 360, 15);
		add(label);

		JLabel label_1 = new JLabel("��������ã�");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);

		JLabel label_2 = new JLabel("��������");
		label_2.setBounds(180, 159, 54, 15);
		add(label_2);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("����ѡ������");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(390, 159, 96, 15);
		add(lblNewLabel_8);

		JLabel label_3 = new JLabel("��ת���ı��");
		label_3.setBounds(180, 211, 96, 15);
		add(label_3);

		textField = new JTextField();
		textField.setBounds(333, 208, 192, 21);
		add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("������");
		lblNewLabel.setBounds(180, 263, 54, 15);
		add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setText(lv.getOffName());
		textField_1.setBounds(333, 260, 192, 21);
		add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("���ﵽ��״̬");
		lblNewLabel_1.setBounds(180, 317, 96, 15);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("����״̬");
		lblNewLabel_2.setBounds(180, 372, 69, 15);
		add(lblNewLabel_2);

		String[] approveState = { "δ����", "����ͨ��", "����δͨ��" };
		JComboBox comboBox = new JComboBox(approveState);
		comboBox.setBounds(344, 369, 181, 21);
		comboBox.setEnabled(false);
		add(comboBox);

		rdbtnNewRadioButton = new JRadioButton("��");
		rdbtnNewRadioButton.setBounds(333, 313, 64, 23);
		add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("����");
		rdbtnNewRadioButton_1.setBounds(408, 313, 69, 23);
		add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_2 = new JRadioButton("��ʧ");
		rdbtnNewRadioButton_2.setBounds(479, 313, 57, 23);
		add(rdbtnNewRadioButton_2);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);

		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() == 0
						|| lblNewLabel_8.getText().equals("����ѡ������")
						|| !isSelected()) {
					label_4.setText("������Ϣ����");
				} else {
					ArriverorderVO av = new ArriverorderVO(textField.getText(),
							lblNewLabel_8.getText(), textField_1.getText(),
							getSelection(),lv.getCarNum(),lv.getMonitorName(),
							lv.getTransferName(),lv.getOrder());
					ReceiveBLService rb=new ReceiveBL();
					rb.build(av);
					label_4.setText("���ﵥ���ύ�ܾ�������");
				}
			}
		});
		btnNewButton.setBounds(220, 457, 80, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arriverorder a = new Arriverorder(main, lastui, lv);
				main.remove(nowPanel);
				main.getContentPane().add(a);
				main.invalidate();
				main.repaint();
			}
		});
		btnNewButton_1.setBounds(390, 457, 80, 23);
		add(btnNewButton_1);

		JLabel label_5 = new JLabel(
				"\u4E2D\u8F6C\u4E2D\u5FC3\u5230\u8FBE\u5355");
		label_5.setFont(new Font("΢���ź�", Font.BOLD, 24));
		label_5.setBounds(260, 71, 226, 44);
		add(label_5);
	}

	protected String getSelection() {
		if (rdbtnNewRadioButton.isSelected())
			return rdbtnNewRadioButton.getText();
		else if (rdbtnNewRadioButton_1.isSelected())
			return rdbtnNewRadioButton_1.getText();
		else
			return rdbtnNewRadioButton_2.getText();
	}

	protected boolean isSelected() {

		return (rdbtnNewRadioButton.isSelected()
				|| rdbtnNewRadioButton_1.isSelected() || rdbtnNewRadioButton_2
					.isSelected());
	}
}