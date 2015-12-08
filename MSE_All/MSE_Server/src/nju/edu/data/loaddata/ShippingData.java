package nju.edu.data.loaddata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.loaddataservice.ShippingDataService;
import PO.LoadorderPO;
import State.ApproveState;

public class ShippingData extends UnicastRemoteObject implements
		ShippingDataService {

	public ShippingData() throws RemoteException {
		super();
	}

	// 在数据库中插入一个装运单PO
	@Override
	public void insert(LoadorderPO lp) throws RemoteException {
		String list = "";
		for (String s : lp.getOrder()) {
			list += s + " ";
		}
		String new_arriverorder = lp.getLoadorderNum() + ";" + lp.getDate()
				+ ";" + lp.getTransferNum() + ";" + lp.getArriveNum() + ";"
				+ lp.getMonitorName() + ";" + lp.getTransferName() + ";"
				+ lp.getTransportNum() + ";" + list + ";" + lp.getFee() + ";"
				+ lp.getCheckState();
		if (lp.getCheckState() == ApproveState.NotApprove)
			fileWriter.Writer("DataBase/UncheckedLoadorder.txt",
					new_arriverorder, true);
		else {
			fileWriter.Writer("DataBase/Loadorder.txt", new_arriverorder, true);
			deleteUncheckedLoadorder(lp.getLoadorderNum());
			fileWriter.Writer("DataBase/unReceive_Loadorder.txt",
					new_arriverorder, true);
		}

	}

	// 查看需要装运的中转单
	@Override
	public ArrayList<String> checkUnshippingChangeorder()
			throws RemoteException {
		ArrayList<String> Changeorderlist = fileReader
				.Reader("DataBase/unShipping_Changeorder.txt");
		return Changeorderlist;
	}

	// 删除已经进行装运管理的中转单
	@Override
	public void deleteChangeorder(String numOfTransfer) throws RemoteException {
		ArrayList<String> Changeorderlist = fileReader
				.Reader("DataBase/unShipping_Changeorder.txt");
		for (String s : Changeorderlist) {
			if (s.startsWith(numOfTransfer + ";")) {
				Changeorderlist.remove(s);
				break;
			}
		}
		fileWriter.Writer("DataBase/unShipping_Changeorder.txt",
				Changeorderlist, false);
	}

	// 查看未审批的装运单
	@Override
	public ArrayList<LoadorderPO> get() throws RemoteException {
		ArrayList<String> list = fileReader
				.Reader("DataBase/UncheckedLoadorder.txt");
		ArrayList<LoadorderPO> loadorderList = new ArrayList<LoadorderPO>();
		ArrayList<String> orderList = new ArrayList<String>();

		for (String s : list) {
			String[] loadorder = s.split(";");
			orderList.clear();
			orderList.add(loadorder[7]);
			LoadorderPO lp = new LoadorderPO(loadorder[1], loadorder[0],
					loadorder[2], loadorder[3], loadorder[4], loadorder[5],
					loadorder[6], orderList, Double.parseDouble(loadorder[8]),
					ApproveState.NotApprove);
			loadorderList.add(lp);
		}
		return loadorderList;
	}

	private void deleteUncheckedLoadorder(String id) {
		ArrayList<String> Loadorderlist = fileReader
				.Reader("DataBase/UncheckedLoadorder.txt");
		for (String s : Loadorderlist) {
			if (s.startsWith(id)) {
				Loadorderlist.remove(s);
				break;
			}
		}
		fileWriter.Writer("DataBase/UncheckedLoadorder.txt", Loadorderlist,
				false);
	}

}
