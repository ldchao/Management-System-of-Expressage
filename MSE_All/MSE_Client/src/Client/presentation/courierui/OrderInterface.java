package Client.presentation.courierui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OrderInterface extends JFrame implements ActionListener{
	JLabel[] label=new JLabel[30];
	JTextField[] tf=new JTextField[20];
	JButton b1;
	JButton b2;
	JPanel jp1,jp1_1,jp2,jp2_1,jp3,jp3_1,jp4,jp4_1,jp5,jp6;
	
	String[] s=new String[20];
	public OrderInterface(){
		label[0]=new JLabel("����");
		label[1]=new JLabel("���Ա");
		label[2]=new JLabel("������");
		label[3]=new JLabel("����״̬");
		label[4]=new JLabel("δ����");
		label[5]=new JLabel("�ļ�����Ϣ");
		label[6]=new JLabel("����");
		label[7]=new JLabel("��ַ");
		label[8]=new JLabel("ְλ");
		label[9]=new JLabel("�绰");
		label[10]=new JLabel("�ֻ�");
		label[11]=new JLabel("�ռ�����Ϣ");
		label[12]=new JLabel("����");
		label[13]=new JLabel("��ַ");
		label[14]=new JLabel("ְλ");
		label[15]=new JLabel("�绰");
		label[16]=new JLabel("�ֻ�");
		label[17]=new JLabel("�ļ���Ϣ");
		label[18]=new JLabel("����");
		label[19]=new JLabel("����");
		label[20]=new JLabel("��");
		label[21]=new JLabel("��");
		label[22]=new JLabel("��");
		label[23]=new JLabel("�������");
		label[24]=new JLabel("��������");
		label[25]=new JLabel("����");
		label[26]=new JLabel("");
		label[27]=new JLabel("Ԥ��ʱ��");
		label[28]=new JLabel("");
		label[29]=new JLabel("������Ϣ");

		for(int i=0;i<20;i++){
			tf[i]=new JTextField(10);
		}
		
		
		jp1=new JPanel();
		jp1_1=new JPanel(new GridLayout(3,2));
		jp1_1.add(label[1]);
		jp1_1.add(tf[0]);
		jp1_1.add(label[2]);
		jp1_1.add(tf[1]);
		jp1_1.add(label[3]);
		jp1_1.add(label[4]);
		jp1.add(label[0]);
		jp1.add(jp1_1);
		
		jp2=new JPanel();
		jp2_1=new JPanel(new GridLayout(5,2));
		jp2_1.add(label[6]);
		jp2_1.add(tf[2]);
		jp2_1.add(label[7]);
		jp2_1.add(tf[3]);
		jp2_1.add(label[8]);
		jp2_1.add(tf[4]);
		jp2_1.add(label[9]);
		jp2_1.add(tf[5]);
		jp2_1.add(label[10]);
		jp2_1.add(tf[6]);
		jp2.add(label[5]);
		jp2.add(jp2_1);
		
		jp3=new JPanel();
		jp3_1=new JPanel(new GridLayout(5,2));
		jp3_1.add(label[12]);
		jp3_1.add(tf[7]);
		jp3_1.add(label[13]);
		jp3_1.add(tf[8]);
		jp3_1.add(label[14]);
		jp3_1.add(tf[9]);
		jp3_1.add(label[15]);
		jp3_1.add(tf[10]);
		jp3_1.add(label[16]);
		jp3_1.add(tf[11]);
		jp3.add(label[11]);
		jp3.add(jp3_1);
		
		jp4=new JPanel();
		jp4_1=new JPanel(new GridLayout(5,2));
		jp4_1.add(label[18]);
		jp4_1.add(tf[12]);
		jp4_1.add(label[19]);
		jp4_1.add(tf[13]);
		jp4_1.add(label[20]);
		jp4_1.add(tf[14]);
		jp4_1.add(label[21]);
		jp4_1.add(tf[15]);
		jp4_1.add(label[22]);
		jp4_1.add(tf[16]);
		jp4.add(label[17]);
		jp4.add(jp4_1);
		
		jp5=new JPanel(new GridLayout(5,2));
		jp5.add(label[23]);
		jp5.add(tf[17]);
		jp5.add(label[24]);
		jp5.add(tf[18]);
		jp5.add(label[25]);
		jp5.add(label[26]);
		jp5.add(label[27]);
		jp5.add(label[28]);
		jp5.add(label[29]);
		jp5.add(tf[19]);
		
		
		b1=new JButton("ȷ��");
		
		b1.addActionListener(this);
		b2=new JButton("ȡ��");
		jp6=new JPanel(new GridLayout(1,2));
		jp6.add(b1);
		jp6.add(b2);
		
		this.setLayout(new GridLayout(6,1));
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
		this.add(jp5);
		this.add(jp6);
		
		this.setBounds(400, 0, 400, 780);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			s[i]=tf[i].getText();
		}
		
//		ListinBLService_Driver driver=new ListinBLService_Driver();
//		driver.drive(s[0],s[1],1,
//				s[2],s[3],s[4],s[5],
//				s[6],s[7],s[8],
//				s[9],s[10],s[11],s[12],
//				Integer.parseInt(s[13]),
//				Integer.parseInt(s[14]),Integer.parseInt(s[15]),Integer.parseInt(s[16]),"ipone100",
//				Integer.parseInt(s[17]),1,2.0,s[18],s[19]);
	}
	
	
	
	
}
