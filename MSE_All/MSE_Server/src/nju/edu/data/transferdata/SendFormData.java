package nju.edu.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.SendorderPO;
import State.ApproveState;
import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.transferdataservice.SendFormDataService;

public class SendFormData extends UnicastRemoteObject implements SendFormDataService{

	public SendFormData() throws RemoteException {
		super();
	}

	@Override
	public void insert(SendorderPO sp) throws RemoteException {
		String new_senderorder=sp.getDate()+";"+sp.getSender()+";";
		String needtoDelete=new_senderorder;
		for (String s : sp.getOrder()) {
			new_senderorder+=s+" ";
		}
		new_senderorder+=";"+sp.getApprovestate();
		if (sp.getApprovestate() == ApproveState.NotApprove)
			fileWriter.Writer("DataBase/UncheckedSendorder.txt",
					new_senderorder, true);
		else {
			fileWriter.Writer("DataBase/Sendorder.txt", new_senderorder,
					true);
			deleteUncheckedSendorder(needtoDelete);
		}
		
	}

	@Override
	public ArrayList<String> get() throws RemoteException {
		ArrayList<String> list = fileReader
				.Reader("DataBase/UncheckedSendorder.txt");
		return list;
	}

	public void deleteUncheckedSendorder(String s){
		ArrayList<String> list = fileReader
				.Reader("DataBase/UncheckedSendorder.txt");
		for (String string : list) {
			if (string.startsWith(s)) {
				list.remove(string);
				break;
			}
		}
		fileWriter.Writer("DataBase/UncheckedSendorder.txt", list, false);

	}

}
