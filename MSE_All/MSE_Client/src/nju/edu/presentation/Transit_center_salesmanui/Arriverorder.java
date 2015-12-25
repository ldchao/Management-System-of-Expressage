package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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
import PO.LoginPO;
import PO.OrganizationNumPO;
import nju.edu.VO.ArriverorderVO;
import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogic.transferbl.ReceiveBL;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Arriverorder extends JPanel implements Runnable{
	private JTextField textField;
	private JTextField textField_1;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton_2;
	JFrame main;
	JPanel lastui;
	LoadorderVO lv;
	Arriverorder nowPanel;

	/**
	 * Create the panel.
	 */
	public Arriverorder(JFrame m, JPanel jp, LoadorderVO lv,LoginPO loginPO) {
		main = m;
		this.lv = lv;
		lastui = jp;
		nowPanel = this;
		OrganizationNumPO op=new OrganizationNumPO();
		setLayout(null);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		
		JButton button = new JButton("����");
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(new ImageIcon("image/transparent_circle.png"));
		button.addMouseListener(new MouseAdapter() {
					@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_circle.png"));
			}	
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button);

		JLabel label = new JLabel("��ת����ҵ��Ա>>��ת����>>�½����ﵥ");
		label.setBounds(100, 14, 360, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("״̬��");
		toolBar.add(label_4);

		JLabel label_2 = new JLabel("��������");
		label_2.setBounds(180, 159, 54, 15);
		add(label_2);

		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String sendDate = bartDateFormat.format(date);
		JLabel lblNewLabel_8 = new JLabel(sendDate);
		lblNewLabel_8.setBounds(390, 159, 96, 15);
		add(lblNewLabel_8);

		JLabel label_3 = new JLabel("��ת���ı��");
		label_3.setBounds(180, 211, 96, 15);
		add(label_3);

		textField = new JTextField();
		textField.setText(op.getNum(loginPO.getShop()));
		textField.setEditable(false);
		textField.setBounds(333, 208, 192, 21);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setColumns(10);
		add(textField);

		JLabel lblNewLabel = new JLabel("������");
		lblNewLabel.setBounds(180, 263, 54, 15);
		add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setText(lv.getOffName());
		textField_1.setEditable(false);
		textField_1.setBounds(333, 260, 192, 21);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setColumns(10);
		add(textField_1);

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
		btnNewButton.setBounds(220, 457, 52, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isSelected()) {
					label_4.setText("��ѡ����ﵽ��״̬");
				} else {
					ArriverorderVO av = new ArriverorderVO(textField.getText(),
							sendDate, lv.getOffNum(),
							getSelection(),lv.getCarNum(),lv.getMonitorName(),
							lv.getTransferName(),lv.getOrder());
					ReceiveBLService rb=new ReceiveBL();
					rb.build(av,lv.getLoadNum());
					label_4.setText("���ﵥ���ύ�ܾ�������");
					Thread t=new Thread(nowPanel);
					t.start();
					
				}
			}
		});
		Image temp1 = image1.getImage().getScaledInstance(btnNewButton.getWidth(),
				btnNewButton.getHeight(),image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ȡ��");
		btnNewButton_1.setBounds(390, 457, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arriverorder a = new Arriverorder(main, lastui, lv,loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(a);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
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