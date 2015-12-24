package nju.edu.presentation.general_managerui;

import java.awt.Color;
import java.awt.Font;
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

public class editConstant extends JPanel {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JLabel label_4;

	public editConstant(ConstantVO vo, JFrame main, LoginPO loginPO) {
		editConstant editConstant = this;
		setBounds(100, 100, 750, 600);
		setLayout(null);
		this.setVisible(true);

		JLabel label = new JLabel("\u5E38\u91CF\u5177\u4F53\u4FE1\u606F");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label.setBounds(307, 65, 99, 15);
		add(label);

		JLabel label_1 = new JLabel("\u4EF7\u683C\uFF08\u5143/\u516C\u91CC\uFF09\uFF1A");
		label_1.setBounds(214, 274, 107, 15);
		add(label_1);

		JLabel label_2 = new JLabel("\u8DDD\u79BB(\u516C\u91CC)\uFF1A");
		label_2.setBounds(214, 201, 107, 15);
		add(label_2);

		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "确认修改？", "no", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					ConstantPolicybl constantPolicybl = new ConstantPolicybl();
					if (textField_2.getText().equals("") || textField_3.getText().equals("")) {
						label_4.setText("信息不完整，请补全信息");
					} else {
						ConstantVO constantVO = new ConstantVO(textField.getText(), textField_1.getText(),
								Double.parseDouble(textField_2.getText()), Double.parseDouble(textField_3.getText()));
						constantPolicybl.editConstant(constantVO);
						ConstantVO newvo = constantPolicybl.checkConstant(textField.getText(), textField_1.getText());
						Constant constant = new Constant(newvo, main, loginPO);
						main.remove(editConstant);
						main.add(constant);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
					}
				}
			}
		});
		button.setBounds(274, 459, 52, 52);
		ImageIcon image1 = new ImageIcon("image/transparent_circle.png");
		Image temp1 = image1.getImage().getScaledInstance(button.getWidth(), button.getHeight(),
				image1.getImage().SCALE_DEFAULT);
		image1 = new ImageIcon(temp1);
		button.setIcon(image1);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		add(button);

		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Constant constant = new Constant(vo, main, loginPO);
				main.remove(editConstant);
				main.add(constant);
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
		textField.setBounds(317, 129, 120, 21);
		textField.setText(vo.getAddress1());
		textField.setEditable(false);
		textField.setForeground(new Color(88, 93, 103));
		textField.setCaretColor(new Color(88, 93, 103));
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setText(vo.getAddress2());
		textField_1.setColumns(10);
		textField_1.setBounds(472, 129, 120, 21);
		textField_1.setEditable(false);
		textField_1.setForeground(new Color(88, 93, 103));
		textField_1.setCaretColor(new Color(88, 93, 103));
		add(textField_1);

		JLabel label_3 = new JLabel("\u5730\u70B9\uFF1A");
		label_3.setBounds(214, 132, 54, 15);
		add(label_3);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(8, 543, 750, 35);
		toolBar.setOpaque(false);
		toolBar.setBorder(null);
		add(toolBar);

		label_4 = new JLabel("\u72B6\u6001");
		toolBar.add(label_4);

		JLabel label_5 = new JLabel("\u81F3");
		label_5.setBounds(450, 132, 12, 15);
		add(label_5);

		textField_2 = new JTextField(10);
		textField_2.setBounds(396, 198, 120, 21);
		textField_2.addKeyListener(new InputNumber());
		textField_2.setForeground(new Color(88, 93, 103));
		textField_2.setCaretColor(new Color(88, 93, 103));
		add(textField_2);

		textField_3 = new JTextField(10);
		textField_3.setBounds(396, 271, 120, 21);
		textField_3.addKeyListener(new InputNumber());
		textField_3.setForeground(new Color(88, 93, 103));
		textField_3.setCaretColor(new Color(88, 93, 103));
		add(textField_3);

		JButton button2 = new JButton("取消");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editConstant newedEditConstant = new editConstant(vo, main, loginPO);
				main.remove(editConstant);
				main.getContentPane().add(newedEditConstant);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});

		button2.setBounds(425, 459, 52, 52);
		ImageIcon image2 = new ImageIcon("image/transparent_circle.png");
		Image temp2 = image2.getImage().getScaledInstance(button2.getWidth(), button2.getHeight(),
				image2.getImage().SCALE_DEFAULT);
		image2 = new ImageIcon(temp2);
		button2.setIcon(image2);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		add(button2);

	}
}
