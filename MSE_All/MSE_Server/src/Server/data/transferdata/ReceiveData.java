package Server.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.ArriverorderPO;
import Server.dataservice.transferdataservice.ReceiveDataService;

public class ReceiveData extends UnicastRemoteObject implements ReceiveDataService{

	protected ReceiveData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	//在数据库中插入一个中转中心到达单的PO
	@Override
	public void insert(ArriverorderPO ap) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
