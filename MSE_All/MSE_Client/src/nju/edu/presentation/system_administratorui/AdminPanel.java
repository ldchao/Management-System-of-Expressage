package nju.edu.presentation.system_administratorui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import nju.edu.presentation.Loginui.PersonalInfomation;
import PO.LoginPO;

@SuppressWarnings("serial")
public class AdminPanel extends JPanel {
	private PersonalInfomation perinfo;

	/**
	 * Create the panel.
	 */
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/system_stuff/adminPanel.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width,getSize().height,this);
	}
	
	public AdminPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);
		setSize(750, 600);

		AdminPanel adp = this;

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
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
		add(lblHello);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(adp);
				NewUserPanel nup = new NewUserPanel(loginPO, main);
				main.getContentPane().add(nup);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		ImageIcon image2 = new ImageIcon("image/transparent_big.png");
		btnNewButton.setIcon(image2);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon("image/mask_big"));
			}
		});
		btnNewButton.setBounds(166, 242, 160, 128);
		add(btnNewButton);

		JButton button_4 = new JButton();
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
			}
		});
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
		add(button_4);

		JButton button = new JButton("");
		button.setBounds(424, 242, 160, 128);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		ImageIcon image3 = new ImageIcon("image/transparent_big.png");
		button.setIcon(image3);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(adp);
				CheckUserPanel cup = new CheckUserPanel(loginPO, main);
				main.getContentPane().add(cup);
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

}
