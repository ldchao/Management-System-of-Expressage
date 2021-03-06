package nju.edu.dataservice.vehicledataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.DriverPO;
import State.DriverState;

public interface DriverDataService extends Remote{
			//新建司机信息
			public void insert(DriverPO po) throws RemoteException;
			
			//更新司机信息
			public void update(DriverPO po) throws RemoteException;
			
			//查找司机信息
			public DriverPO find(String name) throws RemoteException;
			
			//删除司机信息
			public void delete(DriverPO po) throws RemoteException;
			
			//查找是否存在
			public boolean isExist(String name) throws RemoteException;
			
			//更改司机状态
			public boolean updateState(String name, DriverState state) throws RemoteException;
		

}
