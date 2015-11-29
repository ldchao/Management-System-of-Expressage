package nju.edu.businesslogic.financebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.OrganizationNumPO;
import PO.PayeeorderPO;
import PO.PayorderPO;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;
import nju.edu.businesslogicservice.financeblservice.StatisticsBLService;
import nju.edu.dataservice.financedataservice.StatisticsDataService;

public class StatisticsBL implements StatisticsBLService {

	@Override
	public ArrayList<PayorderVO> checkPay(int start, int end) {
		checkPayorderInfo check = new PayorderBL();

		ArrayList<PayorderVO> list = new ArrayList<>();
		ArrayList<PayorderVO> payvo = check.checkPayorder();
		for (PayorderVO vo : payvo) {
			int date = Integer.valueOf(vo.getDate().replaceAll("-", ""));
			if (date >= start && date <= end)
				list.add(vo);
		}

		return list;
	}

	@Override
	public ArrayList<PayeeorderVO> checkPayee(int start, int end) {
		checkPayeeOrderInfo check = new PayeeorderBL();

		ArrayList<PayeeorderVO> list = new ArrayList<>();
		ArrayList<PayeeorderVO> payeevo = check.checkPayeeorder();
		for (PayeeorderVO vo : payeevo) {
			int date = Integer.valueOf(vo.getDate().replaceAll("-", ""));
			if (date >= start && date <= end)
				list.add(vo);
		}

		return list;
	}

	@Override
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo, String date) {

		ArrayList<PayorderPO> paylist = new ArrayList<>();
		ArrayList<PayeeorderPO> payeelist = new ArrayList<>();

		for (PayorderVO vo : payVo) {
			PayorderPO po = new PayorderPO(vo.getDate(), vo.getMoney(),
					vo.getAccount(), vo.getList(), vo.getComment(),
					vo.getPayor());
			paylist.add(po);
		}

		for (PayeeorderVO vo : payeeVo) {
			PayeeorderPO po = new PayeeorderPO(vo.getOrder(), vo.getMoney(),
					vo.getDate(), vo.getCarrierName(), vo.getShopperName(),
					vo.getShop());
			payeelist.add(po);
		}

		StatisticsDataService std = RMIHelper.getStatisticsData();
		try {
			std.excel(paylist, payeelist, date);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
