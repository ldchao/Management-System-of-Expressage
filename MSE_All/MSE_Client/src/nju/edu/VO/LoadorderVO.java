package nju.edu.VO;

import java.io.Serializable;

public class LoadorderVO implements Serializable {
	   String transferNum;
	   String offName;
	   
	private LoadorderVO(String transferNum) {
		super();
		this.transferNum = transferNum;
//		this.offNum = 
	}

	public String getTransferNum() {
		return transferNum;
	}

	public String getOffNum() {
		return offName;
	}	

}
