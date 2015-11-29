package nju.edu.data.policydata;

import java.io.File;
import java.io.FileReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import PO.ConstantPO;
import nju.edu.data.FileIO.fileReader;
import nju.edu.dataservice.policydataservice.ConstantPolicyDataService;

public class ConstantPolicyData extends UnicastRemoteObject implements ConstantPolicyDataService{
	
//	public static void main(String []args){
//		ConstantPolicyData constantPolicyData;
//		try {
//			constantPolicyData = new ConstantPolicyData();
//			constantPolicyData.find("南京栖霞区营业厅","南京栖霞区营业厅");
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
	
	public ConstantPolicyData() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ConstantPO find(String address1, String address2) throws RemoteException {
		// TODO Auto-generated method stub
		ConstantPO po=null;
		fileReader fileReader=new fileReader();
		ArrayList<String> arrayList=fileReader.Reader("Database/Constant.txt");
		for(int i=0;i<arrayList.size();i++){
			if(arrayList.get(i).equals(address1)&&arrayList.get(i+1).equals(address2)){
				po=new ConstantPO(arrayList.get(i), arrayList.get(i+1), Double.parseDouble(arrayList.get(i+2)), Double.parseDouble(arrayList.get(i+3)));
				break;
			}
		}
		return po;
	}

	@Override
	public void updateConstant(ConstantPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPrice(String address1, String address2) throws RemoteException {
		// TODO Auto-generated method stub
		double result=0;
		ConstantPO po=find(address1, address2);
		result=po.getPrice()*po.getDistance();
		return result;
	}

	@Override
	public double GetDistance(String address1, String address2) throws RemoteException{
		// TODO Auto-generated method stub
		double result=0;
		ConstantPO po=find(address1, address2);
		result=po.getDistance();
		return result;
	}
	
}
