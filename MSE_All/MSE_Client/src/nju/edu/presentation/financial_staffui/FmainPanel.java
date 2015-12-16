package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import nju.edu.presentation.Loginui.PersonalInfomation;
import PO.LoginPO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FmainPanel extends JPanel implements Runnable {
	private JLabel label_6;
	private Thread t;
	private PersonalInfomation perinfo;

	/**
	 * Create the panel.
	 */
	public FmainPanel(LoginPO loginPO, JFrame main) {
		setLayout(null);
		setSize(750, 600);

		FmainPanel fmp = this;

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setForeground(Color.WHITE);
		lblHello.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				perinfo = new PersonalInfomation(loginPO, main);
				perinfo.setLocation(600, 115);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (perinfo.getMouseState() == true)
					perinfo.dispose();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				perinfo.setLocation(600, 115);
				perinfo.setAlwaysOnTop(true);
				perinfo.setMouseState(false);
			}
		});
		lblHello.setBounds(667, 9, 54, 18);
		add(lblHello);

		JButton btnNewButton = new JButton(){
//			@Override
//			protected void paintComponent(Graphics g) {
//				BufferedImage image = new BufferedImage(125, 100, BufferedImage.TYPE_4BYTE_ABGR_PRE);
//				try {
//					image = ImageIO.read(new File("image/financial_stuff/costManage.png"));
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				Graphics2D g2d = image.createGraphics();
////				Graphics2D g2d = (Graphics2D)g;
//				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
//				g2d.drawImage(image.getScaledInstance(125, 100, Image.SCALE_SMOOTH), 0, 0, null); 
//				super.paintComponent(g2d);
//			}
//			
		};
		btnNewButton.setBounds(122, 191, 125, 100);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		
		ImageIcon icon = new ImageIcon("image/transparent_small.png");
//		Image temp = icon.getImage().getScaledInstance(btnNewButton.getWidth(),
//				 btnNewButton.getHeight(),icon.getImage().SCALE_DEFAULT);
//		icon = new ImageIcon(temp);
		btnNewButton.setIcon(icon);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(fmp);
				PayPanel paymain = new PayPanel(loginPO, main);
				main.getContentPane().add(paymain);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon("image/mask_small.png"));
			}
		});
		add(btnNewButton);

		JButton button = new JButton();
		button.setBounds(312, 191, 125, 100);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		ImageIcon icon2 = new ImageIcon("image/transparent_small.png");
		button.setIcon(icon2);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(fmp);
				CalculatePanel calp = new CalculatePanel(loginPO, main);
				main.getContentPane().add(calp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_small.png"));
			}
		});
		add(button);

		JButton button_1 = new JButton();
		button_1.setBounds(504, 191, 125, 100);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		ImageIcon icon3 = new ImageIcon("image/transparent_small.png");
		Image temp3 = icon3.getImage().getScaledInstance(button_1.getWidth(),
				 button_1.getHeight(),icon3.getImage().SCALE_DEFAULT);
		icon3 = new ImageIcon(temp3);
		button_1.setIcon(icon3);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(fmp);
				StatisticsPanel stp = new StatisticsPanel(loginPO, main);
				main.getContentPane().add(stp);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_1.setIcon(new ImageIcon("image/mask_small.png"));
			}
		});
		add(button_1);

		JButton button_2 = new JButton();
		button_2.setBounds(218, 360, 125, 100);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		ImageIcon icon4 = new ImageIcon("image/transparent_small.png");
		Image temp4 = icon4.getImage().getScaledInstance(button_2.getWidth(),
				 button_2.getHeight(),icon4.getImage().SCALE_DEFAULT);
		icon4 = new ImageIcon(temp4);
		button_2.setIcon(icon4);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(fmp);
				BillPanel billPanel = new BillPanel(loginPO, main);
				main.getContentPane().add(billPanel);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_2.setIcon(new ImageIcon("image/mask_small.png"));
			}
		});
		add(button_2);

		label_6 = new JLabel("");
		label_6.setForeground(Color.RED);
		label_6.setBounds(381, 447, 211, 15);
		add(label_6);

		JButton button_3 = new JButton();
		button_3.setBounds(410, 360, 125, 100);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		ImageIcon icon5 = new ImageIcon("image/transparent_small.png");
		Image temp5 = icon5.getImage().getScaledInstance(button_3.getWidth(),
				 button_3.getHeight(),icon5.getImage().SCALE_DEFAULT);
		icon5 = new ImageIcon(temp5);
		button_3.setIcon(icon5);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (loginPO.getLimit().equals("高级财务人员")) {
					main.remove(fmp);
					AccountPanel acp = new AccountPanel(loginPO, main);
					main.getContentPane().add(acp);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				} else {
					label_6.setText("对不起，仅高级财务人员有此权限");
					t = new Thread(fmp);
					t.start();
				}
			}
			
			
		});
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_3.setIcon(new ImageIcon("image/mask_small.png"));
			}
		});
		add(button_3);

		JButton button_4 = new JButton("");
		button_4.setBounds(14, -9, 63, 63);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		ImageIcon icon6 = new ImageIcon("image/transparent_circle.png");
		Image temp6 = icon6.getImage().getScaledInstance(button_4.getWidth(),
				 button_4.getHeight(),icon6.getImage().SCALE_DEFAULT);
		icon6 = new ImageIcon(temp6);
		button_4.setIcon(icon6);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.dispose();
			}
		});
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_4.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});
		add(button_4);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		label_6.setText("");
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		ImageIcon icon = new ImageIcon("image/financial_stuff/financeMain1.png");
		g.drawImage(icon.getImage(), 0, 0, getSize().width, getSize().height, this);
//		super.paintComponent(g);
	}
}
