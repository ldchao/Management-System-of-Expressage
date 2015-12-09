package nju.edu.VO;

import java.io.Serializable;
import java.util.ArrayList;

import PO.OrganizationNumPO;

public class LoadorderVO implements Serializable {
	   String offName;  //出发地名字
	   String offNum;
	   String carNum;  //通过装运单编号前四位得到交通工具代号
	   String monitorName;  //监装员姓名
	   String transferName;  //押运员姓名 
	   ArrayList<String> order;  //所有订单编号
	   
	public LoadorderVO(String transferNum, String carNum, String monitorName,
			String transferName, ArrayList<String> order) {
		super();
		OrganizationNumPO op=new OrganizationNumPO();
		this.offName = op.getName(transferNum);
		this.offNum=transferNum;
		this.carNum = carNum;
		this.monitorName = monitorName;
		this.transferName = transferName;
		this.order = order;
	}

	public String getOffName() {
		return offName;
	}

	public String getOffNum() {
		return offNum;
	}

	public String getCarNum() {
		return carNum;
	}

	public String getMonitorName() {
		return monitorName;
	}

	public String getTransferName() {
		return transferName;
	}

	public ArrayList<String> getOrder() {
		return order;
	}

	

}
