package Client.businesslogicservice.storeblservice;

import Client.PO.StoreoutorderPO;
import Client.VO.ChangeorderVO;

public interface Warehouse_outblservice {

	//新建一张入库单
	public void build(ChangeorderVO cv,String number);
	
	//货物录入中转单后设置提醒
	public void setRemind(ChangeorderVO cv);
	
	//查看提醒值
	public String checkRemind();
	
	//存储新建的入库单
	public void save(StoreoutorderPO sp);
}
