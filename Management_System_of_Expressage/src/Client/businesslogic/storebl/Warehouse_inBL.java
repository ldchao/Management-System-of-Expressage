package Client.businesslogic.storebl;

import java.util.ArrayList;

import Client.PO.StoreinorderPO;
import Client.VO.ArriverorderVO;
import Client.businesslogic.transferbl.StoreinInfo;
import Client.businesslogicservice.storeblservice.Warehouse_inBLService;

public class Warehouse_inBL implements Warehouse_inBLService,StoreinInfo{
	
	ArrayList<ArriverorderVO> needinstore=new ArrayList<ArriverorderVO>();
	
	//新建一张入库单
	@Override
	public void build(ArriverorderVO av, int jia, int wei) {
		// TODO Auto-generated method stub
		System.out.println("新建一张入库单");
	}

	//货物建立到达单后设置提醒值
	@Override
	public void setRemind(ArriverorderVO av) {
		// TODO Auto-generated method stub
		needinstore.add(av);
	}

	//产看提醒
	@Override
	public ArrayList<ArriverorderVO> checkRemind() {
		// TODO Auto-generated method stub
		return needinstore;
	}

	//存储新建立的入库单
	@Override
	public void save(StoreinorderPO sp) {
		// TODO Auto-generated method stub
		System.out.println("存储入库单");
	}

	////根据库位得到对应位置的订单编号
	@Override
	public ArrayList<String> getId(int[][][][] location) {
		// TODO Auto-generated method stub
		ArrayList<String> Idlist=new ArrayList<String> ();
		
		return Idlist;
	}

}
