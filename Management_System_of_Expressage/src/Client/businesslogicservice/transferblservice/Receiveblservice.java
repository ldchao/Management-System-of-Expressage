package Client.businesslogicservice.transferblservice;

import Client.PO.ArriverorderPO;
import Client.VO.vo.LoadorderVO;

public interface Receiveblservice {

	//创建中转中心到达单
	public void build(LoadorderVO lv,String as);
	
	//设置提醒，提醒有货物到达
	public void setRemind(LoadorderVO lv);
	
	//查看消息提醒
	public LoadorderVO checkRemind();
	
	//存储到达单
	public void save(ArriverorderPO PO);
	
}
