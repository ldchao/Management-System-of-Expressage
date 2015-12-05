package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PO.ConstantPO;
import nju.edu.VO.ConstantVO;
import nju.edu.businesslogic.policybl.ConstantPolicybl;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConstantManage extends JFrame {

	private JPanel contentPane;

	public ConstantManage() {
		ConstantManage constantManageframe=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PolicyManage newpolicyManage=new PolicyManage();
				constantManageframe.dispose();
			}
		});
		button.setBounds(10, 10, 75, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u603B\u7ECF\u7406>>\u7B56\u7565\u7BA1\u7406>>\u5E38\u91CF\u7BA1\u7406");
		label.setBounds(95, 14, 211, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u9009\u62E9\u5730\u70B9\u4E00");
		label_1.setBounds(169, 194, 101, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u9009\u62E9\u5730\u70B9\u4E8C");
		label_2.setBounds(169, 288, 101, 15);
		contentPane.add(label_2);
		
		String[] city={"南京鼓楼区营业厅","南京玄武区营业厅","南京建邺区营业厅","南京秦淮区营业厅","南京栖霞区营业厅","南京六合区营业厅","南京浦口区营业厅","南京江宁区营业厅","南京高淳区营业厅","南京溧水区营业厅",
				"北京宣武区营业厅","北京东城区营业厅","北京西城区营业厅","北京崇文区营业厅","北京朝阳区营业厅","北京石景山区营业厅","北京海淀区营业厅","北京丰台区营业厅","北京房山区营业厅","北京大兴区营业厅","北京通州区营业厅","北京门头沟区营业厅","北京昌平区营业厅","北京顺义区营业厅","北京怀柔区营业厅","北京密云县营业厅","北京平谷区营业厅","北京延庆县营业厅","北京大学城营业厅","北京中关村营业厅",
				"上海黄浦区营业厅","上海徐汇区营业厅","上海长宁区营业厅","上海静安区营业厅","上海普陀区营业厅","上海虹口区营业厅","上海杨浦区营业厅","上海闵行区营业厅","上海宝山区营业厅","上海嘉定区营业厅","上海浦东新区营业厅","上海金山区营业厅","上海松江区营业厅","上海青浦区营业厅","上海奉贤区营业厅","上海崇明县营业厅","上海工业区营业厅","上海开发区营业厅","上海外贸区营业厅","上海高新区营业厅",
				"广州越秀区营业厅","广州天河区营业厅","广州白云区营业厅","广州荔湾区营业厅","广州萝岗区营业厅","广州黄埔区营业厅","广州海珠区营业厅","广州番禺区营业厅","广州花都区营业厅","广州南沙区营业厅","广州从化市营业厅","广州增城市营业厅","广州东山区营业厅","广州开发区营业厅","广州高新区营业厅"};
		JComboBox comboBox = new JComboBox(city);
		comboBox.setBounds(380, 187, 174, 29);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(city);
		comboBox_1.setBounds(380, 281, 174, 29);
		contentPane.add(comboBox_1);
		
		JButton button_1 = new JButton("\u786E\u5B9A");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConstantPolicybl constantPolicybl=new ConstantPolicybl();
				ConstantVO vo=constantPolicybl.checkConstant(comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString());
				Constant constant=new Constant(vo);
				dispose();
			}
		});
		button_1.setBounds(304, 387, 93, 23);
		contentPane.add(button_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 534, 724, 28);
		contentPane.add(toolBar);
		
		JLabel lblNewLabel = new JLabel("\u72B6\u6001\u680F");
		toolBar.add(lblNewLabel);
	}
}
