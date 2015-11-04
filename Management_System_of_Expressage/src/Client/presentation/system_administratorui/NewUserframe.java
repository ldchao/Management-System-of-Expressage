package Client.presentation.system_administratorui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import Client.presentation.financial_staffui.Payframe;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;

public class NewUserframe extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public NewUserframe() {
		getContentPane().setLayout(null);
		
		NewUserframe nuf = this;
		
		JLabel label = new JLabel("系统管理员>>新建用户");
		label.setBounds(88, 5, 518, 15);
		getContentPane().add(label);

		JLabel lblHello = new JLabel("Hello!");
		lblHello.setBounds(677, 5, 36, 15);
		getContentPane().add(lblHello);

		JButton button_4 = new JButton("返回");
		button_4.setBounds(10, 1, 68, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuf.dispose();
				Administratorframe adf = new Administratorframe();
			}
		});
		getContentPane().add(button_4);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 423, 744, 32);
		getContentPane().add(toolBar);

		JLabel lblNewLabel = new JLabel("状态栏");
		toolBar.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D");
		label_1.setBounds(186, 114, 62, 15);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801");
		label_2.setBounds(186, 170, 62, 15);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u6743\u9650");
		label_3.setBounds(186, 235, 62, 15);
		getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setBounds(286, 111, 175, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(286, 167, 175, 21);
		getContentPane().add(textField_1);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("创建成功!");
			}
		});
		button.setBounds(216, 362, 93, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.setBounds(391, 362, 93, 23);
		getContentPane().add(button_1);
		
		JCheckBox checkBox = new JCheckBox("\u5FEB\u9012\u5458");
		checkBox.setBounds(286, 231, 84, 23);
		getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\u8425\u4E1A\u5385\u4E1A\u52A1\u5458");
		checkBox_1.setBounds(391, 231, 98, 23);
		getContentPane().add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\u603B\u7ECF\u7406");
		checkBox_2.setBounds(286, 271, 84, 23);
		getContentPane().add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\u8D22\u52A1\u4EBA\u5458");
		checkBox_3.setBounds(391, 271, 84, 23);
		getContentPane().add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		checkBox_4.setBounds(504, 231, 128, 23);
		getContentPane().add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u5458");
		checkBox_5.setBounds(504, 271, 147, 23);
		getContentPane().add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\u7CFB\u7EDF\u7BA1\u7406\u5458");
		checkBox_6.setBounds(286, 307, 103, 23);
		getContentPane().add(checkBox_6);
		
		JLabel label_4 = new JLabel("\u7528\u6237\u4FE1\u606F");
		label_4.setFont(new Font("黑体", Font.BOLD, 15));
		label_4.setBounds(316, 67, 84, 15);
		getContentPane().add(label_4);
		
		
		//frame
		this.setTitle("快递管理系统MSE客户端");
		this.setSize(750, 490);
		this.setLocation(400, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}
