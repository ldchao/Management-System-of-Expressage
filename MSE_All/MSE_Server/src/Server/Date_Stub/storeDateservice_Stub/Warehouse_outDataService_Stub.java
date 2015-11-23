package Server.Date_Stub.storeDateservice_Stub;

import java.rmi.RemoteException;

import PO.StoreoutorderPO;
import Server.dataservice.storedataservice.Warehouse_outDataService;

public class Warehouse_outDataService_Stub implements Warehouse_outDataService{

	//在数据库中插入一条出库单PO
	@Override
	public void insert(StoreoutorderPO sp) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("新建成功");
	}

}
