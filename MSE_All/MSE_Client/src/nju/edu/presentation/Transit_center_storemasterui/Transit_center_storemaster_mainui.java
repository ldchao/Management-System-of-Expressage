package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.businesslogic.storebl.StoreMessageBL;
import nju.edu.presentation.Loginui.PersonalInfomation;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		this.add(contentPane);
		contentPane.setLayout(null);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		contentPane.add(toolBar);

		label_3 = new JLabel("状态栏");
		toolBar.add(label_3);

		sm = StoreMessageBL.getInstance();
		label_3.setText("仓库信息初始化成功");

		JButton button = new JButton("注销");
		button.setBounds(10, 10, 65, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sm.save();
				label_3.setText("库存信息储存完毕");
				main.dispose();
			}
		});
		contentPane.add(button);

		JLabel label = new JLabel("仓库管理员");
		label.setBounds(100, 14, 73, 15);
		contentPane.add(label);

		JLabel label_1 = new JLabel(loginPO.getName() + "，你好！");
		label_1.setBounds(600, 14, 100, 15);
		contentPane.add(label_1);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				perinfo = new PersonalInfomation(loginPO, main);
				perinfo.setBounds(new Rectangle(main.getX()+450, main.getY()+70,290, 215));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (perinfo.getMouseState() == true)
					perinfo.dispose();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				perinfo.setBounds(new Rectangle(main.getX()+450, main.getY()+70,290, 215));
				perinfo.setAlwaysOnTop(true);
				perinfo.setMouseState(false);
			}
		});

		JLabel label_2 = new JLabel("入库管理");
		label_2.setBounds(109, 172, 54, 15);
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
		btnNewButton.setBounds(62, 217, 160, 128);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("库存管理");
		lblNewLabel.setBounds(339, 172, 54, 15);
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
		btnNewButton_1.setBounds(290, 217, 160, 128);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("出库管理");
		lblNewLabel_1.setBounds(557, 172, 54, 15);
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
		btnNewButton_2.setBounds(507, 217, 160, 128);
		contentPane.add(btnNewButton_2);

	}

}
