package nju.edu.presentation.Business_hall_salesmanui;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;

import nju.edu.VO.OrderVO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class ChecklistImfo extends JPanel {

	/*
	 * method:Frebin function:interface of record the order
	 */
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel lblkg;
	private JLabel lblcm;
	private JLabel lblcm_1;
	private JLabel lblcm_2;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JButton button_1;
	private JLabel carrier;
	private JLabel orderID;
	private JLabel status;
	private JLabel sender;
	private JLabel sendPhone;
	private JLabel sendCell;
	private JLabel sendCompany;
	private JLabel sendAddress;
	private JLabel thing;
	private JLabel weight;
	private JLabel length;
	private JLabel width;
	private JLabel height;
	private JLabel receiver;
	private JLabel receiPhone;
	private JLabel receiCell;
	private JLabel receiCompany;
	private JLabel receiAddress;
	private JLabel num;
	private JLabel category;
	private JLabel pack;
	private JLabel payment;
	private JLabel arriveTime;
	private JLabel trace;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/courier/OrderShow.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ChecklistImfo(JFrame m, JPanel bf) {
		JFrame main = m;
		ChecklistImfo contentPane = this;
		this.setBounds(0, 0, 712, 571);
		this.setVisible(true);
		this.setLayout(null);

		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u5BC4\u4EF6\u4EBA\u4FE1\u606F");
		label.setBounds(153, 145, 94, 15);
		label.setForeground(new Color(248, 179, 28));
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		contentPane.add(label);

		label_1 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F");
		label_1.setForeground(new Color(248, 179, 28));
		label_1.setBounds(411, 145, 94, 15);
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		contentPane.add(label_1);

		label_2 = new JLabel("\u59D3\u540D");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(153, 170, 54, 15);
		contentPane.add(label_2);

		label_3 = new JLabel("\u59D3\u540D");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(411, 172, 54, 15);
		contentPane.add(label_3);

		label_6 = new JLabel("\u8BA2\u5355\u53F7");
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(411, 80, 54, 15);
		contentPane.add(label_6);

		label_7 = new JLabel("\u7535\u8BDD");
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(153, 197, 54, 15);
		contentPane.add(label_7);

		label_8 = new JLabel("\u7535\u8BDD");
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(411, 197, 54, 15);
		contentPane.add(label_8);

		label_9 = new JLabel("\u624B\u673A");
		label_9.setForeground(Color.WHITE);
		label_9.setBounds(153, 224, 54, 15);
		contentPane.add(label_9);

		label_10 = new JLabel("\u624B\u673A");
		label_10.setForeground(Color.WHITE);
		label_10.setBounds(411, 224, 54, 15);
		contentPane.add(label_10);

		label_11 = new JLabel("\u5355\u4F4D");
		label_11.setForeground(Color.WHITE);
		label_11.setBounds(153, 251, 54, 15);
		contentPane.add(label_11);

		label_12 = new JLabel("\u5355\u4F4D");
		label_12.setForeground(Color.WHITE);
		label_12.setBounds(411, 251, 54, 15);
		contentPane.add(label_12);

		label_13 = new JLabel("\u5730\u5740");
		label_13.setForeground(Color.WHITE);
		label_13.setBounds(153, 278, 54, 15);
		contentPane.add(label_13);

		label_14 = new JLabel("\u5730\u5740");
		label_14.setForeground(Color.WHITE);
		label_14.setBounds(411, 278, 54, 15);
		contentPane.add(label_14);

		JLabel label_15 = new JLabel("\u6258\u8FD0\u7269\u4FE1\u606F");
		label_15.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		label_15.setForeground(new Color(248, 179, 28));
		label_15.setBounds(153, 305, 112, 15);
		contentPane.add(label_15);

		JLabel label_16 = new JLabel("\u7269\u54C1\u540D");
		label_16.setForeground(Color.WHITE);
		label_16.setBounds(153, 332, 54, 15);
		contentPane.add(label_16);

		JLabel label_17 = new JLabel("\u7269\u54C1\u6570");
		label_17.setForeground(Color.WHITE);
		label_17.setBounds(411, 332, 54, 15);
		contentPane.add(label_17);

		lblkg = new JLabel("\u7269\u54C1\u5B9E\u9645\u91CD\u91CF\uFF08kg\uFF09");
		lblkg.setForeground(Color.WHITE);
		lblkg.setBounds(153, 359, 123, 15);
		contentPane.add(lblkg);

		lblcm = new JLabel("\u7269\u54C1\u957F\u5EA6\uFF08cm\uFF09");
		lblcm.setForeground(Color.WHITE);
		lblcm.setBounds(153, 386, 99, 15);
		contentPane.add(lblcm);

		lblcm_1 = new JLabel("\u7269\u54C1\u5BBD\u5EA6\uFF08cm\uFF09");
		lblcm_1.setForeground(Color.WHITE);
		lblcm_1.setBounds(153, 413, 97, 15);
		contentPane.add(lblcm_1);

		lblcm_2 = new JLabel("\u7269\u54C1\u9AD8\u5EA6\uFF08cm\uFF09");
		lblcm_2.setForeground(Color.WHITE);
		lblcm_2.setBounds(153, 440, 106, 15);
		contentPane.add(lblcm_2);

		label_18 = new JLabel("\u5FEB\u9012\u79CD\u7C7B");
		label_18.setForeground(Color.WHITE);
		label_18.setBounds(411, 359, 54, 15);
		contentPane.add(label_18);

		@SuppressWarnings("unused")
		ButtonGroup bg1 = new ButtonGroup();

		label_19 = new JLabel("\u5305\u88C5\u79CD\u7C7B");
		label_19.setForeground(Color.WHITE);
		label_19.setBounds(411, 386, 54, 15);
		contentPane.add(label_19);

		@SuppressWarnings("unused")
		ButtonGroup bg2 = new ButtonGroup();

		label_20 = new JLabel("\u7269\u6D41\u4FE1\u606F");
		label_20.setForeground(new Color(248, 179, 28));
		label_20.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
		label_20.setBounds(153, 484, 63, 15);
		contentPane.add(label_20);

		label_21 = new JLabel("\u5BA1\u6279\u72B6\u6001");
		label_21.setForeground(Color.WHITE);
		label_21.setBounds(153, 105, 54, 15);
		contentPane.add(label_21);

		label_22 = new JLabel("\u9884\u8BA1\u9001\u8FBE\u65F6\u95F4");
		label_22.setForeground(Color.WHITE);
		label_22.setBounds(411, 440, 84, 15);
		contentPane.add(label_22);

		label_23 = new JLabel("\u4ED8\u6B3E");
		label_23.setForeground(Color.WHITE);
		label_23.setBounds(411, 413, 43, 15);
		contentPane.add(label_23);

		button_1 = new JButton("");
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBounds(13, -9, 63, 63);

		button_1.setIcon(new ImageIcon("image/transparent_circle.png"));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_1.setIcon(new ImageIcon("image/mask_circle.png"));
			}
		});

		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(contentPane);
				main.getContentPane().add(bf);
				main.invalidate();
				main.repaint();

			}
		});
		contentPane.add(button_1);

		label_5 = new JLabel("\u63FD\u4EF6\u4EBA");
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(153, 80, 54, 15);
		contentPane.add(label_5);

		carrier = new JLabel("New label");
		carrier.setForeground(Color.WHITE);
		carrier.setBounds(234, 79, 94, 16);
		contentPane.add(carrier);

		orderID = new JLabel("New label");
		orderID.setForeground(Color.WHITE);
		orderID.setBounds(477, 79, 106, 16);
		add(orderID);

		status = new JLabel("New label");
		status.setForeground(Color.WHITE);
		status.setBounds(234, 104, 94, 16);
		add(status);

		sender = new JLabel("New label");
		sender.setForeground(Color.WHITE);
		sender.setBounds(234, 169, 106, 16);
		add(sender);

		sendPhone = new JLabel("New label");
		sendPhone.setForeground(Color.WHITE);
		sendPhone.setBounds(234, 196, 94, 16);
		add(sendPhone);

		sendCell = new JLabel("New label");
		sendCell.setForeground(Color.WHITE);
		sendCell.setBounds(234, 223, 94, 16);
		add(sendCell);

		sendCompany = new JLabel("New label");
		sendCompany.setForeground(Color.WHITE);
		sendCompany.setBounds(234, 250, 94, 16);
		add(sendCompany);

		sendAddress = new JLabel("New label");
		sendAddress.setForeground(Color.WHITE);
		sendAddress.setBounds(234, 277, 165, 16);
		add(sendAddress);

		thing = new JLabel("New label");
		thing.setForeground(Color.WHITE);
		thing.setBounds(234, 331, 61, 16);
		add(thing);

		weight = new JLabel("New label");
		weight.setForeground(Color.WHITE);
		weight.setBounds(288, 358, 61, 16);
		add(weight);

		length = new JLabel("New label");
		length.setForeground(Color.WHITE);
		length.setBounds(288, 385, 61, 16);
		add(length);

		width = new JLabel("New label");
		width.setForeground(Color.WHITE);
		width.setBounds(288, 412, 61, 16);
		add(width);

		height = new JLabel("New label");
		height.setForeground(Color.WHITE);
		height.setBounds(288, 439, 61, 16);
		add(height);

		receiver = new JLabel("New label");
		receiver.setForeground(Color.WHITE);
		receiver.setBounds(477, 172, 84, 16);
		add(receiver);

		receiPhone = new JLabel("New label");
		receiPhone.setForeground(Color.WHITE);
		receiPhone.setBounds(477, 196, 84, 16);
		add(receiPhone);

		receiCell = new JLabel("New label");
		receiCell.setForeground(Color.WHITE);
		receiCell.setBounds(477, 223, 84, 16);
		add(receiCell);

		receiCompany = new JLabel("New label");
		receiCompany.setForeground(Color.WHITE);
		receiCompany.setBounds(477, 250, 84, 16);
		add(receiCompany);

		receiAddress = new JLabel("New label");
		receiAddress.setForeground(Color.WHITE);
		receiAddress.setBounds(477, 277, 140, 16);
		add(receiAddress);

		num = new JLabel("New label");
		num.setForeground(Color.WHITE);
		num.setBounds(477, 331, 84, 16);
		add(num);

		category = new JLabel("New label");
		category.setForeground(Color.WHITE);
		category.setBounds(477, 358, 84, 16);
		add(category);

		pack = new JLabel("New label");
		pack.setForeground(Color.WHITE);
		pack.setBounds(477, 385, 84, 16);
		add(pack);

		payment = new JLabel("New label");
		payment.setForeground(Color.WHITE);
		payment.setBounds(477, 412, 84, 16);
		add(payment);

		arriveTime = new JLabel("New label");
		arriveTime.setForeground(Color.WHITE);
		arriveTime.setBounds(507, 439, 94, 16);
		add(arriveTime);

		trace = new JLabel("New label");
		trace.setForeground(Color.WHITE);
		trace.setBounds(153, 514, 408, 28);
		add(trace);
	}

	public void show(OrderVO vo) {
		this.carrier.setText(vo.getCourier());
		this.orderID.setText(vo.getId());
		this.status.setText(vo.getState().toString());
		this.sender.setText(vo.getSender());
		this.sendPhone.setText(vo.getPhone1());
		this.sendCell.setText(vo.getCellphone1());
		this.sendCompany.setText(vo.getPosition1());
		this.sendAddress.setText(vo.getAddress1());
		this.thing.setText(vo.getItems());
		this.weight.setText(vo.getWeight() + "");
		this.length.setText(vo.getLength() + "");
		this.width.setText(vo.getWidth() + "");
		this.height.setText(vo.getHeight() + "");
		this.receiver.setText(vo.getReceiver());
		this.receiPhone.setText(vo.getPhone2());
		this.receiCell.setText(vo.getCellphone2());
		this.receiCompany.setText(vo.getPosition2());
		this.receiAddress.setText(vo.getAddress2());
		this.num.setText(vo.getCount() + "");
		this.category.setText(vo.getExpress().toString());
		this.pack.setText(vo.getPack().toString());
		this.payment.setText(vo.getBill() + "");
		this.arriveTime.setText(vo.getTime());
		this.trace.setText(vo.getTransformState());

	}
}
