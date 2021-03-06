package nju.edu.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.financedataservice.PayorderDataService;
import PO.PayorderPO;
import State.ApproveState;

@SuppressWarnings("serial")
public class PayorderData extends UnicastRemoteObject implements PayorderDataService {

	public PayorderData() throws RemoteException {
		super();
	}

	@Override
	public void insert(PayorderPO po) {

		String list = po.getDate() + ";" + po.getMoney() + ";" + po.getAccount() + ";" + po.getList() + ";"
				+ po.getComment() + ";" + po.getPayor();
		if (po.getState() == ApproveState.Valid)
			fileWriter.Writer("DataBase/Payorder.txt", list, true);
		else if (po.getState() == ApproveState.NotApprove)
			fileWriter.Writer("DataBase/uncheckedPayorder.txt", list, true);
	}

	@Override
	public ArrayList<PayorderPO> find() {

		// checked already
		ArrayList<PayorderPO> paylist = new ArrayList<>();
		ArrayList<String> fileList = fileReader.Reader("DataBase/Payorder.txt");
		for (String fl : fileList) {
			String str[] = fl.split(";");
			PayorderPO payorderPO = new PayorderPO(str[0], Double.parseDouble(str[1]), str[2], str[3], str[4], str[5],
					ApproveState.Valid);
			paylist.add(payorderPO);
		}

		// unchecked
		ArrayList<String> unfileList = fileReader.Reader("DataBase/uncheckedPayorder.txt");
		for (String fl : unfileList) {
			String str[] = fl.split(";");
			PayorderPO payorderPO = new PayorderPO(str[0], Double.parseDouble(str[1]), str[2], str[3], str[4], str[5],
					ApproveState.Invalid);
			paylist.add(payorderPO);
		}

		return paylist;
	}

	public void delete(PayorderPO po) throws RemoteException {

		ArrayList<String> filelist = fileReader.Reader("DataBase/uncheckedPayorder.txt");
		ArrayList<String> list = new ArrayList<>();

		for (String str : filelist) {
			String part[] = str.split(";");
			if (!part[0].equals(po.getDate()) || Double.parseDouble(part[1]) != po.getMoney()
					|| !part[2].equals(po.getAccount()) || !part[3].equals(po.getList())
					|| !part[4].equals(po.getComment()) || !part[5].equals(po.getPayor())) {
				list.add(str);
			}
		}

		fileWriter.Writer("DataBase/uncheckedPayorder.txt", list, false);
	}

	@Override
	public ArrayList<PayorderPO> findUnchecked() throws RemoteException {
		// checked already
		ArrayList<PayorderPO> paylist = new ArrayList<>();
		ArrayList<String> fileList = fileReader.Reader("DataBase/uncheckedPayorder.txt");
		for (String fl : fileList) {
			String str[] = fl.split(";");
			PayorderPO payorderPO = new PayorderPO(str[0], Double.parseDouble(str[1]), str[2], str[3], str[4], str[5],
					ApproveState.Valid);
			paylist.add(payorderPO);
		}

		return paylist;
	}

}
