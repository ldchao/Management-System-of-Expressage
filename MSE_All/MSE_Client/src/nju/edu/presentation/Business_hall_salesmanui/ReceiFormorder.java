package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import nju.edu.VO.ArriverorderVO;
import nju.edu.VO.LoadorderVO;
import nju.edu.VO.ReceiFormVO;
import nju.edu.businesslogic.transferbl.ReceiFormBL;
import nju.edu.businesslogic.transferbl.ReceiveBL;
import nju.edu.businesslogicservice.transferblservice.ReceiFormBlService;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;
import nju.edu.presentation.financial_staffui.DateChooser;

public class ReceiFormorder extends JPanel {

	private JTextField textField;
	private JTextField textField_1;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton_2;
	JFrame main;
	LoadorderVO lv;

	/**
	 * Create the panel.
	 */
	public ReceiFormorder(JFrame m, JPanel jp, LoadorderVO lv) {
		main = m;
		this.lv = lv;
		JPanel lastui = jp;
		ReceiFormorder nowPanel = this;
		setLayout(null);

		JButton button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(nowPanel);
				main.getContentPane().add(lastui);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 10, 65, 23);
		add(button);

		JLabel label = new JLabel("营业厅业务员>>接收>>新建接收单");
		label.setBounds(100, 14, 360, 15);
		add(label);

		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

		JLabel label_2 = new JLabel("到达日期");
		label_2.setBounds(180, 159, 54, 15);
		add(label_2);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_8 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_8);
		lblNewLabel_8.setBounds(390, 159, 96, 15);
		add(lblNewLabel_8);

		JLabel label_3 = new JLabel("中转中心编号");
		label_3.setBounds(180, 211, 96, 15);
		add(label_3);

		textField = new JTextField();
		textField.setBounds(333, 208, 192, 21);
		add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("出发地");
		lblNewLabel.setBounds(180, 263, 54, 15);
		add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setText(lv.getOffName());
		textField_1.setBounds(333, 260, 192, 21);
		add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("货物到达状态");
		lblNewLabel_1.setBounds(180, 317, 96, 15);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("审批状态");
		lblNewLabel_2.setBounds(180, 372, 69, 15);
		add(lblNewLabel_2);

		String[] approveState = { "未审批", "审批通过", "审批未通过" };
		JComboBox comboBox = new JComboBox(approveState);
		comboBox.setBounds(344, 369, 181, 21);
		comboBox.setEnabled(false);
		add(comboBox);

		rdbtnNewRadioButton = new JRadioButton("损坏");
		rdbtnNewRadioButton.setBounds(333, 313, 64, 23);
		add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("完整");
		rdbtnNewRadioButton_1.setBounds(408, 313, 69, 23);
		add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_2 = new JRadioButton("丢失");
		rdbtnNewRadioButton_2.setBounds(479, 313, 57, 23);
		add(rdbtnNewRadioButton_2);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);

		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() == 0
						|| lblNewLabel_8.getText().equals("单击选择日期")
						|| !isSelected()) {
					label_4.setText("输入信息有误");
				} else {
					ReceiFormVO rv = new ReceiFormVO(textField.getText(),
							lblNewLabel_8.getText(), textField_1.getText(),
							getSelection(), lv.getCarNum(),
							lv.getMonitorName(), lv.getTransferName(), lv
									.getOrder());
					ReceiFormBlService rb = new ReceiFormBL();
					rb.addReceiveOrder(rv);
					label_4.setText("接收单已提交总经理审批");
				}
			}
		});
		btnNewButton.setBounds(220, 457, 80, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReceiFormorder f = new ReceiFormorder(main, lastui, lv);
				main.remove(nowPanel);
				main.getContentPane().add(f);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(390, 457, 80, 23);
		add(btnNewButton_1);

		JLabel label_5 = new JLabel(
				"\u4E2D\u8F6C\u4E2D\u5FC3\u5230\u8FBE\u5355");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label_5.setBounds(260, 71, 226, 44);
		add(label_5);
	}

	protected String getSelection() {
		if (rdbtnNewRadioButton.isSelected())
			return rdbtnNewRadioButton.getText();
		else if (rdbtnNewRadioButton_1.isSelected())
			return rdbtnNewRadioButton_1.getText();
		else
			return rdbtnNewRadioButton_2.getText();
	}

	protected boolean isSelected() {

		return (rdbtnNewRadioButton.isSelected()
				|| rdbtnNewRadioButton_1.isSelected() || rdbtnNewRadioButton_2
					.isSelected());
	}

}
