package nju.edu.businesslogic.storebl;

import PO.StorePO;
import PO.StoreinorderPO;

public class StoreMessageBL {
	
	private static StoreMessageBL store_message=null;
	private StorePO sp;

	private StoreMessageBL() {
         init();
	}

	public static StoreMessageBL getInstance() {

		if(store_message==null){
			store_message=new StoreMessageBL();
			
		}
	     return store_message;
	}

	private void init(){
		
		
	}
	
	private void save(){
		
		
	}
}
