package nju.edu.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.dataservice.transferdataservice.ReceiveDataService;
import PO.ArriverorderPO;
import PO.LoadorderPO;

public class ReceiveData extends UnicastRemoteObject implements ReceiveDataService{

	public ReceiveData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	//�����ݿ��в���һ����ת���ĵ��ﵥ��PO
	@Override
	public void insert(ArriverorderPO ap) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	//�������в��Ҷ�Ӧ��δ���յ�װ�˵�
	@Override
	public LoadorderPO checkUnreceive_loadorderPO(String s) throws RemoteException{
		
		return null;
	}
	

}
