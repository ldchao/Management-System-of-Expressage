package nju.edu.presentation.financial_staffui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.businesslogic.financebl.PayorderBL;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class NewPayorderPanel extends JPanel implements Runnable {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JLabel lblNewLabel;
	private boolean success;
	PayorderBL payorderBL = new PayorderBL();

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("static-access")
	public NewPayorderPanel(LoginPO loginPO, JFrame main) {
		success = false;
		setLayout(null);
		setSize(750, 600);

		NewPayorderPanel npp = this;

		JLabel lblHello = new JLabel("Hello! " + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JButton button_4 = new JButton();
		button_4.setBounds(13, -9, 63, 63);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		ImageIcon icon = new ImageIcon("image/transparent_circle.png");
		button_4.setIcon(icon);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(npp);
				PayPanel pp = new PayPanel(loginPO, main);
				main.getContentPane().add(pp);
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

		textField = new JTextField();
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		textField.setBounds(218, 143, 137, 27);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(218, 185, 137, 27);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.setColumns(10);
		add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBounds(498, 143, 133, 27);
		textField_2.setForeground(new Color(88, 93, 103));
		textField_2.setCaretColor(new Color(88, 93, 103));
		textField_2.setOpaque(false);
		textField_2.setBorder(null);
		textField_2.setColumns(10);
		add(textField_2);

		textField_3 = new JTextField();
		textField_3.setBounds(498, 185, 133, 27);
		textField_3.setColumns(10);
		textField_3.setForeground(new Color(88, 93, 103));
		textField_3.setCaretColor(new Color(88, 93, 103));
		textField_3.setOpaque(false);
		textField_3.setBorder(null);
		add(textField_3);
		Date dt = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		textField_3.setText(date.format(dt));

		JToolBar toolBar = new JToolBar();

		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		toolBar.setEnabled(false);
		add(toolBar);

		lblNewLabel = new JLabel("状态栏");
		lblNewLabel.setForeground(new Color(255, 255, 255, 200));
		toolBar.add(lblNewLabel);

		JScrollPane jsp = new JScrollPane();
		jsp.setOpaque(false);
		jsp.getViewport().setOpaque(false);
		jsp.setBorder(null);
		jsp.setBounds(218, 237, 409, 79);
		add(jsp);

		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setBorder(null);
		textArea.setForeground(new Color(88, 93, 103));
		jsp.setViewportView(textArea);
		JScrollPane jsp2 = new JScrollPane();
		jsp2.setBounds(218, 344, 409, 79);
		jsp2.setOpaque(false);
		jsp2.setBorder(null);
		jsp2.getViewport().setOpaque(false);
		add(jsp2);

		textArea_1 = new JTextArea();
		textArea_1.setOpaque(false);
		textArea_1.setBorder(null);
		textArea_1.setForeground(new Color(88, 93, 103));
		jsp2.setViewportView(textArea_1);

		JButton button = new JButton();
		button.setBounds(274, 459, 52, 52);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp = image2.getImage().getScaledInstance(button.getWidth(),
				button.getHeight(), image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp);
		button.setIcon(image2);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double money = 0;
				if (!textField.getText().equals(""))
					money = Double.parseDouble(textField.getText());
				String payname = textField_1.getText();
				String payaccount = textField_2.getText();
				String date = textField_3.getText();
				String list = textArea.getText();
				String comment = textArea_1.getText();

				if (payname.equals("") || payaccount.equals("")
						|| date.equals("") || list.equals("")
						|| comment.equals("")
						|| payname.replaceAll(" ", "").equals("")
						|| payaccount.replaceAll(" ", "").equals("")
						|| date.replaceAll(" ", "").equals("")
						|| list.replaceAll(" ", "").equals("")
						|| comment.replaceAll(" ", "").equals("")) {
					
					lblNewLabel.setText("信息录入不完整，无法完成新建");
					success = false;
				} else {
					payorderBL.addPayorder(money, date, payname, payaccount,
							list, comment);
					lblNewLabel.setText("创建成功！");
					success = true;
				}

				Thread t = new Thread(npp);
				t.start();
			}
		});
		add(button);

		JButton button_1 = new JButton();
		button_1.setBounds(425, 459, 52, 52);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button_1.getWidth(),
				button_1.getHeight(), image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button_1.setIcon(image1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textArea.setText("");
				textArea_1.setText("");
				lblNewLabel.setText("状态栏");
			}
		});
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
			textField_2.setText("");
			textArea_1.setText("");
		}

		lblNewLabel.setText("状态栏");
	}

	@Override
	protected void paintComponent(Graphics g) {
		ImageIcon icon = new ImageIcon("image/financial_stuff/newPay.png");
		g.drawImage(icon.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}
}
