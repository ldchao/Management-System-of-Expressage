package nju.edu.businesslogic.financebl;

import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import PO.PayorderPO;
import State.ApproveState;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;
import nju.edu.businesslogicservice.financeblservice.PayorderBLService;
import nju.edu.dataservice.financedataservice.PayorderDataService;

public class PayorderBL implements PayorderBLService, checkPayorderInfo,
		checkProfitInfo {
	
	PayorderDataService payorderData = RMIHelper.getPayorderData();

	@Override
	public void addPayorder(double paymoney, String date, String payname,
			String payaccount, String list, String comment) {

		PayorderPO ppo = new PayorderPO(date, paymoney, payaccount, list,
				comment, payname, ApproveState.NotApprove);
		try {
			payorderData.insert(ppo);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<PayorderVO> checkPayorder() {
		ArrayList<PayorderVO> payorderlist = new ArrayList<>();

		try {
			ArrayList<PayorderPO> paypo = payorderData.find();
			for (PayorderPO po : paypo) {
				PayorderVO vo = new PayorderVO(po.getDate(), po.getMoney(),
						po.getAccount(), po.getList(), po.getComment(),
						po.getPayor());
				payorderlist.add(vo);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return payorderlist;
	}

	@Override
	public double[] profit() {

		ArrayList<PayorderVO> pay = checkPayorder();
		checkPayeeOrderInfo check = new PayeeorderBL();
		ArrayList<PayeeorderVO> payee = check.checkPayeeorder();

		double res[] = new double[3];

		double totalPay = 0;
		for (PayorderVO pv : pay) {
			totalPay += pv.getMoney();
		}

		double totalPayee = 0;
		for (PayeeorderVO pe : payee) {
			totalPayee += pe.getMoney();
		}

		DecimalFormat df = new DecimalFormat("0.0");
		res[0] = Double.parseDouble(df.format(totalPay));
		res[1] = Double.parseDouble(df.format(totalPayee));
		res[2] = Double.parseDouble(df.format(totalPay - totalPayee));

		return res;
	}

	@Override
	public void excel(String date, double income, double outcome, double benefit) {

		try {
			payorderData.excel(date, income, outcome, benefit);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(PayorderPO po) {

		try {
			payorderData.insert(po);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
