package Client.presentation.Transit_center_storemasterui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.presentation.Transit_center_salesmanui.Transferui;
import Client.presentation.financial_staffui.DateChooser;

import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetWarnData extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public SetWarnData(JFrame m,JPanel jp) {
		JFrame main=m;
		JPanel lastui=jp;
		SetWarnData nowPanel=this;

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
		
		JLabel lblNewLabel = new JLabel("仓库管理员>>库存管理>>设置警戒值");
		lblNewLabel.setBounds(100, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("张三，你好！");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("当前警戒值比例");
		lblNewLabel_3.setBounds(194, 226, 93, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("输入警戒值比例");
		lblNewLabel_2.setBounds(194, 311, 105, 15);
		add(lblNewLabel_2);
		
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 533,734,28);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("确定");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_6.setText("设置成功");
			}
		});
		btnNewButton_1.setBounds(216, 394, 93, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("取消");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetWarnData sw=new SetWarnData(main,lastui);
				main.remove(nowPanel);				
				main.getContentPane().add(sw);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(399, 394, 93, 25);
		add(btnNewButton_2);

		
		textField = new JTextField();
		textField.setBounds(376, 223, 150, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(376, 308, 150, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("\u8BBE\u7F6E\u8B66\u6212\u503C");
		label.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label.setBounds(278, 130, 171, 28);
		add(label);
		
		
	}
}
