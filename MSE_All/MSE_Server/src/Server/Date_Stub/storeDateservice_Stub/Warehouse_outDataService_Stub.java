package Server.Date_Stub.storeDateservice_Stub;

import java.rmi.RemoteException;

import PO.StoreoutorderPO;
import Server.dataservice.storedataservice.Warehouse_outDataService;

public class Warehouse_outDataService_Stub implements Warehouse_outDataService{

	//�����ݿ��в���һ�����ⵥPO
	@Override
	public void insert(StoreoutorderPO sp) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("�½��ɹ�");
	}

}
