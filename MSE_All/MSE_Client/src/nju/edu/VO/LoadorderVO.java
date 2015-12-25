package nju.edu.VO;

import java.io.Serializable;
import java.util.ArrayList;

import PO.OrganizationNumPO;

public class LoadorderVO implements Serializable {
	   String offName;  //����������
	   String offNum;
	   String loadNum;  //װ�˵����
	   String carNum;  //ͨ��װ�˵����ǰ��λ�õ���ͨ���ߴ���
	   String monitorName;  //��װԱ����
	   String transferName;  //Ѻ��Ա���� 
	   ArrayList<String> order;  //���ж������
	   
	public LoadorderVO(String transferNum,  String loadNum, String carNum, String monitorName,
			String transferName, ArrayList<String> order) {
		super();
		OrganizationNumPO op=new OrganizationNumPO();
		this.offName = op.getName(transferNum);
		this.loadNum=loadNum;
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

	public String getLoadNum() {
		return loadNum;
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
