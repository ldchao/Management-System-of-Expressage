package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import nju.edu.VO.LoadorderVO;
import nju.edu.VO.StoreLocationVO;
import nju.edu.VO.StoreinVO;
import nju.edu.businesslogic.storebl.Warehouse_inBL;
import nju.edu.businesslogicservice.storeblservice.Warehouse_inBLService;
import PO.LoginPO;
import PO.OrganizationNumPO;

public class Storeinorder extends JPanel implements Runnable {
	private JTextField textField[];
	JFrame main;
	JPanel lastui;
	LoginPO loginpo;
	Storeinorder nowPanel;
	String order_number;
	String offnum;
	String qu;
	String pai;
	String jia;
	String wei;
	JButton btnNewButton_1;

	/**
	 * Create the panel.
	 */
	public Storeinorder(JFrame m, JPanel jp, LoginPO loginPO) {
		main = m;
		lastui = jp;
		loginpo = loginPO;
		nowPanel = this;
		textField = new JTextField[6];
		Warehouse_inBLService wb = new Warehouse_inBL();

		for (int i = 0; i < 6; i++) {
			textField[i] = new JTextField();
			add(textField[i]);
			textField[i].setColumns(10);
			textField[i].setEditable(false);
			textField[i].setForeground(new Color(88, 93, 103));
			textField[i].setCaretColor(new Color(88, 93, 103));
		}

		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);

		JButton button = new JButton("返回");
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

		JLabel lblNewLabel = new JLabel("仓库管理员>>入库管理>>新建入库单");
		lblNewLabel.setBounds(100, 14, 347, 15);
		add(lblNewLabel);

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

		JLabel lblNewLabel_4 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_4);

		JLabel lblNewLabel_2 = new JLabel("快递编号");
		lblNewLabel_2.setBounds(168, 170, 54, 15);
		add(lblNewLabel_2);

		textField[0].addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		textField[0].addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				order_number = textField[0].getText();
				if (order_number.length() != 10) {
					lblNewLabel_4.setText("请输入正确单号");
				} else {
					OrganizationNumPO op = new OrganizationNumPO();
					String storeNum = op.getNum(loginPO.getShop());
					String number = "0" + order_number.substring(0, 2) + "0"
							+ order_number.substring(2, 4);
					offnum = op.getName(number);
					textField[1].setText(offnum);
					StoreLocationVO lv = wb.getStoreLocation(order_number,
							storeNum);
					if (lv.getWei() == -1) {
						lblNewLabel_4.setText("原定库区已满，请暂时放入机动区！");
					} else {
						qu = lv.getQu();
						pai = "" + lv.getPai();
						jia = "" + lv.getJia();
						wei = "" + lv.getWei();

						textField[2].setText(qu);
						textField[3].setText(pai);
						textField[4].setText(jia);
						textField[5].setText(wei);
						btnNewButton_1.setEnabled(true);
					}
				}

			}
		});
		textField[0].setEditable(true);
		textField[0].setBounds(299, 167, 234, 21);

		JLabel lblNewLabel_3 = new JLabel("入库日期");
		lblNewLabel_3.setBounds(168, 207, 54, 15);
		add(lblNewLabel_3);

		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String sendDate = bartDateFormat.format(date);

		JLabel lblNewLabel_3_1 = new JLabel(sendDate);
		lblNewLabel_3_1.setBounds(346, 207, 85, 15);
		add(lblNewLabel_3_1);

		JLabel lblNewLabel_5 = new JLabel("目的地");
		lblNewLabel_5.setBounds(168, 246, 54, 15);
		add(lblNewLabel_5);

		textField[1].setBounds(299, 243, 234, 21);

		JLabel lblNewLabel_6 = new JLabel("区号");
		lblNewLabel_6.setBounds(168, 294, 54, 15);
		add(lblNewLabel_6);

		String[] quhao = { "航运区", "铁运区", "汽运区" };
		textField[2].setBounds(236, 291, 93, 21);

		JLabel lblNewLabel_7 = new JLabel("排号");
		lblNewLabel_7.setBounds(376, 294, 39, 15);
		add(lblNewLabel_7);

		textField[3].setBounds(440, 291, 93, 21);

		JLabel lblNewLabel_8 = new JLabel("架号");
		lblNewLabel_8.setBounds(168, 344, 39, 15);
		add(lblNewLabel_8);

		textField[4].setBounds(236, 341, 94, 21);

		JLabel lblNewLabel_9 = new JLabel("位号");
		lblNewLabel_9.setBounds(382, 344, 39, 15);
		add(lblNewLabel_9);

		textField[5].setBounds(440, 341, 93, 21);

		JLabel lblNewLabel_10 = new JLabel("审批状态");
		lblNewLabel_10.setBounds(168, 398, 54, 15);
		add(lblNewLabel_10);

		String[] approveState = { "未审批", "审批通过", "审批未通过" };
		JComboBox comboBox_1 = new JComboBox(approveState);
		comboBox_1.setBounds(299, 395, 234, 21);
		comboBox_1.setEnabled(false);
		add(comboBox_1);

		btnNewButton_1 = new JButton("确定");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(180, 460, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				StoreinVO sv = new StoreinVO(order_number, sendDate, offnum,
						qu, pai, wei, jia);
				wb.build(sv);
				lblNewLabel_4.setText("创建成功");
				Thread t = new Thread(nowPanel);
				t.start();
			}
		});
		Image temp1 = image1.getImage().getScaledInstance(
				btnNewButton_1.getWidth(), btnNewButton_1.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		btnNewButton_1.setIcon(image1);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("取消");
		btnNewButton_2.setBounds(440, 460, 52, 52);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Storeinorder s = new Storeinorder(main, lastui, loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(s);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setIcon(image1);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		add(btnNewButton_2);

		JLabel label = new JLabel("入  库  单");
		label.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label.setBounds(317, 82, 142, 41);
		add(label);

	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Storeinorder s = new Storeinorder(main, lastui, loginpo);
		main.remove(nowPanel);
		main.getContentPane().add(s);
		main.invalidate();
		main.repaint();
		main.setVisible(true);
	}
}
