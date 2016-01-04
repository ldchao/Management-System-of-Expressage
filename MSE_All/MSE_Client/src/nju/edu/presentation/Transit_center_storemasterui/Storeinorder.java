package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
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
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/TransitCenterStoreMaster/Storeinorder.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
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
			textField[i].setForeground(new Color(255,255,255,200));
			textField[i].setCaretColor(new Color(88, 93, 103));
			textField[i].setOpaque(false);
			textField[i].setBorder(null);
		}

		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);

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
		lblNewLabel_4.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel_4);
		
		textField[0].setForeground(new Color(88, 93, 103,200));
		textField[0].setText("回车确认");
		textField[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField[0].setText("");
			}
		});
		textField[0].addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
				if(e.getKeyChar()=='\n'){
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
			}
		});
		textField[0].setEditable(true);
		textField[0].setBounds(287, 188, 113, 27);

		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String sendDate = bartDateFormat.format(date);

		JLabel lblNewLabel_3_1 = new JLabel(sendDate);
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255,200));
		lblNewLabel_3_1.setBounds(285, 230, 85, 15);
		add(lblNewLabel_3_1);

		textField[1].setBounds(287, 257, 113, 27);

		String[] quhao = { "航运区", "铁运区", "汽运区" };
		textField[2].setBounds(287, 298, 47, 27);

		textField[3].setBounds(455, 298, 47, 27);

		textField[4].setBounds(287, 333, 47, 27);

		textField[5].setBounds(455, 333, 47, 27);

		String[] approveState = { "未审批", "审批通过", "审批未通过" };
		JComboBox comboBox_1 = new JComboBox(approveState);
		comboBox_1.setBounds(287, 378, 189, 21);
		comboBox_1.setEnabled(false);
		add(comboBox_1);

		btnNewButton_1 = new JButton("");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(272, 443, 52, 52);
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

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(427, 442, 52, 52);
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
