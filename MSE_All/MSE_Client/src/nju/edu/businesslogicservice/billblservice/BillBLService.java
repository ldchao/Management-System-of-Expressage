package nju.edu.businesslogicservice.billblservice;

import java.util.ArrayList;

import nju.edu.VO.StartinfoVO;

public interface BillBLService {

	// 新建账
	public void addBill(String name, String account, String organization,
			String staff, String vehicle, String store);

	// 查看期初信息时显示所有帐的信息
	public ArrayList<StartinfoVO> checkBill();
}