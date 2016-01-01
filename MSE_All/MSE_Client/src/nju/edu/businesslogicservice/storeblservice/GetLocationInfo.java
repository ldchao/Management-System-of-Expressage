package nju.edu.businesslogicservice.storeblservice;

import nju.edu.VO.StoreLocationVO;

public interface GetLocationInfo {

	//根据订单号查找对应入库单，找到库存位置
	public StoreLocationVO getLocation(String orderNum);
	
}
