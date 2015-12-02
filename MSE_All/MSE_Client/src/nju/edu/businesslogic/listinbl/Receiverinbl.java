package nju.edu.businesslogic.listinbl;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ReceiverVO;
import nju.edu.businesslogicservice.listinblservice.ReceiverinBLService;
import nju.edu.dataservice.listindataservice.ReceiverinDataService;

import java.rmi.RemoteException;

import Client.PO.ReceiverPO;
import State.ResultMessage;

public class Receiverinbl implements ReceiverinBLService{
	ReceiverinDataService receiverinDataService=RMIHelper.getReceiverinData();
	@Override
	public void addReceiver(ReceiverVO vo) {
		// TODO Auto-generated method stub
		ReceiverPO po=new ReceiverPO(vo.getCourier(), vo.getPhoneOfcourier(), vo.getId(), vo.getTime(), vo.getReceiver(), vo.getAddress(), vo.getPhone(), vo.getCellphone(), vo.getPosition());
		try {
			receiverinDataService.insertReceiver(po);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean searchOrder(String id) {
		try {
			return receiverinDataService.find(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
		
	}

	@Override
	public boolean JudgeNull(ReceiverVO vo) {
		// TODO Auto-generated method stub
		boolean result=true;
		if(vo.getCourier().equals("")||vo.getId().equals("")||vo.getPhoneOfcourier().equals("")||
				vo.getReceiver().equals("")||vo.getAddress().equals("")||vo.getTime().equals("点击选择日期")||vo.getCellphone().equals("")){
			result=false;
		}
		return result;
	}

}
