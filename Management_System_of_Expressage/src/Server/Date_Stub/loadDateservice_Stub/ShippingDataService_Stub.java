package Server.Date_Stub.loadDateservice_Stub;

import java.rmi.RemoteException;

import Client.PO.LoadorderPO;
import Server.dataservice.loaddataservice.ShippingDataService;

public class ShippingDataService_Stub implements ShippingDataService{

	//�����ݿ��в���һ��װ�˵�PO
	@Override
	public void insert(LoadorderPO lp) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("�½��ɹ�");
	}

}
