package Server.data.loaddata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.LoadorderPO;
import Server.dataservice.loaddataservice.ShippingDataService;

public class ShippingData extends UnicastRemoteObject implements ShippingDataService{

	protected ShippingData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	//�����ݿ��в���һ��װ�˵�PO
	@Override
	public void insert(LoadorderPO lp) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
