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
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AccountPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AccountPanel(LoginPO loginPO, JFrame main) {
		setSize(750, 600);
		setLayout(null);

		AccountPanel accountPanel = this;

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setForeground(Color.white);
		lblHello.setBounds(677, 6, 67, 25);
		add(lblHello);

		JButton button_4 = new JButton();
		button_4.setBounds(13, -9, 63, 63);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		button_4.setIcon(image1);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(accountPanel);
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
				button_4.setIcon(new ImageIcon("image/mask_circle"));
			}
		});
		add(button_4);

		JButton button_1 = new JButton();
		button_1.setBounds(166, 242, 160, 128);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		ImageIcon image2 = new ImageIcon("image/transparent_big.png");
		button_1.setIcon(image2);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(accountPanel);
				NewAccountPanel nacp = new NewAccountPanel(loginPO, main);
				main.getContentPane().add(nacp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_1.setIcon(new ImageIcon("image/mask_big"));
			}
		});
		add(button_1);

		JButton button = new JButton();
		button.setBounds(424, 242, 160, 128);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		ImageIcon image3 = new ImageIcon("image/transparent_big.png");
		button.setIcon(image3);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(accountPanel);
				CheckAccountPanel cap = new CheckAccountPanel(loginPO, main);
				main.getContentPane().add(cap);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_big"));
			}
		});
		add(button);

	}
	@Override
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/financial_stuff/accountMain.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
}