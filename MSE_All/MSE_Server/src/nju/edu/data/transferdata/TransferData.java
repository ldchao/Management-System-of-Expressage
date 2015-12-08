package nju.edu.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
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
        deleteUncheckedChangeorder(cp.getNumberOfTransfer());
        fileWriter.Writer("DataBase/unStoreout_Changeorder.txt", new_changeorder, true);
        fileWriter.Writer("DataBase/unShipping_Changeorder.txt", new_changeorder, true);
        }
		
	}
	//得到未审批的中转单
	@Override
	public ArrayList<String> get() throws RemoteException {
		ArrayList<String> list=fileReader.Reader("DataBase/UncheckedChangeorder.txt");
		return list;
	}

	private void deleteUncheckedChangeorder(String id){
		ArrayList<String> list=fileReader.Reader("DataBase/UncheckedChangeorder.txt");
		for (String s : list) {
			if(s.startsWith(id)){
				list.remove(s);
				break;
			}
		}
		fileWriter.Writer("DataBase/UncheckedChangeorder.txt", list, false);
	}
}
