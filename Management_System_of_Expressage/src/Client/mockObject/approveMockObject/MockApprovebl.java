package Client.mockObject.approveMockObject;

import java.util.ArrayList;

import Client.PO.ReceiverPO;
import Client.businesslogic.approvebl.Approvebl;

public class MockApprovebl extends Approvebl{
	public <T> ArrayList<T> showList(int state, String type) {
		// TODO Auto-generated method stub
		ArrayList<T> arrayList=new ArrayList<T>();
		arrayList.add((T) new ReceiverPO("chao", " ", " ", " "," ", " ", " "));
		arrayList.add((T) new ReceiverPO("monitor", " ", " ", " "," ", " ", " "));
		return null;
	}
}
