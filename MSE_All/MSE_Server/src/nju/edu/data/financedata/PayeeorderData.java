package nju.edu.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.PayeeorderPO;
import State.ApproveState;
import nju.edu.RMI_init.RMIHelper;
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
				+ ";" + po.getCarrierName() + ";" + po.getShopperName();
		if (po.getState() == ApproveState.Valid)
			fileWriter.Writer("DataBase/Payeeorder.txt", list, true);
		else if (po.getState() == ApproveState.NotApprove)
			fileWriter.Writer("DataBase/uncheckedPayeeorder.txt", list, true);

	}
	
	public ArrayList<PayeeorderPO> checkPayeeorder(String name, String shop){
		ArrayList<PayeeorderPO> list = new ArrayList<>();
		// 读文件，并筛选
		return list;
	}

}
