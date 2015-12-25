package nju.edu.businesslogicservice.transferblservice;

import nju.edu.VO.ChangeorderVO;
import PO.ChangeorderPO;

public interface TransferBLService {
	
	//创建中转单
	public void build(ChangeorderVO cv);
	 
	 //查看消息提醒
	 public String checkRemind(String transferNum);
	 
	 //查看当前各个库区库存比例
	 public String[][] checkStore(String transferNum);
}
