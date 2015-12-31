package nju.edu.dataservice.policydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.ConstantPO;

public interface ConstantPolicyDataService extends Remote{
	//获得两地常量信息
	public ConstantPO find(String address1,String address2)throws RemoteException;
	//修改两地信息
	public void updateConstant(ConstantPO po)throws RemoteException;
	
	public double getPrice(String address1,String address2)throws RemoteException;
	
	public double GetDistance(String address1,String address2)throws RemoteException;
}
