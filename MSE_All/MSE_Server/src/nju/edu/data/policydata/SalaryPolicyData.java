package nju.edu.data.policydata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.SalaryPO;
import State.SalaryModel;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.policydataservice.SalaryPolicyDataService;

public class SalaryPolicyData extends UnicastRemoteObject implements SalaryPolicyDataService{

	public SalaryPolicyData() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public SalaryPO get(String typeOfStaff) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		String [] strings={"快递员","营业厅业务员","中转中心业务员","中转中心仓库管理员","高级财务人员","低级财务人员","总经理","管理员"};
		int temp=-1;
		for(int i=0;i<strings.length;i++){
			if(typeOfStaff.equals(strings[i])){
				temp=i;
			}
		}
		ArrayList<String> arrayList=fileReader.Reader("Database/Salary.txt");
		String[] strings2=arrayList.get(temp).split(";");
		SalaryModel typeOfStrategy=SelectModel(strings2[2]);
		SalaryPO po=new SalaryPO(strings2[0], Double.parseDouble(strings2[1]), typeOfStrategy);
		return po;
	}

	private SalaryModel SelectModel(String string) {
		// TODO Auto-generated method stub
		String[] strings={"ByMonth","ByTimes","ByTimes"};
		if(string.equals(strings[0])){
			return SalaryModel.ByMonth;
		}else if(string.equals(strings[1])){
			return SalaryModel.ByTimes;
		}else{
			return SalaryModel.ByBenefit;
		}
	}

	@Override
	public void updateSalary(SalaryPO po) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		String string=""+po.getTypeOfStaff()+";"+po.getSalary()+";"+po.getTypeOfStrategy();
		ArrayList<String> strings=fileReader.Reader("Database/Salary.txt");
		for(int i=0;i<strings.size();i++){
			String[] temp=strings.get(i).split(";");
			if(temp[0].equals(po.getTypeOfStaff())){
				strings.set(i, string);
			}
		}
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/Salary.txt", strings, false);
	}

}
