package nju.edu.businesslogic.transferbl;

import java.rmi.RemoteException;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ReceiFormVO;
import nju.edu.businesslogicservice.transferblservice.ReceiFormBlService;
import nju.edu.dataservice.transferdataservice.ReceiFormDataService;
import PO.ReceiveorderPO;
import State.ApproveState;
import State.ArriveState;

public class ReceiFormBL implements ReceiFormBlService{
	//新建接收单
	@Override
	public void addReceiveOrder(ReceiFormVO rv) {
		ReceiveorderPO PO = new ReceiveorderPO(rv.getData(),
				rv.getDepartPlace(), rv.getArrivePlace(), getState(rv.getArrive_state()),rv.getOrderNum(),
				ApproveState.NotApprove);
		ReceiFormDataService receiFormdata = RMIHelper.getReceiFormData();
		try {
			receiFormdata.insert(PO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("接收单已提交总经理审批");
	}
	//保存接收单
	@Override
	public void save(ReceiveorderPO rp) {
		ReceiFormDataService receiFormdata = RMIHelper.getReceiFormData();
		try {
			receiFormdata.insert(rp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("存储已完成审批的到达单");
	}
	//更新订单物流信息，司机、监装员、押运员、车辆状态信息
	@Override
	public void update() {
		// TODO Auto-generated method stub
		//在build中利用rv更新
	}

	private ArriveState getState(String s) {
		if (s.equals("损坏")) {
			return ArriveState.Damaged;
		} else if (s.equals("完整")) {
			return ArriveState.Whole;
		} else {
			return ArriveState.Lost;
		}
	}


}
