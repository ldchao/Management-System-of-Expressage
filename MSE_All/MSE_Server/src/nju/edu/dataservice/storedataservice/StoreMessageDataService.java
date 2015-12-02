package nju.edu.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.StorePO;

public interface StoreMessageDataService extends Remote{
	    //从文件中读取当前最新的库存信息（警戒值，管理值，各个位置所存单据）
        public StorePO getStoreMessage()throws RemoteException;
        //在仓库管理人员退出时将当前信息存储到文件中
        public void saveStoreMessage(StorePO sp)throws RemoteException;
}
