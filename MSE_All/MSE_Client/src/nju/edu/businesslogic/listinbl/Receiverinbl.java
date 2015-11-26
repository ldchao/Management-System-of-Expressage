package nju.edu.businesslogic.listinbl;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ReceiverVO;
import nju.edu.businesslogicservice.listinblservice.ReceiverinBLService;
import nju.edu.dataservice.listindataservice.ReceiverDataService;

import java.rmi.RemoteException;

import State.ResultMessage;

public class Receiverinbl implements ReceiverinBLService{
	ReceiverDataService receiverDataService=RMIHelper.getReceiverinData();
	@Override
	public void addReceiver(ReceiverVO vo) {
		// TODO Auto-generated method stub
//		ReceiveDataService.insertReceiver(po);
	}

	@Override
	public boolean searchOrder(String id) {
		try {
			return receiverDataService.find(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
		
	}

}
