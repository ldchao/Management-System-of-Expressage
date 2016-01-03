package nju.edu.presentation.courierui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import PO.LoginPO;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import nju.edu.VO.ReceiverVO;
import nju.edu.businesslogic.listinbl.Receiverinbl;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Receiver extends JPanel implements Runnable {

	JTextField[] textFields;
	JLabel label_11;
	private JTextArea textArea;
	private Receiverinbl receiverinbl;
	private LoginPO loginPO;
	private JFrame main;
	private Receiver receiverframe;
	private JLabel label_12;
	private boolean cleanSignal = false;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/courier/Receiver.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("static-access")
	public Receiver(JFrame main, LoginPO loginPO) {
		this.main = main;
		this.loginPO = loginPO;
		receiverinbl = new Receiverinbl();
		receiverframe = this;
		setBounds(300, 100, 750, 600);
		setVisible(true);
		setLayout(null);

		textFields = new JTextField[7];
		for (int i = 0; i < 7; i++) {
			textFields[i] = new JTextField(10);
			this.add(textFields[i]);
			textFields[i].setForeground(new Color(88, 93, 103));
			textFields[i].setCaretColor(new Color(88, 93, 103));
			textFields[i].setOpaque(false);
			textFields[i].setBorder(null);

		}
		textFields[0].setBounds(212, 162, 115, 26);

		textFields[1].setBounds(492, 162, 115, 26);

		textFields[2].setBounds(212, 204, 115, 26);

		textFields[3].setBounds(212, 286, 115, 26);

		textFields[4].setBounds(492, 286, 115, 26);

		textFields[5].setBounds(212, 328, 115, 26);

		textFields[6].setBounds(492, 328, 115, 26);

		JLabel lblHello = new JLabel("Hello!" + loginPO.getName());
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(655, 12, 100, 15);
		add(lblHello);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(212, 372, 395, 63);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		scrollPane.getViewport().setOpaque(false);
		add(scrollPane);

		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setBorder(null);
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);

		label_11 = new JLabel("点击选择日期");
		label_11.setBounds(492, 211, 115, 15);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser1.register(label_11);
		add(label_11);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 538, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		label_12 = new JLabel("\u72B6\u6001\u680F");
		label_12.setForeground(Color.WHITE);
		toolBar.add(label_12);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 显示确认按钮
				int n = JOptionPane.showConfirmDialog(null, "确认新建收件人信息单？",
						"no", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					ReceiverVO receiverVO = new ReceiverVO(textFields[0]
							.getText(), textFields[1].getText(), textFields[2]
							.getText(), label_11.getText(), textFields[3]
							.getText(), textFields[4].getText(), textFields[5]
							.getText(), textFields[6].getText(), textArea
							.getText());
					// function:judge whether the information is not complete
					boolean complete = receiverinbl.JudgeNull(receiverVO);
					if (complete == true) {
						boolean valid = receiverinbl.searchOrder(textFields[2]
								.getText());
						if (valid == false) {
							label_12.setText("此订单不存在");
						} else {
							receiverinbl.addReceiver(receiverVO);
							label_12.setText("新建成功");
							button.setEnabled(false);
							cleanSignal = true;
						}
					} else {
						label_12.setText("信息填写不完整，请补全信息");
					}
					Thread thread = new Thread(receiverframe);
					thread.start();
				}
			}
		});
		button.setBounds(274, 456, 52, 52);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button.getWidth(),
				button.getHeight(), image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button.setIcon(image2);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		add(button);

		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Courier newcourier = new Courier(main, loginPO);
				main.remove(receiverframe);
				main.getContentPane().add(newcourier);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});

		button_1.setBounds(13, -9, 63, 63);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_1.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});

		add(button_1);

		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "确认清空？", "no",
						JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					clean();
				}
			}
		});
		button_2.setBounds(423, 455, 52, 52);
		ImageIcon image3 = new ImageIcon("image/transparent_circle.png");
		Image temp3 = image3.getImage().getScaledInstance(button_2.getWidth(),
				button_2.getHeight(), image3.getImage().SCALE_DEFAULT);
		image3 = new ImageIcon(temp3);
		button_2.setIcon(image3);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		add(button_2);
	}

	public void clean() {
		main.remove(receiverframe);
		main.getContentPane().add(new Receiver(main, loginPO));
		main.repaint();
		main.invalidate();
		main.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		label_12.setText("状态栏");
		if (cleanSignal == true) {
			clean();
		}
	}
}
