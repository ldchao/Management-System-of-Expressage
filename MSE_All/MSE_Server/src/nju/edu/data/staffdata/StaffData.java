package nju.edu.data.staffdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.StaffPO;
import nju.edu.data.FileIO.fileReader;
import nju.edu.dataservice.staffdataservice.StaffDataService;

public class StaffData extends UnicastRemoteObject implements StaffDataService {
	public StaffData() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<StaffPO> gets() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
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

	}

	@Override
	public void delete(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub

	}

}
