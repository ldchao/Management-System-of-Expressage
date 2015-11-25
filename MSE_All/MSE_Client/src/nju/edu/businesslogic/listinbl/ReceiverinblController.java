package nju.edu.businesslogic.listinbl;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ReceiverVO;
import nju.edu.businesslogicservice.listinblservice.ReceiverinBLService;
import nju.edu.dataservice.listindataservice.ReceiverDataService;
import nju.edu.dataservice.transferdataservice.ReceiveDataService;

public class ReceiverinblController implements ReceiverinBLService{
	Receiverinbl Receiverinbl=new Receiverinbl();
	@Override
	public void addReceiver(ReceiverVO vo) {
		// TODO Auto-generated method stub
		Receiverinbl.addReceiver(vo);
	}

	@Override
	public boolean searchOrder(String id) {
		return Receiverinbl.searchOrder(id);
		// TODO Auto-generated method stub
	}
	
}
