package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
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
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/TransitCenterStoreMaster/Storeoutorder.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
	public Storeoutorder(JFrame m, JPanel jp, JPanel jp2, LoginPO loginPO,
			ChangeorderVO cv) {
		main = m;
		returnui = jp2;
		lastui = jp;
		nowPanel = this;
		loginpo = loginPO;
		textField=new JTextField[4];
		for(int i=0;i<4;i++){
			textField[i]=new JTextField();
			textField[i].setEditable(false);
			add(textField[i]);
			textField[i].setColumns(10);
			textField[i].setForeground(new Color(255,255,255,200));
			textField[i].setCaretColor(new Color(88, 93, 103));
			textField[i].setOpaque(false);
			textField[i].setBorder(null);
		}

		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);
		OrganizationNumPO op = new OrganizationNumPO();

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
		lblNewLabel_4.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel_4);

		textField[0].setText("该中转单上所有单号");
		textField[0].setBounds(364, 190, 140, 27);

		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String sendDate = bartDateFormat.format(date);

		JLabel lblNewLabel_3_1 = new JLabel(sendDate);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setBounds(364, 230, 85, 15);
		add(lblNewLabel_3_1);

		textField[1].setText(op.getName(cv.getArrivenum()));
		textField[1].setBounds(364, 259, 140, 27);

		textField[2].setText(cv.getWayOfTransport());
		textField[2].setBounds(364, 299, 140, 27);

		textField[3].setText(cv.getNumberOfTransfer());
		textField[3].setBounds(364, 332, 140, 27);

		String[] approveState = { "未审批", "审批通过", "审批未通过" };
		JComboBox comboBox = new JComboBox(approveState);
		comboBox.setBounds(351, 381, 165, 21);
		comboBox.setEnabled(false);
		add(comboBox);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(273, 443, 52, 52);
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

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(426, 442, 52, 52);
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
