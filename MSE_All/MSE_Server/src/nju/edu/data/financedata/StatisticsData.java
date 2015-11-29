package nju.edu.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.ExcelWriter;
import nju.edu.dataservice.financedataservice.StatisticsDataService;
import PO.OrganizationNumPO;
import PO.PayeeorderPO;
import PO.PayorderPO;

@SuppressWarnings("serial")
public class StatisticsData extends UnicastRemoteObject implements
		StatisticsDataService {

	public StatisticsData() throws RemoteException {
		super();
	}

	@Override
	public ArrayList<PayorderPO> findPay(String start, String end)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PayeeorderPO> findPayee(String start, String end)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excel(ArrayList<PayorderPO> payPo,
			ArrayList<PayeeorderPO> payeePo, String date)
			throws RemoteException {
		ArrayList<String> list = new ArrayList<>();

		list.add("��������,������,�����˺�,������Ŀ,��ע,������");
		for (PayorderPO po : payPo) {
			list.add(po.getDate() + "," + po.getMoney() + "," + po.getAccount()
					+ "," + po.getList() + "," + po.getComment() + ","
					+ po.getPayor());
		}

		list.add("\n�տ�����,�տ���,������,���Ա����,Ӫҵ��,ҵ��Ա����");
		for (PayeeorderPO po : payeePo) {
			OrganizationNumPO opo = new OrganizationNumPO();
			String shop = opo.getName(po.getShop());
			list.add(po.getDate() + "," + po.getMoney() + "," + po.getOrder()
					+ "," + po.getCarrierName() + "," + shop + ","
					+ po.getShopperName());
		}

		ExcelWriter.Writer(date + "��Ӫ�����", list);
	}

}
