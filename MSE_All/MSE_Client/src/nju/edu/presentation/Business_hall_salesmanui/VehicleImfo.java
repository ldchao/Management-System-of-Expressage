package nju.edu.presentation.Business_hall_salesmanui;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import nju.edu.VO.VehicleVO;
import nju.edu.presentation.financial_staffui.DateChooser;

import javax.swing.JTextField;
import java.awt.Color;

public class VehicleImfo extends JPanel{
	private JLabel carNum;
	private JLabel engineNum;
	private JLabel baseNum;
	private JLabel car;
	private JLabel driver;
	private JLabel buyTime;
	private JLabel useNum;
	private JLabel status;
	
			public VehicleImfo(JFrame m, JPanel bf) {
				JFrame main = m;
				JPanel lastui = bf;
				VehicleImfo nowPanel = this;
				nowPanel.setBounds(0, 0, 750, 600);
				setLayout(null);
				
				JButton button = new JButton("����");
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

				JLabel label = new JLabel("Ӫҵ��ҵ��Ա>>�½�������Ϣ");
				label.setBounds(100, 14, 200, 15);
				add(label);

				JLabel label_1 = new JLabel("��˧����ã�");
				label_1.setBounds(600, 14, 100, 15);
				add(label_1);

				JToolBar toolBar = new JToolBar();
				toolBar.setBounds(0, 533, 734, 28);
				add(toolBar);

				JLabel label_4 = new JLabel("״̬��");
				toolBar.add(label_4);
				
				JLabel carNumLabel = new JLabel("��������");
				carNumLabel.setBounds(169, 311, 57, 28);
				add(carNumLabel);
				
				JLabel engineNumLabel = new JLabel("�������ͺ�");
				engineNumLabel.setBounds(169, 350, 65, 28);
				add(engineNumLabel);
				
				JLabel carLabel = new JLabel("������");
				carLabel.setBounds(169, 431, 67, 28);
				add(carLabel);
				
				JLabel baseLabel = new JLabel("���̺�");
				baseLabel.setBounds(169, 391, 57, 28);
				add(baseLabel);
				
				DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
				
				JLabel label_7 = new JLabel("��������");
				label_7.setBounds(415, 350, 57, 28);
				add(label_7);
				
				JLabel label_8 = new JLabel("����ʱ��");
				label_8.setBounds(415, 391, 74, 28);
				add(label_8);
				
				JLabel label_11 = new JLabel("��ʻԱ");
				label_11.setBounds(415, 312, 57, 28);
				add(label_11);
				
				JPanel panel = new JPanel();
				panel.setBackground(Color.WHITE);
				panel.setBounds(289, 104, 160, 160);
				add(panel);
				
				JLabel label_2 = new JLabel("״̬");
				label_2.setBounds(415, 431, 74, 28);
				add(label_2);
				
				
				carNum = new JLabel("New label");
				carNum.setBounds(261, 317, 61, 16);
				add(carNum);
				
				engineNum = new JLabel("New label");
				engineNum.setBounds(261, 356, 61, 16);
				add(engineNum);
				
				baseNum = new JLabel("New label");
				baseNum.setBounds(261, 397, 61, 16);
				add(baseNum);
				
				car = new JLabel("New label");
				car.setBounds(261, 437, 61, 16);
				add(car);
				
				driver = new JLabel("New label");
				driver.setBounds(492, 317, 61, 16);
				add(driver);
				
				buyTime = new JLabel("New label");
				buyTime.setBounds(492, 356, 61, 16);
				add(buyTime);
				
				useNum = new JLabel("New label");
				useNum.setBounds(492, 397, 61, 16);
				add(useNum);
				
				status = new JLabel("New label");
				status.setBounds(492, 437, 61, 16);
				add(status);
				
				

		}
			
		public void show(VehicleVO vo){
			this.carNum.setText(vo.getCarNum());
			this.engineNum.setText(vo.getEngineNum());
			this.baseNum.setText(vo.getBaseNum());
			this.car.setText(vo.getCar());
//			this.driver
			this.buyTime.setText(vo.getBuyDate());
			this.status.setText(vo.getCarState().toString());
		}
}

