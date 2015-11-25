package nju.edu.dataservice.vehicledataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.DriverPO;

public interface DriverDataService extends Remote{
	    //�½�˾����Ϣ
		public void insert(DriverPO po) throws RemoteException;
		
		//����˾����Ϣ
		public void update(DriverPO po) throws RemoteException;
		
		//����˾����Ϣ
		public DriverPO find(String name) throws RemoteException;
		
		//ɾ��˾����Ϣ
		public void delete(DriverPO po) throws RemoteException;
		

}
