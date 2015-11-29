package nju.edu.data.policydata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.ConstantPO;
import nju.edu.dataservice.policydataservice.ConstantPolicyDataService;

public class ConstantPolicyData extends UnicastRemoteObject implements ConstantPolicyDataService{
	
	public ConstantPolicyData() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ConstantPO find(String address1, String address2) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateConstant(ConstantPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPrice(String address1, String address2) throws RemoteException {
		// TODO Auto-generated method stub
		ConstantPO po=find(address1, address2);
//		return po.getPrice()*po.getDistance();
		return 0;
	}

	@Override
	public double GetDistance(String address1, String address2) throws RemoteException{
		// TODO Auto-generated method stub
		return 0;
	}
	
}
