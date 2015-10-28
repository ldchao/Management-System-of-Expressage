package Client.BL_Stub.loadBLService_Stub;

import java.util.ArrayList;

import Client.PO.send_LoadorderPO;
import Client.businesslogicservice.loadblservice.*;

public class LoadBlService_Stub implements LoadBlService{
	
	double total;

	public LoadBlService_Stub(double total) {
		super();
		this.total = total;
	}

	@Override
	public void addLoadOrder(String data, String shop, String carShippingNum, String arrival, String vehicleNum,
			String monitor, String transfer, ArrayList<String> orderNum) {
		System.out.println("新建一个装车单！");
		
	}

	@Override
	public double getTotal(String arrival) {
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public void endLoad() {
		System.out.println("结束新建接收单！");
		
	}

	@Override
	public void exportLoad(send_LoadorderPO po) {
		System.out.println("导出一个接收单！");
		
	}

}
