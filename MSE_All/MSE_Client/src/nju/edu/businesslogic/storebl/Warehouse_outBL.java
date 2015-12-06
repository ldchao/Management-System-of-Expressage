package nju.edu.businesslogic.storebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ChangeorderVO;
import nju.edu.VO.StoreLocationVO;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogicservice.listinblservice.UpdateInfo;
import nju.edu.businesslogicservice.storeblservice.GetLocationInfo;
import nju.edu.businesslogicservice.storeblservice.StoreinUpdateInfo;
import nju.edu.businesslogicservice.storeblservice.Warehouse_outBLService;
import nju.edu.dataservice.loaddataservice.ShippingDataService;
import nju.edu.dataservice.storedataservice.Warehouse_outDataService;
import PO.StoreoutorderPO;
import State.ApproveState;

public class Warehouse_outBL implements Warehouse_outBLService{

	ArrayList<ChangeorderVO> needoutstore=new ArrayList<ChangeorderVO>();
	
	//�½�һ����ⵥ
	@Override
	public void build(ChangeorderVO cv, String date) {
		Warehouse_outDataService wd=RMIHelper.getWarehouse_outData();
		StoreoutorderPO sp=new StoreoutorderPO(date, cv.getArrivenum(), cv.getWayOfTransport(), cv.getNumberOfTransfer(), ApproveState.NotApprove);
		for (String s:cv.getOrder_number()) {
			sp.setOrder_number(s);			
			try {
				wd.insert(sp);
				update(s);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
		try {
			wd.deleteChangeorder(cv.getNumberOfTransfer());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	
		System.out.println("�½�һ�ų��ⵥ");
	}

	//�鿴����ֵ
	@Override
	public ArrayList<ChangeorderVO> checkRemind() {
		ArrayList<ChangeorderVO> needship = new ArrayList<ChangeorderVO>();
		ArrayList<String> orderlist = new ArrayList<String>();
		Warehouse_outDataService wd= RMIHelper.getWarehouse_outData();
		ArrayList<String> changeorderlist = new ArrayList<String>();
		try {
			changeorderlist = wd.checkUnstoreoutChangeorder();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		if (changeorderlist.isEmpty()) {
			return null;
		} else {
			for (String s : changeorderlist) {
				String[] changeorder = s.split(";");// 8�����ֱ��Ǳ���ת������ת����š�װ�����ڡ������ء�����ء�װ�˷�ʽ����װԱ��������ת���е��š�����״̬
				String[] order = changeorder[6].split(" ");
				orderlist.clear();
				for (int i = 0; i < order.length; i++) {
					orderlist.add(order[i]);
				}
				ChangeorderVO cv = new ChangeorderVO(changeorder[0],
						changeorder[1], changeorder[2], changeorder[3],
						changeorder[4], changeorder[5], orderlist);
				needship.add(cv);
			}
			return needship;
		}
	}

	//�洢�½�����ⵥ
	@Override
	public void save(StoreoutorderPO sp) {
		Warehouse_outDataService wd=RMIHelper.getWarehouse_outData();
		try {
			wd.insert(sp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("�洢һ�ų��ⵥ");
	}
    //���¶�����Ϣ�Ϳ����Ϣ
	public void update(String orderNum){
		GetLocationInfo gl=new Warehouse_inBL();
		StoreLocationVO sv=gl.getLocation(orderNum);
		
		StoreinUpdateInfo su=StoreMessageBL.getInstance();
		su.storein_update(sv.getQu(), sv.getPai(), sv.getJia(), sv.getWei(), "0");
		
		UpdateInfo updateOrder=new Listinbl();
		updateOrder.update(orderNum, "���Ķ����Ѱ������");
		
	}
}
