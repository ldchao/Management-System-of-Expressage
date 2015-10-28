package Client.businesslogicservice.loadblservice;

import java.util.ArrayList;
import Client.PO.send_LoadorderPO;

public interface LoadBlService {
	
	//新建装车单
	public void addLoadOrder(String data, String shop, String carShippingNum,
			String arrival, String vehicleNum, String monitor, String transfer, 
			ArrayList<String> orderNum);
	
	//获得运费总价
	public double getTotal(String arrival);
	
	//保存装车单
	public void endLoad();
	
	//导出
	public void exportLoad(send_LoadorderPO po);
	

}
