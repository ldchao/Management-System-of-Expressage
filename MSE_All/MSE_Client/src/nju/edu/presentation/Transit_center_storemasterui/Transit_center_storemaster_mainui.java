package nju.edu.presentation.Transit_center_storemasterui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import nju.edu.businesslogic.storebl.StoreMessageBL;
import nju.edu.presentation.Loginui.PersonalInfomation;
import PO.LoginPO;
import PO.OrganizationNumPO;
import StaticValue.StoreNum;

@SuppressWarnings("serial")
public class Transit_center_storemaster_mainui extends JFrame {

	private Transit_center_storemaster_mainui_Panel contentPane;
	Transit_center_storemaster_mainui main;
	StoreMessageBL sm;
	
	

	/**
	 * Create the frame.
	 */
	
	
	public Transit_center_storemaster_mainui(LoginPO loginPO) {

		main = this;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750, 600);
		setLocationRelativeTo(null);


		OrganizationNumPO op=new OrganizationNumPO();
		String transferNum=op.getNum(loginPO.getShop());
		sm = StoreMessageBL.getInstance(transferNum);
		contentPane = new Transit_center_storemaster_mainui_Panel(main,loginPO,sm);
		getContentPane().add(contentPane);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				sm.save();
			 }
		});



	}
}
