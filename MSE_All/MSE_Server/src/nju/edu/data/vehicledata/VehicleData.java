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
import nju.edu.dataservice.vehicledataservice.VehicleDataService;

@SuppressWarnings("serial")
public class VehicleData extends UnicastRemoteObject implements VehicleDataService{

	public VehicleData() throws RemoteException {
		super();
	}

	@Override
	public void insert(VehiclePO po) throws RemoteException {
		fileWriter fileWriter=new fileWriter();
		String temp="";
		temp+=po.getCarNum()+";";
		temp+=po.getEngineNum()+";";
		temp+=po.getCar()+";";
		temp+=po.getDriver()+";";
		temp+=po.getBaseNum()+";";
		temp+=po.getBuyDate()+";";
		temp+=po.getUseDate()+";";
		temp+=po.getCarState().toString();
		fileWriter.Writer("Database/Vehicle.txt", temp, true);
	}

	@Override
	public void update(VehiclePO po) throws RemoteException {
		VehicleData data = new VehicleData();
		data.delete(data.find(po.getCarNum()));
		data.insert(po);
	}

	@Override
	public VehiclePO find(String carNum) throws RemoteException {
		VehiclePO po;
		fileReader fileReader = new fileReader();
		String[] temp = null;
		ArrayList<String> arrayList = fileReader.Reader("Database/Vehicle.txt");
		for (int i = 0; i < arrayList.size(); i++) {
			temp = arrayList.get(i).split(";");
			if (temp[0].equals(carNum)) {
				break;
			}
		}
		
		TransportState state = null;
		switch (temp[7]) {
		case "Busy":state = TransportState.Busy;
	 	case "Available":state = TransportState.Available;
			break;
		default:
			break;
		}
		
		po = new VehiclePO(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6],state);
		return po;
	}

	@Override
	public void delete(VehiclePO po) throws RemoteException {
		fileReader fileReader = new fileReader();
		String[] temp = null;
		ArrayList<String> arrayList = fileReader.Reader("Database/Vehicle.txt");
		for (int i = 0; i < arrayList.size(); i++) {
			temp = arrayList.get(i).split(";");
			if (temp[0].equals(po.getCarNum())) {
				arrayList.remove(i);
				break;
			}
		}
		fileWriter fileWriter = new fileWriter();
		fileWriter.Writer("Database/Vehicle.txt", arrayList, false);
		
		
	}

	@Override
	public boolean isExist(String carNum) throws RemoteException {
		boolean isExist = false;
		fileReader fileReader = new fileReader();
		String[] temp = null;
		ArrayList<String> arrayList = fileReader.Reader("Database/Vehicle.txt");
		for (int i = 0; i < arrayList.size(); i++) {
			temp = arrayList.get(i).split(";");
			if (temp[0].equals(carNum)) {
				isExist = true;
			}
		}
		return isExist;
	}

	@Override
	public boolean updateState(String carNum, TransportState state) {
		boolean success = false;
		VehicleData data;
		DriverData data2;
		DriverState driverState = DriverState.Available;
		if (state.toString().equals("Busy")) {
			driverState = DriverState.Busy;
		}
		
		try {
			data = new VehicleData();
			data2 = new DriverData();
			VehiclePO po = data.find(carNum);
			po.setCarState(state);
			data.update(po);
			if (data.find(carNum).getCarState() == state) {
				success = data2.updateState(po.getDriver(), driverState);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}
}
