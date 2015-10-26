package Server.Date_Stub.billDateservice_Stub;

import java.util.ArrayList;

import Client.PO.StartinfoPO;
import Client.VO.StartinfoVO;
import Server.dataservice.billdataservice.BillDataService;

public class BillDataService_Stub implements BillDataService{

	@Override
	public void insert(StartinfoPO po) {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!");
	}

	@Override
	public ArrayList<StartinfoPO> find() {
		// TODO Auto-generated method stub
		ArrayList<StartinfoPO> infoList = new ArrayList<StartinfoPO>();
		infoList.add(new StartinfoPO()); //าษฮสฃก
		return infoList;
	}
	
	
}
