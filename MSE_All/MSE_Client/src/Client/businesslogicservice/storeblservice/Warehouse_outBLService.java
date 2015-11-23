package Client.businesslogicservice.storeblservice;

import java.util.ArrayList;

import Client.VO.ChangeorderVO;
import PO.StoreoutorderPO;

public interface Warehouse_outBLService {

	//新建一张入库单
	public void build(ChangeorderVO cv,String number);
	
	//货物录入中转单后设置提醒
	public void setRemind(ChangeorderVO cv);
	
	//查看提醒值
	public ArrayList<ChangeorderVO> checkRemind();
	
	//存储新建的入库单
	public void save(StoreoutorderPO sp);
}
