package nju.edu.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.StorePO;
import nju.edu.dataservice.storedataservice.StoreMessageDataService;

public class StoreMessageData extends UnicastRemoteObject implements StoreMessageDataService{

	
	 public StoreMessageData() throws RemoteException {
		super();
	}
	//���ļ��ж�ȡ��ǰ���µĿ����Ϣ������ֵ������ֵ������λ�����浥�ݣ�
	@Override
	public StorePO getStoreMessage() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	  //�ڲֿ������Ա�˳�ʱ����ǰ��Ϣ�洢���ļ���
	@Override
	public void saveStoreMessage(StorePO sp) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	
	

}
