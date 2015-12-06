package nju.edu.dataservice.policydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.ConstantPO;
import State.ExpressType;

public interface ConstantPolicyDataService extends Remote{
	public ConstantPO find(String address1,String address2)throws RemoteException;
	
	public void updateConstant(ConstantPO po)throws RemoteException;
	
	public double getPrice(ExpressType expressType)throws RemoteException;
	
	public double GetDistance(String address1,String address2)throws RemoteException;
	
}
