package nju.edu.dataservice.policydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.SalaryPO;

public interface SalaryPolicyDataService extends Remote{
	public SalaryPO get(String typeOfStaff)throws RemoteException;
	
	public void updateSalary(SalaryPO po)throws RemoteException;
	
}
