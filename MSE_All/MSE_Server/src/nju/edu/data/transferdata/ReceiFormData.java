package nju.edu.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.ReceiveorderPO;
import State.ApproveState;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.transferdataservice.ReceiFormDataService;

public class ReceiFormData extends UnicastRemoteObject implements ReceiFormDataService{

	public ReceiFormData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(ReceiveorderPO PO) throws RemoteException {
		String new_arriverorder = PO.getDate() + ";" + PO.getDepartPlace()
				+ ";" + PO.getArrivePlace() + ";" + PO.getArriveState() + ";";
		for (String s:PO.getOrder()) {
			new_arriverorder+=s+" ";
		}
		String s=new_arriverorder+";"+ApproveState.NotApprove;
		new_arriverorder+=(";"+PO.getApproveState());
		if(PO.getApproveState()==ApproveState.NotApprove)
			fileWriter.Writer("DataBase/UncheckedReceiverorder.txt", new_arriverorder, true);
		else{
        fileWriter.Writer("DataBase/Receiverorder.txt", new_arriverorder, true);
        deleteUncheckedReceiverorder(s);
        }
		
	}
	//得到未审批的接收单
	@Override
	public ArrayList<String> get() throws RemoteException {
		ArrayList<String> list=fileReader.Reader("DataBase/UncheckedReceiverorder.txt");
		return list;
	}

	private void deleteUncheckedReceiverorder(String s){
		ArrayList<String> list=fileReader.Reader("DataBase/UncheckedReceiverorder.txt");

		list.remove(s);
		fileWriter.Writer("DataBase/UncheckedReceiverorder.txt", list, false);
		 
	}
}
