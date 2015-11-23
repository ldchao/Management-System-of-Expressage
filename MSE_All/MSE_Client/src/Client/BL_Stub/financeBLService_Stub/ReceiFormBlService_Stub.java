package Client.BL_Stub.financeBLService_Stub;

import java.util.ArrayList;

import Client.businesslogicservice.financeblservice.ReceiFormBlService;
import PO.PayeeorderPO;

public class ReceiFormBlService_Stub implements ReceiFormBlService{
	
	double total;
	
	

	public ReceiFormBlService_Stub(double total) {
		super();
		this.total = total;
	}

	@Override
	public void addReceiForm(String data, ArrayList<Integer> price, 
			ArrayList<String> orderNum, String carrierName,String recorder) {
		System.out.println("新建一个收款单！");
	}

	@Override
	public double getTotal(ArrayList<String> orderNum) {
		return total;
	}

	@Override
	public void endReceiForm() {
		System.out.println("结束新建收款单！");
	}

	@Override
	public void exportPayeeorder(PayeeorderPO po) {
		System.out.println("导出收款单！");
	}



}
