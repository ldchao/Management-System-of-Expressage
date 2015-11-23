package Client.mockObject.approveMockObject;

import java.util.ArrayList;

import Client.businesslogic.approvebl.Approvebl;
import PO.ReceiverPO;

public class MockApprovebl extends Approvebl{
	public  ArrayList<String> showList(int state, String type) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add(new ReceiverPO("chao", " ", " ", " "," ", " ", " ").getReceiver());
		arrayList.add((new ReceiverPO("monitor", " ", " ", " "," ", " ", " ").getReceiver()));
		return arrayList;
	}
}
