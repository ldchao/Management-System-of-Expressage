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
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class PayPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public PayPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);

		PayPanel pp = this;

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(661, 13, 71, 18);
		add(lblHello);

		JButton button_4 = new JButton();
		button_4.setBounds(14, -9, 63, 63);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		ImageIcon icon = new ImageIcon("image/transparent_circle.png");
		button_4.setIcon(icon);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(pp);
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

		JButton button = new JButton();
		button.setBounds(86, 242, 160, 128);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		ImageIcon icon1 = new ImageIcon("image/transparent_big.png");
		button.setIcon(icon1);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(pp);
				NewPayorderPanel npf = new NewPayorderPanel(loginPO, main);
				main.getContentPane().add(npf);
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

		JButton button_1 = new JButton();
		button_1.setBounds(295, 242, 160, 128);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		ImageIcon icon2 = new ImageIcon("image/transparent_big.png");
		button_1.setIcon(icon2);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(pp);
				CheckPayorderPanel cpf = new CheckPayorderPanel(loginPO, main);
				main.getContentPane().add(cpf);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_1.setIcon(new ImageIcon("image/mask_big.png"));
			}
			
		});
		add(button_1);

		JButton button_2 = new JButton();
		button_2.setBounds(503, 242, 160, 128);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		ImageIcon icon3 = new ImageIcon("image/transparent_big.png");
		button_2.setIcon(icon3);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(pp);
				ProfitPanel pfp = new ProfitPanel(loginPO, main);
				main.getContentPane().add(pfp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_2.setIcon(new ImageIcon("image/mask_big.png"));
			}
			
		});
		add(button_2);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/financial_stuff/paymain.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
}