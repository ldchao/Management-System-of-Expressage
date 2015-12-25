package nju.edu.data.staffdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.StaffPO;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.staffdataservice.StaffDataService;

public class StaffData extends UnicastRemoteObject implements StaffDataService {
	public StaffData() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<StaffPO> gets() throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader = new fileReader();
		ArrayList<String> arrayList = fileReader.Reader("Database/Staff.txt");
		ArrayList<StaffPO> staffPOs=new ArrayList<StaffPO>();
		for(int i=0;i<arrayList.size();i++){
			String[] strings=arrayList.get(i).split(";");
			StaffPO po=new StaffPO(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6]);
			staffPOs.add(po);
		}
		return staffPOs;
	}
//根据用户名查找po
	@Override
	public StaffPO get(String name) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader = new fileReader();
		ArrayList<String> arrayList = fileReader.Reader("Database/Staff.txt");
		String[] strings = null;
		StaffPO staffPO = null;
		for (int i = 0; i < arrayList.size(); i++) {
			strings = arrayList.get(i).split(";");
			if (strings[0].equals(name)) {
				staffPO = new StaffPO(strings[0], strings[1], strings[2],
						strings[3], strings[4], strings[5], strings[6]);
				break;
			}
		}
		return staffPO;
	}

	@Override
	public void insert(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		String temp=po.getId()+";"+po.getName()+";"+po.getAddress()+";"+po.getPosition()
					+";"+po.getPhone()+";"+po.getCellphone()+";"+po.getShop();
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/StaffWithoutID.txt", temp, true);
	}

	@Override
	public void delete(String id) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		ArrayList<String> arrayList=fileReader.Reader("Database/Staff.txt");
		for(int i=0;i<arrayList.size();i++){
			String []strings = arrayList.get(i).split(";");
			if (strings[0].equals(id)) {
				arrayList.remove(i);
			}
		}
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/Staff.txt", arrayList, false);
	}

	@Override
	public void update(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		ArrayList<String> arrayList=fileReader.Reader("Database/Staff.txt");
		String temp=po.getId()+";"+po.getName()+";"+po.getAddress()+";"+po.getPosition()
		+";"+po.getPhone()+";"+po.getCellphone()+";"+po.getShop();
		for(int i=0;i<arrayList.size();i++){
			String []strings = arrayList.get(i).split(";");
			if (strings[0].equals(po.getId())) {
				arrayList.set(i, temp);
			}
		}
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/Staff.txt", arrayList, false);
	}


	@Override
	public void editTheID(String oldID,String newID,String position) throws RemoteException {
		// TODO Auto-generated method stub
		StaffPO po=null;
		try {
			po=get(oldID);
			po.setId(newID);
			po.setPosition(position);
			update(po);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public int getnum() throws RemoteException {
		fileReader fileReader=new fileReader();
		ArrayList<String> arrayList=fileReader.Reader("Database/temporaryNum.txt");
		int a=Integer.parseInt(arrayList.get(0));
		fileWriter.Writer("Database/temporaryNum.txt", a+1+"", false);
		return a;
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<StaffPO> getAllStaff() throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		ArrayList<String> strings=fileReader.Reader("Database/StaffWithoutID.txt");
		ArrayList<StaffPO> staffPOs=new ArrayList<>();
		for(String temp:strings){
			String[] t=temp.split(";");
			StaffPO po=new StaffPO(t[0], t[1], t[2], t[3], t[4], t[5], t[6]);
		}
		return staffPOs;
	}

	@Override
	public void exchange(String id, StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		fileReader fileReader=new fileReader();
		ArrayList<String> arrayList=fileReader.Reader("Database/StaffWithouID.txt");
		String []temp=null;
		int signal=-1;
		for(int i=0;i<arrayList.size();i++){
			temp=arrayList.get(i).split(";");
			if(po.getId().equals(temp[0])){
				signal=i;
			}
		}
		if(signal>-1){
			arrayList.remove(signal);
		}
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/StaffWithoutID.txt", arrayList, false);
		po.setId(id);
		String info=po.getId()+";"+po.getName()+";"+po.getAddress()+";"+po.getPosition()
		+";"+po.getPhone()+";"+po.getCellphone()+";"+po.getShop();
		fileWriter.Writer("Database/Staff.txt", info, true);
	}

}
