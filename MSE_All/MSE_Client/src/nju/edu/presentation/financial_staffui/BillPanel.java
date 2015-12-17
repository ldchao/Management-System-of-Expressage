package nju.edu.presentation.financial_staffui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PO.LoginPO;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class BillPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BillPanel(LoginPO loginPO, JFrame main) {

		setLayout(null);
		setSize(750, 600);

		BillPanel bp = this;

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(677, 6, 67, 25);
		add(lblHello);

		JButton button_4 = new JButton("");
		button_4.setBounds(13, -9, 63, 63);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		ImageIcon image = new ImageIcon("image/transparent_circle.png");
		button_4.setIcon(image);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(bp);
				FmainPanel fm = new FmainPanel(loginPO, main);
				main.getContentPane().add(fm);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_4.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});
		add(button_4);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(166, 242, 160, 128);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		ImageIcon image2 = new ImageIcon("image/transparent_big.png");
		btnNewButton.setIcon(image2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(bp);
				NewbillPanel nbp = new NewbillPanel(loginPO,main);
				main.getContentPane().add(nbp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon("image/mask_big.png"));
			}
		});
		add(btnNewButton);

		JButton button = new JButton("");
		button.setBounds(424, 242, 160, 128);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		ImageIcon image3 = new ImageIcon("image/transparent_big.png");
		button.setIcon(image3);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(bp);
				CheckBillPanel cbp = new CheckBillPanel(loginPO,main);
				main.getContentPane().add(cbp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_big.png"));
			}
		});
		add(button);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/financial_stuff/billMain.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
}