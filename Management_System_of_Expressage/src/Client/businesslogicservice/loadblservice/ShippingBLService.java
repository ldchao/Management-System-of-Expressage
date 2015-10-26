package Client.businesslogicservice.loadblservice;

import java.util.ArrayList;

import Client.PO.LoadorderPO;
import Client.VO.ChangeorderVO;

public interface ShippingBLService {
  
	//创建装车单
	public void build(ChangeorderVO cv,String car_number,String monitor,String transfer);
	
	//当货物出库完毕后设置提醒值
	public void setRemind(ChangeorderVO cv);
	
	//查看提醒值
	public ArrayList<ChangeorderVO> checkRemind();
	
	//存储新建的装车单
	public void save(LoadorderPO lp);
	
}
