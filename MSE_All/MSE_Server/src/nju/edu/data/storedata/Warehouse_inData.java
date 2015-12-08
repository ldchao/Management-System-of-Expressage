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

	//�����ݿ��в���һ����ⵥPO
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
	//�鿴δ���ĵ��ﵥ
	@Override
	public ArrayList<String> checkUnstoreinArriveorder() throws RemoteException{
		
		ArrayList<String> Arriveorderlist = fileReader
				.Reader("DataBase/unStorein_Arriveorder.txt");
		return Arriveorderlist;
	}
    //�����Ϣ����
	@Override
	public void deleteRemind() throws RemoteException {
		fileWriter.Writer("DataBase/unStorein_Arriveorder.txt","", false);
		
	}
    //���ݶ����鿴��Ӧ�Ŀ��λ��
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
	//�õ�δ��������ⵥ
	@Override
	public ArrayList<String> get() throws RemoteException {
		ArrayList<String> StoreinOrderList=fileReader
				.Reader("DataBase/UncheckedStoreinorder.txt");
		return StoreinOrderList;
	}
	//ɾ������������ⵥ
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
