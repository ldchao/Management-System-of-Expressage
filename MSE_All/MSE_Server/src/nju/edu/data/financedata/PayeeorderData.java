package nju.edu.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.PayeeorderPO;
import State.ApproveState;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.financedataservice.PayeeorderDataService;

@SuppressWarnings("serial")
public class PayeeorderData extends UnicastRemoteObject implements
		PayeeorderDataService {

	public PayeeorderData() throws RemoteException {
		super();
	}

	@Override
	public void insert(PayeeorderPO po) throws RemoteException {

		String list = po.getOrder() + ";" + po.getMoney() + ";" + po.getDate()
				+ ";" + po.getCarrierName() + ";" + po.getShopperName() + ";"
				+ po.getShop();
		if (po.getState() == ApproveState.Valid)
			fileWriter.Writer("DataBase/Payeeorder.txt", list, true);
		else if (po.getState() == ApproveState.NotApprove)
			fileWriter.Writer("DataBase/uncheckedPayeeorder.txt", list, true);

	}

	public ArrayList<PayeeorderPO> checkPayeeorder(String name, String shop) {
		ArrayList<PayeeorderPO> list = new ArrayList<>();
		// 读文件，并筛选
		ArrayList<String> filelist = fileReader
				.Reader("DataBase/Payeeorder.txt");
		for (String fl : filelist) {
			String str[] = fl.split(";");
			if (name.equals(str[2]) && shop.equals(str[5])) {
				list.add(new PayeeorderPO(str[0], Double.parseDouble(str[1]),
						str[2], str[3], str[4], str[5]));
			}
		}
		return list;
	}

	public ArrayList<PayeeorderPO> checkPayeeorders() {
		ArrayList<PayeeorderPO> list = new ArrayList<>();
		// 读文件，并筛选
		ArrayList<String> filelist = fileReader
				.Reader("DataBase/Payeeorder.txt");
		for (String fl : filelist) {
			String str[] = fl.split(";");
			list.add(new PayeeorderPO(str[0], Double.parseDouble(str[1]),
					str[2], str[3], str[4], str[5]));
		}
		return list;
	}

	@Override
	public void delete(PayeeorderPO po) throws RemoteException {

		ArrayList<String> filelist = fileReader
				.Reader("DataBase/uncheckedPayeeorder.txt");
		ArrayList<String> list = filelist;

		for (String str : filelist) {
			String part[] = str.split(";");
			if (part[0].equals(po.getOrder())) {
				list.remove(str);
				break;
			}
		}

		fileWriter.Writer("DataBase/uncheckedPayeeorder.txt", list, false);
	}

}
