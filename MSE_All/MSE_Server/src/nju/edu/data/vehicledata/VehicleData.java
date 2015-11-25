package nju.edu.data.vehicledata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.VehiclePO;
import nju.edu.dataservice.vehicledataservice.VehicleDataService;

public class VehicleData extends UnicastRemoteObject implements VehicleDataService{

	public VehicleData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(VehiclePO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(VehiclePO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public VehiclePO find(String carNum) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(VehiclePO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
