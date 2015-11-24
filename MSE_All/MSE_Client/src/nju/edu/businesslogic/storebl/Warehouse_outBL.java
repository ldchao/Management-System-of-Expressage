package nju.edu.businesslogic.storebl;

import java.util.ArrayList;

import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogicservice.storeblservice.Warehouse_outBLService;
import PO.StoreoutorderPO;

public class Warehouse_outBL implements Warehouse_outBLService{

	ArrayList<ChangeorderVO> needoutstore=new ArrayList<ChangeorderVO>();
	
	//新建一张入库单
	@Override
	public void build(ChangeorderVO cv, String number) {
		// TODO Auto-generated method stub
		System.out.println("新建一张出库单");
	}

	//货物录入中转单后设置提醒
	@Override
	public void setRemind(ChangeorderVO cv) {
		// TODO Auto-generated method stub
		needoutstore.add(cv);
	}

	//查看提醒值
	@Override
	public ArrayList<ChangeorderVO> checkRemind() {
		// TODO Auto-generated method stub
		return needoutstore;
	}

	//存储新建的入库单
	@Override
	public void save(StoreoutorderPO sp) {
		// TODO Auto-generated method stub
		System.out.println("存储一张出库单");
	}

}
