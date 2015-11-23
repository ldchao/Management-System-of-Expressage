package Server.Date_Stub.transferDateservice_Stub;

import java.rmi.RemoteException;

import PO.ChangeorderPO;
import Server.dataservice.transferdataservice.TransferDataService;

public class TransferDataService_Stub implements TransferDataService{

	//在数据库中插入一个中转单PO
	@Override
	public void insert(ChangeorderPO cp) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("新建成功");
	}

}
