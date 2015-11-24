package nju.edu.businesslogic.billbl;

import java.util.ArrayList;

import PO.StartinfoPO;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.StartinfoVO;
import nju.edu.businesslogicservice.billblservice.BillBLService;
import nju.edu.dataservice.billdataservice.BillDataService;

public class BillBL implements BillBLService {
	BillDataService billData = RMIHelper.getBillData();

	@Override
	public void addBill(String name, String account, String organization,
			String staff, String vehicle, String store) {

		StartinfoPO spo = new StartinfoPO(name, account, organization, staff,
				vehicle, store);
		try {
			billData.insert(spo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<StartinfoVO> checkBill() {
		ArrayList<StartinfoVO> billist = new ArrayList<>();

		try {
			ArrayList<StartinfoPO> stp = billData.find();
			for (StartinfoPO sp : stp) {
				StartinfoVO sv = new StartinfoVO(sp.getName(), sp.getAccount(),
						sp.getOrganization(), sp.getStaff(), sp.getVehicle(),
						sp.getStore());
				billist.add(sv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return billist;
	}

}
