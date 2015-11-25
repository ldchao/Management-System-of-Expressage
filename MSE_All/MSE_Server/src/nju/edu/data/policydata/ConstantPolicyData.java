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
	
}
