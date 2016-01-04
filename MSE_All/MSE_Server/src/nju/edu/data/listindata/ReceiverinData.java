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
		String temp=po.getCourier()+";"+po.getPhoneOfcourier()+";"+po.getId()
		+";"+po.getTime()+";"+po.getReceiver()+";"+po.getPhone()+";"+po.getCellphone()
		+";"+po.getPosition()+";"+po.getAddress();
		fileWriter fileWriter=new fileWriter();
		fileWriter.Writer("Database/Receiver.txt", temp, true);
	}

	@Override
	public boolean find(String number) throws RemoteException {
		// TODO Auto-generated method stub
		boolean result=false;
		fileReader fileReader=new fileReader();
		ArrayList<String> arrayList=fileReader.Reader("Database/UnReceiveOrder.txt");
		for(int i=0;i<arrayList.size();i++){
			String [] temp=arrayList.get(i).split(";");
			if(temp[1].equals(number)){
				result=true;
				break;
			}
		}
		return result;
	}

	@Override
	public void delete(ReceiverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=fileReader.Reader("UnReceiveOrder.txt");
		String[] temp=null;
		for(int i=0;i<arrayList.size();i++){
			temp=arrayList.get(i).split(";");
			if(temp[1].equals(po.getId())){
				fileWriter.Writer("Order.txt", arrayList.get(i), true);
				arrayList.remove(i);
				break;
			}
		}
	}

}
