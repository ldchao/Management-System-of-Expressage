package Client.presentation.Transit_center_storemasterui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import Client.presentation.Transit_center_salesmanui.Transferui;
import Client.presentation.financial_staffui.DateChooser;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Storeoutorder extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public Storeoutorder(JFrame m, JPanel jp) {
		JFrame main = m;
		JPanel lastui = jp;
		Storeoutorder nowPanel = this;
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

		JLabel lblNewLabel = new JLabel("仓库管理员>>出库管理>>新建出库单>>出库单");
		lblNewLabel.setBounds(100, 14, 347, 15);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("张三，你好！");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel lblNewLabel_4 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_4);

		JLabel lblNewLabel_2 = new JLabel("快递编号");
		lblNewLabel_2.setBounds(168, 163, 54, 15);
		add(lblNewLabel_2);

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

		JLabel lblNewLabel_6 = new JLabel("装运形式");
		lblNewLabel_6.setBounds(168, 313, 54, 15);
		add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("中转单编号");
		lblNewLabel_7.setBounds(168, 361, 78, 15);
		add(lblNewLabel_7);

		JLabel lblNewLabel_10 = new JLabel("审批状态");
		lblNewLabel_10.setBounds(168, 412, 54, 15);
		add(lblNewLabel_10);

		JButton btnNewButton_1 = new JButton("确定");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_4.setText("创建成功");
			}
		});
		btnNewButton_1.setBounds(188, 464, 93, 23);
		add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("取消");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Storeoutorder s=new Storeoutorder(main,lastui);
				main.remove(nowPanel);				
				main.getContentPane().add(s);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(418, 464, 93, 23);
		add(btnNewButton_2);

		textField = new JTextField();
		textField.setBounds(298, 358, 237, 21);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(298, 310, 234, 21);
		add(textField_1);
		textField_1.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(298, 160, 234, 21);
		add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(298, 259, 234, 21);
		add(textField_4);
		textField_4.setColumns(10);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(298, 409, 234, 21);
		add(comboBox_1);

		JLabel label = new JLabel("\u51FA  \u5E93  \u5355");
		label.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label.setBounds(297, 88, 148, 38);
		add(label);
	}
}
