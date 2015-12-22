package nju.edu.presentation.financial_staffui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;

@SuppressWarnings("serial")
public class CalculatePanel extends JPanel implements Runnable {
	private JTextField textField;
	private JLabel label_2;
	private Thread t;

	/**
	 * Create the panel.
	 */
	@Override
	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/financial_stuff/calculate.png");
		g.drawImage(image.getImage(), 0, 0,getSize().width,getSize().height, this);
	}
	
	public CalculatePanel(LoginPO loginPO, JFrame main) {

		CalculatePanel cp = this;
		setLayout(null);
		setSize(750, 600);

		JLabel lblHello = new JLabel("Hello! "+loginPO.getName());
		lblHello.setBounds(655, 12, 100, 15);
		lblHello.setForeground(Color.WHITE);
		add(lblHello);

		JButton button_4 = new JButton();
		button_4.setBounds(13, -9, 63, 63);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(cp);
				FmainPanel fm = new FmainPanel(loginPO, main);
				main.getContentPane().add(fm);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button_4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				button_4.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});
		add(button_4);

		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel showDate2 = new JLabel("请单击选择日期");
		showDate2.setForeground(new Color(255, 255, 255, 200));
		showDate2.setBounds(328, 312, 93, 34);
		dateChooser2.register(showDate2);
		add(showDate2);

		textField = new JTextField(" 请输入营业厅编号");
		textField.setForeground(new Color(88, 93, 103, 200));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setBounds(283, 248, 190, 35);
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setForeground(new Color(88, 93, 103));
				textField.setText("");
			}
		});
		add(textField);
		textField.setColumns(10);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		toolBar.setEnabled(false);
		add(toolBar);

		label_2 = new JLabel("\u72B6\u6001\u680F");
		label_2.setForeground(Color.WHITE);
		toolBar.add(label_2);

		JButton button = new JButton();
		button.setBounds(349, 402, 52, 52);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String date = showDate2.getText();
				String shop = textField.getText();
				if (!date.equals("请单击选择日期") && !shop.equals("")) {
					main.remove(cp);
					CheckPayeePanel cpep = new CheckPayeePanel(main, loginPO,
							date, shop);
					main.getContentPane().add(cpep);
					main.invalidate();
					main.repaint();
					main.setVisible(true);
				} else {
					label_2.setText("请输入营业厅编号并选择日期后确认");
					t = new Thread(cp);
					t.start();
				}
			}
		});
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button.getWidth(),
						button.getHeight(),image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button.setIcon(image1);
		add(button);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		label_2.setText("状态栏");

	}
}