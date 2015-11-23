package Client.businesslogic.financebl;

import java.util.ArrayList;

import Client.PO.PayeeorderPO;
import Client.businesslogicservice.financeblservice.ReceiFormBlService;

public class ReceiFormController implements ReceiFormBlService{

	@Override
	public void addReceiForm(String data, ArrayList<Integer> price, ArrayList<String> orderNum, String carrierName,
			String recorder) {
		ReceiForm recei1 = new ReceiForm();
		recei1.addReceiForm(data, price, orderNum, carrierName,
				recorder);
	}

	@Override
	public double getTotal(ArrayList<String> orderNum) {
		double result = 0.0;
		ReceiForm recei1 = new ReceiForm();
		result = recei1.getTotal(orderNum);
		return result;
	}

	@Override
	public void endReceiForm() {
		ReceiForm recei1 = new ReceiForm();
		recei1.endReceiForm();
	}

	@Override
	public void exportPayeeorder(PayeeorderPO po) {
		ReceiForm recei1 = new ReceiForm();
		recei1.exportPayeeorder(po);
	}

}
