package Client.businesslogic.loadbl;

import java.util.ArrayList;

import Client.PO.LoadorderPO;
import Client.VO.ChangeorderVO;
import Client.businesslogicservice.loadblservice.ShippingBLService;

public class ShippingBL implements ShippingBLService {

	// 待装运的中转单
	ArrayList<ChangeorderVO> needship = new ArrayList<ChangeorderVO>();

	// 新建一张装运单
	@Override
	public void build(ChangeorderVO cv, String car_number, String monitor,
			String transfer) {
		// TODO Auto-generated method stub
		System.out.println("新建一张装运单");

	}

	// 当货物出库完毕后设置提醒值
	@Override
	public void setRemind(ChangeorderVO cv) {
		// TODO Auto-generated method stub
		needship.add(cv);
	}

	// 查看提醒值
	@Override
	public ArrayList<ChangeorderVO> checkRemind() {
		// TODO Auto-generated method stub
		return needship;
	}

	// 存储新建的装车单
	@Override
	public void save(LoadorderPO lp) {
		// TODO Auto-generated method stub
		System.out.println("存储新建的装车单");
	}
}
