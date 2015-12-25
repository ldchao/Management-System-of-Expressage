package nju.edu.data.listindata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.ArriverorderPO;
import PO.LoadorderPO;
import PO.ReceiverPO;
import State.ResultMessage;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.listindataservice.ReceiverinDataService;
import nju.edu.dataservice.transferdataservice.ReceiveDataService;

public class ReceiverinData extends UnicastRemoteObject implements ReceiverinDataService{
	public ReceiverinData() throws RemoteException{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertReceiver(ReceiverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add(po.getCourier());
		arrayList.add(po.getPhoneOfcourier());
		arrayList.add(po.getId());
		arrayList.add(po.getTime());
		arrayList.add(po.getReceiver());
		arrayList.add(po.getPhone());
		arrayList.add(po.getCellphone());
		arrayList.add(po.getPosition());
		arrayList.add(po.getAddress());
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/Receiver.txt", arrayList, true);
	}

	@Override
	public boolean find(String number) throws RemoteException {
		// TODO Auto-generated method stub
		boolean result=false;
		fileReader fileReader=new fileReader();
		ArrayList<String> arrayList=fileReader.Reader("Database/Order.txt");
		for(int i=0;i<arrayList.size();i++){
			String [] temp=arrayList.get(i).split(";");
			if(temp[1].equals(number)){
				result=true;
				break;
			}
		}
		return result;
	}

}
