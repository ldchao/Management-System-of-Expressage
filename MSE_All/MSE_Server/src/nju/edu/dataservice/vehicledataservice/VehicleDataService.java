package nju.edu.dataservice.vehicledataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.VehiclePO;
import State.TransportState;

public interface VehicleDataService extends Remote{
	
	//新建车辆信息
	public void insert(VehiclePO po) throws RemoteException;
	
	//更新车辆信息
	public void update(VehiclePO po) throws RemoteException;
	
	//查找车辆信息
	public VehiclePO find(String carNum) throws RemoteException;
	
	//删除车辆信息
	public void delete(VehiclePO po) throws RemoteException;
	
	//是否存在
	public boolean isExist(String carNum) throws RemoteException;
	
	//更改车辆状态
	public boolean updateState(String carNum, TransportState state) throws RemoteException;
	
}