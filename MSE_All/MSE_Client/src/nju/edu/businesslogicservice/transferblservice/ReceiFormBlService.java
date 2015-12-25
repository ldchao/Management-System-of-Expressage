package nju.edu.businesslogicservice.transferblservice;

import java.util.ArrayList;

import nju.edu.VO.ReceiFormVO;
import PO.ReceiveorderPO;

public interface ReceiFormBlService {
    
	
	//新建接收单
	public void addReceiveOrder(ReceiFormVO rv,String s);
}