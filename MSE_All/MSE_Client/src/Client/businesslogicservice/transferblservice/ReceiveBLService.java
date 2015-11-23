package Client.businesslogicservice.transferblservice;

import java.util.ArrayList;

import Client.VO.LoadorderVO;
import PO.ArriverorderPO;

public interface ReceiveBLService {

	//创建中转中心到达单
	public void build(LoadorderVO lv,String as);
	
	//设置提醒，提醒有货物到达
	public void setRemind(LoadorderVO lv);
	
	//查看消息提醒
	public ArrayList<LoadorderVO> checkRemind();
	
	//存储到达单
	public void save(ArriverorderPO PO);
	
}
