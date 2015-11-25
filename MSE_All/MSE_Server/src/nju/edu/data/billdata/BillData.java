package nju.edu.data.billdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.billdataservice.BillDataService;
import PO.StartinfoPO;

@SuppressWarnings("serial")
public class BillData extends UnicastRemoteObject implements BillDataService {

	public BillData() throws RemoteException {
		super();
	}

	@Override
	public void insert(StartinfoPO po) throws RemoteException {

		ArrayList<String> list = new ArrayList<String>();

		list.add(po.getName() + ";" + po.getAccount() + ";"
				+ po.getOrganization() + ";" + po.getStaff() + ";"
				+ po.getVehicle() + ";" + po.getStore());

		fileWriter.Writer("DataBase/Startinfo.txt", list, true);
	}

	@Override
	public ArrayList<StartinfoPO> find() throws RemoteException {
		ArrayList<StartinfoPO> stpo = new ArrayList<>();

		ArrayList<String> filelist = fileReader.Reader("DataBase/Startinfo.txt");
		for (String fl : filelist) {
			String[] str = fl.split(";");
			StartinfoPO startinfoPO = new StartinfoPO(str[0], str[1], str[2],
					str[3], str[4], str[5]);
			stpo.add(startinfoPO);
		}

		return stpo;
	}

}
