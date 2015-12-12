package nju.edu.businesslogic.transferbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogic.storebl.StoreMessageBL;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.businesslogicservice.transferblservice.TransferBLService;
import nju.edu.dataservice.transferdataservice.ReceiFormDataService;
import nju.edu.dataservice.transferdataservice.TransferDataService;
import PO.ChangeorderPO;
import PO.ReceiveorderPO;
import State.ApproveState;
import State.ArriveState;
import StaticValue.StoreNum;

public class TransferBL implements TransferBLService,ApproveTransferInfo{

	@Override
	public void build(ChangeorderVO cv) {
		ChangeorderPO cp=new ChangeorderPO(cv.getDate(), cv.getNumberOfTransfer(),
				cv.getOffnum(), cv.getArrivenum(), cv.getWayOfTransport(),
				cv.getMonitor(), cv.getOrder_number(), ApproveState.NotApprove);
		TransferDataService td=RMIHelper.getTransferData();
		try {
			td.insert(cp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String checkRemind() {
		String[][] storeRatio=checkStore();
		String[] number;
		String remind="";
		double ratio;
		String[] qu={"������","������","������"};
		
		for (int i = 0; i < storeRatio.length; i++) {
			number=storeRatio[i][1].split("/");
			ratio=(Integer.parseInt(number[0]))/(Integer.parseInt(number[1]));
			if(ratio>=Double.parseDouble(storeRatio[i][2])){
				remind+=(i/3)>2?("������4��"+(i-8)+"��"):(qu[i/3]+(i%3+1)+"��")+
						"�ﵽ����ֵ����Ҫ¼�뷢��"+StoreNum.storeName[i]+"����ת��"+"\n";
			}
		}
		return remind;
	}

	@Override
	public String[][] checkStore() {
		StoreinInfo sm=StoreMessageBL.getInstance();		
		return sm.getStoreRatio();
	}
	
	
//�õ�δ��������ת��
	@Override
	public ArrayList<ChangeorderPO> get() {
		ArrayList<ChangeorderPO> changeorderList=new ArrayList<>();
		TransferDataService td = RMIHelper.getTransferData();
		ArrayList<String> orderlist=new ArrayList<>();
		try {
			ArrayList<String> list=td.get();
			for (String s : list) {
				String[] order=s.split(";");
				orderlist.clear();
				orderlist.add(order[6]);
				ChangeorderPO rp=new ChangeorderPO(
						order[1], order[0], order[2], order[3], order[4],
						order[5], orderlist, ApproveState.NotApprove);
				changeorderList.add(rp);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return changeorderList;
	}
	//�洢���������ת��
	@Override
	public void save(ChangeorderPO cp) {
		TransferDataService td=RMIHelper.getTransferData();
		try {
			td.insert(cp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}


	

	

}
