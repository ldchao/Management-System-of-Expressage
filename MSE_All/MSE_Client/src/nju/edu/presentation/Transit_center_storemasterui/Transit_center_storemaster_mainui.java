package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import nju.edu.businesslogic.storebl.StoreMessageBL;
import nju.edu.presentation.Loginui.PersonalInfomation;
import PO.LoginPO;
import PO.OrganizationNumPO;
import StaticValue.StoreNum;

@SuppressWarnings("serial")
public class Transit_center_storemaster_mainui extends JFrame {

	private JPanel contentPane;
	Transit_center_storemaster_mainui main;
	StoreMessageBL sm;
	JLabel label_3;
	private PersonalInfomation perinfo;

	/**
	 * Create the frame.
	 */
	public Transit_center_storemaster_mainui(LoginPO loginPO) {

		main = this;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		OrganizationNumPO op=new OrganizationNumPO();
		String transferNum=op.getNum(loginPO.getShop());
		sm = StoreMessageBL.getInstance(transferNum);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");

		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				sm.save();
			 }
		});

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		contentPane.add(toolBar);

		label_3 = new JLabel("状态栏");
		toolBar.add(label_3);

		label_3.setText("仓库信息初始化成功");

		JButton button = new JButton("注销");
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
				sm.save();
				label_3.setText("库存信息储存完毕");
				System.exit(0);
				main.dispose();
			}
		});
		contentPane.add(button);

		JLabel label = new JLabel("仓库管理员");
		label.setBounds(100, 14, 73, 15);
		contentPane.add(label);

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		contentPane.add(lblHello);
		lblHello.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				perinfo = new PersonalInfomation(loginPO, main);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (perinfo.getMouseState() == true)
					perinfo.dispose();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				perinfo.setAlwaysOnTop(true);
				perinfo.setMouseState(false);
			}
		});

		JLabel label_2 = new JLabel("入库管理");
		label_2.setBounds(210, 113, 54, 15);
		contentPane.add(label_2);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Warehouse_inui wi = new Warehouse_inui(main, contentPane,
						loginPO);
				main.remove(contentPane);
				main.getContentPane().add(wi);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(172, 158, 125, 100);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("库存管理");
		lblNewLabel.setBounds(473, 113, 54, 15);
		contentPane.add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory_managementui im = new Inventory_managementui(main,
						contentPane, loginPO);
				main.remove(contentPane);
				main.getContentPane().add(im);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(434, 158, 125, 100);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("出库管理");
		lblNewLabel_1.setBounds(210, 299, 54, 15);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Warehouse_outui wo = new Warehouse_outui(main, contentPane,
						loginPO);
				main.remove(contentPane);
				main.getContentPane().add(wo);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(172, 339, 125, 100);
		contentPane.add(btnNewButton_2);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("选项");
		lblNewLabel_2.setBounds(473, 299, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(434, 339, 125, 100);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Optionui o = new Optionui(main, contentPane,
						loginPO,sm);
				main.remove(contentPane);
				main.getContentPane().add(o);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_3);

	}
}
