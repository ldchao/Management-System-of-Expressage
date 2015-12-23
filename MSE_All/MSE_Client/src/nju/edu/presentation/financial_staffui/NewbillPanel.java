package nju.edu.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTextArea;

import java.awt.Graphics;
import java.awt.Image;

import PO.LoginPO;
import nju.edu.businesslogic.billbl.BillBL;

import java.awt.Color;

@SuppressWarnings("serial")
public class NewbillPanel extends JPanel implements Runnable {
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	private boolean success;
	private JLabel lblNewLabel;
	BillBL billBL = new BillBL();

	/**
	 * Create the panel.
	 * 
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon(
				"image/financial_stuff/initialNewBill.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings("static-access")
	public NewbillPanel(LoginPO loginPO, JFrame main) {
		success = false;
		setLayout(null);
		setSize(750, 600);

		NewbillPanel nbp = this;

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JButton button_4 = new JButton("");
		button_4.setBounds(13, -9, 63, 63);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_4.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nbp);
				BillPanel bp = new BillPanel(loginPO, main);
				main.getContentPane().add(bp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		add(button_4);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		toolBar.setEnabled(false);
		add(toolBar);

		lblNewLabel = new JLabel("状态栏");
		lblNewLabel.setForeground(Color.WHITE);
		toolBar.add(lblNewLabel);

		textField = new JTextField();
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setBounds(213, 185, 140, 21);
		add(textField);
		textField.setColumns(10);
		JScrollPane jsp = new JScrollPane();
		jsp.setOpaque(false);
		jsp.setBorder(null);
		jsp.getViewport().setOpaque(false);
		jsp.setBounds(213, 234, 140, 77);
		add(jsp);

		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setBorder(null);
		textArea.setForeground(new Color(88, 93, 103));
		textArea.setCaretColor(new Color(88, 93, 103));
		jsp.setViewportView(textArea);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setBounds(495, 185, 132, 21);
		add(textField_1);
		JScrollPane jsp1 = new JScrollPane();
		jsp1.setOpaque(false);
		jsp1.setBorder(null);
		jsp1.getViewport().setOpaque(false);
		jsp1.setBounds(494, 234, 132, 77);
		add(jsp1);

		textArea_1 = new JTextArea();
		textArea_1.setOpaque(false);
		textArea_1.setBorder(null);
		textArea_1.setForeground(new Color(88, 93, 103));
		textArea_1.setCaretColor(new Color(88, 93, 103));
		jsp1.setViewportView(textArea_1);
		JScrollPane jsp2 = new JScrollPane();
		jsp2.setOpaque(false);
		jsp2.getViewport().setOpaque(false);
		jsp2.setBorder(null);
		jsp2.setBounds(213, 340, 140, 77);
		add(jsp2);

		textArea_2 = new JTextArea();
		textArea_2.setOpaque(false);
		textArea_2.setBorder(null);
		textArea_2.setForeground(new Color(88, 93, 103));
		textArea_2.setCaretColor(new Color(88, 93, 103));
		jsp2.setViewportView(textArea_2);
		JScrollPane jsp3 = new JScrollPane();
		jsp3.setOpaque(false);
		jsp3.getViewport().setOpaque(false);
		jsp3.setBorder(null);
		jsp3.setBounds(494, 340, 132, 77);
		add(jsp3);

		textArea_3 = new JTextArea();
		textArea_3.setOpaque(false);
		textArea_3.setBorder(null);
		textArea_3.setForeground(new Color(88, 93, 103));
		textArea_3.setCaretColor(new Color(88, 93, 103));
		jsp3.setViewportView(textArea_3);

		JButton button = new JButton();
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String name = textField.getText();
				String account = textField_1.getText();
				String organization = textArea.getText();
				String staff = textArea_1.getText();
				String vehicle = textArea_2.getText();
				String store = textArea_3.getText();

				if (name.equals("") || account.equals("")
						|| organization.equals("") || staff.equals("")
						|| vehicle.equals("") || store.equals("")
						|| name.replaceAll(" ", "").equals("")
						|| account.replaceAll(" ", "").equals("")
						|| organization.replaceAll(" ", "").equals("")
						|| staff.replaceAll(" ", "").equals("")
						|| vehicle.replaceAll(" ", "").equals("")
						|| store.replaceAll(" ", "").equals("")) {
					
					lblNewLabel.setText("信息录入不完整，无法完成新建");
					success = false;
				} else {
					billBL.addBill(name, account, organization, staff, vehicle,
							store);
					lblNewLabel.setText("创建成功！"); // 目标在线程前执行
					success = true;
				}

				Thread t = new Thread(nbp);
				t.start();
			}
		});
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		button.setBounds(274, 459, 52, 52);
		Image temp1 = image1.getImage().getScaledInstance(button.getWidth(),
				button.getHeight(), image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button.setIcon(image1);
		add(button);

		JButton button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textArea.setText("");
				textArea_1.setText("");
				textArea_2.setText("");
				textArea.setText("");
				lblNewLabel.setText("状态栏 ");
			}
		});
		ImageIcon image = new ImageIcon("image/transparent_circle.png");
		button_1.setBounds(425, 459, 52, 52);
		Image temp = image1.getImage().getScaledInstance(button_1.getWidth(),
				button_1.getHeight(), image.getImage().SCALE_DEFAULT);
		image = new ImageIcon(temp);
		button_1.setIcon(image);
		add(button_1);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (success) {
			textField.setText("");
			textField_1.setText("");
			textArea.setText("");
			textArea_1.setText("");
			textArea_2.setText("");
			textArea_3.setText("");
		}

		lblNewLabel.setText("状态栏");
	}
}
