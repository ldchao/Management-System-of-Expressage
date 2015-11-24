package nju.edu.data.billdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.dataservice.billdataservice.BillDataService;
import PO.StartinfoPO;

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
