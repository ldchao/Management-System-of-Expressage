package nju.edu.businesslogicservice.loginblservice;

import javax.swing.JFrame;

import PO.LoginPO;

public interface LoginBLService {

	// 根据用户名和输入的密码，判断密码是否正确
	// 无该用户返回-1，密码错误返回0，通过返回1
	public int isLegal(String user, String password);

	// 根据用户名获取用户信息
	public LoginPO getUserInfo(String user);
	
	// 根据权限进入相应界面
	public void Enter(JFrame main,String limit);
	
}
