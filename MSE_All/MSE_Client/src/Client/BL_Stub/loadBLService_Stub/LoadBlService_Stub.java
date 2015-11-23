package Client.BL_Stub.loadBLService_Stub;

import java.util.ArrayList;

import Client.businesslogicservice.loadblservice.LoadBlService;
import PO.send_LoadorderPO;

public class LoadBlService_Stub implements LoadBlService{
	
	double total;

	public LoadBlService_Stub(double total) {
		super();
		this.total = total;
	}

	@Override
	public void addLoadOrder(String data, String shop, String carShippingNum, String arrival, String vehicleNum,
			String monitor, String transfer, ArrayList<String> orderNum) {
		System.out.println("�½�һ��װ������");
		
	}

	@Override
	public double getTotal(String arrival) {
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public void endLoad() {
		System.out.println("�����½����յ���");
		
	}

	@Override
	public void exportLoad(send_LoadorderPO po) {
		System.out.println("����һ�����յ���");
		
	}

}
