package nju.edu.businesslogic.transferbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ReceiFormVO;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogic.vehiclebl.VehicleBl;
import nju.edu.businesslogic.vehiclebl.transportUpdateInfo;
import nju.edu.businesslogicservice.listinblservice.UpdateInfo;
import nju.edu.businesslogicservice.transferblservice.ReceiFormBlService;
import nju.edu.dataservice.transferdataservice.ReceiFormDataService;
import PO.OrganizationNumPO;
import PO.ReceiveorderPO;
import State.ApproveState;
import State.ArriveState;
import State.TransportState;

public class ReceiFormBL implements ReceiFormBlService,ApproveReceiFormInfo{
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
		update(rv.getOrderNum(), rv.getArrivePlace(), rv.getCarNum());
		System.out.println("接收单已提交总经理审批");
	}
	//得到未审批的营业厅接收单
	@Override
	public ArrayList<ReceiveorderPO> get() {
		ArrayList<ReceiveorderPO> receiveorderList=new ArrayList<>();
		ReceiFormDataService receiFormdata = RMIHelper.getReceiFormData();
		ArrayList<String> orderlist=new ArrayList<>();
		try {
			ArrayList<String> list=receiFormdata.get();
			for (String s : list) {
				String[] order=s.split(";");
				orderlist.clear();
				orderlist.add(order[4]);
				ReceiveorderPO rp=new ReceiveorderPO(
						order[0], order[1], order[2], ArriveState.Whole,
						orderlist, ApproveState.NotApprove);
				receiveorderList.add(rp);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return receiveorderList;
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
	public void update(ArrayList<String> id,String arriveNum,String carNum) {
		UpdateInfo ui=new Listinbl();
		OrganizationNumPO op=new OrganizationNumPO();
		String message="您的订单已到达"+op.getName(arriveNum);
		for (String s : id) {
			ui.update(s, message);
		}
		
		transportUpdateInfo du=new VehicleBl();
		du.update(carNum, TransportState.Available);
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
