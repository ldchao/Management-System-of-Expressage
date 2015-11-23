package Server.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.ChangeorderPO;
import Server.dataservice.transferdataservice.TransferDataService;

public class TransferData extends UnicastRemoteObject implements TransferDataService{

	protected TransferData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	//在数据库中插入一个中转单PO
	@Override
	public void insert(ChangeorderPO cp) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
