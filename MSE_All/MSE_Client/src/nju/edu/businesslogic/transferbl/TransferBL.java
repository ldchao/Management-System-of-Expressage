package nju.edu.businesslogic.transferbl;

import nju.edu.businesslogicservice.transferblservice.TransferBLService;
import PO.ChangeorderPO;

public class TransferBL implements TransferBLService{

	
	int qu;
	int pai;
	int jia;
	String remind;
	String numberOfTransferStation;
	
	
	//设置中转中心编号
	public TransferBL(String numberOfTransferStation) {
		super();
		this.numberOfTransferStation = numberOfTransferStation;
	}

	//创建中转单
	@Override
	public void build(int[][][][] location, String car_number, String monitor) {
		// TODO Auto-generated method stub
		System.out.println("新建一张中转单");
		
	}

	//当库存值达到警戒值时设置提醒
	@Override
	public void setRemind(int qu, int pai, int jia) {
		// TODO Auto-generated method stub
		
		this.qu=qu;
		this.pai=pai;
		this.jia=jia;
		
	}

	//查看消息提醒
	@Override
	public String checkRemind() {
		// TODO Auto-generated method stub
		
		return remind;
	}

	//存储中转单
	@Override
	public void save(ChangeorderPO cp) {
		// TODO Auto-generated method stub
		System.out.println("存储一张单");
	}
	
	

}
