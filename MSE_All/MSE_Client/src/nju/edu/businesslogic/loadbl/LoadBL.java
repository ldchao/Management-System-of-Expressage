package nju.edu.businesslogic.loadbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.VehicleLoadorderVO;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogic.vehiclebl.VehicleBl;
import nju.edu.businesslogic.vehiclebl.transportUpdateInfo;
import nju.edu.businesslogicservice.listinblservice.OrderInfo;
import nju.edu.businesslogicservice.listinblservice.UpdateInfo;
import nju.edu.businesslogicservice.loadblservice.LoadBlService;
import nju.edu.dataservice.loaddataservice.ShippingDataService;
import PO.LoadorderPO;
import PO.OrganizationNumPO;
import State.ApproveState;
import State.TransportState;

public class LoadBL implements LoadBlService,ApproveLoadInfo {

	// �½�װ����
	@Override
	public void addLoadOrder(VehicleLoadorderVO vlv) {
		String[] orderlist = vlv.getOrder().split("\n");
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < orderlist.length; i++) {
			list.add(orderlist[i]);
		}
        OrganizationNumPO op=new OrganizationNumPO();
		LoadorderPO lp = new LoadorderPO(vlv.getDate(), vlv.getLoadorderNum(),
				vlv.getTransferNum(), op.getNum(vlv.getArriveNum()), vlv.getMonitorName(),
				vlv.getTransferName(), vlv.getTransportNum(), list,
				Double.parseDouble(vlv.getFee()), ApproveState.NotApprove);

		ShippingDataService sd=RMIHelper.getShippingData();
		try {
			sd.insert(lp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	
	// ����˷��ܼ�
	@Override
	public double getTotal(String orderTotransfer) {
		double total=0;
		OrderInfo order=new Listinbl();
		String[] orderlist = orderTotransfer.split("\n");
		for (int i = 0; i < orderlist.length; i++) {
			total+=order.getWeight(orderlist[i]);
		}
		total=total*30*2/1000;
		return total;
	}
    //�õ�δ������װ�˵�
	@Override
	public ArrayList<LoadorderPO> get() {
		ShippingDataService sd=RMIHelper.getShippingData();
		try {
			ArrayList<LoadorderPO> loadorderList=sd.get();
			return loadorderList;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}
	// ����װ����
	@Override
	public void save(LoadorderPO lp) {
		ShippingDataService sd=RMIHelper.getShippingData();
		try {
			sd.insert(lp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		update(lp.getOrder(),lp.getTransferNum(),lp.getLoadorderNum().substring(0, 4));
	}

	// ������Ϣ(������˾��������״̬)
	public void update(ArrayList<String> id,String offNum,String carNum) {
		UpdateInfo ui=new Listinbl();
		OrganizationNumPO op=new OrganizationNumPO();
		String message="���Ķ����Ѵ�"+op.getName(offNum)+"����";
		for (String s : id) {
			ui.update(s, message);
		}
		
		transportUpdateInfo du=new VehicleBl();
		du.update(carNum, TransportState.Busy);
	}


	

}
