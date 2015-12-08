package nju.edu.dataservice.vehicledataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.DriverPO;
import State.DriverState;

public interface DriverDataService extends Remote{
	    //�½�˾����Ϣ
		public void insert(DriverPO po) throws RemoteException;
		
		//����˾����Ϣ
		public void update(DriverPO po) throws RemoteException;
		
		//����˾����Ϣ
		public DriverPO find(String name) throws RemoteException;
		
		//ɾ��˾����Ϣ
		public void delete(DriverPO po) throws RemoteException;
		
		//�����Ƿ����
		public boolean isExist(String name) throws RemoteException;
		
		//����˾��״̬
		public boolean updateState(String name, DriverState state) throws RemoteException;
		
		

}
