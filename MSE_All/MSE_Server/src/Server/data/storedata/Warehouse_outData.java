package Server.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.StoreoutorderPO;
import Server.dataservice.storedataservice.Warehouse_outDataService;

public class Warehouse_outData extends UnicastRemoteObject implements  Warehouse_outDataService{

	protected Warehouse_outData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	//�����ݿ��в���һ�����ⵥPO
	@Override
	public void insert(StoreoutorderPO sp) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
