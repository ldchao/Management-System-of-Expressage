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
		String[] qu={"������","������","������"};
		
		for (int i = 0; i < storeRatio.length; i++) {
			number=storeRatio[i][1].split("/");
			ratio=(Integer.parseInt(number[0]))/(Integer.parseInt(number[1]));
			if(ratio>=Double.parseDouble(storeRatio[i][2])){
				remind+=(i/3)>2?("������4��"+(i-8)+"��"):(qu[i/3]+(i%3+1)+"��")+
						"�ﵽ����ֵ����Ҫ¼�뷢��"+StoreNum.storeName[i]+"����ת��"+"\n";
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
