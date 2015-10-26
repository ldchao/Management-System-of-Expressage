package Server.Date_Stub.transferDateservice_Stub;

import java.rmi.RemoteException;

import Client.PO.ArriverorderPO;
import Server.dataservice.transferdataservice.ReceiveDataService;

public class ReceiveDataService_Stub implements ReceiveDataService{

	//在数据库中插入一个中转中心到达单的PO
	@Override
	public void insert(ArriverorderPO ap) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("新建成功");
	}

}
