package nju.edu.presentation.Loginui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import nju.edu.VO.OrderVO;
import nju.edu.businesslogic.checklistbl.ChecklistController;
import nju.edu.businesslogic.listinbl.Receiverinbl;
import nju.edu.presentation.Business_hall_salesmanui.ChecklistImfo;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;

@SuppressWarnings("serial")
public class ChecklistPanel extends JPanel implements Runnable {
	private JTextField textField;
	private ChecklistController checklistController;
	private Receiverinbl receiverinbl;
	private boolean isValid = false;
	private OrderVO vo = null;

	@SuppressWarnings("static-access")
	public ChecklistPanel(JFrame m, JPanel bf) {
		JFrame main = m;
		JPanel lastui = bf;
		ChecklistPanel nowPanel = this;
		setSize(750, 600);
		setLayout(null);

		JButton button = new JButton("");
		button.setBounds(13, -9, 63, 63);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		button.setIcon(image1);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button.setIcon(new ImageIcon("image/mask_cirlce.png"));
			}
		});
		add(button);

		JButton button2 = new JButton("");
		button2.setBounds(528, 254, 84, 84);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp = image2.getImage().getScaledInstance(button2.getWidth(),
				button2.getHeight(), image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp);
		button2.setIcon(image2);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				if (id.length() != 0) {
					receiverinbl = new Receiverinbl();
					isValid = receiverinbl.searchOrder(id);
				}
				if (isValid) {
					checklistController = new ChecklistController();
					vo = checklistController.getOrder(id);
					ChecklistImfo imfo = new ChecklistImfo(main, nowPanel);
					imfo.show(vo);
					main.remove(nowPanel);
					main.getContentPane().add(imfo);
					main.invalidate();
					main.repaint();

				} else {
					textField.setText("∂©µ•≤ª¥Ê‘⁄");
					textField.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 20));
					textField.setForeground(new Color(248, 179, 28, 200));
					Thread t = new Thread(nowPanel);
					t.start();
				}
			}
		});
		button2.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 20));
		add(button2);

		textField = new JTextField("«Î ‰»Î∂©µ•∫≈");
		textField.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 20));
		textField.setForeground(new Color(255, 255, 255, 100));
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 25));
				textField.setForeground(new Color(255, 255, 255, 200));
			}
		});
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setBounds(154, 267, 327, 55);
		textField.setCaretColor(new Color(248, 179, 28, 230));
		textField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String id = textField.getText();
					if (id.length() != 0) {
						receiverinbl = new Receiverinbl();
						isValid = receiverinbl.searchOrder(id);
					}
					if (isValid) {
						checklistController = new ChecklistController();
						vo = checklistController.getOrder(id);
						ChecklistImfo imfo = new ChecklistImfo(main, nowPanel);
						imfo.show(vo);
						main.remove(nowPanel);
						main.getContentPane().add(imfo);
						main.invalidate();
						main.repaint();

					} else {
						textField.setText("∂©µ•≤ª¥Ê‘⁄");
						textField.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 20));
						textField.setForeground(new Color(248, 179, 28, 200));
						Thread t = new Thread(nowPanel);
						t.start();
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
		textField.setColumns(10);
		this.add(textField);

	}

	@Override
	public void run() {
		try {
			Thread.sleep(1150);
			textField.setText("");
			textField.setForeground(new Color(255, 255, 255, 220));
			textField.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 28));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		ImageIcon icon = new ImageIcon("image/searchOrderMain.png");
		g.drawImage(icon.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}
}
