package nju.edu.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.StorePO;
import nju.edu.dataservice.storedataservice.StoreMessageDataService;

public class StoreMessageData extends UnicastRemoteObject implements StoreMessageDataService{

	
	 public StoreMessageData() throws RemoteException {
		super();
	}
	//从文件中读取当前最新的库存信息（警戒值，管理值，各个位置所存单据）
	@Override
	public StorePO getStoreMessage() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	  //在仓库管理人员退出时将当前信息存储到文件中
	@Override
	public void saveStoreMessage(StorePO sp) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	
	

}
