package Client.BL_Stub.storeBLService_Stub;

import java.util.ArrayList;

import Client.PO.StoreoutorderPO;
import Client.VO.ChangeorderVO;
import Client.businesslogicservice.storeblservice.Warehouse_outBLService;

public class Warehouse_outBLService_Stub implements Warehouse_outBLService{

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
