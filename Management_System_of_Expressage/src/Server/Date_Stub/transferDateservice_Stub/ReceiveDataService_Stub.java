package Server.Date_Stub.transferDateservice_Stub;

import java.rmi.RemoteException;

import Client.PO.ArriverorderPO;
import Server.dataservice.transferdataservice.ReceiveDataService;

public class ReceiveDataService_Stub implements ReceiveDataService{

	//�����ݿ��в���һ����ת���ĵ��ﵥ��PO
	@Override
	public void insert(ArriverorderPO ap) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("�½��ɹ�");
	}

}
