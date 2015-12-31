package nju.edu.dataservice.policydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.SalaryPO;

public interface SalaryPolicyDataService extends Remote{
	//获取相应人员薪水信息
	public SalaryPO get(String typeOfStaff)throws RemoteException;
	
	//更新人员薪水信息
	public void updateSalary(SalaryPO po)throws RemoteException;
}
