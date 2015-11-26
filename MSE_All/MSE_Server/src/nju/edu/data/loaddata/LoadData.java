package nju.edu.data.loaddata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.LoadorderPO;
import State.ApproveState;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.loaddataservice.LoadDataService;

public class LoadData extends UnicastRemoteObject implements LoadDataService{

	public LoadData() throws RemoteException {
		super();
	}

	@Override
	public void insert(LoadorderPO PO) throws RemoteException {
		String list="";
		for (String s:PO.getOrder()) {
			list+=s+" ";
		}
		String new_arriverorder = PO.getLoadorderNum()+";"+PO.getDate()+";"+PO.getTransferNum()+";"+PO.getArriveNum()+";"+
	    PO.getMonitorName()+";"+PO.getTransferName()+";"+PO.getTransportNum()+";"+list+";"+PO.getFee()+";"+PO.getCheckState();
		if(PO.getCheckState()==ApproveState.NotApprove)
			fileWriter.Writer("DataBase/UncheckedLoadorder.txt", new_arriverorder, true);
		else{
        fileWriter.Writer("DataBase/Loadorder.txt", new_arriverorder, true);
        fileWriter.Writer("DataBase/unReceive_Loadorder.txt", new_arriverorder, true);
        }
		
	}

}
