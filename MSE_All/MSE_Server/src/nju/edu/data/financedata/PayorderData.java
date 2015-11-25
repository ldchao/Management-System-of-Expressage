package nju.edu.data.financedata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.financedataservice.PayorderDataService;
import PO.PayeeorderPO;
import PO.PayorderPO;

public class PayorderData extends UnicastRemoteObject implements
		PayorderDataService {

	public PayorderData() throws RemoteException {
		super();
	}

	@Override
	public void insert(PayorderPO po) {

		ArrayList<String> list = new ArrayList<String>();
		list.add(po.getDate() + ";" + po.getMoney() + ";" + po.getAccount()
				+ ";" + po.getList() + ";" + po.getComment() + ";"
				+ po.getPayor());
		fileWriter.Writer("DataBase/Payorder.txt", list, true);
	}

	@Override
	public ArrayList<PayorderPO> find() {
		ArrayList<PayorderPO> paylist = new ArrayList<>();
		ArrayList<String> fileList = fileReader.Reader("DataBase/Payorder.txt");

		for (String fl : fileList) {
			String str[] = fl.split(";");
			PayorderPO payorderPO = new PayorderPO(str[0],
					Double.parseDouble(str[1]), str[2], str[3], str[4], str[5]);
			paylist.add(payorderPO);
		}

		return paylist;
	}

	@Override
	public double[] profit(ArrayList<PayorderPO> pay,
			ArrayList<PayeeorderPO> payee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excel(String date, double income, double outcome, double benefit) {
		// TODO Auto-generated method stub

	}

}
