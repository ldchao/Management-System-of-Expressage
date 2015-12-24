package nju.edu.data.policydata;

import java.io.File;
import java.io.FileReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import PO.ConstantPO;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.policydataservice.ConstantPolicyDataService;

public class ConstantPolicyData extends UnicastRemoteObject implements ConstantPolicyDataService {

	public ConstantPolicyData() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ConstantPO find(String address1, String address2) throws RemoteException {
		// TODO Auto-generated method stub
		ConstantPO po = null;
		fileReader fileReader = new fileReader();
		ArrayList<String> arrayList = fileReader.Reader("Database/Constant.txt");
		// 用映射的方式指定下标对应城市
		String[] strings = { "南京", "北京", "广州", "上海" };
		String a = address1.substring(0, 2);
		String b = address2.substring(0, 2);
		int num1 = -1, num2 = -1;
		for (int i = 0; i < strings.length; i++) {
			if (a.equals(strings[i])) {
				num1 = i;
			}
			if (b.equals(strings[i])) {
				num2 = i;
			}
		}
		if (num1 == -1 || num2 == -1) {
			return null;
		}else{
			String[] t1 = arrayList.get(num1).split(";");
			String[] t2 = t1[num2].split(",");
			po = new ConstantPO(address1, address2, Double.parseDouble(t2[0]), Double.parseDouble(t2[1]));
			return po;
		}
	}

	@Override
	public void updateConstant(ConstantPO po) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader = new fileReader();
		fileWriter fileWriter = new fileWriter();
		ArrayList<String> arrayList = fileReader.Reader("Database/Constant.txt");
		String[] city = { "南京", "北京", "广州", "上海" };
		int a = -1, b = -1;
		for (int i = 0; i < city.length; i++) {
			if (po.getAddress1().equals(city[i])) {
				a = i;
			}
			if (po.getAddress2().equals(city[i])) {
				b = i;
			}
		}

		String[] temp = arrayList.get(a).split(";");
		temp[b] = po.getDistance() + "," + po.getPrice();
		String t = "";
		for (int i = 0; i < temp.length; i++) {
			t = t + temp[i] + ";";
		}
		arrayList.set(a, t);
		fileWriter.Writer("Database/Constant.txt", arrayList, false);
	}

	@Override
	public double getPrice(String address1, String address2) throws RemoteException {
		// TODO Auto-generated method stub
		double result = 0;
		ConstantPO po = find(address1, address2);
		result = po.getPrice() * po.getDistance();
		return result;
	}

	@Override
	public double GetDistance(String address1, String address2) throws RemoteException {
		// TODO Auto-generated method stub
		double result = 0;
		ConstantPO po = find(address1, address2);
		result = po.getDistance();
		return result;
	}

}
