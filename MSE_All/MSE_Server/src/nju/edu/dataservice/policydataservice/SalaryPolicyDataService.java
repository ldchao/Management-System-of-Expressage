package nju.edu.dataservice.policydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.SalaryPO;

public interface SalaryPolicyDataService extends Remote{
	//��ȡ��Ӧ��Աнˮ��Ϣ
	public SalaryPO get(String typeOfStaff)throws RemoteException;
	
	//������Աнˮ��Ϣ
	public void updateSalary(SalaryPO po)throws RemoteException;
}
