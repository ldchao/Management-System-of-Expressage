package Client.presentation.Transit_center_salesmanui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Client.PO.StoreinorderPO;
import Client.presentation.Transit_center_storemasterui.Storeinorder;

public class Demo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 650, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
//		Shipping_Plane sp=new Shipping_Plane();
//		contentPane.add(sp);
		Arriverorder a=new Arriverorder();
		contentPane.add(a);
//		Changeorder_Input c=new Changeorder_Input();
//		contentPane.add(c);
//		Changeorder_choose_TC ct=new Changeorder_choose_TC();
//		contentPane.add(ct);
//		Changeorder_choose_BH cb=new Changeorder_choose_BH();
//    	contentPane.add(cb);
//		Storeinorder s=new Storeinorder();
//		contentPane.add(s);
	} 

}
