package Client.presentation.Transit_center_salesmanui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Changeorder_Input extends JPanel {
	JFrame main;
	/**
	 * Create the panel.
	 */
	public Changeorder_Input(JFrame m,JPanel jp) {
		main=m;
		JPanel lastui=jp;
		Changeorder_Input nowPanel=this;
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
		
		JLabel label = new JLabel("中转中心业务员>>录入中转单>>新建中转单");
		label.setBounds(100, 14, 270, 15);
		add(label);
		
		JLabel label_1 = new JLabel("张三，你好！");
		label_1.setBounds(600, 14, 100, 15);
		add(label_1);
		
		JLabel lblNewLabel = new JLabel("航运区");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
		lblNewLabel.setBounds(113, 153, 72, 15);
		add(lblNewLabel);
		
		JLabel label_2 = new JLabel("铁运区");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_2.setBounds(113, 222, 91, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("汽运区");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 14));
		label_3.setBounds(113, 298, 72, 15);
		add(label_3);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0,  533, 734, 28);
		add(toolBar);
		
		JLabel label_4 = new JLabel("状态栏");
		toolBar.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("选择库区和排号");
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD, 20));
		lblNewLabel_1.setBounds(280, 72, 171, 52);
		add(lblNewLabel_1);
		
		JRadioButton jb1 = new JRadioButton("一排");
		jb1.setBounds(238, 150, 72, 23);
		add(jb1);

		JRadioButton jb2 = new JRadioButton("二排");
		jb2.setBounds(361, 150, 72, 23);
		add(jb2);
		
		JRadioButton jb3 = new JRadioButton("三排");
		jb3.setBounds(498, 150, 72, 23);
		add(jb3);
		
		JRadioButton jb4 = new JRadioButton("一排");
		jb4.setBounds(238, 219, 72, 23);
		add(jb4);
		
		JRadioButton jb5 = new JRadioButton("二排");
		jb5.setBounds(361, 219, 72, 23);
		add(jb5);
		
		JRadioButton jb6 = new JRadioButton("三排");
		jb6.setBounds(498, 219, 63, 23);
		add(jb6);
		
		JRadioButton jb7 = new JRadioButton("一排");
		jb7.setBounds(238, 295, 72, 23);
		add(jb7);
		
		JRadioButton jb8 = new JRadioButton("二排");
		jb8.setBounds(361, 295, 72, 23);
		add(jb8);
		
		JRadioButton jb9 = new JRadioButton("三排");
		jb9.setBounds(498, 295, 63, 23);
		add(jb9);
		
		JRadioButton jb10 = new JRadioButton("四排");
		jb10.setBounds(238, 367, 72, 23);
		add(jb10);		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(jb1);bg.add(jb2);bg.add(jb3);bg.add(jb4);bg.add(jb5);
		bg.add(jb6);bg.add(jb7);bg.add(jb8);bg.add(jb9);bg.add(jb10);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_choose_TC ctc=new Changeorder_choose_TC(main, nowPanel);
				main.remove(nowPanel);				
				main.getContentPane().add(ctc);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton.setBounds(203, 448, 93, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeorder_Input ti=new Changeorder_Input(main, lastui);
				main.remove(nowPanel);				
				main.getContentPane().add(ti);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(379, 448, 93, 23);
		add(btnNewButton_1);
		
		
	}
}