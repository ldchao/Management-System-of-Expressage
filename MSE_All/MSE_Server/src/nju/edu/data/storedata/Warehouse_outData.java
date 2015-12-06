package nju.edu.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.storedataservice.Warehouse_outDataService;
import PO.StoreoutorderPO;
import State.ApproveState;

public class Warehouse_outData extends UnicastRemoteObject implements  Warehouse_outDataService{

	public Warehouse_outData() throws RemoteException {
		super();
	}
	//在数据库中插入一条出库单PO
	@Override
	public void insert(StoreoutorderPO sp) throws RemoteException {
		String storeoutorder=sp.getOrder_number()+";"+sp.getDate()+";"+sp.getArrivenum()
				+";"+sp.getWay()+";"+sp.getNumberOfTransport()+";"+sp.getCheck_state();
		if(sp.getCheck_state()==ApproveState.NotApprove){
			fileWriter.Writer("DataBase/UncheckedStoreoutorder.txt", storeoutorder, true);
		}else{
		fileWriter.Writer("DataBase/Storeoutorder.txt", storeoutorder, true);
		}
		
	}
	
	// 查看未办理出库的中转单
	@Override
	public ArrayList<String> checkUnstoreoutChangeorder()
			throws RemoteException {
		ArrayList<String> Changeorderlist = fileReader
				.Reader("DataBase/unStoreout_Changeorder.txt");
		return Changeorderlist;
	}
	
	// 删除已经办理出库的中转单
	@Override
	public void deleteChangeorder(String numOfTransfer) throws RemoteException {
		ArrayList<String> Changeorderlist = fileReader
				.Reader("DataBase/unStoreout_Changeorder.txt");
		for (String s:Changeorderlist) {
			if(s.startsWith(numOfTransfer+";")){
				Changeorderlist.remove(s);
				break;}
		}
		fileWriter.Writer("DataBase/unStoreout_Changeorder.txt", Changeorderlist, false);
		
	}

}
