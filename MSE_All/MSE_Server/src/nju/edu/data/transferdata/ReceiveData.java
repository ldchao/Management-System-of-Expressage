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
	//在数据库中插入一个中转中心到达单的PO
	@Override
	public void insert(ArriverorderPO ap) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	//在数据中查找对应的未接收的装运单
	@Override
	public LoadorderPO checkUnreceive_loadorderPO(String s) throws RemoteException{
		
		return null;
	}
	

}
