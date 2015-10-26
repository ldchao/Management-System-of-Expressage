package Client.businesslogicservice.storeblservice;

import java.util.ArrayList;

import Client.PO.StoreinorderPO;
import Client.VO.ArriverorderVO;

public interface Warehouse_inBLService {

	//新建一张入库单
	public void build(ArriverorderVO av,int jia,int wei);
	
	//货物建立到达单后设置提醒值
	public void setRemind(ArriverorderVO av);
	
	//产看提醒
	public ArrayList<ArriverorderVO> checkRemind();
	
	//存储新建立的入库单
	public void save(StoreinorderPO sp);
	
}
