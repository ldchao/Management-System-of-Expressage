package nju.edu.businesslogic.transferbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.SendorderVO;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogicservice.listinblservice.UpdateInfo;
import nju.edu.businesslogicservice.transferblservice.SendFormBlService;
import nju.edu.dataservice.transferdataservice.SendFormDataService;
import PO.SendorderPO;
import State.ApproveState;

public class SendFormBL implements SendFormBlService, ApproveSendFormInfo {

	@Override
	public ArrayList<SendorderPO> get() {
		ArrayList<SendorderPO> sendorderlist = new ArrayList<>();
		SendFormDataService sd = RMIHelper.getSendFormData();
		ArrayList<String> orderlist = new ArrayList<>();
		try {
			ArrayList<String> list = sd.get();
			for (String s : list) {
				String[] order = s.split(";");
				orderlist.clear();
				orderlist.add(order[2]);
				SendorderPO sp = new SendorderPO(order[0], order[1], orderlist,
						ApproveState.NotApprove);
				sendorderlist.add(sp);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return sendorderlist;
	}

	@Override
	public void save(SendorderPO sp) {
		SendFormDataService sd = RMIHelper.getSendFormData();
		try {
			sd.insert(sp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addReceiveOrder(SendorderVO sv) {
		SendorderPO sp = new SendorderPO(sv.getDate(), sv.getSender(),
				sv.getOrder(), ApproveState.NotApprove);

		SendFormDataService sd = RMIHelper.getSendFormData();
		try {
			sd.insert(sp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		update(sv.getOrder(), sv.getSender());
	}

	public void update(ArrayList<String> id, String sender) {
		UpdateInfo ui = new Listinbl();
		String message = "快递员" + sender + "正在派件中";
		for (String s : id) {
			ui.update(s, message);
		}
	}
}
