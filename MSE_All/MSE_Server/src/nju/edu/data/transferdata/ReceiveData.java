package nju.edu.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.transferdataservice.ReceiveDataService;
import PO.ArriverorderPO;
import PO.LoadorderPO;
import State.ApproveState;

public class ReceiveData extends UnicastRemoteObject implements
		ReceiveDataService {

	public ReceiveData() throws RemoteException {
		super();
	}

	// 在数据库中插入一个中转中心到达单的PO
	@Override
	public void insert(ArriverorderPO ap) throws RemoteException {
		String new_arriverorder = ap.getDate() + ";" + ap.getNumberOfTransferStation()
				+ ";" + ap.getOffnum() + ";" + ap.getArrive_state() + ";"
				+ ap.getCheck_state();
        fileWriter.Writer("DataBase/Arriverorder.txt", new_arriverorder, true);
        fileWriter.Writer("DataBase/unStorein_Arriveorder.txt", new_arriverorder, true);
	}

	// 在数据中查找对应的未接收的装运单
	@Override
	public LoadorderPO checkUnreceive_loadorderPO(String s)
			throws RemoteException {
		LoadorderPO lp = null;
		String need_loadorder = "";
		boolean isHave = false;
		ArrayList<String> loadorderlist = fileReader
				.Reader("DataBase/unReceive_Loadorder.txt");
		for (String loadorder : loadorderlist) {
			if (loadorder.startsWith(s)) {
				need_loadorder = loadorder;
				loadorderlist.remove(loadorder);
				fileWriter.Writer("DataBase/unReceive_Loadorder.txt", loadorderlist, false);
				isHave = true;
				break;
			}
		}
		if (isHave) {
			String[] spit_loadorder = need_loadorder.split(";");
			String[] orderlist = spit_loadorder[7].split(" ");
			ArrayList<String> orderArraylist = new ArrayList<>();
			for (int i = 0; i < orderlist.length; i++) {
				orderArraylist.add(orderlist[i]);
			}
			lp = new LoadorderPO(spit_loadorder[0], spit_loadorder[1],
					spit_loadorder[2], spit_loadorder[3], spit_loadorder[4],
					spit_loadorder[5], spit_loadorder[6], orderArraylist,
					Double.parseDouble(spit_loadorder[8]), ApproveState.Valid);
		}

		return lp;
	}

}
