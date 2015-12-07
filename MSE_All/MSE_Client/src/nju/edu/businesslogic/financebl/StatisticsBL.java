package nju.edu.businesslogic.financebl;

import java.util.ArrayList;

import PO.OrganizationNumPO;
import nju.edu.ExcelWriter.ExcelWriter;
import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;
import nju.edu.businesslogicservice.financeblservice.StatisticsBLService;

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


		ArrayList<String> list = new ArrayList<>();

		list.add("付款日期,付款金额,付款账号,付款条目,备注,付款人");
		for (PayorderVO vo : payVo) {
			list.add(vo.getDate() + "," + vo.getMoney() + "," + vo.getAccount()
					+ "," + vo.getList() + "," + vo.getComment() + ","
					+ vo.getPayor());
		}

		list.add("\n收款日期,收款金额,订单号,快递员姓名,营业厅,业务员姓名");
		for (PayeeorderVO vo : payeeVo) {
			OrganizationNumPO opo = new OrganizationNumPO();
			String shop = opo.getName(vo.getShop());
			list.add(vo.getDate() + "," + vo.getMoney() + "," + vo.getOrder()
					+ "," + vo.getCarrierName() + "," + shop + ","
					+ vo.getShopperName());
		}

		ExcelWriter.Writer(date + "经营情况表", list);
	}
}
