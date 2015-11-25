package nju.edu.RMI_init;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import nju.edu.data.accountdata.AccountData;
import nju.edu.data.billdata.BillData;
import nju.edu.data.checklistdata.ChecklistData;
import nju.edu.data.financedata.CalculateData;
import nju.edu.data.financedata.PayeeorderData;
import nju.edu.data.financedata.PayorderData;
import nju.edu.data.financedata.StatisticsData;
import nju.edu.data.loaddata.LoadData;
import nju.edu.data.loaddata.ShippingData;
import nju.edu.data.staffdata.UserData;
import nju.edu.data.storedata.Inventory_managementData;
import nju.edu.data.storedata.Warehouse_inData;
import nju.edu.data.storedata.Warehouse_outData;
import nju.edu.data.transferdata.ReceiFormData;
import nju.edu.data.transferdata.ReceiveData;
import nju.edu.data.transferdata.SendFormData;
import nju.edu.data.transferdata.TransferData;
import nju.edu.data.vehicledata.DriverData;
import nju.edu.data.vehicledata.VehicleData;

public class RMIHelper {

	private static Map<String, Class<? extends UnicastRemoteObject>> NAMING_MAP = new HashMap<>();
	private static final int PORT = 1099;
	private static boolean inited = false;

	static {
		NAMING_MAP.put("AccountData", AccountData.class);
		// NAMING_MAP.put("ApproveData", ApproveData.class);
		NAMING_MAP.put("BillData", BillData.class);
		NAMING_MAP.put("ChecklistData", ChecklistData.class);
		NAMING_MAP.put("CalculateData", CalculateData.class);
		NAMING_MAP.put("PayorderData", PayorderData.class);
		NAMING_MAP.put("PayeeorderData", PayeeorderData.class);
		NAMING_MAP.put("StatisticsData", StatisticsData.class);
		// // NAMING_MAP.put("ListinData", ListinData.class);
		// NAMING_MAP.put("ReceiverData", ReceiverData.class);
		NAMING_MAP.put("LoadData", LoadData.class);
		NAMING_MAP.put("ShippingData", ShippingData.class);
		// NAMING_MAP.put("ConstantData", ConstantData.class);
		// NAMING_MAP.put("SalaryPolicyData", SalaryPolicyData.class);
		// NAMING_MAP.put("StaffData", StaffData.class);
		NAMING_MAP.put("UserData", UserData.class);
		NAMING_MAP.put("Warehouse_inData", Warehouse_inData.class);
		NAMING_MAP.put("Warehouse_outData", Warehouse_outData.class);
		NAMING_MAP.put("Inventory_managementData", Inventory_managementData.class);
		NAMING_MAP.put("ReceiFormData", ReceiFormData.class);
		NAMING_MAP.put("ReceiveData", ReceiveData.class);
		NAMING_MAP.put("SendFormData", SendFormData.class);
		NAMING_MAP.put("TransferData", TransferData.class);
		NAMING_MAP.put("DriverData", DriverData.class);
		NAMING_MAP.put("VehicleData", VehicleData.class);
	}

	public synchronized static void init() throws ServerInitException {
		if (inited) {
			return;
		}
		try {
			LocateRegistry.createRegistry(PORT);
			for (Entry<String, Class<? extends UnicastRemoteObject>> entry : NAMING_MAP.entrySet()) {
				String name = entry.getKey();
				Class<? extends UnicastRemoteObject> clazz = entry.getValue();
				UnicastRemoteObject proxy = clazz.newInstance();
				Naming.rebind(name, proxy);
			}
			inited = true;
		} catch (Exception e) {
			throw new ServerInitException(e);
		}
	}
}
