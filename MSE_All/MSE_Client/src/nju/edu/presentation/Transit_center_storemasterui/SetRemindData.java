package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import nju.edu.businesslogic.storebl.Inventory_managementBL;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementBLService;
import PO.LoginPO;

public class SetRemindData extends JPanel {
	private JTextField[] textField;
	private int areaNum = -1;
	String remindData;
	JComboBox comboBox;

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/TransitCenterStoreMaster/SetRemindData.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
	public SetRemindData(JFrame m, JPanel jp, LoginPO loginPO) {
		JFrame main = m;
		JPanel lastui = jp;
		SetRemindData nowPanel = this;
		textField = new JTextField[2];
		for (int i = 0; i < 2; i++) {
			textField[i] = new JTextField();
			add(textField[i]);
			textField[i].setColumns(10);
			textField[i].setOpaque(false);
			textField[i].setBorder(null);
			textField[i].setForeground(new Color(88, 93, 103));
			textField[i].setCaretColor(new Color(88, 93, 103));
		}
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		setLayout(null);
		Inventory_managementBLService ib = new Inventory_managementBL();

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

		textField[0].setEditable(false);
		textField[0].setBounds(410, 302, 138, 27);
		textField[0].setForeground(new Color(255, 255, 255,200));

		textField[1].addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!(Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '.')) {
					e.consume();
				}
			}
		});
		textField[1].setBounds(404, 383, 138, 27);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		JLabel lblNewLabel_6 = new JLabel("状态栏");
		lblNewLabel_6.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel_6);

		String[] area = { "", "航运区一排", "航运区二排", "航运区三排", "铁运区一排", "铁运区二排",
				"铁运区三排", "汽运区一排", "汽运区二排", "汽运区三排", "汽运区四排01架", "汽运区四排02架",
				"汽运区四排03架", "汽运区四排04架", "汽运区四排05架", "汽运区四排06架", "汽运区四排07架",
				"汽运区四排08架", "汽运区四排09架", "汽运区四排10架", "汽运区四排11架", "汽运区四排12架",
				"汽运区四排13架", "汽运区四排14架", "汽运区四排15架", "汽运区四排16架", "汽运区四排17架",
				"汽运区四排18架", "汽运区四排19架", "汽运区四排20架", };
		comboBox = new JComboBox(area);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String selectedArea = (String) comboBox.getSelectedItem();
					if (!selectedArea.equals("")) {
						for (int i = 0; i < area.length; i++) {
							if (selectedArea.equals(area[i])) {
								areaNum = i - 1;
								break;
							}
						}
						remindData = ib.getRemindData(areaNum);
						textField[0].setText(remindData);
					}
				}
			}
		});
		comboBox.setBounds(398, 223, 140, 27);
		add(comboBox);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(273, 468, 52, 52);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String new_remindData = textField[1].getText();
				if (new_remindData.length() == 0) {
					lblNewLabel_6.setText("未输入数值！");
				} else {
					double true_warnData = Double.parseDouble(new_remindData);
					if (true_warnData > 0 && true_warnData < 1) {
						ib.setRemindData(areaNum, new_remindData);
						lblNewLabel_6.setText("设置成功！");
					} else {
						lblNewLabel_6.setText("请输入正确的数值！");
					}
				}
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
		btnNewButton_2.setBounds(424, 468, 52, 52);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetRemindData sr = new SetRemindData(main, lastui, loginPO);
				main.remove(nowPanel);
				main.getContentPane().add(sr);
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
}
