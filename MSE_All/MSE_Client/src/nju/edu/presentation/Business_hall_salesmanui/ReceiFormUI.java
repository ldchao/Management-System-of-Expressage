package nju.edu.presentation.Business_hall_salesmanui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogic.transferbl.ReceiveBL;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;
import nju.edu.presentation.Transit_center_salesmanui.Arriverorder;
import nju.edu.presentation.Transit_center_salesmanui.Receiveui;

public class ReceiFormUI extends JPanel{
	private JTextField textField;
	JFrame main;

	/**
	 * Create the panel.
	 */
	public ReceiFormUI(JFrame m, JPanel jp) {
		main = m;
		JPanel lastui = jp;
		ReceiFormUI nowPanel = this;
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

		JLabel label = new JLabel("营业厅业务员>>接收");
		label.setBounds(100, 14, 187, 15);
		add(label);

		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);

		JLabel label_2 = new JLabel("输入装运单编号");
		label_2.setBounds(179, 255, 110, 23);
		add(label_2);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533, 734, 28);
		add(toolBar);

		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);

		JLabel label_3 = new JLabel("选择到达的装运单");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_3.setBounds(289, 134, 255, 23);
		add(label_3);

		textField = new JTextField();
		textField.setBounds(342, 254, 196, 23);
		add(textField);
		textField.setColumns(10);

		JButton button_1 = new JButton("创建接收单");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length()==0) {
					label_4.setText("未输入装运单号");
				} else {
					ReceiveBLService rbs = new ReceiveBL();
					LoadorderVO lv = rbs.checkUnreceive_loadorderPO(textField
							.getText());
					if (lv == null) {
						label_4.setText("未检测到该装运单");
					} else {
						ReceiFormorder r = new ReceiFormorder(main, nowPanel, lv);
						main.remove(nowPanel);
						main.getContentPane().add(r);
						main.invalidate();
						main.repaint();
						main.setVisible(true);
					}
				}
			}
		});
		button_1.setBounds(307, 368, 134, 23);
		add(button_1);

	}

}
