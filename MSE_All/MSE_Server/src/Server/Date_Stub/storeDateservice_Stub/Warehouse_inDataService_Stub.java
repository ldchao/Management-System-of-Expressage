package Server.Date_Stub.storeDateservice_Stub;

import java.rmi.RemoteException;

import PO.StoreinorderPO;
import Server.dataservice.storedataservice.Warehouse_inDataService;

public class Warehouse_inDataService_Stub implements Warehouse_inDataService{

	//在数据库中插入一条入库单PO
	@Override
	public void insert(StoreinorderPO sp) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("新建成功");
	}

}
