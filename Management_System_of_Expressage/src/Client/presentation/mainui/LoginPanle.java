package Client.presentation.mainui;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Client.BL_Driver.listinBLService_Driver.ListinBLService_Driver;
import Client.presentation.courierui.OrderInterface;

public class LoginPanle extends JPanel implements ActionListener{

	
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	JTextField jtf;
    JPasswordField jpf;
    JLabel label = new JLabel("");
	
	public LoginPanle(){
		
		jp1 =new JPanel();
		jp2 =new JPanel();
		jp3 =new JPanel();
		
		jlb1=new JLabel("�û���");
		jlb2=new JLabel("��    ��");
		
		jb1=new JButton("��¼");
		jb2=new JButton("ȡ��");
		
		jtf=new JTextField(10);
		jpf=new JPasswordField(10);
		
//		String x=jtf.getText();
//		System.out.println(x);
		jb1.addActionListener(this);
		
		//���ò��ֹ�����
		this.setLayout(null);
		//�������
		jp1.add(jlb1);
		jp1.add(jtf);
		jp2.add(jlb2);
		jp2.add(jpf);
		jp3.add(jb1);
		jp3.add(jb2);
		
		jp1.setBounds(70, 160, 200, 50);
		jp2.setBounds(70, 200, 200, 50);
		jp3.setBounds(70, 240, 200, 50);
		
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
//		ImageIcon background = new ImageIcon(
//				Image.class.getResource("/heic0604a2.jpg"));
//		// �ѱ���ͼƬ��ʾ��һ����ǩ����
//
//		label.setIcon(background);
//		// �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������
//		label.setBounds(0, 0, 750, 550);
//
//		this.add(label);
//		this.setOpaque(false);
//		// // �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
////		this.getRootPane().add(label, new Integer(Integer.MIN_VALUE));
//		// //���ÿɼ�
//		setVisible(true);
}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

//		x=jtf.getText();
//		System.out.println(x);
		
		OrderInterface oi=new OrderInterface();
	}
}
