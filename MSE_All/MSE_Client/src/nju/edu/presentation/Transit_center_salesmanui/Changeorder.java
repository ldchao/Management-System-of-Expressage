package nju.edu.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.SwingConstants;

import PO.LoginPO;
import PO.OrganizationNumPO;
import StaticValue.StoreNum;
import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogic.transferbl.TransferBL;
import nju.edu.businesslogicservice.transferblservice.TransferBLService;
import nju.edu.presentation.courierui.JTextFieldLimit;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTextArea;

public class Changeorder extends JPanel implements Runnable {
	private JTextField[] textField;
	JFrame main;
	Changeorder nowPanel;
	JPanel returnui;
	LoginPO loginpo;
	String offNumber;
	String arriveNumber;

	/**
	 * Create the panel.
	 */
	public Changeorder(JFrame m, JPanel jp, JPanel jp2, LoginPO loginPO,
			String transferWay, int arriveNum, ArrayList<String> orderlist) {

		main = m;
		textField=new JTextField[6];
		JPanel lastui = jp;
		nowPanel = this;
		returnui = jp2;
		loginpo = loginPO;
		setLayout(null);

		for(int i=0;i<6;i++){
			textField[i]=new JTextField();
			add(textField[i]);
			textField[i].setColumns(10);
			textField[i].setForeground(new Color(88, 93, 103));
			textField[i].setCaretColor(new Color(88, 93, 103));
		}
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		OrganizationNumPO op=new OrganizationNumPO();
		String off=loginPO.getShop();
		offNumber=op.getNum(off);
		String arrive=StoreNum.getStoreName(offNumber, arriveNum - 1);
		arriveNumber=op.getNum(arrive);
		if(arriveNumber.length()==6){
			arriveNumber=arriveNumber.substring(3);
		}

		JButton button = new JButton("");
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(image1);
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

		JLabel label = new JLabel("中转中心业务员>>录入中转单>>新建中转单>>选择货物>>中转单");
		label.setBounds(100, 14, 393, 15);
		add(label);

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		JLabel label_2 = new JLabel("装车日期");
		label_2.setBounds(70, 132, 54, 15);
		add(label_2);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(180, 132, 96, 15);
		add(lblNewLabel_8);

		JLabel label_3 = new JLabel("中转单编号");
		label_3.setBounds(70, 174, 96, 15);
		add(label_3);

		
		textField[0].setText(offNumber+"-"+arriveNumber);
		textField[0].setEditable(false);
		textField[0].setBounds(180, 168, 60, 21);
		
		textField[1].addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!(Character.isDigit(e.getKeyChar()))) {
					e.consume();
				}
			}
		});
		textField[1].setDocument(new JTextFieldLimit(4));
		textField[1].setBounds(254, 168, 60, 21);


		JLabel lblNewLabel = new JLabel("出发地");
		lblNewLabel.setBounds(70, 216, 54, 15);
		add(lblNewLabel);

		textField[2].setText(off);
		textField[2].setEditable(false);
		textField[2].setBounds(180, 213, 134, 21);

		JLabel lblNewLabel_3 = new JLabel("到达地");
		lblNewLabel_3.setBounds(70, 262, 54, 15);
		add(lblNewLabel_3);

		textField[3].setText(arrive);
		textField[3].setEditable(false);
		textField[3].setBounds(180, 259, 134, 21);

		JLabel label_6 = new JLabel("运输方式");
		label_6.setBounds(70, 307, 54, 15);
		add(label_6);

		textField[4].setText(transferWay);
		textField[4].setEditable(false);
		textField[4].setBounds(180, 304, 134, 21);

		JLabel lblNewLabel_1 = new JLabel("监装员");
		lblNewLabel_1.setBounds(70, 355, 54, 15);
		add(lblNewLabel_1);

		textField[5].setBounds(180, 352, 134, 21);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(374, 131, 295, 289);
		add(scrollPane);

		String order = "";
		for (String s : orderlist) {
			order += s + "\n";
		}

		JLabel lblNewLabel_4 = new JLabel("本次中转所有单号");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_4);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText(order);
		scrollPane.setViewportView(textArea);

		JLabel label_5 = new JLabel("中转中心中转单");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label_5.setBounds(273, 60, 235, 33);
		add(label_5);

		JLabel lblNewLabel_2 = new JLabel("审批状态");
		lblNewLabel_2.setBounds(70, 402, 69, 15);
		add(lblNewLabel_2);

		String[] approveState = { "未审批", "审批通过", "审批未通过" };
		JComboBox comboBox = new JComboBox(approveState);
		comboBox.setBounds(180, 399, 134, 21);
		comboBox.setEnabled(false);
		add(comboBox);

		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBounds(226, 457, 52, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = lblNewLabel_8.getText();
				String transferNum = offNumber+arriveNumber+textField[1].getText();
				String offNum =offNumber ;
				String arriveNum = offNumber+arriveNumber;
				String moniterName = textField[5].getText();
				if (date.equals("单击选择日期") || transferNum.length() != 10
						|| moniterName.length() == 0) {
					label_4.setText("输入信息有误！");
				} else {
					ChangeorderVO cv = new ChangeorderVO(transferNum, date,
							offNum, arriveNum, transferWay, moniterName,
							orderlist);
					TransferBLService tb = new TransferBL();
					tb.build(cv);
					Thread t = new Thread(nowPanel);
					t.start();
				}

			}
		});
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton.getWidth(), btnNewButton.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton.setIcon(image1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setBounds(428, 457, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder c = new Changeorder(main, lastui, jp2, loginPO,
						transferWay, arriveNum, orderlist);
				main.remove(nowPanel);
				main.getContentPane().add(c);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		add(btnNewButton_1);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Transferui tf = new Transferui(main, returnui, loginpo);
		main.remove(nowPanel);
		main.getContentPane().add(tf);
		main.invalidate();
		main.repaint();
		main.setVisible(true);
	}
}