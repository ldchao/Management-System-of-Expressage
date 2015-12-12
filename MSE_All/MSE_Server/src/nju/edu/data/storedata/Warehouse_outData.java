package nju.edu.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.storedataservice.Warehouse_outDataService;
import PO.StoreoutorderPO;
import State.ApproveState;

public class Warehouse_outData extends UnicastRemoteObject implements
		Warehouse_outDataService {

	public Warehouse_outData() throws RemoteException {
		super();
	}

	// 在数据库中插入一条出库单PO
	@Override
	public void insert(StoreoutorderPO sp) throws RemoteException {
		String storeoutorder = sp.getOrder_number() + ";" + sp.getDate() + ";"
				+ sp.getArrivenum() + ";" + sp.getWay() + ";"
				+ sp.getNumberOfTransport() + ";" + sp.getCheck_state();
		if (sp.getCheck_state() == ApproveState.NotApprove) {
			fileWriter.Writer("DataBase/UncheckedStoreoutorder.txt",
					storeoutorder, true);
		} else {
			fileWriter
					.Writer("DataBase/Storeoutorder.txt", storeoutorder, true);
			deleteUncheckedStoreoutorder(sp.getOrder_number());
		}

	}

	// 查看未办理出库的中转单
	@Override
	public ArrayList<String> checkUnstoreoutChangeorder()
			throws RemoteException {
		ArrayList<String> Changeorderlist = fileReader
				.Reader("DataBase/unStoreout_Changeorder.txt");
		return Changeorderlist;
	}

	// 删除已经办理出库的中转单
	@Override
	public void deleteChangeorder(String numOfTransfer) throws RemoteException {
		ArrayList<String> Changeorderlist = fileReader
				.Reader("DataBase/unStoreout_Changeorder.txt");
		for (String s : Changeorderlist) {
			if (s.startsWith(numOfTransfer + ";")) {
				Changeorderlist.remove(s);
				break;
			}
		}
		fileWriter.Writer("DataBase/unStoreout_Changeorder.txt",
				Changeorderlist, false);

	}

	// 得到未审批的出库单
	@Override
	public ArrayList<String> get() throws RemoteException {
		ArrayList<String> StoreoutOrderList = fileReader
				.Reader("DataBase/UncheckedStoreoutorder.txt");
		return StoreoutOrderList;
	}

	// 删除审批过的入库单
	private void deleteUncheckedStoreoutorder(String id) {
		ArrayList<String> StoreinOrderList = fileReader
				.Reader("DataBase/UncheckedStoreoutorder.txt");
		for (String s : StoreinOrderList) {
			if (s.startsWith(id)) {
				StoreinOrderList.remove(s);
				break;
			}
		}
		fileWriter.Writer("DataBase/UncheckedStoreoutorder.txt",
				StoreinOrderList, false);
	}

}
