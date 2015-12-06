package nju.edu.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.transferdataservice.TransferDataService;
import PO.ChangeorderPO;
import State.ApproveState;

public class TransferData extends UnicastRemoteObject implements TransferDataService{

	public TransferData() throws RemoteException {
		super();
	}

	//在数据库中插入一个中转单PO
	@Override
	public void insert(ChangeorderPO cp) throws RemoteException {
		String new_changeorder = cp.getNumberOfTransfer()+";"+cp.getDate()+";"+
	cp.getOffnum()+";"+cp.getArrivenum()+";"+cp.getWayOfTransport()+";"+cp.getMonitor()+";";
		for (String s:cp.getOrder_number()) {
			new_changeorder+=s+" ";
		}
		new_changeorder+=";"+cp.getCheck_state();
		if(cp.getCheck_state()==ApproveState.NotApprove)
			fileWriter.Writer("DataBase/UncheckedChangeorder.txt", new_changeorder, true);
		else{
        fileWriter.Writer("DataBase/Changeorder.txt", new_changeorder, true);
        fileWriter.Writer("DataBase/unStoreout_Changeorder.txt", new_changeorder, true);
        fileWriter.Writer("DataBase/unShipping_Changeorder.txt", new_changeorder, true);
        }
		
	}

}
