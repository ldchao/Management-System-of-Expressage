package Client.businesslogicservice.transferblservice;

import PO.ChangeorderPO;

public interface TransferBLService {
	
	//创建中转单
	public void build(int[][][][] location,String car_number,String monitor);
	
	//当库存值达到警戒值时设置提醒
	 public void setRemind(int qu,int pai,int jia);
	 
	 //查看消息提醒
	 public String checkRemind();
	 
	 //存储中转单
	 public void save(ChangeorderPO cp);
}
