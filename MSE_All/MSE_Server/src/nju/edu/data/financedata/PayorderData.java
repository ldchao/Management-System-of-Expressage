package nju.edu.data.financedata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

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

		ArrayList<String> arrayList = new ArrayList<String>();
		File payfile = new File("DataBase/Payorder.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(payfile));
			String line;
			while ((line = reader.readLine()) != null)
				arrayList.add(line);

			reader.close();

			arrayList.add(po.getDate() + ";" + po.getMoney() + ";"
					+ po.getAccount() + ";" + po.getList() + ";"
					+ po.getComment() + ";" + po.getPayor());

			FileWriter writer = new FileWriter(payfile);
			for (String str : arrayList) {
				writer.write(str + "\n");
			}
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public ArrayList<PayorderPO> find() {
		ArrayList<PayorderPO> paylist = new ArrayList<>();
		
		// 读取Payorder.txt，并显示到表格中
		File payfile = new File("DataBase/Payorder.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(payfile));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] str = line.split(";");
				PayorderPO payorderPO = new PayorderPO(str[0],
						Double.parseDouble(str[1]), str[2], str[3], str[4],
						str[5]);
				paylist.add(payorderPO);
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
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
