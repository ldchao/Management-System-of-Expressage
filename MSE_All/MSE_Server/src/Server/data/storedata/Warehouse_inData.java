package Server.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.StoreinorderPO;
import Server.dataservice.storedataservice.Warehouse_inDataService;

public class Warehouse_inData extends UnicastRemoteObject implements Warehouse_inDataService{

	protected Warehouse_inData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	//在数据库中插入一条入库单PO
	@Override
	public void insert(StoreinorderPO sp) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
