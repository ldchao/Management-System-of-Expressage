package Server.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PayeeorderPO;

public interface CalculateDataService extends Remote{
	
	// �����ں�Ӫҵ�������տ���Ϣ
	public ArrayList<PayeeorderPO> find(String data,String shop)throws RemoteException;
	
	// �������տ���
	public double total(double[] payee)throws RemoteException;
}
