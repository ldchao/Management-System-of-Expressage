package Client.dataservice.billdataservice;

import java.util.ArrayList;

import Client.PO.StartinfoPO;
import Client.VO.StartinfoVO;

public interface BillDataService {

	// 新建账
	public void insert(StartinfoPO po);

	// 查找所有帐
	public ArrayList<StartinfoVO> find();
}
