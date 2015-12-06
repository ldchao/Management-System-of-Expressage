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
	
	//新建一张入库单
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
	
		System.out.println("新建一张出库单");
	}

	//查看提醒值
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
				String[] changeorder = s.split(";");// 8个，分别是本中转中心中转单编号、装车日期、出发地、到达地、装运方式、监装员、本次中转所有单号、审批状态
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

	//存储新建的入库单
	@Override
	public void save(StoreoutorderPO sp) {
		Warehouse_outDataService wd=RMIHelper.getWarehouse_outData();
		try {
			wd.insert(sp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("存储一张出库单");
	}
    //更新订单信息和库存信息
	public void update(String orderNum){
		GetLocationInfo gl=new Warehouse_inBL();
		StoreLocationVO sv=gl.getLocation(orderNum);
		
		StoreinUpdateInfo su=StoreMessageBL.getInstance();
		su.storein_update(sv.getQu(), sv.getPai(), sv.getJia(), sv.getWei(), "0");
		
		UpdateInfo updateOrder=new Listinbl();
		updateOrder.update(orderNum, "您的订单已办理出库");
		
	}
}
