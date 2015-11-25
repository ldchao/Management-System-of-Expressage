package nju.edu.data.vehicledata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.DriverPO;
import nju.edu.dataservice.vehicledataservice.DriverDataService;

public class Driverdata extends UnicastRemoteObject implements DriverDataService{

	protected Driverdata() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(DriverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(DriverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DriverPO find(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(DriverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
