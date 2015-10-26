package Server.dataservice.billdataservice;

import java.util.ArrayList;

import Client.PO.StartinfoPO;

public interface BillDataService {

	// 新建账
	public void insert(StartinfoPO po);

	// 查找所有帐
	public ArrayList<StartinfoPO> find();
}
