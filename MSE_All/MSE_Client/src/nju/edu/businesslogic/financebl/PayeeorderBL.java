package nju.edu.businesslogic.financebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.businesslogicservice.financeblservice.PayeeorderBlService;
import nju.edu.dataservice.financedataservice.PayeeorderDataService;
import PO.PayeeorderPO;
import State.ApproveState;

public class PayeeorderBL implements PayeeorderBlService {
	PayeeorderDataService payeeorderData = RMIHelper.getPayeeorderData();
	private ArrayList<PayeeorderPO> payeeList = new ArrayList<>();

	@Override
	public void addReceiForm(String order, String money, String date,
			String carrierName, String shopperName, boolean over) {
		if (over) {
			try {
				for (PayeeorderPO po : payeeList)
					payeeorderData.insert(po);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			payeeList = new ArrayList<>();
		} else {
			PayeeorderPO payeepo = new PayeeorderPO(order,
					Double.parseDouble(money), date, carrierName, shopperName,
					ApproveState.NotApprove);
			payeeList.add(payeepo);
		}
	}

	public double getTotal() {
		double total = 0;
		for (PayeeorderPO ppo : payeeList)
			total += ppo.getMoney();
		return total;
	}

	@Override
	public double getTotal(ArrayList<PayeeorderPO> polist) {
		double total = 0;

		for (PayeeorderPO po : polist)
			total += po.getMoney();

		return total;
	}
	
	public ArrayList<PayeeorderPO> checkPayeeorder(String date, String shop){
		
		ArrayList<PayeeorderPO> list = new ArrayList<>();
		try {
			list = payeeorderData.checkPayeeorder(date, shop);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public void save(PayeeorderPO po) {

		try {
			payeeorderData.insert(po);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
