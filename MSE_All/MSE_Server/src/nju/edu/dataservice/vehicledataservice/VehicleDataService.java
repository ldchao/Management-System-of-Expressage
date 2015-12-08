package nju.edu.dataservice.vehicledataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.VehiclePO;
import State.TransportState;

public interface VehicleDataService extends Remote{
	
	//�½�������Ϣ
	public void insert(VehiclePO po) throws RemoteException;
	
	//���³�����Ϣ
	public void update(VehiclePO po) throws RemoteException;
	
	//���ҳ�����Ϣ
	public VehiclePO find(String carNum) throws RemoteException;
	
	//ɾ��������Ϣ
	public void delete(VehiclePO po) throws RemoteException;
	
	//�Ƿ����
	public boolean isExist(String carNum) throws RemoteException;
	
	//���ĳ���״̬
	public boolean updateState(String carNum, TransportState state) throws RemoteException;
	
}