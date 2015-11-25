package nju.edu.VO;

import java.io.Serializable;

import PO.OrganizationNumPO;

public class LoadorderVO implements Serializable {
	   String offName;
	   
	public LoadorderVO(String transferNum) {
		super();
		OrganizationNumPO op=new OrganizationNumPO();
		this.offName = op.getName(transferNum);
	}

	public String getOffName() {
		return offName;
	}	

}
