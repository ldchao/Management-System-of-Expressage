package nju.edu.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.ReceiveorderPO;
import State.ApproveState;
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
		new_arriverorder+=(";"+PO.getApproveState());
		if(PO.getApproveState()==ApproveState.NotApprove)
			fileWriter.Writer("DataBase/UncheckedReceiverorder.txt", new_arriverorder, true);
		else{
        fileWriter.Writer("DataBase/Receiverorder.txt", new_arriverorder, true);
        }
		
	}

}
