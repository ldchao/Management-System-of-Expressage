package nju.edu.businesslogic.transferbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ArriverorderVO;
import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;
import nju.edu.dataservice.transferdataservice.ReceiFormDataService;
import nju.edu.dataservice.transferdataservice.ReceiveDataService;
import PO.ArriverorderPO;
import PO.LoadorderPO;
import PO.ReceiveorderPO;
import State.ApproveState;
import State.ArriveState;

public class ReceiveBL implements ReceiveBLService ,ApproveReceiveInfo{

	LoadorderVO needinputarrive = null;

	// 创建中转中心到达单
	@Override
	public void build(ArriverorderVO av) {
		ArriverorderPO PO = new ArriverorderPO(av.getNumberOfTransferStation(),
				av.getDate(), av.getOffnum(), getState(av.getArrive_state()),
				ApproveState.NotApprove);
		ReceiveDataService receivedata = RMIHelper.getReceiveData();
		try {
			receivedata.insert(PO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
//		update(av.getOrder(), av.getCarNum(), av.g);
		System.out.println("到达单已提交总经理审批");
	}
//得到未审批的中转中心到达单
	@Override
	public ArrayList<ArriverorderPO> get() {
		ArrayList<ArriverorderPO> arriverorderList=new ArrayList<>();
		ReceiveDataService rd = RMIHelper.getReceiveData();
		try {
			ArrayList<String> list=rd.get();
			for (String s : list) {
				String[] order=s.split(";");
				ArriverorderPO rp=new ArriverorderPO(
						order[0], order[1], order[2], ArriveState.Whole,
						 ApproveState.NotApprove);
				arriverorderList.add(rp);
			}
			return arriverorderList;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}
	// 存储到达单
	@Override
	public void save(ArriverorderPO PO) {
		ReceiveDataService receivedata = RMIHelper.getReceiveData();
		try {
			receivedata.insert(PO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("存储已完成审批的到达单");
	}

	// 查看未接收的装运单
	@Override
	public LoadorderVO checkUnreceive_loadorderPO(String s) {
		ReceiveDataService receivedata = RMIHelper.getReceiveData();
		LoadorderPO lp;
		try {
			lp = receivedata.checkUnreceive_loadorderPO(s);
			if (lp != null)
				needinputarrive = new LoadorderVO(lp.getTransferNum(), lp
						.getLoadorderNum().substring(0, 4),
						lp.getMonitorName(), lp.getTransferName(),
						lp.getOrder());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return needinputarrive;
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

	// 更新司机、交通工具、监装员、押运员的闲/忙信息和订单物流信息
	private void update(ArrayList<String> Idlist,String carNum) {

		// 在build中通过loadervo中信息调用
	}

	

}
