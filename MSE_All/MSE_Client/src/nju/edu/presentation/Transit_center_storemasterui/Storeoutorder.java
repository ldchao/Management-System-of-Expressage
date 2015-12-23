package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogic.storebl.Warehouse_outBL;
import nju.edu.businesslogicservice.storeblservice.Warehouse_outBLService;
import PO.LoginPO;
import PO.OrganizationNumPO;

public class Storeoutorder extends JPanel implements Runnable {
	private JTextField[] textField;
	JFrame main;
	JPanel returnui;
	JPanel lastui;
	Storeoutorder nowPanel;
	LoginPO loginpo;

	/**
	 * Create the panel.
	 */
	public Storeoutorder(JFrame m, JPanel jp, JPanel jp2, LoginPO loginPO,
			ChangeorderVO cv) {
		main = m;
		returnui = jp2;
		lastui = jp;
		nowPanel = this;
		loginpo = loginPO;
		textField=new JTextField[4];
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);
		OrganizationNumPO op = new OrganizationNumPO();

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

		JLabel lblNewLabel = new JLabel("仓库管理员>>出库管理>>新建出库单>>出库单");
		lblNewLabel.setBounds(100, 14, 347, 15);
		add(lblNewLabel);

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

		JLabel lblNewLabel_4 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_4);

		JLabel lblNewLabel_2 = new JLabel("快递编号");
		lblNewLabel_2.setBounds(168, 163, 54, 15);
		add(lblNewLabel_2);

		textField[0].setText("该中转单上所有单号");
		textField[0].setBounds(298, 160, 234, 21);

		JLabel lblNewLabel_3 = new JLabel("出库日期");
		lblNewLabel_3.setBounds(168, 207, 54, 15);
		add(lblNewLabel_3);

		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String sendDate = bartDateFormat.format(date);

		JLabel lblNewLabel_3_1 = new JLabel(sendDate);
		lblNewLabel_3_1.setBounds(360, 207, 85, 15);
		add(lblNewLabel_3_1);

		JLabel lblNewLabel_5 = new JLabel("目的地");
		lblNewLabel_5.setBounds(168, 262, 54, 15);
		add(lblNewLabel_5);

		textField[1].setText(op.getName(cv.getArrivenum()));
		textField[1].setBounds(298, 259, 234, 21);

		JLabel lblNewLabel_6 = new JLabel("装运形式");
		lblNewLabel_6.setBounds(168, 313, 54, 15);
		add(lblNewLabel_6);

		textField[2].setText(cv.getWayOfTransport());
		textField[2].setBounds(298, 310, 234, 21);

		JLabel lblNewLabel_7 = new JLabel("中转单编号");
		lblNewLabel_7.setBounds(168, 361, 78, 15);
		add(lblNewLabel_7);

		textField[3].setText(cv.getNumberOfTransfer());
		textField[3].setBounds(298, 358, 237, 21);


		for(int i=0;i<4;i++){
			textField[i].setEditable(false);
			add(textField[i]);
			textField[i].setColumns(10);
			textField[i].setForeground(new Color(88, 93, 103));
			textField[i].setCaretColor(new Color(88, 93, 103));
		}
		
		JLabel lblNewLabel_10 = new JLabel("审批状态");
		lblNewLabel_10.setBounds(168, 412, 54, 15);
		add(lblNewLabel_10);

		String[] approveState = { "未审批", "审批通过", "审批未通过" };
		JComboBox comboBox = new JComboBox(approveState);
		comboBox.setBounds(298, 409, 234, 21);
		comboBox.setEnabled(false);
		add(comboBox);

		JButton btnNewButton_1 = new JButton("确定");
		btnNewButton_1.setBounds(188, 464, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Warehouse_outBLService wb = new Warehouse_outBL();
					wb.build(cv, sendDate);
					lblNewLabel_4.setText("入库单创建成功！");
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
		btnNewButton_2.setBounds(418, 464, 52, 52);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setIcon(image1);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		add(btnNewButton_2);

		JLabel label = new JLabel("出  库 单");
		label.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label.setBounds(320, 88, 148, 38);
		add(label);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Storeoutorder_Input si = new Storeoutorder_Input(main, returnui,
				loginpo);
		main.remove(nowPanel);
		main.getContentPane().add(si);
		main.invalidate();
		main.repaint();
		main.setVisible(true);
	}
}
