package nju.edu.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.dataservice.transferdataservice.ReceiveDataService;
import PO.ArriverorderPO;

public class ReceiveData extends UnicastRemoteObject implements ReceiveDataService{

	protected ReceiveData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	//�����ݿ��в���һ����ת���ĵ��ﵥ��PO
	@Override
	public void insert(ArriverorderPO ap) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
