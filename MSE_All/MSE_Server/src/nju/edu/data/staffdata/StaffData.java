package nju.edu.data.staffdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.StaffPO;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.staffdataservice.StaffDataService;

public class StaffData extends UnicastRemoteObject implements StaffDataService {
	public StaffData() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<StaffPO> gets() throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader = new fileReader();
		ArrayList<String> arrayList = fileReader.Reader("Database/Staff.txt");
		ArrayList<StaffPO> staffPOs=new ArrayList<StaffPO>();
		for(int i=0;i<arrayList.size();i++){
			String[] strings=arrayList.get(i).split(";");
			StaffPO po=new StaffPO(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6]);
			staffPOs.add(po);
		}
		return staffPOs;
	}

	@Override
	public StaffPO get(String name) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader = new fileReader();
		ArrayList<String> arrayList = fileReader.Reader("Database/Staff.txt");
		String[] strings = null;
		StaffPO staffPO = null;
		for (int i = 0; i < arrayList.size(); i++) {
			strings = arrayList.get(i).split(";");
			if (strings[0].equals(name)) {
				staffPO = new StaffPO(strings[0], strings[1], strings[2],
						strings[3], strings[4], strings[5], strings[6]);
				break;
			}
		}
		return staffPO;
	}

	@Override
	public void insert(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		String temp=po.getId()+";"+po.getName()+";"+po.getAddress()+";"+po.getPosition()
					+";"+po.getPhone()+";"+po.getCellphone()+";"+po.getShop();
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/Staff.txt", temp, true);
	}

	@Override
	public void delete(String id) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		ArrayList<String> arrayList=fileReader.Reader("Database/Staff.txt");
		for(int i=0;i<arrayList.size();i++){
			String []strings = arrayList.get(i).split(";");
			if (strings[0].equals(id)) {
				arrayList.remove(i);
			}
		}
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/Staff.txt", arrayList, false);
	}

	@Override
	public void update(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		ArrayList<String> arrayList=fileReader.Reader("Database/Staff.txt");
		String temp=po.getId()+";"+po.getName()+";"+po.getAddress()+";"+po.getPosition()
		+";"+po.getPhone()+";"+po.getCellphone()+";"+po.getShop();
		for(int i=0;i<arrayList.size();i++){
			String []strings = arrayList.get(i).split(";");
			if (strings[0].equals(po.getId())) {
				arrayList.set(i, temp);
			}
		}
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/Staff.txt", arrayList, false);
	}


	@Override
	public void editTheID(String oldID,String newID) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
