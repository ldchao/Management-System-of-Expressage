package nju.edu.businesslogic.transferbl;

import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogic.storebl.StoreMessageBL;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.businesslogicservice.transferblservice.TransferBLService;
import PO.ChangeorderPO;
import StaticValue.StoreNum;

public class TransferBL implements TransferBLService{

	@Override
	public void build(ChangeorderVO cv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String checkRemind() {
		String[][] storeRatio=checkStore();
		String[] number;
		String remind="";
		double ratio;
		String[] qu={"航运区","铁运区","汽运区"};
		
		for (int i = 0; i < storeRatio.length; i++) {
			number=storeRatio[i][1].split("/");
			ratio=(Integer.parseInt(number[0]))/(Integer.parseInt(number[1]));
			if(ratio>=Double.parseDouble(storeRatio[i][2])){
				remind+=(i/3)>2?("汽运区4排"+(i-8)+"架"):(qu[i/3]+(i%3+1)+"排")+
						"达到提醒值，需要录入发往"+StoreNum.storeName[i]+"的中转单"+"\n";
			}
		}
		return remind;
	}

	@Override
	public String[][] checkStore() {
		StoreinInfo sm=StoreMessageBL.getInstance();		
		return sm.getStoreRatio();
	}
	
	@Override
	public void save(ChangeorderPO cp) {
		// TODO Auto-generated method stub
		
	}

	

	

}
