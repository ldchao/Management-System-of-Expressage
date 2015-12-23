package nju.edu.businesslogic.listinbl;

import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import PO.OrderPO;
import State.ExpressType;
import State.PackageType;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.OrderVO;
import nju.edu.businesslogic.checklistbl.ListinInfo;
import nju.edu.businesslogicservice.listinblservice.ListApprove;
import nju.edu.businesslogicservice.listinblservice.ListinBLService;
import nju.edu.businesslogicservice.listinblservice.OrderInfo;
import nju.edu.businesslogicservice.listinblservice.UpdateInfo;
import nju.edu.businesslogicservice.listinblservice.getID;
import nju.edu.dataservice.listindataservice.ListinDataService;
import nju.edu.dataservice.policydataservice.ConstantPolicyDataService;

public class Listinbl implements ListinBLService, ListinInfo, OrderInfo, UpdateInfo, ListApprove, getID {
	ListinDataService listinDataService = RMIHelper.getListinData();
	ConstantPolicyDataService ConstantPolicyDataSerivce = RMIHelper.getConstantPolicyData();

	@Override
	public void addOrder(OrderVO vo) {
		// TODO Auto-generated method stub
		OrderPO po = new OrderPO(vo.getCourier(), vo.getId(), vo.getState(), vo.getSender(), vo.getAddress1(),
				vo.getPosition1(), vo.getPhone1(), vo.getCellphone1(), vo.getReceiver(), vo.getAddress2(),
				vo.getPosition2(), vo.getPhone2(), vo.getCellphone2(), vo.getItems(), vo.getCount(), vo.getWeight(),
				vo.getLength(), vo.getWidth(), vo.getHeight(), vo.getExpress(), vo.getPack(), vo.getBill(),
				vo.getTime(), vo.getTransformState());
		try {
			listinDataService.insert(po);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public double getTotalMoney(String address1, String address2, String weight, String length, String width,
			String height, ExpressType express, PackageType pack) {
		// TODO Auto-generated method stub
		double result = 0;
		double distance = 0;
		// 价格部分1：两地之间的距离*单价
		try {
			distance = ConstantPolicyDataSerivce.GetDistance(address1, address2);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 部分价格部分2：质量；3：包裹种类；4：快递种类
		result = (distance + 30 * 2) / 1000 * ExpressPrice(express) * WeightPrice(weight, length, width, height)
				+ PackPrice(pack);
		DecimalFormat dFormat=new DecimalFormat("#0.0");  
		result=Double.parseDouble(dFormat.format(result));
		return result;
	}

	protected double PackPrice(PackageType pack) {
		// TODO Auto-generated method stub
		if (pack == PackageType.Carton) {
			return 10;
		} else if (pack == PackageType.Wooden) {
			return 20;
		} else {
			return 5;
		}
	}

	protected double ExpressPrice(ExpressType express) {
		// TODO Auto-generated method stub
		if (express == ExpressType.Economy) {
			return 18;
		} else if (express == ExpressType.Standard) {
			return 23;
		} else {
			return 25;
		}

	}

	protected double WeightPrice(String zhiliang, String l, String w, String h) {
		// TODO Auto-generated method stub
		Double length = Double.parseDouble(l);
		Double width = Double.parseDouble(w);
		Double height = Double.parseDouble(h);
		Double weight = Double.parseDouble(zhiliang);
		if (length * width * height / 5000 > weight) {
			return length * width * height / 5000;
		} else {
			return weight;
		}
	}

	@Override
	public String getTotalTime(String address1, String address2, ExpressType express) {
		// TODO Auto-generated method stub
		double distance = 0;
		try {
			distance = ConstantPolicyDataSerivce.GetDistance(address1, address2) + 30 * 2;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double speed = 80;
		return (int) (distance / 80 / 24) + "天" + ((int) (distance / 80) - (int) (distance / 80 / 24) * 24) + "小时";
	}

	@Override
	public OrderVO getOrder(String id) {
		// TODO Auto-generated method stub
		OrderVO vo = null;
		OrderPO po;
		try {
			po = listinDataService.getOrder(id);
			if(po!=null){
				vo = new OrderVO(po.getCourier(), po.getId(), po.getState(), po.getSender(), po.getAddress1(),
					po.getPosition1(), po.getPhone1(), po.getCellphone1(), po.getReceiver(), po.getAddress2(),
					po.getPosition2(), po.getPhone2(), po.getCellphone2(), po.getItems(), po.getCount() + "",
					po.getWeight() + "", po.getLength() + "", po.getWidth() + "", po.getHeight() + "", po.getExpress(),
					po.getPack(), po.getTime(), po.getBill() + "", po.getTransformState());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public void update(String id, String message) {
		// TODO Auto-generated method stub
		try {
			listinDataService.update(id, message);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public double getWeight(String id) {
		double result = 0;
		try {
			result = listinDataService.getWeigtht(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean JudgeNull(OrderVO vo) {
		// TODO Auto-generated method stub
		boolean result = true;
		if (vo.getCourier().equals("") || vo.getId().equals("") || vo.getSender().equals("")
				|| vo.getAddress1().equals("") || vo.getPhone1().equals("") || vo.getCellphone1().equals("")
				|| vo.getAddress1().equals("") || vo.getPosition1().equals("") || vo.getReceiver().equals("")
				|| vo.getAddress2().equals("") || vo.getPhone2().equals("") || vo.getCellphone2().equals("")
				|| vo.getAddress2().equals("") || vo.getPosition2().equals("") || vo.getItems().equals("")
				|| vo.getCount() < 0 || vo.getWeight() < 0 || vo.getLength() < 0 || vo.getWidth() < 0
				|| vo.getHeight() < 0 || vo.getExpress() == null || vo.getPack() == null || vo.getBill() < 0) {
			result = false;
			return result;
		}
		System.out.print(vo.getPhone1() + ";" + vo.getPhone2() + ";");
		return result;
	}

	@Override
	public ArrayList<OrderPO> getAllOrders() {
		// TODO Auto-generated method stub
		ArrayList<OrderPO> arrayList = new ArrayList<>();
		try {
			arrayList = listinDataService.getAllOrders();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
	}

	public void changestate(OrderPO po) {

		try {
			listinDataService.changestate(po);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getID(String partOfID) {
		// TODO Auto-generated method stub
		String part2 = "";
		int a = 0;
		while (true) {
			part2 = getpart2(a);
			String id = partOfID + part2;
			OrderVO vo = getOrder(id);
			if (a==100000) {
				return "营业厅已满";
			}
			if (vo == null) {
				return id;
			}
			a++;
		}
	}

	private String getpart2(int a) {
		// TODO Auto-generated method stub
		String result = a + "";
		String temp="";
		for (int i = 0; i < 5 - result.length(); i++) {
			temp = "0" + temp;
		}
		result=temp+result;
		return temp;
	}
}
