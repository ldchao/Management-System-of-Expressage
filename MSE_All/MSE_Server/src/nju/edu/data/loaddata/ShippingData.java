package nju.edu.data.loaddata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.loaddataservice.ShippingDataService;
import PO.ChangeorderPO;
import PO.LoadorderPO;
import State.ApproveState;

public class ShippingData extends UnicastRemoteObject implements ShippingDataService{

	public ShippingData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	//�����ݿ��в���һ��װ�˵�PO
	@Override
	public void insert(LoadorderPO lp) throws RemoteException {
		String list="";
		for (String s:lp.getOrder()) {
			list+=s+" ";
		}
		String new_arriverorder = lp.getLoadorderNum()+";"+lp.getDate()+";"+lp.getTransferNum()+";"+lp.getArriveNum()+";"+
				lp.getMonitorName()+";"+lp.getTransferName()+";"+lp.getTransportNum()+";"+list+";"+lp.getFee()+";"+lp.getCheckState();
		if(lp.getCheckState()==ApproveState.NotApprove)
			fileWriter.Writer("DataBase/UncheckedLoadorder.txt", new_arriverorder, true);
		else{
        fileWriter.Writer("DataBase/Loadorder.txt", new_arriverorder, true);
        fileWriter.Writer("DataBase/unReceive_Loadorder.txt", new_arriverorder, true);
        }
		
	}
	// �鿴��Ҫװ�˵���ת��
	@Override
	public ArrayList<String>  checkUnshippingChangeorder() throws RemoteException{
		ArrayList<String> Changeorderlist = fileReader
				.Reader("DataBase/unShipping_Changeorder.txt");
		return Changeorderlist;
	}
	//ɾ���Ѿ�����װ�˹������ת��
	@Override
	public void deleteChangeorder(String numOfTransfer) throws RemoteException {
		ArrayList<String> Changeorderlist = fileReader
				.Reader("DataBase/unShipping_Changeorder.txt");
		for (String s:Changeorderlist) {
			if(s.startsWith(numOfTransfer+";")){
				Changeorderlist.remove(s);
				break;}
		}
		fileWriter.Writer("DataBase/unShipping_Changeorder.txt", Changeorderlist, false);
	}

}
