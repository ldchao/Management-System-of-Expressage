package nju.edu.businesslogicservice.transferblservice;

import java.util.ArrayList;

import nju.edu.VO.ReceiFormVO;
import PO.ReceiveorderPO;

public interface ReceiFormBlService {
    
	
	//新建接收单
	public void addReceiveOrder(ReceiFormVO rv);
	
	//保存接收单
	public void save(ReceiveorderPO rp);
	
	//更新订单物流信息，司机、监装员、押运员、车辆状态信息
	public void update();
}