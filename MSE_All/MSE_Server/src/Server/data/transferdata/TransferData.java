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

	//�����ݿ��в���һ����ת��PO
	@Override
	public void insert(ChangeorderPO cp) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
