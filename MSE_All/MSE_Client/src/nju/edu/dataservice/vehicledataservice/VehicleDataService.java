package nju.edu.dataservice.vehicledataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.VehiclePO;

public interface VehicleDataService extends Remote{
	
	//�½�������Ϣ
	public void insert(VehiclePO po) throws RemoteException;
	
	//���³�����Ϣ
	public void update(VehiclePO po) throws RemoteException;
	
	//���ҳ�����Ϣ
	public VehiclePO find(String carNum) throws RemoteException;
	
	//ɾ��������Ϣ
	public void delete(VehiclePO po) throws RemoteException;
	
}