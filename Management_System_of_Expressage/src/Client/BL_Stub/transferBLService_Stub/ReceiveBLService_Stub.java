package Client.BL_Stub.transferBLService_Stub;

import java.util.ArrayList;

import Client.PO.ArriverorderPO;
import Client.VO.LoadorderVO;
import Client.businesslogicservice.transferblservice.ReceiveBLService;

public class ReceiveBLService_Stub implements ReceiveBLService{
	
	ArrayList<LoadorderVO> needinputarrive=new ArrayList<LoadorderVO>();
	
	//创建中转中心到达单
	@Override
	public void build(LoadorderVO lv, String as) {
		// TODO Auto-generated method stub
		System.out.println("新建一张到达单");
	}

	//设置提醒，提醒有货物到达
	@Override
	public void setRemind(LoadorderVO lv) {
		// TODO Auto-generated method stub
		needinputarrive.add(lv);
	}

	//查看消息提醒
	@Override
	public ArrayList<LoadorderVO> checkRemind() {
		// TODO Auto-generated method stub
		return null;
	}

	//存储到达单
	@Override
	public void save(ArriverorderPO PO) {
		// TODO Auto-generated method stub
		System.out.println("存储到达单");
	}

	
	
	
}
