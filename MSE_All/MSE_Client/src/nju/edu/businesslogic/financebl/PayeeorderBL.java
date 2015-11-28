package nju.edu.businesslogic.financebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.PayeeorderVO;
import nju.edu.businesslogicservice.financeblservice.PayeeorderBlService;
import nju.edu.dataservice.financedataservice.PayeeorderDataService;
import PO.PayeeorderPO;
import State.ApproveState;

public class PayeeorderBL implements PayeeorderBlService, checkPayeeOrderInterface {
	PayeeorderDataService payeeorderData = RMIHelper.getPayeeorderData();
	private ArrayList<PayeeorderPO> payeeList = new ArrayList<>();

	@Override
	public void addReceiForm(String order, String money, String date,
			String carrierName, String shopperName, String shop, boolean over) {
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
					shop, ApproveState.NotApprove);
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

	public ArrayList<PayeeorderVO> checkPayeeorder(String date, String shop) {

		ArrayList<PayeeorderVO> Vlist = new ArrayList<>();
		try {
			ArrayList<PayeeorderPO> Plist = payeeorderData.checkPayeeorder(
					date, shop);
			for (PayeeorderPO po : Plist) {
				PayeeorderVO vo = new PayeeorderVO(po.getOrder(),
						po.getMoney(), po.getDate(), po.getCarrierName(),
						po.getShopperName(),po.getShop());
				Vlist.add(vo);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return Vlist;
	}

	@Override
	public void save(PayeeorderPO po) {

		try {
			payeeorderData.insert(po);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<PayeeorderVO> checkPayeeorder() {
		
		ArrayList<PayeeorderVO> Vlist = new ArrayList<>();
		try {
			ArrayList<PayeeorderPO> Plist = payeeorderData.checkPayeeorders();
			for (PayeeorderPO po : Plist) {
				PayeeorderVO vo = new PayeeorderVO(po.getOrder(),
						po.getMoney(), po.getDate(), po.getCarrierName(),
						po.getShopperName(),po.getShop());
				Vlist.add(vo);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return Vlist;
	}

}
