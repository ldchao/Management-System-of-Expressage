package nju.edu.data.vehicledata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.DriverPO;
import PO.VehiclePO;
import State.DriverState;
import State.TransportState;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.vehicledataservice.DriverDataService;

public class DriverData extends UnicastRemoteObject implements DriverDataService {

	public DriverData() throws RemoteException {
		super();
	}

	@Override
	public void insert(DriverPO po) throws RemoteException {
		fileWriter fileWriter = new fileWriter();
		String temp = "";
		temp += po.getDriverNum() + ";";
		temp += po.getName() + ";";
		temp += po.getShopNum() + ";";
		temp += po.getBirthDate() + ";";
		temp += po.getIdNum() + ";";
		temp += po.getPhoneNum() + ";";
		temp += po.getSex() + ";";
		temp += po.getLicenseDue() + ";";
		temp += po.getDriverState().toString();
		fileWriter.Writer("Database/Driver.txt", temp, true);
	}

	@Override
	public void update(DriverPO po) throws RemoteException {
		DriverData data = new DriverData();
		data.delete(data.find(po.getName()));
		data.insert(po);
	}

	@Override
	public DriverPO find(String name) throws RemoteException {
		DriverPO po;
		fileReader fileReader = new fileReader();
		String[] temp = null;
		ArrayList<String> arrayList = fileReader.Reader("Database/Driver.txt");
		for (int i = 0; i < arrayList.size(); i++) {
			temp = arrayList.get(i).split(";");
			if (temp[0].equals(name)) {
				break;
			}
		}

		DriverState state = null;
		switch (temp[8]) {
		case "Busy":
			state = DriverState.Busy;
		case "Available":
			state = DriverState.Available;
			break;
		default:
			break;
		}

		po = new DriverPO(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], state);
		return po;
	}

	@Override
	public void delete(DriverPO po) throws RemoteException {
		fileReader fileReader = new fileReader();
		String[] temp = null;
		ArrayList<String> arrayList = fileReader.Reader("Database/Driver.txt");
		for (int i = 0; i < arrayList.size(); i++) {
			temp = arrayList.get(i).split(";");
			if (temp[0].equals(po.getName())) {
				arrayList.remove(i);
				break;
			}
		}
		fileWriter fileWriter = new fileWriter();
		fileWriter.Writer("Database/Driver.txt", arrayList, false);

	}

	@Override
	public boolean isExist(String name) throws RemoteException {
		boolean isExist = false;
		fileReader fileReader = new fileReader();
		String[] temp = null;
		ArrayList<String> arrayList = fileReader.Reader("Database/Driver.txt");
		for (int i = 0; i < arrayList.size(); i++) {
			temp = arrayList.get(i).split(";");
			if (temp[0].equals(name)) {
				isExist = true;
			}
		}
		return isExist;
	}

	@Override
	public boolean updateState(String name, DriverState state) throws RemoteException {
		boolean success = false;
		DriverData data;
		try {
			data = new DriverData();
			DriverPO po = data.find(name);
			po.setDriverState(state);
			data.update(po);
			if (data.find(name).getDriverState() == state) {
				success = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}

}
