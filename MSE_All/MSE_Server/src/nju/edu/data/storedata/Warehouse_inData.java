package nju.edu.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.storedataservice.Warehouse_inDataService;
import PO.StoreinorderPO;
import State.ApproveState;

public class Warehouse_inData extends UnicastRemoteObject implements Warehouse_inDataService{

	public Warehouse_inData() throws RemoteException {
		super();
	}

	//在数据库中插入一条入库单PO
	@Override
	public void insert(StoreinorderPO sp) throws RemoteException {
		String storeinorder=sp.getOrder_number()+";"+sp.getDate()+";"+sp.getOffnum()
				+";"+sp.getQu()+";"+sp.getPai()+";"+sp.getJia()
				+";"+sp.getWei()+";"+sp.getCheck_state();
		if(sp.getCheck_state()==ApproveState.NotApprove){
			fileWriter.Writer("DataBase/UncheckedStoreinorder.txt", storeinorder, true);
		}else{
		fileWriter.Writer("DataBase/Storeinorder.txt", storeinorder, true);
		}
	}
	//查看未入库的到达单
	@Override
	public ArrayList<String> checkUnstoreinArriveorder() throws RemoteException{
		
		ArrayList<String> Arriveorderlist = fileReader
				.Reader("DataBase/unStorein_Arriveorder.txt");
		return Arriveorderlist;
	}

	@Override
	public void deleteRemind() throws RemoteException {
		fileWriter.Writer("DataBase/unStorein_Arriveorder.txt","", false);
		
	}

}
