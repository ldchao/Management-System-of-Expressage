package nju.edu.data.policydata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.SalaryPO;
import nju.edu.dataservice.policydataservice.SalaryPolicyDataService;

public class SalaryPolicyData extends UnicastRemoteObject implements SalaryPolicyDataService{

	public SalaryPolicyData() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public SalaryPO get(String typeOfStaff) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSalary(SalaryPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
