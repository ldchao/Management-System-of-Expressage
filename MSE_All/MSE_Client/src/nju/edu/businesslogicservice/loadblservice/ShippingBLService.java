package nju.edu.businesslogicservice.loadblservice;

import java.util.ArrayList;

import nju.edu.VO.ChangeorderVO;
import nju.edu.VO.VehicleLoadorderVO;
import PO.LoadorderPO;

public interface ShippingBLService {
  
	//创建装车单
	public void build(VehicleLoadorderVO vv);
	
	//得到总运费
	public double getTotal(ArrayList<String> orderlist,String offNum,String arriveNum,String wayOfTransfer);
	
	//查看提醒值
	public ArrayList<ChangeorderVO> checkRemind();
	
	//存储新建的装车单
	public void save(LoadorderPO lp);
	
}
