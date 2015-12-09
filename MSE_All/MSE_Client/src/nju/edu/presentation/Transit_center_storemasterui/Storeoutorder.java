package nju.edu.presentation.Transit_center_storemasterui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import PO.LoginPO;
import PO.OrganizationNumPO;
import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogic.storebl.Warehouse_outBL;
import nju.edu.businesslogicservice.storeblservice.Warehouse_outBLService;
import nju.edu.presentation.Transit_center_salesmanui.Transferui;
import nju.edu.presentation.financial_staffui.DateChooser;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Storeoutorder extends JPanel implements Runnable {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JFrame main;
	JPanel returnui;
	JPanel lastui;
	Storeoutorder nowPanel;
	LoginPO loginpo;

	/**
	 * Create the panel.
	 */
	public Storeoutorder(JFrame m, JPanel jp, JPanel jp2, LoginPO loginPO,
			ChangeorderVO cv) {
		main = m;
		returnui = jp2;
		lastui = jp;
		nowPanel = this;
		loginpo = loginPO;
		setLayout(null);
		OrganizationNumPO op = new OrganizationNumPO();

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

		JLabel lblNewLabel = new JLabel("仓库管理员>>出库管理>>新建出库单>>出库单");
		lblNewLabel.setBounds(100, 14, 347, 15);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(loginPO.getName() + "，你好！");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel lblNewLabel_4 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_4);

		JLabel lblNewLabel_2 = new JLabel("快递编号");
		lblNewLabel_2.setBounds(168, 163, 54, 15);
		add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setText("该中转单上所有单号");
		textField_1.setEditable(false);
		textField_1.setBounds(298, 160, 234, 21);
		add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("出库日期");
		lblNewLabel_3.setBounds(168, 207, 54, 15);
		add(lblNewLabel_3);

		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		JLabel lblNewLabel_3_1 = new JLabel("单击选择日期");
		dateChooser1.register(lblNewLabel_3_1);
		lblNewLabel_3_1.setBounds(360, 207, 85, 15);
		add(lblNewLabel_3_1);

		JLabel lblNewLabel_5 = new JLabel("目的地");
		lblNewLabel_5.setBounds(168, 262, 54, 15);
		add(lblNewLabel_5);

		textField_2 = new JTextField();
		textField_2.setText(op.getName(cv.getArrivenum()));
		textField_2.setEditable(false);
		textField_2.setBounds(298, 259, 234, 21);
		add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("装运形式");
		lblNewLabel_6.setBounds(168, 313, 54, 15);
		add(lblNewLabel_6);

		textField_3 = new JTextField();
		textField_3.setText(cv.getWayOfTransport());
		textField_3.setEditable(false);
		textField_3.setBounds(298, 310, 234, 21);
		add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("中转单编号");
		lblNewLabel_7.setBounds(168, 361, 78, 15);
		add(lblNewLabel_7);

		textField_4 = new JTextField();
		textField_4.setText(cv.getNumberOfTransfer());
		textField_4.setEditable(false);
		textField_4.setBounds(298, 358, 237, 21);
		add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("审批状态");
		lblNewLabel_10.setBounds(168, 412, 54, 15);
		add(lblNewLabel_10);

		String[] approveState = { "未审批", "审批通过", "审批未通过" };
		JComboBox comboBox = new JComboBox(approveState);
		comboBox.setBounds(298, 409, 234, 21);
		comboBox.setEnabled(false);
		add(comboBox);

		JButton btnNewButton_1 = new JButton("确定");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = lblNewLabel_3_1.getText();
				if (date.equals("单击选择日期")) {
					lblNewLabel_4.setText("请选择日期！");
				} else {
					Warehouse_outBLService wb = new Warehouse_outBL();
					wb.build(cv, date);
					lblNewLabel_4.setText("入库单创建成功！");
					Thread t = new Thread(nowPanel);
					t.start();
				}

			}
		});
		btnNewButton_1.setBounds(188, 464, 93, 23);
		add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("取消");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Storeoutorder s = new Storeoutorder(main, lastui, jp2, loginPO,
						cv);
				main.remove(nowPanel);
				main.getContentPane().add(s);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(418, 464, 93, 23);
		add(btnNewButton_2);

		JLabel label = new JLabel("出  库 单");
		label.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label.setBounds(320, 88, 148, 38);
		add(label);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Storeoutorder_Input si = new Storeoutorder_Input(main, returnui,
				loginpo);
		main.remove(nowPanel);
		main.getContentPane().add(si);
		main.invalidate();
		main.repaint();
		main.setVisible(true);
	}
}
