package nju.edu.presentation.Transit_center_storemasterui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JComboBox;

import PO.LoginPO;
import nju.edu.businesslogic.storebl.Inventory_managementBL;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementBLService;
import nju.edu.presentation.Transit_center_salesmanui.Transferui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemEvent;

public class SetRemindData extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private int areaNum=-1;
	String remindData;
	JComboBox comboBox;

	/**
	 * Create the panel.
	 */
	public SetRemindData(JFrame m,JPanel jp,LoginPO loginPO) {
		JFrame main=m;
		JPanel lastui=jp;
		SetRemindData nowPanel=this;
        setLayout(null);
        Inventory_managementBLService ib = new Inventory_managementBL();
				
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
		
		JLabel lblNewLabel = new JLabel("仓库管理员>>库存管理>>设置提醒值");
		lblNewLabel.setBounds(100, 14, 263, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(loginPO.getName()+"，你好！");
		lblNewLabel_1.setBounds(600, 14, 100, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("当前提醒值比例");
		lblNewLabel_3.setBounds(178, 258, 93, 15);
		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(336, 255, 200, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("输入提醒值比例");
		lblNewLabel_2.setBounds(182, 327, 105, 15);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			public void  keyTyped(KeyEvent e) {
				if (!(Character.isDigit(e.getKeyChar())||e.getKeyChar()=='.')) {
					e.consume();
				}
			}
		});
		textField_1.setBounds(336, 324, 200, 21);
		add(textField_1);
		textField_1.setColumns(10);		
		
		JToolBar toolBar = new JToolBar();
		toolBar.setEnabled(false);
		toolBar.setBounds(0, 533,734,28);
		add(toolBar);
		
		JLabel lblNewLabel_6 = new JLabel("状态栏");
		toolBar.add(lblNewLabel_6);	
	
		JLabel lblNewLabel_4 = new JLabel("选择库区");
		lblNewLabel_4.setBounds(178, 201, 79, 15);
		add(lblNewLabel_4);
		
		String[] area={"","航运区一排","航运区二排","航运区三排",
				"铁运区一排","铁运区二排","铁运区三排",
				"汽运区一排","汽运区二排","汽运区三排",
				"汽运区四排01架","汽运区四排02架","汽运区四排03架","汽运区四排04架",
				"汽运区四排05架","汽运区四排06架","汽运区四排07架","汽运区四排08架",
				"汽运区四排09架","汽运区四排10架","汽运区四排11架","汽运区四排12架",
				"汽运区四排13架","汽运区四排14架","汽运区四排15架","汽运区四排16架",
				"汽运区四排17架","汽运区四排18架","汽运区四排19架","汽运区四排20架",};
		comboBox = new JComboBox(area);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					String selectedArea=(String)comboBox.getSelectedItem();
					if(!selectedArea.equals("")){
						for (int i = 0; i < area.length; i++) {
							if(selectedArea.equals(area[i])){
								areaNum=i-1;						
								break;
							}												
						}
						remindData = ib.getRemindData(areaNum);
						textField.setText(remindData);
					}				
				}					
			}
		});
		comboBox.setBounds(336, 198, 200, 18);
		add(comboBox);
		
		JLabel label = new JLabel("\u8BBE\u7F6E\u5E93\u533A\u63D0\u9192\u503C");
		label.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label.setBounds(273, 99, 236, 38);
		add(label);
		

		JButton btnNewButton_1 = new JButton("确定");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String new_remindData = textField_1.getText();
				if (new_remindData.length() == 0) {
					lblNewLabel_6.setText("未输入数值！");
				} else {
					double true_warnData = Double.parseDouble(new_remindData);
					if (true_warnData > 0 && true_warnData < 1) {
						ib.setRemindData(areaNum,new_remindData);
						lblNewLabel_6.setText("设置成功！");
					} else {
						lblNewLabel_6.setText("请输入正确的数值！");
					}
				}
			}
		});
		btnNewButton_1.setBounds(206, 409, 93, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("取消");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetRemindData sr=new SetRemindData(main,lastui,loginPO);
				main.remove(nowPanel);				
				main.getContentPane().add(sr);
				main.invalidate();
				main.repaint();
				main.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(398, 409, 93, 25);
		add(btnNewButton_2);
	}
}
