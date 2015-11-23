package Server.data.billdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.StartinfoPO;
import Server.dataservice.billdataservice.BillDataService;

public class BillData extends UnicastRemoteObject implements BillDataService{

	protected BillData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(StartinfoPO po)throws RemoteException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<StartinfoPO> find() throws RemoteException{
		// TODO Auto-generated method stub
		return null;
	}

}
