package nju.edu.businesslogicservice.loginblservice;

import javax.swing.JFrame;

import PO.LoginPO;

public interface LoginBLService {

	// �����û�������������룬�ж������Ƿ���ȷ
	// �޸��û�����-1��������󷵻�0��ͨ������1
	public int isLegal(String user, String password);

	// �����û�����ȡ�û���Ϣ
	public LoginPO getUserInfo(String user);
	
	// ����Ȩ�޽�����Ӧ����
	public void Enter(JFrame main,String limit);
	
}
