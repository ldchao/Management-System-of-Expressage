package nju.edu.dataservice.listindataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.OrderPO;
import State.ResultMessage;

public interface ListinDataService extends Remote{
	//����һ������
	public void insert(OrderPO po) throws RemoteException;
	
	//��ȡ���ؼ۸���
	public double getPrice(String address1,String address2)throws RemoteException;
	
	//����id��ö���po
	public OrderPO getOrder(String id)throws RemoteException;
	//����id����������Ϣ
	public void update(String id,String message)throws RemoteException;
	//��ö����л��������
	public double getWeigtht(String id)throws RemoteException;
	//������ж�����po
	public ArrayList<OrderPO> getAllOrders() throws RemoteException;
	//����po����״̬
	public void changestate(OrderPO po)throws RemoteException;
	
	//��ѯδ�����Ķ��������ڲ���
	public boolean checkOrder(String id)throws RemoteException;
}
