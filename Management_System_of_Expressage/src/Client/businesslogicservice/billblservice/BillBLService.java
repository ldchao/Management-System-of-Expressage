package Client.businesslogicservice.billblservice;

import java.util.ArrayList;

import Client.VO.vo.StartinfoVO;

public interface BillBLService {

	// 新建账
	public void insert(String institution, String staff, String vehicle,
			String store, String account, String data, String creator);

	// 查看期初信息时显示所有帐的信息
	public ArrayList<StartinfoVO> check();
}
