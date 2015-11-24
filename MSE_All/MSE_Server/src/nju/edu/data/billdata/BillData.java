package nju.edu.data.billdata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.dataservice.billdataservice.BillDataService;
import PO.StartinfoPO;

public class BillData extends UnicastRemoteObject implements BillDataService {

	public BillData() throws RemoteException {
		super();
	}

	@Override
	public void insert(StartinfoPO po) throws RemoteException {

		ArrayList<String> list = new ArrayList<String>();
		File billfile = new File("DataBase/Startinfo.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(billfile));
			String line;
			while ((line = reader.readLine()) != null)
				list.add(line);

			reader.close();

			list.add(po.getName() + ";" + po.getAccount() + ";"
					+ po.getOrganization() + ";" + po.getStaff() + ";"
					+ po.getVehicle() + ";" + po.getStore());

			FileWriter writer = new FileWriter(billfile);
			for (String str : list) {
				writer.write(str + "\n");
			}
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public ArrayList<StartinfoPO> find() throws RemoteException {
		ArrayList<StartinfoPO> stpo = new ArrayList<>();

		// 读取Startinfo.txt，并显示到表格中
		File billfile = new File("DataBase/Startinfo.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(billfile));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] str = line.split(";");
				StartinfoPO startinfoPO = new StartinfoPO(str[0], str[1],
						str[2], str[3], str[4], str[5]);
				stpo.add(startinfoPO);
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stpo;
	}

}
