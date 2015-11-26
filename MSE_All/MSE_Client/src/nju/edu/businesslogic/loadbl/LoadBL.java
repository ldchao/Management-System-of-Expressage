package nju.edu.businesslogic.loadbl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.LoadorderPO;
import PO.send_LoadorderPO;
import State.ApproveState;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.VehicleLoadorderVO;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogicservice.listinblservice.OrderInfo;
import nju.edu.businesslogicservice.loadblservice.LoadBlService;
import nju.edu.dataservice.loaddataservice.LoadDataService;

public class LoadBL implements LoadBlService {

	// �½�װ����
	@Override
	public void addLoadOrder(VehicleLoadorderVO vlv) {
		String[] orderlist = vlv.getOrder().split("\n");
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < orderlist.length; i++) {
			list.add(orderlist[i]);
		}

		LoadorderPO lp = new LoadorderPO(vlv.getDate(), vlv.getLoadorderNum(),
				vlv.getTransferNum(), vlv.getArriveNum(), vlv.getMonitorName(),
				vlv.getTransferName(), vlv.getTransportNum(), list,
				Double.parseDouble(vlv.getFee()), ApproveState.NotApprove);

		LoadDataService lds=RMIHelper.getLoadData();
		try {
			lds.insert(lp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	
	// ����˷��ܼ�
	@Override
	public double getTotal(String arrival) {
		double total=0;
		OrderInfo order=new Listinbl();
		String[] orderlist = arrival.split("\n");
		for (int i = 0; i < orderlist.length; i++) {
			total+=order.getWeight(orderlist[i]);
		}
		return total;
	}

	// ����װ����
	@Override
	public void save(LoadorderPO lp) {
		LoadDataService lds=RMIHelper.getLoadData();
		try {
			lds.insert(lp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	// ������Ϣ(������˾��������״̬)
	public void update(String key) {

	}

}