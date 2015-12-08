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
			fileWriter.Writer("DataBase/NeedOutStoreinorder.txt", storeinorder, true);	
		}else{
		fileWriter.Writer("DataBase/Storeinorder.txt", storeinorder, true);	
		deleteUncheckedStoreinorder(sp.getOrder_number());
		}
	}
	//查看未入库的到达单
	@Override
	public ArrayList<String> checkUnstoreinArriveorder() throws RemoteException{
		
		ArrayList<String> Arriveorderlist = fileReader
				.Reader("DataBase/unStorein_Arriveorder.txt");
		return Arriveorderlist;
	}
    //清空消息提醒
	@Override
	public void deleteRemind() throws RemoteException {
		fileWriter.Writer("DataBase/unStorein_Arriveorder.txt","", false);
		
	}
    //根据订单查看对应的库存位置
	@Override
	public String[] getLocation(String id) throws RemoteException {
		String[] location =new String[4];
		ArrayList<String> Storeinorderlist = fileReader
				.Reader("DataBase/NeedOutStoreinorder.txt");
		for (String s:Storeinorderlist) {
			if(s.startsWith(id)){
				String[] storeinOrder=s.split(";");
				for (int i = 0; i < 4; i++) {
					location[i]=storeinOrder[i+3];
				}
			    Storeinorderlist.remove(s);
			    break;
			}
		}
		fileWriter.Writer("DataBase/NeedOutStoreinorder.txt", Storeinorderlist, false);
		return location;
	}
	//得到未审批的入库单
	@Override
	public ArrayList<String> get() throws RemoteException {
		ArrayList<String> StoreinOrderList=fileReader
				.Reader("DataBase/UncheckedStoreinorder.txt");
		return StoreinOrderList;
	}
	//删除审批过的入库单
	private void deleteUncheckedStoreinorder(String id){
		ArrayList<String> StoreinOrderList=fileReader
				.Reader("DataBase/UncheckedStoreinorder.txt");
		for (String s : StoreinOrderList) {
			if(s.startsWith(id)){
				StoreinOrderList.remove(s);
				break;
			}			
		}
		fileWriter.Writer("DataBase/UncheckedStoreinorder.txt", StoreinOrderList, false);
	}

}
