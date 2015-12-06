package nju.edu.businesslogic.loadbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ChangeorderVO;
import nju.edu.VO.VehicleLoadorderVO;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogic.policybl.ConstantPolicybl;
import nju.edu.businesslogicservice.listinblservice.OrderInfo;
import nju.edu.businesslogicservice.loadblservice.ShippingBLService;
import nju.edu.businesslogicservice.policyblservice.ConstantInfo;
import nju.edu.dataservice.loaddataservice.ShippingDataService;
import PO.LoadorderPO;
import PO.OrganizationNumPO;
import State.ApproveState;

public class ShippingBL implements ShippingBLService {

	// �½�һ��װ�˵�
	@Override
	public void build(VehicleLoadorderVO vv) {
		ShippingDataService sd=RMIHelper.getShippingData();
		LoadorderPO lp = new LoadorderPO(vv.getDate(), vv.getLoadorderNum(),
				vv.getTransferNum(), vv.getArriveNum(), vv.getMonitorName(),
				vv.getTransferName(), vv.getTransportNum(), vv.getOrderlist(),
				Double.parseDouble(vv.getFee()), ApproveState.NotApprove);
		try {
			sd.insert(lp);
			sd.deleteChangeorder(vv.getChangeorderNum());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("�½�һ��װ�˵�");

	}

	// �õ����˷�
	@Override
	public double getTotal(ArrayList<String> orderlist, String offNum,
			String arriveNum, String wayOfTransfer) {
		double total = 0;
		OrderInfo order = new Listinbl();
		for (String s : orderlist) {
			total += order.getWeight(s);
		}
		if (arriveNum.length() == 6) {
			total = total * 30 * 2 / 1000;
		} else {
			OrganizationNumPO op = new OrganizationNumPO();
			ConstantInfo constant = new ConstantPolicybl();
			double distance = constant.GetDistance(op.getName(offNum),
					op.getName(arriveNum));
			total *= distance * getPrice(wayOfTransfer) / 1000;
		}
		return total;
	}

	// �鿴����ֵ
	@Override
	public ArrayList<ChangeorderVO> checkRemind() {
		ArrayList<ChangeorderVO> needship = new ArrayList<ChangeorderVO>();
		ArrayList<String> orderlist = new ArrayList<String>();
		ShippingDataService sd = RMIHelper.getShippingData();
		ArrayList<String> changeorderlist = new ArrayList<String>();
		try {
			changeorderlist = sd.checkUnshippingChangeorder();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		if (changeorderlist.isEmpty()) {
			return null;
		} else {
			for (String s : changeorderlist) {
				String[] changeorder = s.split(";");// 8�����ֱ��Ǳ���ת������ת����š�װ�����ڡ������ء�����ء�װ�˷�ʽ����װԱ��������ת���е��š�����״̬
				String[] order = changeorder[6].split(" ");
				orderlist.clear();
				for (int i = 0; i < order.length; i++) {
					orderlist.add(order[i]);
				}
				ChangeorderVO cv = new ChangeorderVO(changeorder[0],
						changeorder[1], changeorder[2], changeorder[3],
						changeorder[4], changeorder[5], orderlist);
				needship.add(cv);
			}
			return needship;
		}
	}

	// �洢�½���װ����
	@Override
	public void save(LoadorderPO lp) {
		ShippingDataService sd=RMIHelper.getShippingData();
		try {
			sd.insert(lp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("�洢�½���װ����");
	}

	// ���¶�����Ϣ�ͽ�ͨ������Ϣ
	private void update() {
		// ��sava�е���

	}

	// �õ���ͬ���䷽ʽ�õ����䵥��
	private double getPrice(String ways) {
		if (ways.equals("����")) {
			return 20;
		} else if (ways.equals("����")) {
			return 0.2;
		} else {
			return 2;
		}
	}
}
