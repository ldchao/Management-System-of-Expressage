package nju.edu.dataservice.staffdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StaffPO;

public interface StaffDataService extends Remote{
	//���������Ա����
	public ArrayList<StaffPO> gets()throws RemoteException;
	
	//�����û��������Ա����
	public StaffPO get(String name)throws RemoteException;
	
	//�½�һ����Ա
	public void insert(StaffPO po)throws RemoteException;
	
	//ɾ��һ����Ա
	public void delete(String id)throws RemoteException;
	
	//������Ա��Ϣ
	public void update(StaffPO po)throws RemoteException;
	
	//�޸��û���,ǰһ��Ϊ���û�������һ��Ϊ���û���
	public void editTheID(String oldID,String newID,String position)throws RemoteException;

	//��ȡ��Ա��ʼ���
	public int getnum() throws RemoteException;

	//��ȡ����û�л���û�������Ա��po��arrayList
	public ArrayList<StaffPO> getAllStaff() throws RemoteException;

	//��Ϊ����û�����ɾ��ԭ�ļ������������ļ�
	public void exchange(String id, StaffPO po)throws RemoteException;
}
