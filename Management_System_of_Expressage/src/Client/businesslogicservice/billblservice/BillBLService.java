package Client.businesslogicservice.billblservice;

import java.util.ArrayList;

import Client.VO.StartinfoVO;

public interface BillBLService {

	// 新建账
	public void addBill(String institution, String staff, String vehicle,
			String store, String account, String data, String creator);

	// 查看期初信息时显示所有帐的信息
	public ArrayList<StartinfoVO> checkBill();
}
