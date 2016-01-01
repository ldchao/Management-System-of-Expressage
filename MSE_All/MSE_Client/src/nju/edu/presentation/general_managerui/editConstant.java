package nju.edu.presentation.general_managerui;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;
import nju.edu.VO.ConstantVO;
import nju.edu.businesslogic.policybl.ConstantPolicybl;
import nju.edu.presentation.courierui.InputNumber;

@SuppressWarnings("serial")
public class editConstant extends JPanel {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JLabel label_4;

	protected void paintComponent(Graphics g) {
		ImageIcon image = new ImageIcon("image/generalManager/editConstant.png");
		g.drawImage(image.getImage(), 0, 0, getSize().width, getSize().height,
				this);
	}

	@SuppressWarnings("static-access")
	public editConstant(ConstantVO vo, JFrame main, LoginPO loginPO) {
		editConstant editConstant = this;
		setBounds(100, 100, 750, 600);
		setLayout(null);
		this.setVisible(true);

		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "确认修改？", "no",
						JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					ConstantPolicybl constantPolicybl = new ConstantPolicybl();
					if (textField_2.getText().equals("")
							|| textField_3.getText().equals("")) {
						label_4.setText("信息不完整，请补全信息");
					} else {
						ConstantVO constantVO = new ConstantVO(textField
								.getText(), textField_1.getText(), Double
								.parseDouble(textField_2.getText()), Double
								.parseDouble(textField_3.getText()));
						constantPolicybl.editConstant(constantVO);
						ConstantVO newvo = constantPolicybl.checkConstant(
								textField.getText(), textField_1.getText());
						Constant constant = new Constant(newvo, main, loginPO);
						main.remove(editConstant);
						main.getContentPane().add(constant);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
					}
				}
			}
		});
		button.setBounds(284, 418, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button.getWidth(),
				button.getHeight(), image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button.setIcon(image1);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		add(button);

		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Constant constant = new Constant(vo, main, loginPO);
				main.remove(editConstant);
				main.getContentPane().add(constant);
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

		textField = new JTextField();
		textField.setBounds(336, 223, 63, 21);
		textField.setText(vo.getAddress1());
		textField.setEditable(false);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		textField.setOpaque(false);
		textField.setBorder(null);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setText(vo.getAddress2());
		textField_1.setColumns(10);
		textField_1.setBounds(479, 223, 52, 21);
		textField_1.setEditable(false);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		add(textField_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 540, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		label_4 = new JLabel("\u72B6\u6001\u680F");
		label_4.setForeground(Color.WHITE);
		toolBar.add(label_4);

		textField_2 = new JTextField(10);
		textField_2.setBounds(391, 286, 120, 21);
		textField_2.addKeyListener(new InputNumber());
		textField_2.setForeground(new Color(88, 93, 103));
		textField_2.setCaretColor(new Color(88, 93, 103));
		textField_2.setOpaque(false);
		textField_2.setBorder(null);
		add(textField_2);

		textField_3 = new JTextField(10);
		textField_3.setBounds(391, 346, 120, 21);
		textField_3.addKeyListener(new InputNumber());
		textField_3.setForeground(new Color(88, 93, 103));
		textField_3.setCaretColor(new Color(88, 93, 103));
		textField_3.setOpaque(false);
		textField_3.setBorder(null);
		add(textField_3);

		JButton button2 = new JButton("取消");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editConstant newedEditConstant = new editConstant(vo, main,
						loginPO);
				main.remove(editConstant);
				main.getContentPane().add(newedEditConstant);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});

		button2.setBounds(415, 418, 52, 52);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button2.getWidth(),
				button2.getHeight(), image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button2.setIcon(image2);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		add(button2);

	}
}
